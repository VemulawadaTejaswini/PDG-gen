import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
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
        DBuilt solver = new DBuilt();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBuilt {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            Vec3i[] v = new Vec3i[n];
            Graph g = new Graph(n);
            long res = 0;
            for (int i = 0; i < n; i++) {
                v[i] = new Vec3i(in.nextInt() - 1, in.nextInt() - 1, i);
            }

            Arrays.sort(v, Comparator.comparing(vec -> vec.x));
            for (int i = 0; i < n - 1; i++) {
                g.addEdge(new Edge(v[i].z, v[i + 1].z, Math.abs(v[i].x - v[i + 1].x)));
            }
            Arrays.sort(v, Comparator.comparing(vec -> vec.y));
            for (int i = 0; i < n - 1; i++) {
                g.addEdge(new Edge(v[i].z, v[i + 1].z, Math.abs(v[i].y - v[i + 1].y)));
            }
            ArrayList<Edge> mbt = g.kruscal();
            for (Edge e : mbt) {
                res += e.cost;
            }

            out.println(res);
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

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        int[] inDeg;
        long[] vertexCost;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            inDeg = new int[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
            inDeg[e.to]++;
        }

        public ArrayList<Edge> kruscal() {
            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparing(e -> e.cost));
            ArrayList<Edge> minimumBoundedTree = new ArrayList<>();
            UnionFindTree uf = new UnionFindTree(n);

            for (ArrayList<Edge> list : adj) {
                for (Edge e : list) {
                    pq.add(e);
                }
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

    static class Vec3i {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String toString() {
            return "Vec3i{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
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
}

