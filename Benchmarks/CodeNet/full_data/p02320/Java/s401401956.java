import java.util.Deque;
import java.util.Scanner;

public class Main {
    int n, w;
    int[] vs;
    int[] ws;
    int[] ms;
    int[][] dp;


    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        vs = new int[n];
        ws = new int[n];
        ms = new int[n];
        for (int i = 0; i < n; i++) {
            vs[i] = sc.nextInt();
            ws[i] = sc.nextInt();
            ms[i] = sc.nextInt();
        }
        dp = new int[n+1][w+1];
    }

    private void solve() {

        for (int i = 1; i < n + 1; i++) {
            int v = vs[i-1];
            int m = ms[i-1];
            int w = ws[i-1];
            for (int j = 0; j < this.w + 1; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k <= m; k++) {
                    if (j - k * w >= 0) {
                        max = Math.max(max, dp[i-1][j-k * w] + v * k);
                    }
                }
                dp[i][j] = max;
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j <= w; j++) {
            ans = Math.max(ans, dp[n][j]);
        }
        System.out.println(ans);
    }

    private class Pos {
        int i, j;
        Pos (int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}