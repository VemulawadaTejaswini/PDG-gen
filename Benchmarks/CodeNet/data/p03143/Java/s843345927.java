import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] x = in.nextLongArray(n);
            WeightUnionFind wuf = new WeightUnionFind(x);

            List<Edge> edges = new ArrayList<>();
            List<Set<Edge>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new HashSet<>());
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                long y = in.nextLong();

                edges.add(new Edge(a, b, y, i));
                graph.get(a).add(new Edge(a, b, y, i));
                graph.get(b).add(new Edge(b, a, y, i));
            }

            edges.sort(Comparator.comparingLong(e -> e.weight));
            Set<Integer> candidate = new HashSet<>();
            for (int i = 0; i < m; i++) {
                Edge e = edges.get(i);
                wuf.union(e.from, e.to);
                if (e.weight <= wuf.getWeightSum(e.from)) {
                    candidate.add(e.index);
                }
            }

            int ans = 0;
            boolean[] used = new boolean[m];
            for (int i = 0; i < m; i++) {
                Edge e = edges.get(m - 1 - i);
                if (used[e.index]) continue;
                if (candidate.contains(e.index)) {
                    dfs(e.from, e.weight, graph, used);
                } else {
                    ans++;
                }
            }

            out.println(ans);
        }

        void dfs(int x, long weight, List<Set<Edge>> graph, boolean[] used) {
            for (Edge e : graph.get(x)) {
                if (!used[e.index] && e.weight <= weight) {
                    used[e.index] = true;
                    dfs(e.to, weight, graph, used);
                }
            }
        }

        class Edge {
            int from;
            int to;
            long weight;
            int index;

            public Edge(int from, int to, long weight, int index) {
                this.from = from;
                this.to = to;
                this.weight = weight;
                this.index = index;
            }

            public String toString() {
                return from + "," + to + "," + weight + "," + index;
            }

        }

        class WeightUnionFind extends UnionFind {
            long[] weightSum;

            WeightUnionFind(long[] weightSum) {
                super(weightSum.length);
                this.weightSum = weightSum;
            }

            public boolean union(int x, int y) {
                boolean isConnected = super.isConnected(x, y);
                long sum = weightSum[super.root(x)] + weightSum[super.root(y)];
                boolean result = super.union(x, y);
                if (!isConnected) weightSum[super.root(x)] = sum;
                return result;
            }

            long getWeightSum(int x) {
                return weightSum[x];
            }

        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

    }

    static class UnionFind {
        int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (parent[y] < parent[x]) {
                    int tmp = y;
                    y = x;
                    x = tmp;
                }
                parent[x] += parent[y];
                parent[y] = x;
                return true;
            }
            return false;
        }

        public boolean isConnected(int x, int y) {
            return root(x) == root(y);
        }

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public ArrayList<ArrayList<Integer>> getGroups() {
            int n = parent.length;
            ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = root(i);
                if (!map.containsKey(r)) {
                    map.put(r, groups.size());
                    groups.add(new ArrayList<>());
                }
                groups.get(map.get(r)).add(i);
            }
            return groups;
        }

        public String toString() {
            return getGroups().toString();
        }

    }
}

