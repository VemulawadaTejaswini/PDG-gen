import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DMaximumSumOfMinimum solver = new DMaximumSumOfMinimum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumSumOfMinimum {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            UnionFindTree uf = new UnionFindTree(n);
            Edge[] e = new Edge[n - 1];
            boolean[] used = new boolean[n - 1];
            Arrays.fill(used, false);
            long m = 0;
            int[] result = new int[n];
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                e[i] = new Edge(a, b, 0);
            }

            ArrayList<Integer> c = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                m += v;
                c.add(v);
            }

            int index = 1;
            c.sort(Comparator.reverseOrder());
            m -= c.get(0);


            result[0] = c.get(0);
            while (true) {
                for (int i = 0; i < e.length; i++) {
                    if (!uf.same(0, e[i].getFrom()) && !used[i]) {
                        used[i] = true;
                        result[e[i].getFrom()] = c.get(index);
                        index++;
                        uf.union(0, e[i].getFrom());
                    }
                    if (!uf.same(0, e[i].getTo()) && !used[i]) {
                        used[i] = true;
                        result[e[i].getTo()] = c.get(index);
                        index++;
                        uf.union(0, e[i].getTo());
                    }
                }
                boolean f = true;
                for (int i = 0; i < n; i++) {
                    f = f && uf.same(0, i);
                }
                if (f) break;
            }

        /*
            out
         */
            out.println(m);
            for (int i : result) {
                out.print(i + " ");
            }
            out.println();
        }

    }

    static class Edge {
        int from;
        int to;
        long cost;

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

        public int getTo() {
            return to;
        }

        public int getFrom() {
            return from;
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
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

