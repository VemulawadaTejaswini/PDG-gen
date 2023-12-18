import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[] dp = new long[6001];
        Arrays.fill(dp, Long.MIN_VALUE);
        dp[0] = 0L;
        for (int i = 0; i < n; i++) {
            for (int j = t-1; j >= 0; j--) {
                dp[j+a[i]] = Math.max(dp[j+a[i]], dp[j] + b[i]);
            }
        }
        long ans = 0L;
        for (int i = 0; i < 6001; i++) {
            if(ans < dp[i]) ans = dp[i];
        }
        System.out.println(ans);
        sc.close();

    }

}
