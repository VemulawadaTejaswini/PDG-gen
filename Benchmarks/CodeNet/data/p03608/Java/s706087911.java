import java.util.*;

public class Main {

    static int n, m ,r;
    static int[] R;
    static long[][] d;
    static int[][][] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        R = new int[r];
        for (int i = 0; i < r; i++) {
            R[i] = sc.nextInt()-1;
        }
        int[][] e = new int[m][3];
        for (int i = 0; i < m; i++) {
            e[i][0] = sc.nextInt()-1;
            e[i][1] = sc.nextInt()-1;
            e[i][2] = sc.nextInt();
        }
        g = buildWeightedGraph(n, e);
        d = new long[n][];
        for (int i = 0; i < r; i++) {
            d[R[i]] = dijkstra(n, g, R[i]);
        }
        long ans = Long.MAX_VALUE/2;
        for (int i = 0; i < r; i++) {
            boolean[] used = new boolean[r];
            used[i] = true;
            long tmp = dfs(i, used, 0L);
            if(tmp < ans) ans = tmp;
        }
        System.out.println(ans);
        sc.close();

    }

    private static long dfs(int v, boolean[] used, long c) {
        long ret = Long.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            if(used[i]) continue;
            used[i] = true;
            long tmp = dfs(i, used, c + d[R[v]][R[i]]);
            used[i] = false;
            if(tmp < ret) ret = tmp;
        }
        if(ret == Long.MAX_VALUE) ret = c;
        return ret;
    }

    public static long[] dijkstra(int n, int[][][] graph, int s) {
        // {sからの最短距離, 頂点}
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        long[] d = new long[n]; // sからの最短距離
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        pq.add(new long[] { 0, s });
        while (!pq.isEmpty()) {
            long[] a = pq.poll();
            int v = (int) a[1];
            if (d[v] < a[0])
                continue;
            for (int[] g : graph[v]) {
                int to = g[0];
                int cost = g[1];
                if (d[to] > d[v] + cost) {
                    d[to] = d[v] + cost;
                    pq.add(new long[] { d[to], to });
                }
            }
        }

        return d;
    }

    public static int[][][] buildWeightedGraph(int n, int[][] edges){
        int m = edges.length;
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            deg[ edges[i][0] ]++;
            deg[ edges[i][1] ]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            graph[a][--deg[a]][0] = b;
            graph[a][deg[a]][1] = c;
            graph[b][--deg[b]][0] = a;
            graph[b][deg[b]][1] = c;
        }

        return graph;
    }

}
