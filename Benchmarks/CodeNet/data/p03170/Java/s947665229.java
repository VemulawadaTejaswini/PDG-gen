import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int mod=1000000007;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    long dp[][]=new long[n][k+1];
    long sum[]=new long[k+1];
    for(int i=0;i<=a[0];i++)
    {
      dp[0][i]=1;
    }
    for(int i=1;i<n;i++)
    {
      sum[0]=dp[i-1][0]%mod;
      for(int j=1;j<=k;j++)
      {
        sum[j]=(sum[j-1]%mod+dp[i-1][j]%mod)%mod;
      }
      for(int j=0;j<=k;j++)
      {
        if(a[i]<j)
        dp[i][j]=(sum[j]%mod-sum[j-a[i]-1]%mod)%mod;
        else
        dp[i][j]=sum[j]%mod;
      }
      /*for(int j=0;j<=k;j++)
      System.out.println(dp[i][j]+" ");
      System.out.println();*/
    }
    System.out.println(dp[n-1][k]);
  }
}
    