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
        T_Permutation solver = new T_Permutation();
        solver.solve(1, in, out);
        out.close();
    }

    static class T_Permutation {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            String s = in.ns();
            long mod = (int) 1e9 + 7;
            long[][] dp = new long[n][n + 1];
            dp[0][1] = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == '<') {
                    long sum = 0;
                    for (int j = 1; j <= i; j++) {
                        sum += dp[i - 1][j];
                        dp[i][j + 1] = (dp[i][j + 1] + sum) % mod;
                    }
                } else {// >
                    long sum = 0;
                    for (int j = i; j >= 1; j--) {
                        sum += dp[i - 1][j];
                        dp[i][j] = (dp[i][j] + sum) % mod;
                    }
                }
            }
            long ans = 0;
            for (int i = 1; i < n + 1; i++) {
                ans += dp[n - 1][i];
            }
            out.println(ans % mod);
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

