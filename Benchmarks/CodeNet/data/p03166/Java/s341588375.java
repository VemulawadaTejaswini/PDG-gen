import java.util.*;

public class Main{
  public static int v[]=new int[100001];
  public static int dp[]=new int[100001];
  public static int n;
  public static int g[][]=new int[1001][1001];
  public static int dfs(int u){
    v[u]=1;
    int max=0;
    for(int i=0;i<n;i++){
      if(i==u)
      continue;
      if(v[i]==0 && g[u][i]==1){
        max=Math.max(1+dfs(i),max);
      }
    }
    v[u]=0;
    return dp[u]=max;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=0;i<m;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      g[x-1][y-1]=1;
    }
    for(int i=0;i<n;i++){
      if(v[i]!=1){
        dfs(i);
      }
    }
    int ans=0;
    for(int i=0;i<n;i++)
    ans=Math.max(ans,dp[i]);
    System.out.println(ans);
  }
}