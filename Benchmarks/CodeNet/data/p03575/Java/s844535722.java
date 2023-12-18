import java.util.*;
class Main {
    static int N,M;
    static int[] visited, x,y,edges;
    static int[][] graph;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N+1];
        edges = new int[M];
        graph = new int[N+1][N+1];
        for(int i = 1; i<N+1; i++) visited[i] = -1;
        x = new int[M];
        y = new int[M];
        for(int i = 0; i<M; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            graph[x[i]][y[i]] = graph[y[i]][x[i]] = 1;
        }

        for(int i = 0; i<M; i++) {
            for(int j = 1; j<N+1; j++) visited[j] = -1;
            graph[x[i]][y[i]] = graph[y[i]][x[i]] = 0;
            dfs(1);
//            System.out.println();
//            for(int v: visited) System.out.print(v);
//            System.out.println();
            for(int j = 0; j<N+1; j++) {
                if(visited[j] == 1) continue;
                if(visited[j] == -1) {
                    ans++;
                    break;
                }
            }
            graph[x[i]][y[i]] = graph[y[i]][x[i]] = 1;
        }
        System.out.println(ans);
    }
    public static void dfs(int node) {
        if(visited[node]==1) return;
        //System.out.print(node+" ");
        if(visited[node] == -1) {
            visited[node] = 1;
        }
        for(int i = 0; i<N+1; i++) {
            if(graph[node][i] == 1) dfs(i);
        }
    }
}