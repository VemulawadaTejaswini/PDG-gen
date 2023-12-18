import java.util.*;

public class Main{
  public static int dp[];
  public static int func(int a[],int i)
  {
    if(i>=a.length)
    return 10000000;
    if(i==a.length-1)
    return 0;
    if(dp[i]!=-1)
    return dp[i];
    if(i<a.length-2)
    {
      dp[i]=Math.min(Math.abs(a[i]-a[i+2])+
            func(a,i+2),
            Math.abs(a[i]-a[i+1])+
            func(a,i+1));
    }
    else
    {
      dp[i]=Math.abs(a[i]-a[i+1])+func(a,i+1);
    }
    return dp[i];
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    dp=new int[n+1];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<=n;i++)
    dp[i]=-1;
    System.out.println(func(a,0));
  }
}