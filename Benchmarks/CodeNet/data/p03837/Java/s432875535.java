import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author @MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NoShortestPath solver = new NoShortestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class NoShortestPath {
        static ArrayList<NoShortestPath.Edge> g;

        static long kruskal(int n) {
            Collections.sort(g);
            long ans = 0L;
            DisjointSet ds = new DisjointSet();
            for (int i = 0; i <= n; i++) {
                ds.makeSet(i);
            }
            int num = 0;
            for (NoShortestPath.Edge e : g) {
                long u = ds.findSet(e.from);
                long v = ds.findSet(e.to);
                if (ds.findSet(u) != ds.findSet(v)) {
                    ans += e.cost;
                    ds.union(u, v);
                } else {
                    num++;
                }
            }
            return num;
        }

        public void solve(int testNumber, FastReader fs, PrintWriter pw) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            g = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
                g.add(new NoShortestPath.Edge(a, b, c));
            }
            pw.println(kruskal(n));
        }

        static class Edge implements Comparable<NoShortestPath.Edge> {
            int from;
            int to;
            int cost;

            public Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }


            public int compareTo(NoShortestPath.Edge o) {
                return cost - o.cost;
            }

        }

    }

    static class FastReader {
        BufferedReader bf;
        StringTokenizer st;

        public FastReader(InputStream is) {
            bf = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    String line = bf.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
            } catch (Exception e) {
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class DisjointSet {
        private Map<Long, Node> map = new HashMap<>();

        public void makeSet(long data) {
            Node node = new Node();
            node.data = data;
            node.parent = node;
            node.rank = 0;
            map.put(data, node);
        }

        public boolean union(long a, long b) {
            Node node1 = map.get(a);
            Node node2 = map.get(b);

            Node parent1 = findSet(node1);
            Node parent2 = findSet(node2);

            if (parent1.data == parent2.data) {
                return false;
            }

            if (parent1.rank >= parent2.rank) {

                parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
                parent2.parent = parent1;
            } else {
                parent1.parent = parent2;
            }
            return true;
        }

        public long findSet(long data) {

            return findSet(map.get(data)).data;
        }

        private Node findSet(Node node) {
            Node parent = node.parent;
            if (parent == node) {
                return parent;
            }
            node.parent = findSet(node.parent);
            return node.parent;
        }

        class Node {
            long data;
            Node parent;
            int rank;

        }

    }
}

