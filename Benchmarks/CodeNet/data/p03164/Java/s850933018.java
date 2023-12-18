import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Harry on 3/30/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_e
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        for(int i=0; i<n; i++){
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        System.out.println(findMaxValue(weights ,values, n, w));
    }

    public static int findMaxValue(int[] weights, int[] values, int n, int w){
        int valSum = 0;
        for(int val : values){
            valSum += val;
        }
        int res = 0;
        long[] dp = new long[valSum+1];
        Arrays.fill(dp, (long)1e13);
        dp[0] = 0;
        for(int i=1; i<=n; i++){
            for(int val=valSum; val>=values[i-1]; val--){
                dp[val] = Math.min(dp[val], dp[val-values[i-1]]+weights[i-1]);
                if(dp[val]<=w){
                    res = Math.max(res, val);
                }
            }
        }

        return res;
    }
}
