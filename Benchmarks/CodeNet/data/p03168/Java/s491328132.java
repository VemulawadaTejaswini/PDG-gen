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
 * @author Coer
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskI solver = new TaskI();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskI {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            double[] p = new double[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = in.nextDouble();
            }
            double[][] dp = new double[n + 1][n + 1];
            dp[0][0] = 1.0;
            for (int i = 1; i <= n; i++) {
                dp[i][0] = dp[i - 1][0] * (1 - p[i]);
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i - 1][j - 1] * p[i] + dp[i - 1][j] * (1 - p[i]);
                }
            }
            double ans = 0.0;
            for (int j = 1; j <= n; j++) {
                if (j > n - j) {
                    ans += dp[n][j];
                }
            }
            out.println(ans);
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}