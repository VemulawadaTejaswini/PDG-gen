import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] x = new long[n];
        long[] y = new long[m];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            if (i > 0) {
                x[i] -= sum;
            }
            sum += x[i];
        }
        sum = 0;
        for (int i = 0; i < m; i++) {
            y[i] = scanner.nextInt();
            if (i > 0) {
                y[i] -= sum;
            }
            sum += y[i];
        }
        long c = 0;
        for (int i = 1; i < m; i++) {
            c = (c + y[i] * i % mod * (m - i) % mod) % mod;
        }

        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans = (ans + c * x[i] % mod * i % mod * (n - i) % mod) % mod;
        }
        System.out.println(ans);
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