import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        private static long getPathLen(Vertex v) {
            if (v.getValue() >= 0)
                return v.getValue();
            long max = 0;
            for (Edge ce : v.getEdges()) {
                Vertex to = ce.getVertex();
                max = Math.max(max, getPathLen(to) + 1);
            }
            v.setValue(max);
            return max;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Vertex[] vertices = new Vertex[n + 1];
            for (int i = 1; i <= n; i++)
                vertices[i] = new Vertex(-1);

            for (int i = 0; i < m; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                vertices[from].setEdge(vertices[to]);
            }

            long ans = 0;
            for (int i = 1; i <= n; i++)
                ans = Math.max(ans, getPathLen(vertices[i]));

            out.println(ans);
        }

    }

    static class Vertex {
        private long value;
        private boolean hasValue = false;
        private List<Edge> edges = new ArrayList<Edge>();

        public Vertex() {
        }

        public Vertex(long v) {
            this.value = v;
        }

        public void setValue(long v) {
            this.value = v;
            this.hasValue = true;
        }

        public void setEdge(Vertex v) {
            this.edges.add(new Edge(v));
        }

        public long getValue() {
            return this.value;
        }

        public List<Edge> getEdges() {
            return edges;
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }

    static class Edge {
        private Vertex from;
        private Vertex to;
        private long cost;

        public Edge() {
        }

        public Edge(Vertex to) {
            this.to = to;
        }

        public Edge(Vertex to, long c) {
            this.to = to;
            this.cost = c;
        }

        public Edge(Vertex from, Vertex to, long c) {
            this.from = from;
            this.to = to;
            this.cost = c;
        }

        public Vertex getVertex() {
            return this.to;
        }

    }
}

