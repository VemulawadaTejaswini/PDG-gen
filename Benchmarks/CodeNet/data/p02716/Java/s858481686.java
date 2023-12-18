import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextLong();
        }

        long[][] dp = new long[n][3];
        int k = n/2;
        long max = 0;

        for(int i = 1 ; i <= k ; i++){
            dp[i][0] = dp[i-1][0] + a[2*i-2];
        }
        max = dp[k][0];

        for(int i = 1 ; i <= k ; i++){
            dp[i][1] = Math.max(    dp[i-1][0] + a[2*i-1],
                                    dp[i-1][1] + a[2*i-1]);
        }
        max = Math.max(max, dp[k][1]);

        if((n % 2) == 1) {
            for (int i = 1; i <= k; i++) {
                dp[i][2] = Math.max(dp[i - 1][0] + a[2 * i],
                            Math.max(dp[i - 1][1] + a[2 * i],
                                    dp[i-1][2] + a[2*i]));
            }
            max = Math.max(max, dp[k][2]);
        }

        System.out.println(max);
    }
}
