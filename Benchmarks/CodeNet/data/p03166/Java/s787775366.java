import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Main {
    private static final class Edge {
        final int src;
        final int dest;
        final long weight;
        Edge(int src, int dest, long weight) {
            if (src < 0 || dest < 0) {
                throw new IllegalArgumentException();
            }
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        Edge reverse() {
            return new Edge(dest, src, weight);
        }
        static Edge[][] newSrcToEdges(int vertexCount,
                                      Edge[] edges,
                                      boolean directedGraph) {
            int[] edgeCount = new int[vertexCount];
            for (Edge e : edges) {
                edgeCount[e.src]++;
                if (!directedGraph) {
                    edgeCount[e.dest]++;
                }
            }
            Edge[][] srcToEdges = new Edge[vertexCount][];
            for (int i = 0; i < vertexCount; i++) {
                srcToEdges[i] = new Edge[edgeCount[i]];
                edgeCount[i] = 0;
            }
            for (Edge e : edges) {
                srcToEdges[e.src][edgeCount[e.src]] = e;
                edgeCount[e.src]++;
                if (!directedGraph) {
                    srcToEdges[e.dest][edgeCount[e.dest]] = e.reverse();
                    edgeCount[e.dest]++;
                }
            }
            return srcToEdges;
        }
        @Override
        public int hashCode() {
            return Objects.hash(dest, src, weight);
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
                   && weight == other.weight;
        }
        @Override
        public String toString() {
            return "Edge [src="
                   + src
                   + ", dest="
                   + dest
                   + ", weight="
                   + weight
                   + "]";
        }
    }
    private static int dfs(Edge[][] srcToEdges, int[] dp, int vertex) {
        if (dp[vertex] != -1) {
            return dp[vertex];
        }
        int result = 0;
        for (Edge e : srcToEdges[vertex]) {
            result = Math.max(result, dfs(srcToEdges, dp, e.dest) + 1);
        }
        dp[vertex] = result;
        return result;
    }
    static void solve(MyScanner in, MyWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        Edge[] edges = new Edge[M];
        for (int i = 0; i < M; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            edges[i] = new Edge(x - 1, y - 1, 1);
        }
        Edge[][] srcToEdges = Edge.newSrcToEdges(N, edges, true);
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, dfs(srcToEdges, dp, i));
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
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
        void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        void joinAndPrintln(long[] x, String delimiter) {
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
