import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String output = "";

        for (int i = 0; i < s.length(); i++) {
            output = mutateStringBasedOnKey(output,s.charAt(i));
        }
        System.out.println(output);

    }

    private static String mutateStringBasedOnKey(String s, char key) {
        if (key == '0') {
            return s + "0";
        } else if (key == '1') {
            return s + "1";
        } else {
            if (s.isEmpty()) {
                return "";
            } else {
                return s.substring(0, s.length() - 1);
            }
        }
    }

}