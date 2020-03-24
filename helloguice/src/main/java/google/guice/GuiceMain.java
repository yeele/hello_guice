package google.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class GuiceMain {

    @Inject
    private HelloWorld helloWorld;

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override protected void configure() {}
        });

        GuiceMain main = injector.getInstance(GuiceMain.class);
        main.helloWorld.hello();
    }
}
