import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt() - 1;
        int t = scanner.nextInt() - 1;
        List<Grid>[] yen = new ArrayList[n];
        List<Grid>[] snuuk = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            yen[i] = new ArrayList<>();
            snuuk[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            yen[u].add(new Grid(v, a));
            yen[v].add(new Grid(u, a));
            yen[u].add(new Grid(v, b));
            yen[v].add(new Grid(u, b));
        }

        long[] dist1 = dijkstra(yen, s);
        long[] dist2 = dijkstra(snuuk, t);
        long[] ans = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = Math.min(i == n - 1 ? Long.MAX_VALUE : ans[i + 1], dist1[i] + dist2[i]);
        }

        for (long a : ans) {
            System.out.println((long)1e15 - a);
        }
    }

    static long[] dijkstra(List<Grid>[] list, int start) {
        long[] cost = new long[list.length];
        Arrays.fill(cost, 1L << 62);
        cost[start] = 0;

        Queue<Grid> queue = new PriorityQueue<>(Comparator.comparing(grid -> grid.cost));
        queue.add(new Grid(start, 0));

        while (!queue.isEmpty()) {
            Grid grid = queue.poll();
            if (cost[grid.to] >= grid.cost) {
                for (Grid g : list[grid.to]) {
                    if (cost[g.to] > cost[grid.to] + grid.cost) {
                        cost[g.to] = cost[grid.to] + grid.cost;
                        queue.add(new Grid(g.to, cost[g.to]));
                    }
                }
            }
        }
        return cost;
    }

    static class Grid {
        int to;
        long cost;

        Grid(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}