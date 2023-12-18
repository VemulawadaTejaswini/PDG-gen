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
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ICoins solver = new ICoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ICoins {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            double[] p = new double[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextDouble();
            }

            double[][] dp = new double[n + 1][n + 1];
            boolean[][] go = new boolean[n + 1][n + 1];
            go[0][0] = true;
            dp[0][0] = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (go[i][j])
                        dp[i + 1][j] += dp[i][j] * (1 - p[i]);
                    go[i + 1][j] = true;
                    dp[i + 1][j + 1] += dp[i][j] * p[i];
                    go[i + 1][j + 1] = true;
                }
            }

            double ans = 0;
            for (int i = n; i > n / 2; i--) {
                ans += dp[n][i];
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}

