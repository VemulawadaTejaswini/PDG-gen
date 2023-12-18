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
        BGarbageCollector solver = new BGarbageCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGarbageCollector {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            long cost = in.nextInt();
            long[] x = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                x[i] = in.nextInt();
            }

            long[] dp = new long[n + 1];

            long[] sum2kxk = new long[n + 2];
            double[] sum2kxkD = new double[n + 2];
            long[] sum2xk = new long[n + 2];

            for (int i = n - 1; i >= 0; i--) {

                sum2kxkD[i] = sum2kxkD[i + 1] + 1.0 * (-2 * (i + 1) + 3) * x[i + 1];
                sum2kxk[i] = sum2kxk[i + 1] + (-2 * (i + 1) + 3) * x[i + 1];
                sum2xk[i] = sum2xk[i + 1] + 2 * x[i + 1];
            }

            for (int i = 1; i <= n; i++) {
                dp[i] = Long.MAX_VALUE;
                for (int j = i - 1; j >= 0; j--) {
                    double value = dp[j] + 2 * x[i] + cost + 1.0 * i * (sum2xk[j] - sum2xk[i]) + (sum2kxkD[j] - sum2kxkD[i]);
                    if (value > Long.MAX_VALUE) {
                        continue;
                    }
                    long realValue = dp[j] + 2 * x[i] + cost + i * (sum2xk[j] - sum2xk[i]) + (sum2kxk[j] - sum2kxk[i]);
                    dp[i] = Math.min(dp[i], realValue);
                }
            }

            out.println(dp[n] + cost * n);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

