import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weights = new int[n+1];
        int[] values = new int[n+1];
        int valSum = 0;
        for(int i =1 ; i<=n ; ++i){
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
            valSum+=values[i];
        }
        int sol=0;
        long[][] dp = new long[n+1][valSum+1];
        for(long[] arr :dp)
            Arrays.fill(arr,Integer.MAX_VALUE);
        dp[0][0]=0;
        for(int i = 1 ; i<=n ; ++i){
            for(int j = 0 ; j<=valSum ; ++j){
                if(values[i]<=j ){
                    dp[i][j] = Math.min(weights[i]+dp[i-1][j-values[i]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i = valSum ; i>=0 ; --i){
            if(dp[n][i]<=w){
                System.out.println(i);
                return;
            }
        }
    }
}
