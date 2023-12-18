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
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= k && i - j >= 1; j++) {
                dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
            }
        }
        System.out.println(dp[n]);
    }
}
