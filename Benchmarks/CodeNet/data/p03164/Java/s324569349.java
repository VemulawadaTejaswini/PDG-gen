import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int w;
    int[][] wv;
    int[][] dp;

    long m = 0;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        wv = new int[n][2];
        for (int i = 0; i < n; i++) {
            wv[i][0] = sc.nextInt();
            wv[i][1] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp();
        System.out.println(m);
    }

    private void dp() {
        dp = new int[n+1][n*1000+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n * 1000 + 1; j++) {
                dp[i][j] = (int)1e9+50000;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n*1000; j++) {
                if (j < wv[i-1][1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j - wv[i-1][1]] + wv[i-1][0], dp[i-1][j]);
                }
            }
        }
        for (int i = 0; i <= n*1000; i++) {
            if (dp[n][i] <= w) {
                m = Math.max(m, i);
            }
        }
    }
}