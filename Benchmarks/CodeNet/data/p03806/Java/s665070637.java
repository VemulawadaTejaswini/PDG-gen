import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMixingExperiment solver = new DMixingExperiment();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMixingExperiment {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // A,Bの入る最大量は400g
            final int MAX = 400;
            final int INF = (int) 1e9 + 7;

        /*
        dp[i][j] = タイプAが i [g], タイプBが j [g]のものを作る最小コストを考えればいいことがわかる
         */

            int n = in.nextInt();

            // ma, mbは互いに素であるから大丈夫
            int ma = in.nextInt();
            int mb = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            int[][][] dp = new int[n + 1][MAX + 1][MAX + 1];

            ArrayUtil.fill(dp, INF);
            dp[0][0][0] = 0;

            for (int prod = 0; prod < n; prod++) {
                for (int i = 0; i <= MAX; i++) {
                    for (int j = 0; j <= MAX; j++) {
                        try {
                            dp[prod + 1][i + a[prod]][j + b[prod]] =
                                    Math.min(dp[prod][i + a[prod]][j + b[prod]], dp[prod][i][j] + c[i]);
                        } catch (ArrayIndexOutOfBoundsException ignored) {
                        }
                    }
                }
            }

            int min = Integer.MAX_VALUE;
            for (int i = 1; Math.max(ma * i, mb * i) <= MAX; i++) {
                min = Math.min(min, dp[n][ma * i][mb * i]);
            }
            out.println(min > 1e9 ? -1 : min);

        }

    }

    static class ArrayUtil {
        public static void fill(int[][][] array, int val) {
            for (int[][] ar : array) for (int[] a : ar) Arrays.fill(a, val);
        }

    }
}

