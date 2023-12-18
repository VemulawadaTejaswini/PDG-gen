import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        List<Edge>[] g;
        int[] arr;
        boolean[] v;
        HashSet<Integer> inTree = new HashSet<>();
        HashSet<Integer> removed = new HashSet<>();

        boolean canRemove(int cur, int should) {
            boolean[] vis = new boolean[g.length];
            ArrayDeque<Integer> q = new ArrayDeque<>();
            vis[cur] = true;
            q.addFirst(cur);
            while (!q.isEmpty()) {
                int x = q.poll();
                for (Edge e : g[x]) {
                    if (!vis[e.to] && e.to != should && !removed.contains(e.to)) {
                        vis[e.to] = true;
                        q.addFirst(e.to);
                    }
                }
            }
            for (int i = 0; i < vis.length; i++) {
                if (removed.contains(i) || should == i) continue;
                if (!vis[i]) return false;
            }
            return true;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            arr = new int[r];
            for (int i = 0; i < r; i++) {
                arr[i] = in.nextInt() - 1;
                inTree.add(arr[i]);
            }
            v = new boolean[n];
            g = GraphUtils.generateWeightedGraph(n);
            TaskD.Triple[] edges = new TaskD.Triple[m];
            for (int i = 0; i < m; i++) {
                edges[i] = new TaskD.Triple(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
            }
            Arrays.sort(edges);
            DisjointSet ds = new DisjointSet(n);
            long ans = 0;

            for (TaskD.Triple t : edges) {
                int ra = ds.find(t.first);
                int rb = ds.find(t.second);
                if (ra != rb) {
                    ds.merge(t.first, t.second);
                    ans += t.cost;
                    g[t.first].add(new Edge(t.second, t.cost));
                    g[t.second].add(new Edge(t.first, t.cost));
                }
            }

            for (TaskD.Triple e : edges) {
                if (!inTree.contains(e.first) && !removed.contains(e.first)) {
                    if (canRemove(arr[0], e.first)) {
                        removed.add(e.first);
                        ans -= e.cost;
                    }
                } else if (!inTree.contains(e.second) && !removed.contains(e.second)) {
                    if (canRemove(arr[0], e.second)) {
                        removed.add(e.second);
                        ans -= e.cost;
                    }
                }
            }
            out.println(ans);
        }

        static class Triple implements Comparable<TaskD.Triple> {
            int first;
            int second;
            long cost;


            public String toString() {
                return "Triple{" +
                        "first=" + first +
                        ", second=" + second +
                        ", cost=" + cost +
                        '}';
            }

            public Triple(int first, int second, long cost) {
                this.first = first;
                this.second = second;
                this.cost = cost;
            }


            public int compareTo(TaskD.Triple o) {
                return Long.compare(cost, o.cost);
            }

        }

    }

    static class Edge implements Comparable<Edge> {
        public int to;
        public long cost;


        public String toString() {
            return "Edge{" +
                    "to=" + to +
                    ", cost=" + cost +
                    '}';
        }

        public Edge(int to, long cost) {
            this.cost = cost;
            this.to = to;
        }


        public int compareTo(Edge o) {
            return Long.compare(cost, o.cost);
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Edge edge = (Edge) o;

            if (to != edge.to) return false;
            return cost == edge.cost;
        }


        public int hashCode() {
            long result = to;
            result = 31L * result + cost;
            return (int) result;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException ex) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }

    static class GraphUtils {
        private GraphUtils() {
        }

        public static List<Edge>[] generateWeightedGraph(int n) {
            List<Edge>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            return graph;
        }

    }

    static class DisjointSet {
        int[] parent;
        int[] rank;

        public DisjointSet(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++)
                parent[i] = i;
            rank = new int[size];
        }

        public int find(int x) {
            return x == parent[x] ? x : (parent[x] = find(parent[x]));
        }

        public void merge(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b)
                return;
            if (rank[a] < rank[b]) {
                parent[a] = b;
            } else {
                parent[b] = a;
                if (rank[a] == rank[b])
                    ++rank[a];
            }
        }

    }
}

