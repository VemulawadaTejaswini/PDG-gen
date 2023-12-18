import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int w[]=new int[N];
        int v[]=new int[N];

        long dp[][] = new long[N][1000*N+1];//重さが入る

        int sum_v = 1000*N;

        for(int i=0;i<N;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++)dp[i][0]=0;
        for(int i=1;i<=v[0];i++)dp[0][i] = w[0];
        for(int i=v[0]+1;i<sum_v+1;i++)dp[0][i] = W+1;

        for(int i=1;i<N;i++){
            for(int j=1;j<=v[i];j++)dp[i][j]=Math.min(dp[i-1][j],w[i]);
            for(int j=v[i]+1;j<sum_v+1;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-v[i]]+w[i]);
            }
        }


        /*
        for(int i=0;i<N;i++){
            for(int j=0;j<sum_v+1;j++) System.out.print(dp[i][j]+" ");
            System.out.println();
        }
        
         */


        long ans = Long.MIN_VALUE;

        for(int i=0;i<N;i++)for(int j=0;j<sum_v+1;j++){
            if(dp[i][j]<=W){
                ans = Math.max(ans,j);
            }
        }
        System.out.println(ans);

    }
}
