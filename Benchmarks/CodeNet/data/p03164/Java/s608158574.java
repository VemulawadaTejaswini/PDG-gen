import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long W = sc.nextInt();
        long[] weight = new long[N];
        int[] value = new int[N];
        int V = 0;
        for(int n=0; n<N; n++){
            weight[n] = sc.nextInt();
            value[n]= sc.nextInt();
            V += value[n];
        }

        long[][] dp = new long[N+1][V+1];
        //dp[n][v] : choose items from first 'n' items, and the total value is v
        //this arrays have the minimum weight

        Arrays.fill(dp[0], 5000000000000000L); dp[0][0] = 0;
        for(int n=1; n<=N; n++) for(int v=0; v<=V; v++){
            dp[n][v] = dp[n-1][v];
            if(value[n-1] <= v){
                dp[n][v] = Math.min(dp[n][v], dp[n-1][v-value[n-1]]+weight[n-1]);
            }
        }

        //for(int n=0; n<=N; n++) System.err.println(Arrays.toString(dp[n]));


        int ans = 0;
        for(int v=0; v<=V; v++){
            if(dp[N][v] <= W) ans=v;
        }
        System.out.println(ans);

    }
}
