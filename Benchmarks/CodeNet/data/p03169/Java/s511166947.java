/*input
2
1 2
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

        final int MAXN = (int) (3e2) + 10;
        final long MOD = (long) (1e9) + 7;
        int group[] = new int[4];
        double dp[][][] = new double[MAXN][MAXN][MAXN];
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            this.n = in.nextInt();
            for (int i = 0, x = 0; i < n; i++) {
                x = in.nextInt();
                group[x]++;
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) dp[i][j][k] = -1.0d;
                }
            }
            double ans = solve(group[1], group[2], group[3]);
            out.printf("%.14f\n", ans);

        }

        public double solve(int one, int two, int three) {

            if (one + two + three == 0) return 0.0d;

            if (dp[one][two][three] != -1.0d) return dp[one][two][three];

            double ans = 0.0d, sum = one + two + three;

            if (one > 0) {
                double cc = (one * 1.0d) / sum;
                cc *= solve(one - 1, two, three);
                ans += cc;
            }

            if (two > 0) {
                double cc = (two * 1.0d) / sum;
                cc *= solve(one + 1, two - 1, three);
                ans += cc;
            }

            if (three > 0) {
                double cc = (three * 1.0d) / sum;
                cc *= solve(one, two + 1, three - 1);
                ans += cc;
            }
        
            ans += this.n / sum;

            return dp[one][two][three] = ans;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}

