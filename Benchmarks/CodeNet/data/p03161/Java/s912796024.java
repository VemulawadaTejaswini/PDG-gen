import java.util.Scanner;

/**
 * Created by Harry on 3/31/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_b
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] height = new int[n];
        for(int i=0; i<n; i++){
            height[i] = scanner.nextInt();
        }
        System.out.print(findMinCost(n,k,height));
    }

    public static long findMinCost(int n, int k, int[] height){
        long[] dp = new long[n];
        dp[0] = 0;
        for(int i=1; i<n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=i-1; j>=Math.max(0, i-k); j--){
                dp[i] = Math.min(dp[i], dp[j]+Math.abs(height[i]-height[j]));
            }
        }
        return dp[n-1];
    }
}
