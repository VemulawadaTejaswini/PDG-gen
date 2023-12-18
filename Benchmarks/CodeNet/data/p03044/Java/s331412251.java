import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static BufferedReader input = null;

    static {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    static class Edge {
        int i;
        int w;

        public Edge(int i, int w) {
            this.i = i;
            this.w = w;
        }
    }

    static class Tree {
        private int n;
        private List<Edge> adj[];
        private int color[];
        private boolean visited[];

        public Tree(int n) {
            this.n = n;
            this.adj = new List[n];
            this.color = new int[n];
            this.visited = new boolean[n];
            for (int i = 0; i < n; i += 1) {
                adj[i] = new ArrayList<>();
            }
        }

        public void add(int u, int v, int w) {
            adj[u].add(new Edge(v, w));
        }

        private void flipColor(int root, boolean visited[]) {
            if (visited[root])
                return;
            visited[root] = true;
            color[root] = color[root] == 1 ? 0 : 1;
            for (Edge e : adj[root]) {
                flipColor(e.i, visited);
            }
        }


        private void color(int root) {
            if (visited[root])
                return;

            visited[root] = true;

            if (adj[root].size() == 0) {
                color[root] = 0;
                return;
            }
            for (Edge edge : adj[root]) {
                color(edge.i);
            }

            for (Edge edge : adj[root]) {
                if (edge.w % 2 == 1) {
                    boolean v[] = new boolean[n];
                    flipColor(edge.i, v);
                }
            }
        }

        public void color() {
            Arrays.fill(visited, false);
            color(0);
        }

        private void print(int root) {
            if (visited[root])
                return;
            visited[root] = true;
            System.out.println(color[root]);
            for (Edge next : adj[root])
                print(next.i);
        }

        public void print() {
            for (int i : color) {
                System.out.println(i);
            }
        }
    }


    public static void main(String ar[]) throws IOException {
        int n = Integer.parseInt(input.readLine());
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i += 1) {
            String uvw[] = input.readLine().split(" ");
            int u = Integer.parseInt(uvw[0]) - 1;
            int v = Integer.parseInt(uvw[1]) - 1;
            int w = Integer.parseInt(uvw[2]);
            tree.add(u, v, w);
        }
        tree.color();
        tree.print();
    }
}
