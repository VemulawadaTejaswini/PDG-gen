import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);

    void solve() {
        int n = scanner.nextInt();
        char[][] s = new char[n][n * 2];
        for (int i = 0; i < n; i++) {
            String t = scanner.next();
            s[i] = (t + t).toCharArray();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean f = true;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    f &= s[j][i + k] == s[k][i + j];
                }
            }
            if (f) {
                count += n;
            }
        }
        System.out.println(count);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.close();
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}