import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.Comparator;

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
            // a-c, b-dがminとなるような辺だけいれればいいことがわかる
            int n = in.nextInt();
            Graph g = new Graph(n);
            Vec3i[] v = new Vec3i[n];
            for (int i = 0; i < n; i++) {
                v[i] = new Vec3i(in.nextInt(), in.nextInt(), i);
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
            long sum = 0;
            for (Edge e : mbt) {
                sum += e.cost;
            }
            out.println(sum);

        }

    }

    static class Graph {
        public int size;
        public ArrayList<Edge>[] adj;
        public int[] inDeg;
        public int[] vertexCost;

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

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
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

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
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

