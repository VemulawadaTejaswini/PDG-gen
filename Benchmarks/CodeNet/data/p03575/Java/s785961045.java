import java.util.*;
public class Main{
  static ArrayList<Integer>[] graph;
  static boolean[] visited;
  static int n;
  static int cnt;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int m = sc.nextInt();
    graph = new ArrayList[n+1];
    for(int i=1;i<=n;i++)graph[i]=new ArrayList<>();
    visited = new boolean[n+1];
    int[][] ab = new int[m+1][2];
    for(int i=1;i<=m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph[a].add(b);
      graph[b].add(a);
      ab[i][0]=a;
      ab[i][1]=b;
    }
    int ans = 0;
    for(int i=1;i<=m;i++){
      cnt=0;
      Arrays.fill(visited,false);
      if(dfs(ab[i][0],ab[i][1],1))ans++;
    }
    System.out.println(ans);
  }
  public static boolean dfs(int a,int b,int now){
    cnt++;
    if(cnt==n)return false;
    visited[now]=true;
    for(int i:graph[now]){
      if(!visited[i]&&!(now==a&&i==b)&&!(now==b&&i==a)){
        if(!dfs(a,b,i))return false;
      }
    }
    return true;
  }
}