import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String O = input.readLine();
        String E = input.readLine();
        System.out.println(zip(O, E));
    }

    private static String zip(String first, String second) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < second.length(); i++) {
            builder.append(first.charAt(i));
            builder.append(second.charAt(i));
        }
        if (first.length() > second.length()) {
            builder.append(first.charAt(first.length() - 1));
        }
        return builder.toString();
    }
}
