import java.util.*;

public class Main {

    static long ans;
    static boolean[] used;
    static int k;
    static int mod = 1_000_000_007;
    static int[][] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        g = buildGraph(sc, n, n-1);
        used = new boolean[n];
        ans = 1L;
        dfs(0, 0, 0);
        System.out.println(ans);
        sc.close();

    }

    public static void dfs(int v, int depth, int sib){
        if(!used[v]){
            if(k - sib - Math.min(depth, 2) == 0){
                ans = 0;
                return;
            }
            used[v] = true;
            ans = ans * (k - sib - Math.min(depth, 2)) % mod;
            int cnt = 0;
            for(int next: g[v]){
                if(used[next]) continue;
                dfs(next, depth+1, cnt++);
            }
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
