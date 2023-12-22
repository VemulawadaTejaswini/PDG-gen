import java.util.*;

public class Main{
  public static long mod=998244353;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    Set<Integer> s=new HashSet<Integer>();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      for(int j=x;j<=y;j++)
      s.add(j);
    }
    List<Integer> l=new ArrayList(s);
    Collections.sort(l);
    long dp[]=new long[n+1];
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
      for(int elem:l)
      {
        if(i-elem>=1)
        {
          dp[i]+=dp[i-elem]%mod;
        }
        else
        break;
      }
    }
    System.out.println(dp[n]%mod);
  }
}

  
