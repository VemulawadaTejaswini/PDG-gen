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
        B_Extension solver = new B_Extension();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_Extension {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final int MOD = 998244353;
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            long[][][][] f = new long[3][3][c + 1][d + 1];
            f[0][0][a][b] = 1;
            long ans = 0;
            for (int i = a; i <= c; i++) {
                for (int j = b; j <= d; j++) {
                    for (int numTop = 0; numTop < 3; numTop++) {
                        for (int numRight = 0; numRight < 3; numRight++) {
                            long cur = f[numTop][numRight][i][j];
                            if (cur == 0) {
                                continue;
                            }
                            if (i == c && j == d) {
                                ans = (ans + cur) % MOD;
                            }
                            // Place top.
                            if (i + 1 <= c) {
                                f[1][numRight][i + 1][j] += (j - 1) * cur;
                                f[1][numRight][i + 1][j] %= MOD;
                                f[1][Math.min(numRight + 1, 2)][i + 1][j] += cur;
                                f[1][Math.min(numRight + 1, 2)][i + 1][j] %= MOD;
                            }
                            // Place right.
                            if (j + 1 <= d) {
                                if (numTop != 1 || i == a) {
                                    f[numTop][1][i][j + 1] += (i - 1) * cur;
                                    f[numTop][1][i][j + 1] %= MOD;
                                }
                                if (numTop + 1 != 1 || i == a) {
                                    f[Math.min(numTop + 1, 2)][1][i][j + 1] += cur;
                                    f[Math.min(numTop + 1, 2)][1][i][j + 1] %= MOD;
                                }
                            }
                        }
                    }
                }
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

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

