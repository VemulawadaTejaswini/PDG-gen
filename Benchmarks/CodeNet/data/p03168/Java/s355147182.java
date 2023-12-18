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
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ICoins solver = new ICoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ICoins {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            double[] ar = new double[n + 1];
            for (int i = 1; i <= n; ++i) ar[i] = in.nd();
            double[][] dp = new double[n + 1][n + 1]; // i -> taken i, j-> j heads
            dp[0][0] = 1D;
            for (int i = 1; i <= n; ++i) {
                for (int j = 0; j <= n; ++j) {
                    dp[i][j] += dp[i - 1][j] * (1 - ar[i]);
                    if (j != 0) dp[i][j] += dp[i - 1][j - 1] * ar[i];
                }
            }
            double ans = 0D;
            for (int j = (n + 1) / 2; j <= n; ++j) ans += dp[n][j];
            out.print(ans);
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

        public int ni() {
            return Integer.parseInt(next());
        }

        public double nd() {
            return Double.parseDouble(next());
        }

    }
}

