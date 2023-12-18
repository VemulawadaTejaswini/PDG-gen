import java.util.Scanner;

public class Main {

    static int n;
    static int[][] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        g = buildGraph(sc, n, m);
        boolean[] used = new boolean[n];
        int ans = dfs(used, 0);

        System.out.println(ans);
        sc.close();
    }

    private static int dfs(boolean[] used, int v) {
        int ret = 0;
        boolean[] used2 = new boolean[n];
        for(int i = 0; i < n; i++) used2[i] = used[i];
        used2[v] = true;
        for(int next: g[v]){
            if(!used2[next]) ret += dfs(used2, next);
        }
        boolean allUsed = true;
        for(int i = 0; i < n; i++) if(!used2[i]) allUsed = false;
        if(allUsed) ret++;
        return ret;
    }

    public static int[][] buildGraph(Scanner sc, int n, int m){
        int[][] graph = new int[n][];
        int[][] edges = new int[m][2];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            edges[i][0] = a;
            edges[i][1] = b;
            deg[a]++;
            deg[b]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }

        return graph;
    }

}