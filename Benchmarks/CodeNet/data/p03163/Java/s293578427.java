import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++){
        wt[i]=sc.nextInt();
        val[i]=sc.nextInt();
        }
        long dp[][]=new long[n+1][w+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(j>=wt[i-1])
                dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                else
                dp[i][j]=dp[i-1][j];
            }
        } 
    System.out.println(dp[n][w]);
}
}