import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BalancedPath solver = new BalancedPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class BalancedPath {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // 2 * 80 * 80
            final int MAX = 13000;

            int h = in.nextInt();
            int w = in.nextInt();
            int[][] a = new int[h + 1][w + 1];
            int[][] b = new int[h + 1][w + 1];
            int[][] c = new int[h + 1][w + 1];
            boolean[][][] dp = new boolean[h + 1][w + 1][MAX + 1];

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    a[i][j] = Integer.parseInt(in.next());
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    b[i][j] = Integer.parseInt(in.next());
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    c[i][j] = Math.abs(a[i][j] - b[i][j]);
                }
            }

            dp[1][1][c[1][1]] = true;

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    for (int k = 0; k <= MAX; k++) {
                        if (dp[i][j][k]) {
                            if (i + 1 <= h) {
                                dp[i + 1][j][k + c[i + 1][j]] = true;
                                dp[i + 1][j][Math.abs(k - c[i + 1][j])] = true;
                            }
                            if (j + 1 <= w) {
                                dp[i][j + 1][k + c[i][j + 1]] = true;
                                dp[i][j + 1][Math.abs(k - c[i][j + 1])] = true;
                            }
                        }
                    }
                }
            }

            int result = Integer.MAX_VALUE;
            for (int k = 0; k <= MAX; k++) {
                if (dp[h][w][k]) {
                    result = Math.min(result, k);
                }
            }
            out.println(result);
        }

    }
}

