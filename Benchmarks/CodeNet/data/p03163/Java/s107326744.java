import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), W = in.nextInt();
            int[] weight = new int[N + 1], values = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                weight[i] = in.nextInt();
                values[i] = in.nextInt();
            }

            long[][] dp = new long[N + 1][W + 1];
//            long res = maxValue(weight, values, W, N, dp);
            long res = maxValue2(weight, values, W, 0, 0, dp);
            out.println(res);
        }

        public long maxValue(int[] weight, int[] values, int W, int N, long[][] dp) {
            if (W == 0 || N == 0)
                return 0;

            if (dp[N][W] != 0)
                return dp[N][W];

            long max = 0;
            if (W - weight[N] >= 0)
                max = Math.max(max, values[N] + maxValue(weight, values, W - weight[N], N - 1, dp));
            max = Math.max(max, maxValue(weight, values, W, N - 1, dp));

            dp[N][W] = max;
            return max;
        }

        public long maxValue2(int[] weight, int[] values, int W, int currW, int index, long[][] dp) {
            if (currW == W)
                return 0;

            if(dp[index][currW] != 0)
                return dp[index][currW];

            long max = 0;
            for (int i = index + 1; i < weight.length; i++) {
                if (currW + weight[i] <= W)
                    max = Math.max(max,
                            values[i] + maxValue2(weight, values, W, currW + weight[i], i, dp));
            }

            dp[index][currW] = max;
            return max;
        }

        public long bottomUp1D(int[] weight, int[] values, int W, int N) {
            int[] dp = new int[W + 1];

//            for (int i = 1; i <= W; i++) {
//                for (int j = 1; j <= N; j++) {
//                    if (i - weight[j] >= 0)
//                        dp[i] = Math.max(dp[i], values[j] + dp[i - weight[j]]);
//                }
//            }

            for (int i = 1; i <= N; i++) {
                for (int j = W; j >= weight[i]; j--) {
                    dp[j] = Math.max(dp[j], values[i] + dp[j - weight[i]]);
                }
            }

            return dp[W];
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
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

    }
}

