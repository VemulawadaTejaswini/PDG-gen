import java.util.*;

public class Main {

    static int[][] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt()-1;
        int v = sc.nextInt()-1;
        g = buildGraph(sc, n, n-1);
        int[] du = new int[n];
        Arrays.fill(du, -1);
        int[] dv = new int[n];
        Arrays.fill(dv, -1);
        dfs(du, u, 0);
        dfs(dv, v, 0);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(du[i] < dv[i]){
                int t = dv[i]-1;
                if(ans < t) ans = t;
            }
        }
        System.out.println(ans);
        sc.close();

    }

    private static void dfs(int[] dv, int next, int d) {
        if(0 <= dv[next]) return;
        dv[next] = d;
        d++;
        for(int nex : g[next]){
            dfs(dv, nex, d);
        }
    }

    public static int[][] buildGraph(Scanner sc, int n, int m) {
        int[][] graph = new int[n][];
        int[][] edges = new int[m][2];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
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
