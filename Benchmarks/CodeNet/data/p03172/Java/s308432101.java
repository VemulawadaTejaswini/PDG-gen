import java.util.*;
public class Main {
    static int mod=1000000007;
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
      
      long dp[][]=new long[n+1][k+1];
      for(int i=0;i<=n;i++)
        for(int j=0;j<=k;j++)
         dp[i][j]=-1;
      System.out.println(Solve(a,n,k,dp));
    }
    public static long Solve(int a[],int n,int k,long dp[][])
    {
        if(n==0)
        return k==0?1:0;
        

        if(dp[n][k]!=-1)
        return dp[n][k]%mod;

        long count=0;
        for(int i=0;i<=a[n-1];i++){
          if(k-i>=0)
         count+=Solve(a,n-1,k-i,dp);
        }
         return dp[n][k]=count%mod;
    }
}