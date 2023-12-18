import java.util.*;
import java.io.*;
class Main {
    static void dfs(int src, ArrayList<Integer>[] graph, boolean[] visited, int[] dist) {
        visited[src] = true;
        for(int i: graph[src]) {
            if(!visited[i])
                dfs(i, graph, visited, dist);
            dist[src] = Math.max(dist[src], dist[i]+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i<n; i++)
            graph[i] = new ArrayList<>();
        for(int i = 0; i<m; i++) {
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            graph[u].add(v);
        }
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        for(int i = 0; i<n; i++) 
            if(!visited[i])
                dfs(i, graph, visited, dist);
        System.out.println(Arrays.stream(dist).max().getAsInt());
    }
}