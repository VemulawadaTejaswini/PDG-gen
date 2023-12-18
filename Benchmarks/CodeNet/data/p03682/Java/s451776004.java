import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.Collections;
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
        OutputWriter out = new OutputWriter(outputStream);
        DBuilt solver = new DBuilt();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBuilt {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            List<Edge> graph = new ArrayList<>();
            Pair[] points = new Pair[n];
            for (int i = 0; i < n; i++) {
                points[i] = new Pair(i, in.nextInt(), in.nextInt());
            }

            Arrays.sort(points, Comparator.comparingInt(p -> p.x));
            for (int i = 0; i < n - 1; i++) {
                int from = points[i].num;
                int to = points[i + 1].num;
                long cost = Math.abs(points[i + 1].x - points[i].x);
                graph.add(new Edge(from, to, cost));
            }

            Arrays.sort(points, Comparator.comparingInt(p -> p.y));
            for (int i = 0; i < n - 1; i++) {
                int from = points[i].num;
                int to = points[i + 1].num;
                long cost = Math.abs(points[i + 1].y - points[i].y);
                graph.add(new Edge(from, to, cost));
            }

            Collections.sort(graph);
            DSU dsu = new DSU(n);
            long res = 0;

            for (Edge e : graph) {
                if (dsu.union(e.from, e.to)) {
                    res += e.cost;
                }
            }

            out.println(res);
        }

    }

    static class DSU {
        int[] parent;
        int[] rank;

        public DSU(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++)
                parent[i] = i;
            rank = new int[size];
        }

        public int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        public boolean union(int x, int y) {
            int xr = find(x), yr = find(y);
            if (xr == yr) {
                return false;
            } else if (rank[xr] < rank[yr]) {
                parent[xr] = yr;
            } else if (rank[xr] > rank[yr]) {
                parent[yr] = xr;
            } else {
                parent[yr] = xr;
                rank[xr]++;
            }
            return true;
        }

    }

    static class Edge implements Comparable<Edge> {
        int from;
        int to;
        long cost;

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public int compareTo(Edge o) {
            if (this.cost == o.cost) return 0;
            else if (this.cost > o.cost) return 1;
            else return -1;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class Pair {
        int num;
        int x;
        int y;

        public Pair(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }

    }
}

