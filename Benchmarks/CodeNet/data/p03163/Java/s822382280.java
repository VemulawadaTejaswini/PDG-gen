import java.util.*;

public class Main{
  public static long dp[][];
  public static long func(int w[],long v[],int n,int W)
  {
    if(n==0 || W==0)
    {
      return 0;
    }
    if(dp[n][W]!=-1)
      return dp[n][W];
    if(W-w[n-1]>=0)
    return dp[n][W]=Math.max(v[n-1]+func(w,v,n-1,W-w[n-1]),
             func(w,v,n-1,W));
    else
    return dp[n][W]=func(w,v,n-1,W);   
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int W=sc.nextInt();
    int w[]=new int[n];
    long v[]=new long[n];
    dp=new long[n+1][W+1];
    for(int i=0;i<n;i++)
    {
      w[i]=sc.nextInt();
      v[i]=sc.nextInt();
    }
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=W;j++)
      dp[i][j]=-1;
    }
    System.out.println(func(w,v,n,W));
  }
}