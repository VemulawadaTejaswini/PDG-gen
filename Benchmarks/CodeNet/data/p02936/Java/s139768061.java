import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static final class Edge {
        final int src;
        final int dest;
        final long length;
        Edge(int src, int dest, long length) {
            if (src < 0 || dest < 0) {
                throw new IllegalArgumentException();
            }

            this.src = src;
            this.dest = dest;
            this.length = length;
        }
        @Override
        public int hashCode() {
            return Objects.hash(dest, src, length);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Edge)) {
                return false;
            }
            Edge other = (Edge)obj;
            return dest == other.dest
                   && src == other.src
                   && length == other.length;
        }
        @Override
        public String toString() {
            return "Edge [src="
                   + src
                   + ", dest="
                   + dest
                   + ", length="
                   + length
                   + "]";
        }
    }
    static final class AdjacencyMatrix {
        final int vertexNumber;
        final boolean directedGraph;
        private final List<Map<Integer, Edge>> matrix;
        AdjacencyMatrix(int vertexNumber) {
            this(vertexNumber, false);
        }
        AdjacencyMatrix(int vertexNumber, boolean directedGraph) {
            if (vertexNumber < 1) {
                throw new IllegalArgumentException();
            }
            this.vertexNumber = vertexNumber;
            this.directedGraph = directedGraph;
            matrix = new ArrayList<>(Collections.nCopies(vertexNumber, null));
            matrix.replaceAll(e -> new HashMap<>());
        }
        void setEdge(Edge edge) {
            if (edge.dest < 0 || edge.dest >= vertexNumber) {
                throw new IndexOutOfBoundsException();
            }
            matrix.get(edge.src).put(edge.dest, edge);
            if (directedGraph) {
                return;
            }
            matrix.get(edge.dest)
                  .put(edge.src, new Edge(edge.dest, edge.src, edge.length));
        }
        void setLength(int src, int dest, long length) {
            setEdge(new Edge(src, dest, length));
        }
        long getLength(int src, int dest) {
            if (dest < 0 || dest >= vertexNumber) {
                throw new IndexOutOfBoundsException();
            }
            Edge e = matrix.get(src).get(dest);
            return e == null ? 0 : e.length;
        }
        Collection<Edge> edges(int src) {
            return matrix.get(src).values();
        }
    }
    static void f(long[] ans,
                  AdjacencyMatrix m,
                  boolean[] visited,
                  Map<Integer, Long> vertexToCounter,
                  int vertexId,
                  long counter) {
        if (visited[vertexId]) {
            return;
        }
        visited[vertexId] = true;
        counter += vertexToCounter.getOrDefault(vertexId, 0L);
        ans[vertexId] += counter;
        for (Edge e : m.edges(vertexId)) {
            f(ans, m, visited, vertexToCounter, e.dest, counter);
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int N = in.nextInt();
        int Q = in.nextInt();
        AdjacencyMatrix m = new AdjacencyMatrix(N);
        for (int i = 0; i < N - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            m.setLength(a, b, 1);
        }
        Map<Integer, Long> vertexToCounter = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            int p = in.nextInt() - 1;
            long x = in.nextLong();
            vertexToCounter.merge(p, x, (v1, v2) -> v1 + v2);
        }
        long[] ans = new long[N];
        boolean[] visited = new boolean[N];
        f(ans, m, visited, vertexToCounter, 0, 0);
        out.println(Arrays.stream(ans)
                          .boxed()
                          .map(String::valueOf)
                          .collect(Collectors.joining(" ")));
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        private final InputStream in;
        MyScanner(InputStream in) {
            this.in = new BufferedInputStream(in);
        }
        private int readByte() {
            try {
                return in.read();
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (int[] element : c) {
                if (a.length != element.length) {
                    return false;
                }
            }
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (char[] element : c) {
                if (a.length != element.length) {
                    return false;
                }
            }
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c)) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c) {
                    d[i] = nextInt();
                }
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c)) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
