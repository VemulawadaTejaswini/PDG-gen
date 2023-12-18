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
        L_Deque solver = new L_Deque();
        solver.solve(1, in, out);
        out.close();
    }

    static class L_Deque {
        Long[][] dp;
        int[] a;

        long go(int i, int j) {
            if (i == j)
                return a[i];
            if (dp[i][j] != null)
                return dp[i][j];
            long res = Math.max(a[i] - go(i + 1, j), a[j] - go(i, j - 1));
            dp[i][j] = res;
            return res;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();

            a = in.na(n);
            dp = new Long[n][n];
            long ans = go(0, n - 1);
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

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }
}

