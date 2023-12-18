import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;

public class Main {
    private static final class Edge {
        final int src;
        final int dest;
        final int weight;
        Edge(int src, int dest, int weight) {
            assert src >= 0;
            assert dest >= 0;

            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        @Override
        public int hashCode() {
            return Objects.hash(dest, src, weight);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (!(obj instanceof Edge))
                return false;
            Edge other = (Edge)obj;
            return dest == other.dest
                   && src == other.src
                   && weight == other.weight;
        }
    }
    private static final class AdjacencyMatrix {
        final int vertexNumber;
        final boolean directedGraph;
        private final List<Map<Integer, Edge>> matrix;
        AdjacencyMatrix(int vertexNumber) {
            this(vertexNumber, false);
        }
        AdjacencyMatrix(int vertexNumber, boolean directedGraph) {
            assert vertexNumber >= 1;
            this.vertexNumber = vertexNumber;
            this.directedGraph = directedGraph;
            matrix = new ArrayList<>(Collections.nCopies(vertexNumber, null));
        }
        void setWeight(int src, int dest, int weight) {
            assert src >= 0 && src < vertexNumber;
            assert dest >= 0 && dest < vertexNumber;

            Map<Integer, Edge> srcMap = matrix.get(src);
            if (srcMap == null)
                matrix.set(src, srcMap = new HashMap<>());
            srcMap.put(dest, new Edge(src, dest, weight));

            if (directedGraph)
                return;

            Map<Integer, Edge> destMap = matrix.get(dest);
            if (destMap == null)
                matrix.set(dest, destMap = new HashMap<>());
            destMap.put(src, new Edge(dest, src, weight));
        }
        Collection<Edge> edges(int src) {
            Map<Integer, Edge> m = matrix.get(src);
            return m == null ? Collections.emptyList() : m.values();
        }
    }
    static void solve(MyScanner in, PrintWriter out) {
        int n = in.nextInt();

        AdjacencyMatrix matrix = new AdjacencyMatrix(n);

        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            matrix.setWeight(a, b, 1);
        }

        int[] c = in.nextIntArray(n);
        Arrays.sort(c);
        int ci = c.length - 1;

        int[] d = new int[n];
        int m = 0;

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        visited[0] = true;
        d[0] = c[ci];
        ci--;
        while (!q.isEmpty()) {
            int src = q.poll();

            for (Edge e : matrix.edges(src)) {
                if (visited[e.dest])
                    continue;
                d[e.dest] = c[ci];
                ci--;
                m += Math.min(d[src], d[e.dest]);
                q.offer(e.dest);
                visited[e.dest] = true;
            }
        }

        out.println(m);
        for (int i = 0; i < d.length - 1; i++) {
            out.print(d[i]);
            out.print(" ");
        }
        out.println(d[d.length - 1]);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            assert c != -1;
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
            assert c != -1;
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                assert '0' <= c && c <= '9' : c;
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            assert Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE : n;
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
            for (int i = 0; i < c.length; i++) {
                if (a.length != c[i].length) {
                    return false;
                }
            }
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (int i = 0; i < c.length; i++) {
                if (a.length != c[i].length) {
                    return false;
                }
            }
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            assert allSameLength(a, b, c);
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
            assert c != -1;
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
            assert allSameLength(a, b, c);
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
}
