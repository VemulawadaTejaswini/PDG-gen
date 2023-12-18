import java.util.*;


class Main
{
    public static void main(String [] args)
    {
        int N; 
        int W;
        Scanner sc=  new Scanner (System.in);

        N = sc.nextInt();
        W = sc.nextInt();
        int [] v = new int [N+1];
        int w [] = new int [N+1];

        for(int i=1;i<=N;i++)
        {
            w[i] = sc.nextInt();
            v[i]=sc.nextInt();
        }

        int [][] dp = new int [N+1][W+1];

        for(int i=0;i<N;i++) dp[i][0]=0;
        for(int i=0;i<W;i++) dp[0][i]=0;



        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=W;j++)
            {
                if(w[i]>j) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-w[i]]);
            //    System.out.println(dp[i][j]);
                }
            }
        }
        System.out.println(dp[N][W]);
        
    }


}
