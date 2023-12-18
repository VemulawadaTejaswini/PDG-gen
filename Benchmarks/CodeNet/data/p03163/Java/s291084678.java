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
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int W = in.nextInt();
            int[] w = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }
            long[][] dp = new long[W + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int u = 0; u < W + 1; u++) {
                    dp[u][i] = dp[u][i - 1];
                    if (u >= w[i - 1]) {
                        dp[u][i] = Math.max(dp[u][i], dp[u - w[i - 1]][i - 1] + v[i - 1]);
                    }
                }
            }
            out.println(dp[W][n]);
        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

