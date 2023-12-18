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
        M_Candies solver = new M_Candies();
        solver.solve(1, in, out);
        out.close();
    }

    static class M_Candies {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), k = in.ni();
            int[] a = in.na(n);
            long[][] dp = new long[n + 1][k + 1];
            long mod = (int) 1e9 + 7;
            dp[0][0] = 1;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
                if (sum > k) sum = k;
                long total = 0;
                for (int j = 0; j <= a[i]; j++) {
                    total += dp[i][j];
                    dp[i + 1][j] = total % mod;
                }
                for (int j = a[i] + 1; j <= sum; j++) {
                    total += dp[i][j];
                    total -= dp[i][j - a[i] - 1];
                    dp[i + 1][j] = total % mod;
                }
            }
            out.println(dp[n][k]);
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

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }
}

