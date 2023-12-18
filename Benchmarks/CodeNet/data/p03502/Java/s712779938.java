import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int N = Integer.parseInt(s);

            System.out.println(checkHarshad(s, N) ? "Yes" : "No");
        }
    }
    static boolean checkHarshad(String s, int n) {
        int x = 0;
        for (int i = 0; i < s.length(); i++)
            x += Character.getNumericValue(s.charAt(i));

        return n % x == 0;
    }
}
