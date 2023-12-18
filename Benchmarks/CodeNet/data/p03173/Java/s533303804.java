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
        N_Slimes solver = new N_Slimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class N_Slimes {
        long[] a;
        Long[][] dp;
        long[] pref;

        long go(int i, int j) {
            if (i == j) {
                return 0;
            }
            if (dp[i][j] != null)
                return dp[i][j];
            dp[i][j] = pref[j + 1] - pref[i];
            long cost = Long.MAX_VALUE;
            for (int k = i; k < j; k++) {
                cost = Math.min(go(i, k) + go(k + 1, j), cost);
            }
            dp[i][j] += cost;
            return dp[i][j];
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            a = in.nal(n);
            dp = new Long[n][n];

            pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + a[i];
            }
            go(0, n - 1);
            out.println(dp[0][n - 1]);
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

        public long nl() {
            return Long.parseLong(ns());
        }

        public long[] nal(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nl();
            return a;
        }

    }
}

