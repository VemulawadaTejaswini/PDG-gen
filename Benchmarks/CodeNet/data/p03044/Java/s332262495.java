import java.util.*;
public class Main{
  public static ArrayList[] graph;
  public static int[][] path;
  public static int[][] len;
  public static int n;
  public static int[] color;
  public static boolean[] visited;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    path = new int[n][2];
    len = new int[n+1][n+1];
    for(int i=1;i<=n-1;i++){
      path[i][0]=sc.nextInt();
      path[i][1]=sc.nextInt();
      len[path[i][1]][path[i][0]]=len[path[i][0]][path[i][1]]=sc.nextInt();
    }
    graph = new ArrayList[n+1];
    for(int i=0;i<=n;i++)graph[i] = new ArrayList<Integer>();
    for(int i=1;i<=n-1;i++){
      graph[path[i][0]].add(path[i][1]);
      graph[path[i][1]].add(path[i][0]);
    }
    color = new int[n+1];
    visited = new boolean[n+1];
    dfs(1,-1);
    for(int i=1;i<=n;i++)System.out.println(color[i]);
  }
  public static void dfs(int now,int pre){
    for(int i=0;i<graph[now].size();i++){
      int g = (int)graph[now].get(i);
      if(!visited[now]&&g!=pre){
        if(len[now][g]%2==0)color[g]=color[now];
        else color[g]=1-color[now];
        visited[now]=true;
        dfs(g,now);
      }
    }
  }
}