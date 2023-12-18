
import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int value[] = new int[N+1];
        int weights[] = new int[N+1];
        for(int i = 1 ; i<= N ; i++){
            weights[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        System.out.println(knapsack(N , W , weights,value));


    }
    public static long knapsack(int N , int W , int[] weights , int[] value){
        int maxvalue = N *1000;
        long dp[][] = new long[N+1][maxvalue + 1];

        for(int v = 0 ; v<= maxvalue ; v++){
            dp[1][v] = Integer.MAX_VALUE;
        }
        dp[1][value[1]] = weights[1];

        for(int n = 2 ; n<= N ; n++){
            for(int v = 0 ; v<= maxvalue ; v++){
                dp[n][v] = dp[n-1][v];
                if(value[n] > v)
                    continue;
                dp[n][v] = Math.min(weights[n] + dp[n-1][v-value[n]] ,dp[n][v]);
            }
        }
         long max = 0;
         for(int i  = 0 ; i<= maxvalue ; i++){
             if(dp[N][i] <= W){
                 max = i;
             }
         }
        return max;
    }

}
