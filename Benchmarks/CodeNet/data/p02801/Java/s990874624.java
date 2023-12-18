import java.io.Console;

public class Main {
    public static void main(String[] A00) {
    	Console console = System.console();
    	String c = console.readLine();
    	System.out.println(++c);
    }
}
