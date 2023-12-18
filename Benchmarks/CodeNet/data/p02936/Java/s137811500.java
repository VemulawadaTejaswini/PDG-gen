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
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < n - 1; i++) {
                g.addUnDirectedEdge(in.nextInt() - 1, in.nextInt() - 1);
            }
            for (int i = 0; i < q; i++) {
                g.addCost(in.nextInt() - 1, in.nextInt());
            }

            // 0から順にdfsをする.
            g.dfs(0, g.getCost(0));

            for (int i = 0; i < n; i++) {
                out.println(g.getCost(i));
            }

        }

    }

    static class Graph {
        private int n;
        private ArrayList<Integer>[] adj;
        private int[] cost;
        private boolean[] visited;

        public Graph(int size) {
            n = size;
            cost = new int[n];
            visited = new boolean[n];
            Arrays.fill(visited, false);
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(int from, int to) {
            adj[from].add(to);
        }

        public void addUnDirectedEdge(int from, int to) {
            addEdge(from, to);
            addEdge(to, from);
        }

        public void addCost(int index, int value) {
            cost[index] += value;
        }

        public void dfs(int index, int cost) {
            if (visited[index]) {
                return;
            }
            visited[index] = true;
            this.cost[index] = cost;
            ArrayList<Integer> nxtAl = adj[index];
            for (int nxt : nxtAl) {
                dfs(nxt, cost + getCost(nxt));
            }
        }

        public int getCost(int i) {
            return cost[i];
        }

    }
}

