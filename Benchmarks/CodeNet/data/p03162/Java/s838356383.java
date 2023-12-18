import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int[] a;
    int[] b;
    int[] c;
    int[][] dp;
    
    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp = new int[n][3];
        int ans = dp();
        System.out.println(ans);
    }
    
    private int dp() {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[0][0] = a[i];
                dp[0][1] = b[i];
                dp[0][2] = c[i];
            } else {
                dp[i][0] = a[i] + Math.max(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = b[i] + Math.max(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = c[i] + Math.max(dp[i - 1][1], dp[i - 1][0]);
            }
        }
        return Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
    }

    
}