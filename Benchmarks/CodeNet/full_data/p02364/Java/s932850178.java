import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.AbstractQueue;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MBTVerify solver = new MBTVerify();
        solver.solve(1, in, out);
        out.close();
    }

    static class MBTVerify {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++) {
                g.addUnDirectedEdge(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));
            }
            ArrayList<Edge> mbt = g.kruscal();
            long res = 0;
            for (Edge e : mbt) {
                res += e.cost;
            }
            out.println(res);
        }

    }

    static class UnionFindTree {
        private int[] parent;
        private int[] height;
        private int[] size;

        public UnionFindTree(int size) {
            this.parent = new int[size];
            this.height = new int[size];
            this.size = new int[size];

            for (int i = 0; i < size; i++) {
                makeSet(i);
            }
        }

        private void makeSet(int i) {
            parent[i] = i;
            height[i] = 0;
            size[i] = 1;
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {

            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) { //既に結合済み
                return;
            }

            if (height[rootX] > height[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];

            } else if (height[rootX] < height[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];

            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
                height[rootX]++;
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }

    static class Graph {
        public int size;
        public ArrayList<Edge>[] adj;
        public int[] inDeg;
        public int[] vertexCost;

        @SuppressWarnings("unchecked")
        public Graph(int size) {
            this.size = size;
            adj = new ArrayList[size];
            inDeg = new int[size];
            vertexCost = new int[size];
            for (int i = 0; i < size; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
            inDeg[e.to]++;
        }

        public void addUnDirectedEdge(Edge e) {
            addEdge(e);
            addEdge(e.inv());
        }

        public ArrayList<Edge> kruscal() {
            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparing(e -> e.cost));
            ArrayList<Edge> minimumBoundedTree = new ArrayList<>();
            UnionFindTree uf = new UnionFindTree(size);

            for (ArrayList<Edge> list : adj) {
                pq.addAll(list);
            }

            while (!pq.isEmpty()) {
                Edge e = pq.poll();
                if (!uf.same(e.from, e.to)) {
                    minimumBoundedTree.add(e);
                    uf.union(e.from, e.to);
                }
            }
            return minimumBoundedTree;
        }

    }

    static class Edge {
        public int from;
        public int to;
        public long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public Edge inv() {
            return new Edge(to, from, cost);
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }
}


