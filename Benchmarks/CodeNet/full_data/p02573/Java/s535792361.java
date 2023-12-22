import java.util.*;

public class Main{
  public static int cnt;
  public static void dfs(int u,int[] v,
  List<Integer>[] l)
  {
      v[u]=1;
      cnt++;
      for(int child:l[u])
      {
        if(v[child]==0)       
        dfs(child,v,l);
      }     
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    List<Integer>[] l=new ArrayList[n];
    for(int i=0;i<n;i++)
    l[i]=new ArrayList<>();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
     // if(!l[x].contains(y))
      l[x].add(y);
     // if(!l[y].contains(x))
      l[y].add(x);
    }
    int max=0;
    int v[]=new int[n];
    for(int i=n-1;i>=0;i--)
    {
      if(v[i]==0)
      {
      cnt=0;
      dfs(i,v,l);
      max=Math.max(max,cnt);
      }
    }
    System.out.println(max);
  }
}
    