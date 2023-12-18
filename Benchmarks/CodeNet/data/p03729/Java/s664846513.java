import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            String A = sl[0];
            String B = sl[1];
            String C = sl[2];

            System.out.println(
                A.charAt(A.length() - 1) == B.charAt(0)
                && B.charAt(B.length() - 1) == C.charAt(0) ?
                "YES" : "NO");
        }
    }
}
