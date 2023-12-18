import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        Map<Integer, Integer> map;
        int[][] a;
        int[][] dp;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            map = new HashMap<>();
            int h = in.nextInt(), w = in.nextInt(), d = in.nextInt();
            a = new int[h][w];
            dp = new int[h * w + 1][17];

            for (int i = 0; i < h; ++i)
                for (int j = 0; j < w; ++j) {
                    a[i][j] = in.nextInt();
                    map.put(a[i][j], i * w + j);
                }

            for (int val = 1; val + d <= h * w; ++val) {
                int x = map.get(val) / w;
                int y = map.get(val) % w;
                int xx = map.get(val + d) / w;
                int yy = map.get(val + d) % w;
                dp[val][0] = Math.abs(x - xx) + Math.abs(y - yy);
            }

            for (int i = 1; i < 17; ++i) {
                for (int val = 1; val + (1L << i) * d <= h * w; ++val) {
                    dp[val][i] = dp[val][i - 1] + dp[val + (1 << (i - 1)) * d][i - 1];
                }
            }

            int q = in.nextInt();

            int l, r;
            for (int i = 0; i < q; ++i) {
                l = in.nextInt();
                r = in.nextInt();

                int diff = r - l;
                int step = diff / d;
                int res = 0;
                int cur = l;

                for (int j = 16; j >= 0; --j) {
                    if (((1 << j) & step) != 0) {
                        res += dp[cur][j];
                        cur = cur + (1 << j) * d;
                    }
                }
                out.println(res);
            }
        }

    }
}

