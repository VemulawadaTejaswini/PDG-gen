import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] g = buildGraph(sc, n, n-1);
        long[] s = new long[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            s[p] += x;
        }
        boolean[] used = new boolean[n];
        dfs(0, 0, g, s, used);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s[i] + " ");
        }
        System.out.println(sb.toString().trim());
        sc.close();

    }

    private static void dfs(int v, long p, int[][] g, long[] s, boolean[] used) {
        if(used[v]) return;
        used[v] = true;
        s[v] += p;
        for(int nex : g[v]){
            dfs(nex, s[v], g, s, used);
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
