import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =  in.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        boolean[] visited = new boolean[n+1]; 
        for(int i=0; i<=n; i++)
             graph[i] = new ArrayList<>();
        for(int i =0; i<m;i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph[u].add(v);
        }
        int[] dp = new int[n+1];
        for(int i =1; i<=n ;i++){
            if(!visited[i]){
                dfs(graph, n, i, visited, dp);
            }
        }

        int re =0;
        for(int i=1; i<=n; i++)
        re = Math.max(re, dp[i]);

        System.out.println(re); 
        
    }

    static void dfs(ArrayList<Integer>[] graph, int n, int u,
     boolean[] visited, int[] dp ){
        visited[u] = true;
        for(int v: graph[u]){
            if(!visited[v]){
                dfs(graph, n,v, visited, dp);
            }
            dp[u] = Math.max(dp[u], dp[v]+1);
        }
    }
}