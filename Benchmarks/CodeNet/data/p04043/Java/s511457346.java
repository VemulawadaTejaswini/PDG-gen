import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        boolean a = Arrays.asList(args).stream().filter(s -> s.equals("5")).count() == 2;
        boolean b = Arrays.asList(args).stream().filter(s -> s.equals("7")).count() == 1;
        String output = a && b ? "YES" : "NO";
        System.out.println(output);
    }
}