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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        I_Coins solver = new I_Coins();
        solver.solve(1, in, out);
        out.close();
    }

    static class I_Coins {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            double[] p = new double[n];
            for (int i = 0; i < n; i++) {
                p[i] = Double.parseDouble(in.ns());
            }
            double[][] dp = new double[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= n; j++) {
                    dp[i + 1][j] = dp[i][j] * (1 - p[i]);
                    if (j > 0)
                        dp[i + 1][j] += dp[i][j - 1] * p[i];
                }
            }
            double ans = 0;
            for (int i = 0; i < (n + 1) / 2; i++) {
                ans += dp[n][n - i];
            }
            out.println(ans);

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

