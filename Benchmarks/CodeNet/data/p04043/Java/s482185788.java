import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Stream<String> st = Arrays.asList(args).stream();
        boolean a = st.filter(s -> s.equals("5")).count() == 2;
        boolean b = st.filter(s -> s.equals("7")).count() == 1;
        String output = a && b ? "YES" : "NO";
        System.out.println(output);
    }
}