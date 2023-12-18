import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int w;
    int[] weight;
    int[] value;
    long[][] dp;

    long m = 0;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        weight = new int[n];
        value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp();
        System.out.println(dp[n][w]);
    }

    private void dp() {
        dp = new long[n+1][w+1];
        for (int i = 0; i <= w; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j >= weight[i]) {
                    dp[i + 1][j] = Math.max(dp[i][j - weight[i]] + value[i], dp[i][j]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <= w; j++) {
                if (m < dp[i][j]) {
                    m = dp[i][j];
                }
            }
        }
    }
}