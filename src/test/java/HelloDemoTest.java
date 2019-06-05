import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HelloDemoTest {

    @Test
    public void testPrint(){

        HelloDemo helloDemo = new HelloDemo();

        assertThat(helloDemo.print(), is("Hello Demo!"));

    }
}