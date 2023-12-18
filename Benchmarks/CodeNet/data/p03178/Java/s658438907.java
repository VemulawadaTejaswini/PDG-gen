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
            char[] k = inp.next().toCharArray();
            for (int i = 0; i < k.length; i++) k[i] -= '0';
            int d = inp.nextInt();

            long[][] dp = new long[k.length][d];
            long sum = k[0] % d;
            long MOD = 1000000007;
            for (int i = 0; i <= k[0]; i++) dp[0][i % d]++;
            for (int i = 1; i < k.length; i++) {
                for (int j = 0; j < d; j++) {
                    for (int m = 0; m <= k[i]; m++) {
                        int index = (((j - m) % d) + d) % d;
                        dp[i][j] += dp[i-1][index];
                    }
                    for (int m = k[i] + 1; m <= 9; m++) {
                        int index = (((j - m) % d) + d) % d;
                        dp[i][j] += dp[i-1][index];
                        if (index == sum && dp[i-1][index] > 0) dp[i][j]--;
                        //if (index == sum) dp[i][j]--;
                    }
                    dp[i][j] %= MOD;
                }
                sum = (sum + k[i]) % d;
            }
            out.print(dp[k.length-1][0] - 1);
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


