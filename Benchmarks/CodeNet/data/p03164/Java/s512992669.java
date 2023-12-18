

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] wt = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }
        int sum=100000;
        long[] dp = new long[sum+1];
        Arrays.fill(dp,sum+1);
        dp[0]=0;
        for (int i = 0; i < n; i++) {
            for (int j =sum; j >=p[i] ; j--) {
                dp[j] = Math.min(dp[j],dp[j-p[i]]+wt[i]);
            }
        }
        long ans = 0;
        for (int i = sum; i >=0 ; i--) {
            if(dp[i]<=w){
                ans = Math.max(ans,i);

            }
        }
        System.out.println(ans);

    }
}
