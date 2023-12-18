import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[]  = new int[n];
        int dp[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dp[i] = 10001;
        }
        dp[0] = 0;
        
        // メイン処理
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                dp[i] = Math.abs(h[i-1] - h[i]);
            } else {
                for (int x = 1; x <= k; x++) {
                    if (i-x < 0) continue;
                    dp[i] = Math.min(Math.abs(h[i-x] - h[i]) + dp[i-x], dp[i]);
                }
            }
        }
        
        System.out.println(dp[n-1]);
    }
}
