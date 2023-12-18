import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String S;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            S = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        int len = S.length();

        int ans = Integer.MAX_VALUE;

        for (int i = 3; i <= len; i++) {
            String s = S.substring(i - 3, i);
            int num = Integer.parseInt(s);

            ans = Math.min(ans, Math.abs(num - 753));
        }

        out.println(ans);

        out.flush();
    }
}
