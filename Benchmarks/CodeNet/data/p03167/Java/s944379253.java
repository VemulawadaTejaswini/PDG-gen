import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;
    int MAX_M = 100000;
    int MAX_N = 100000;
    int H, W;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        String[] A = new String[H];
        char[][] a = new char[H][];
        dp = new long[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            a[i] = A[i].toCharArray();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i - 1 >= 0 && i - 1 < H && j + 0 >= 0 && j + 0 < W && a[i - 1][j] == '.') {
                    dp[i][j] += dp[i - 1][j];
                }
                if (i >= 0 && i < H && j - 1 >= 0 && j - 1 < W && a[i][j - 1] == '.') {
                    dp[i][j] += dp[i][j - 1];
                }
                dp[i][j] %= 1000000007;
            }
        }
        System.out.println(dp[H - 1][W - 1]);
    }
}