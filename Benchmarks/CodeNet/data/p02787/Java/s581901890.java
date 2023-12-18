import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static long solve1(int h, int n, int[][] l) {
        int maxa = 0;
        for (int i = 0; i < n; ++i) {
            maxa = Math.max(maxa, l[i][0]);
        }

        int maxh = h + maxa + 1;
        long[][] f = new long[n][maxh + 1];

        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], Long.MAX_VALUE);
            f[i][0] = 0;
        }

        for (int j = 1; j <= (int)(1.0 * maxh / l[0][0]); ++j) {
            f[0][l[0][0] * j] = l[0][1] * j;
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < maxh; ++j) {
                if (j - l[i][0] >= 0 && f[i][j - l[i][0]] != Long.MAX_VALUE) {
                    f[i][j] = f[i][j - l[i][0]] + l[i][1];
                }

                if (f[i - 1][j] != Long.MAX_VALUE) {
                    f[i][j] = f[i][j] == 0 ? f[i - 1][j] : Math.min(f[i][j], f[i - 1][j]);
                }
            }
        }

//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < maxh; ++j) {
//                System.out.print((f[i][j] == Long.MAX_VALUE ? "INF" : f[i][j]) + " ");
//            }
//            System.out.println();
//        }

        long minf = Long.MAX_VALUE;
        for (int i = h; i < maxh; ++i) {
            if (f[n - 1][i] != Long.MAX_VALUE) minf = Math.min(minf, f[n - 1][i]);
        }

        return minf;
    }

    public static void solve() {
        int h = 0;
        int n = 0;
        int[][] l = null;
        Scanner s = new Scanner(System.in);
        h = s.nextInt();
        n = s.nextInt();
        l = new int[n][2];
        for (int i = 0; i < n; ++i) {
            l[i][0] = s.nextInt();
            l[i][1] = s.nextInt();
        }

        System.out.println(solve1(h, n, l));
    }

    public static void main(String[] args) {
        solve();
    }
}
