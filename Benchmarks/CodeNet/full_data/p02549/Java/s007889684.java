import java.util.*;

public class Main{
  public static long mod=998244353;
  public static long dp[];
  public static long func(int n,List<Integer> l,
  int pos)
  {
    if(pos==n)
    return 1;
    if(dp[pos]!=-1)
    return dp[pos];
    long ans=0;
    for(int elem:l)
    {
      if(pos+elem<=n)
      ans+=func(n,l,pos+elem)%mod;
      else
      break;
    }
    return dp[pos]=ans%mod;
  }
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
    dp=new long[n+1];
    for(int i=0;i<=n;i++)
    dp[i]=-1;
    System.out.println(func(n,l,1));
  }
}

  
