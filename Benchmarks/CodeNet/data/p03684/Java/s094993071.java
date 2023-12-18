import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        UnionFind unionFind = new UnionFind(n);
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.cost));
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int[] a = IntStream.range(0, n).mapToObj(Integer::valueOf).sorted(Comparator.comparingInt(i -> x[i])).mapToInt(Integer::intValue).toArray();
        int[] b = IntStream.range(0, n).mapToObj(Integer::valueOf).sorted(Comparator.comparingInt(i -> y[i])).mapToInt(Integer::intValue).toArray();
        for (int i = 1; i < n; i++) {
            queue.add(new Edge(a[i - 1], a[i], x[a[i]] - x[a[i - 1]]));
            queue.add(new Edge(b[i - 1], b[i], y[b[i]] - y[b[i - 1]]));
        }

        long sum = 0;
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            if (!unionFind.same(edge.to, edge.from)) {
                sum += edge.cost;
                unionFind.unite(edge.to, edge.from);
            }
        }
        System.out.println(sum);
    }

    static class Edge {
        int to;
        int from;
        int cost;

        Edge(int to, int from, int cost) {
            this.to = to;
            this.from = from;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return String.format("[%s, %s, %s]", to, from, cost);
        }
    }

    static class UnionFind {
        private int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int root(int n) {
            while (parent[n] != n) {
                n = parent[n] = parent[parent[n]];
            }
            return n;
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                parent[x] = y;
            }
        }

        boolean same(int x, int y) {
            return root(x) == root(y);
        }
    }
}