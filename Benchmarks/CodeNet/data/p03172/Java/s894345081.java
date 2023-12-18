import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt(), k = inp.nextInt();
            long[][] dp = new long[n][k+1];
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = inp.nextInt();
            for (int i = 0; i <= a[0]; i++) dp[0][i] = 1;
            long MOD = 1000000007;

            for (int i = 1; i < n; i++) {
                int l = 0, r = -1;
                long sum = 0;
                for (int j = 0; j <= k; j++) {
                    r++;
                    sum += dp[i-1][r];
                    if (r - l > a[i]) {
                        sum -= dp[i-1][l];
                        l++;
                    }
                    dp[i][j] = sum % MOD;
                }
            }
            out.print(((dp[n-1][k] % MOD) + MOD) % MOD);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}


