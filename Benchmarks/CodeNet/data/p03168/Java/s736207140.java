/*input
1
0.50
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) (1e3) + 10;

        double p[] = new double[MAXN];
        double dp[][] = new double[MAXN][MAXN];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) p[i] = in.nextDouble();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1.0d;
                    } else if (i == 0) {
                        continue;
                    } else if (j == 0) {
                        dp[i][j] = (1 - p[i - 1]) * dp[i - 1][j];
                    } else {
                        dp[i][j] = p[i - 1] * dp[i - 1][j - 1];
                        dp[i][j] += (1 - p[i - 1]) * dp[i - 1][j];
                    }
                }
            }
            double res = 0.0d;
            for (int i = (n + 1) / 2; i <= n; i++) {
                res += dp[n][i];
            }
            out.printf("%.14f\n", res);

        }

        public double solve(int coins, int heads) {
            if (coins == 0) {
                // return 1.0d;
                if (heads == 0) return 1.0d;
                else return 0.0d;
            }
            if (heads < 0) { System.err.println("reach"); return 0.0d; }
            if (dp[coins][heads] != 0.0d) return dp[coins][heads];
            double ans = p[coins - 1] * solve(coins - 1, heads - 1);
            ans += (1.0d - p[coins - 1]) * solve(coins - 1, heads);
            return dp[coins][heads] = ans;
        }


        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

