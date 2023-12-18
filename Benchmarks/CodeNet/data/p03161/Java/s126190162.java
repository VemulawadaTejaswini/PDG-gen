import java.util.Scanner;
import java.util.Arrays;


class Main{

/**
 *  https://atcoder.jp/contests/dp/tasks/dp_b
 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if(k > n){
            System.out.println(0);
            return;
        }
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = in.nextInt();

        //////////////solution\\\\\\\\\\\\\\\\
        int[] dp = new int[n];
        dp[0] = 0;

        for(int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;

            for(int j = 1;j <= k && j <= i; j++){
                dp[i] = Math.min(dp[i], Math.abs(nums[i] - nums[i - j]) + dp[i - j]);
            }
        }
        System.out.println(dp[n]);
    }
}