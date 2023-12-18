import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedInputStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
      	new Thread(null, () -> {
          InputStream inputStream = System.in;
          OutputStream outputStream = System.out;
          InputReader in = new InputReader(inputStream);
          PrintWriter out = new PrintWriter(outputStream);
          EBalancedPath solver = new EBalancedPath();
          solver.solve(1, in, out);
          out.close();
        }, "worker", 1 << 20).start();
    }

    static class EBalancedPath {
        int n;
        int m;
        int[][] a;
        int[][] b;
        int[][][] dp;
        final static int OFFSET = 80 * 80 + 1;

        int go(int x, int y, int diff) {
            if (x == n - 1 && y == m - 1) {
                return Math.min(Math.abs(diff + a[x][y] - b[x][y]), Math.abs(diff + b[x][y] - a[x][y]));
            }
            if (dp[x][y][OFFSET + diff] != -1) {
                return dp[x][y][OFFSET + diff];
            }
            int ans = Integer.MAX_VALUE >> 2;
            if (x + 1 < n) {
                ans = Math.min(ans, go(x + 1, y, diff + a[x][y] - b[x][y]));
                ans = Math.min(ans, go(x + 1, y, diff + b[x][y] - a[x][y]));
            }
            if (y + 1 < m) {
                ans = Math.min(ans, go(x, y + 1, diff + a[x][y] - b[x][y]));
                ans = Math.min(ans, go(x, y + 1, diff + b[x][y] - a[x][y]));
            }
            return dp[x][y][diff + OFFSET] = ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            a = new int[n][m];
            b = new int[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    b[i][j] = in.nextInt();
                }
            }
            dp = new int[n][m][2 * (80 * 80 + 1)];
            for (int[][] dp3 : dp) {
                for (int[] dp2 : dp3) {
                    Arrays.fill(dp2, -1);
                }
            }
            out.println(go(0, 0, 0));
        }

    }

    static class InputReader {
        private StringTokenizer st;
        private BufferedReader reader;

        public InputReader(InputStream is) {
            st = null;
            reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is, 1 << 18)));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

