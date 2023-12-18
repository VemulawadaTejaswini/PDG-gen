import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n+1];
        for(int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(h[2] - h[1]);
        for(int i = 3; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= k && i - j >= 0; j++) {
                min = Math.min(min, dp[i-j] + Math.abs(h[i] - h[i-j]));
            }
            dp[i] = min;

        }
        System.out.println(dp[n]);
    }
}
