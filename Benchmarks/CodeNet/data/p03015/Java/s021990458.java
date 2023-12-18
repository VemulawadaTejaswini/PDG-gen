import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = 1000000007;

    void solve() {
        String l = scanner.next();
        int n = l.length();
        long[] dp1 = new long[n + 1];
        long[] dp2 = new long[n + 1];
        dp2[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (l.charAt(i - 1) == '0') {
                dp1[i] = dp1[i - 1] * 3 % mod;
                dp2[i] = dp2[i - 1] % mod;
            } else {
                dp1[i] = (dp1[i - 1] * 3 + dp2[i - 1]) % mod;
                dp2[i] = dp2[i - 1] * 2 % mod;
            }
        }
        out.println((dp1[n] + dp2[n]) % mod);
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