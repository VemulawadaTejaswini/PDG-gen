import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);

    void solve() {
        int n = scanner.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[scanner.nextInt() - 1] = i;
        }
        int ans = n - 1;
        for (int i = 1, c = 1; i < n; i++) {
            if (q[i - 1] < q[i]) {
                c++;
            } else {
                c = 1;
            }
            ans = Math.min(ans, n - c);
        }
        out.println(ans);
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