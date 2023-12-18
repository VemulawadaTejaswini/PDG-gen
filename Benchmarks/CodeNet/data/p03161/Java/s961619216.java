import java.util.*;

public class Main{
  public static int dp[];
  public static int func(int a[],int start,int k)
  {
    if(start>=a.length)
    return Integer.MAX_VALUE;
    if(start==a.length-1)
    return 0;
    if(dp[start]!=-1)
    return dp[start];
    int ans=Integer.MAX_VALUE;
    for(int i=start+1;i<=Math.min(start+k,a.length-1);i++)
    {
      ans=Math.min(ans,Math.abs(a[start]-a[i])+func(a,i,k));
    }
    return dp[start]=ans;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    dp=new int[n+1];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<=n;i++)
    dp[i]=-1;
    System.out.println(func(a,0,k));
  }
}