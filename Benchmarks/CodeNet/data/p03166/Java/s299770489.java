import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
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
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        Graph g = new Graph(100000);
        int[] p = new int[100000];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                g.addEdge(new Edge(x, y, 0));
            }
            int max = 0;
            Arrays.fill(p, -1);
            for (int i = 0; i < n; i++) {
                // out.println(f(i));
                max = Math.max(max, f(i));
            }
            out.println(max);
        }

        int f(int index) {
            if (p[index] != -1) {
                return p[index];
            }
            p[index] = 0;
            ArrayList<Edge> adj = g.getAdj()[index];

            for (Edge e : adj) {
                int to = e.to;
                p[index] = Math.max(p[index], f(to));
            }

            if (adj.size() != 0) {
                p[index] += 1;
            }
            return p[index];
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

        public ArrayList<Edge>[] getAdj() {
            return adj;
        }

    }
}

