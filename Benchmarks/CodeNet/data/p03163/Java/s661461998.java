import java.util.Scanner;

/**
 * Created by Harry on 3/31/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        System.out.print(findMaxValue(n, w, weight, value));
    }

    public static long findMaxValue(int n, int w, int[] weight, int[] value){
        long[] dp = new long[w+1];
        for(int i=0; i<n; i++){
            for(int j=w; j>=weight[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-weight[i]]+value[i]);
            }
        }
        return dp[w];
    }
}
