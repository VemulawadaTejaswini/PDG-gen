import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.io.InputStream;

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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            Vertex[] vertices = new Vertex[n + 1];
            Map<Vertex, Integer> vn = new HashMap<>();
            Set<Vertex> root = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                vertices[i] = new Vertex();
                vn.put(vertices[i], i);
                root.add(vertices[i]);
            }

            for (int i = 0; i < n + m - 1; i++) {
                Vertex from = vertices[in.nextInt()];
                Vertex to = vertices[in.nextInt()];
                from.setEdge(to);
                root.remove(to);
            }

            Vertex r = null;
            for (Vertex cv : root)
                r = cv;

            List<Vertex> sorted = Sort.topologicalSort(r);
            int[] ans = new int[n + 1];

            for (Vertex cv : sorted) {
                int cn = vn.get(cv);
                for (Edge ce : cv.getEdges())
                    ans[vn.get(ce.getTo())] = cn;
            }

            for (int i = 1; i <= n; i++)
                out.println(ans[i]);
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
            from.setEdge(this);
        }

        public Vertex getTo() {
            return this.to;
        }

    }

    static class Vertex {
        private long value;
        private List<Edge> edges = new ArrayList<>();

        public Vertex() {
        }

        public Vertex(long v) {
            this.value = v;
        }

        public void setEdge(Vertex v) {
            this.edges.add(new Edge(v));
        }

        public void setEdge(Edge e) {
            this.edges.add(e);
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

    static class Sort {
        public static LinkedList<Vertex> topologicalSort(Vertex v) {
            LinkedList<Vertex> sorted = new LinkedList<>();
            Set<Vertex> visited = new HashSet<>();
            visit(v, sorted, visited);
            return sorted;
        }

        private static void visit(Vertex v, LinkedList<Vertex> sorted, Set<Vertex> visited) {
            if (!visited.contains(v)) {
                visited.add(v);
                for (Edge e : v.getEdges())
                    visit(e.getTo(), sorted, visited);
                sorted.addFirst(v);
            }
        }

    }
}

