import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        DScoreAttack solver = new DScoreAttack();
        solver.solve(1, in, out);
        out.close();
    }

    static class DScoreAttack {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        /*
            スコアが正の無限大にできることと負の閉路があることを結び付けたいので
            負で考えてみればいい
            ということはスコアの最大化->スコアの最小化に言い換えられる
         */
            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                long c = in.nextInt() * -1;
                g.addEdge(a, b, c);
            }

            long[] res = g.bellmanFord(0);

            if (g.HasNegativeLoop()) {
                out.println("inf");
            } else {
                out.println(res[n - 1] * -1);
            }


        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;
        boolean hasNegativeLoop = false;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(int from, int to, long cost) {
            if (from >= n || to >= n) {
                System.out.println("Over Size. Check whether it is 0-indexed.");
                return;
            }
            adj[from].add(new Edge(to, cost));
        }

        public long[] bellmanFord(int from) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = i == from ? 0 : (long) 1e30;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (Edge e : adj[j]) {
                        int f = j;
                        int t = e.to;
                        if (res[t] > res[f] + e.cost) {
                            res[t] = res[f] + e.cost;
                            if (i == n - 1) {
                                hasNegativeLoop = true;
                                break;
                            }
                        }
                    }
                }
            }
            return res;
        }

        public boolean HasNegativeLoop() {
            return this.hasNegativeLoop;
        }

    }

    static class Edge {
        int to;
        long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

    }
}

