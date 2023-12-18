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
            int n = inp.nextInt();
            double[] p = new double[n];
            for (int i = 0; i < n; i++) p[i] = inp.nextDouble();

            // probability of having i heads
            double[] dp = new double[n+1];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j > 0; j--) {
                    dp[j] = dp[j] * (1 - p[i]) + dp[j-1] * p[i];
                }
                dp[0] = dp[0] * (1 - p[i]);
            }
            double res = 0;
            for (int i = n / 2 + 1; i <= n; i++) res += dp[i];
            out.print(res);
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
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
