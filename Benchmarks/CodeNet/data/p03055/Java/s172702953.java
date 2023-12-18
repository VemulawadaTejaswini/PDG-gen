import java.util.*;

public class Main {

    static int[][] g;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        g = buildGraph(sc, n, n-1);
        long[] di = dijkstra(n, g, 0);
        long max = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if(max < di[i]){
                max = di[i];
                idx = i;
            }
        }
        di = dijkstra(n, g, idx);
        max = 0;
        idx = 0;
        for (int i = 0; i < n; i++) {
            if(max < di[i]){
                max = di[i];
                idx = i;
            }
        }
        max++;
        System.out.println((max % 3 == 0 || max % 3 == 1) ? "First" : "Second");
        sc.close();
    }

    public static long[] dijkstra(int n, int[][] graph, int s) {
        // {sからの最短距離, 頂点}
        PriorityQueue<long[]> pq =
                new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        long[] d = new long[n]; // sからの最短距離
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        pq.add(new long[]{0, s});
        while(!pq.isEmpty()){
            long[] a = pq.poll();
            int v = (int)a[1];
            if(d[v] < a[0]) continue;
            for (int g: graph[v]) {
                int to = g;
                int cost = 1;
                if(d[to] > d[v] + cost){
                    d[to] = d[v] + cost;
                    pq.add(new long[]{d[to], to});
                }
            }
        }

        return d;
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
