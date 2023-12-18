import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;
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
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            Graph g = new Graph(n * n + 1);
            int[][] match = new int[n][n - 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    int oponent = in.nextInt();
                    int min = Math.min(i + 1, oponent);
                    int max = Math.max(i + 1, oponent);
                    match[i][j] = min * n + max;
                }
            }

        /*
        for (int i = 0; i < n; i++) {
            out.println(Arrays.toString(match[i]));
        }
        
         */

            // 0からほかのやつに辺を伸ばせばいい
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (match[i][0] == match[j][0]) {
                        g.addEdge(new Edge(0, match[i][0], 1));
                    }
                }
                for (int j = 1; j < n - 1; j++) {
                    g.addEdge(new Edge(match[i][j - 1], match[i][j], 1));
                }
            }


            // トポロジカルソートをする
            int[] inDeg = g.getInDeg();
            int[] dist = new int[n * n + 1];
            int cnt = 0;
            boolean[] used = new boolean[n * n + 1];
            Arrays.fill(used, false);
            Stack<Integer> st = new Stack<>();
            st.add(0);
            while (!st.isEmpty()) {
                int now = st.pop();
                ArrayList<Edge> adj = g.getAdj()[now];
                //out.println(adj.toString());
                for (Edge e : adj) {
                    inDeg[e.to]--;
                    if (inDeg[e.to] == 0) {
                        st.add(e.to);
                        dist[e.to] = dist[e.from] + 1;
                        cnt++;
                    }
                }
            }

            //out.println(Arrays.toString(dist));
            //out.println(cnt);

            int max = -1000;
            for (int i = 0; i < dist.length; i++) {
                max = Math.max(max, dist[i]);
            }

            out.println(cnt == (n * n - n) / 2 ? max : -1);
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

        public int[] getInDeg() {
            return inDeg;
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
}

