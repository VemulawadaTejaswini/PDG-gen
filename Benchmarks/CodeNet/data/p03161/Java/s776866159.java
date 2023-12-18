import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n];
        int dp[] = new int[n+100];
        final int INF = 1000001;
        
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n + 100; i++) {
            dp[i] = INF;
        }
        dp[0] = 0;
        
        for(int i = 0; i < n; i++) {
            for (int a = 1; a <= k; a++) {
                if (i + a > n -1) break;
                dp[i+a] = Math.min(dp[i] + Math.abs(h[i] - h[i+a]), dp[i+a]);
            }
        }
        
        System.out.println(dp[n - 1]);
    }
}
