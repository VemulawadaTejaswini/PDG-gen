import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);

    void solve() {
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            if (p != i + 1) {
                count++;
            }
        }
        out.println(count == 2 || count == 0 ? "YES" : "NO");
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