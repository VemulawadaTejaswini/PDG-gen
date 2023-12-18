import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSimpleKnapsack solver = new DSimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSimpleKnapsack {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long W = in.nextInt();

            int[] w = new int[n];
            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            long w0 = w[0];
            for (int i = 0; i < n; i++) {
                w[i] -= w0;
            }

            long[][][] dp = new long[n + 1][n + 1][3 * n + 1]; // [prefix][used][extra]

            for (int i = 1; i <= n; i++) {
                for (int used = 0; used <= n; used++) {
                    for (int weight = 0; weight < dp[i][used].length; weight++) {
                        dp[i][used][weight] = Math.max(dp[i][used][weight], dp[i - 1][used][weight]);
                        if (used - 1 >= 0 && weight - w[i - 1] >= 0)
                            dp[i][used][weight] = Math.max(dp[i][used][weight], v[i - 1] + dp[i - 1][used - 1][weight - w[i - 1]]);
                    }
                }
            }

            long answer = 0;
            for (int used = 0; used <= n; used++) {
                for (int extra = 0; extra < dp[n][used].length; extra++) {
                    if (used * w0 + extra > W)
                        continue;
                    answer = Math.max(answer, dp[n][used][extra]);
                }
            }

            out.println(answer);
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

