import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] e = new int[n-1][3];
        for (int i = 0; i < n-1; i++) {
            e[i][0] = sc.nextInt()-1;
            e[i][1] = sc.nextInt()-1;
            e[i][2] = sc.nextInt();
        }
        int q = sc.nextInt();
        int k = sc.nextInt()-1;
        int[][][] g = buildWeightedGraph(n, e);
        long[] d = dijkstra(n, g, k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            long ans = d[x] + d[y];
            sb.append(ans + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

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
