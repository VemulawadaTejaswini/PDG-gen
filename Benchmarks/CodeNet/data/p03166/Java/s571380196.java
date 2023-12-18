import java.util.*;
public class Main{
  static int[] dp;
  static ArrayList<Integer>[] graph;
  public static void dfs(int v){
    if(graph[v].size()==0)return;
    int a = 0;
    for(Integer e:graph[v]){
      if(dp[e]==0)dfs(e);
      a=Math.max(a,dp[e]);
    }
    dp[v] = a+1;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    dp = new int[n+1];
    graph = new ArrayList[n+1];
    for(int i=1;i<=n;i++)graph[i] = new ArrayList<Integer>();
    boolean[] has = new boolean[n+1];
    Arrays.fill(has,false);
    for(int i=1;i<=m;i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      graph[x].add(y);
      has[y]=true;
    }
    for(int i=1;i<=n;i++){
      if(!has[i])dfs(i);
    }
    int ans = 0;
    for(int i=1;i<=n;i++)ans=Math.max(ans,dp[i]);
    System.out.println(ans);
  }
}