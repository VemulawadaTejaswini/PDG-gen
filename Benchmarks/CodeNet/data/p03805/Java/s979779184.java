import java.util.*;
public class Main{
  static long ans = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] path = new int[n+1][n+1];
    int[] visited = new int[n+1];
    for(int i=0;i<m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      path[a][b]=path[b][a]=1;
    }
    dfs(1,n-1,path,visited,n);
    System.out.println(ans);
  }
  static void dfs(int s,int res,int[][] path,int[] visited,int n){
    if(res==0){
      ans++;
      return;
    }
    for(int i=2;i<=n;i++){
      if(path[s][i]==1&&visited[i]==0){
        visited[i]=1;
        dfs(i,res-1,path,visited,n);
        visited[i]=0;
      }
    }
  }
}