import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (s[i - 1] == s[i]) {
                ans++;
            }
        }
        ans += k * 2;
        System.out.println(Math.min(ans, n - 1));
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}