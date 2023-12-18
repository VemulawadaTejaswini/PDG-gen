import java.util.*;

public class Main {

    static int n;
    static int q;
    static int[][] g;
    static long[] a;
    static long[] ans;
    static boolean[] used;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        g = buildGraph(sc, n, n-1);
        a = new long[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            a[p] += sc.nextLong();
        }
        ans = new long[n];
        used = new boolean[n];
        dfs(0, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i] + " ");
        }
        System.out.println(sb.toString());
        sc.close();

    }

    private static void dfs(int i, long j) {
        if(used[i]) return;
        used[i] = true;
        ans[i] += a[i] + j;
        for(int next : g[i]){
            dfs(next, ans[i]);
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
