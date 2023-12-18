import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Main {
    static final class Edge {
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
        int src() {
            return src;
        }
        int dest() {
            return dest;
        }
        long weight() {
            return weight;
        }
        Edge reverse() {
            return new Edge(dest, src, weight);
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
        static List<Edge> newEdges(int[] oneBasedSrc,
                                   int[] oneBasedDest,
                                   boolean directedGraph) {
            return newEdges(oneBasedSrc, oneBasedDest, null, directedGraph);
        }
        static List<Edge> newEdges(int[] oneBasedSrc,
                                   int[] oneBasedDest,
                                   int[] weight,
                                   boolean directedGraph) {
            if (oneBasedSrc.length != oneBasedDest.length
                || (weight != null && oneBasedSrc.length != weight.length)) {
                throw new IllegalArgumentException();
            }
            List<Edge> result = new ArrayList<>(oneBasedSrc.length
                                                * (directedGraph ? 1 : 2));
            for (int i = 0; i < oneBasedDest.length; i++) {
                Edge e = new Edge(oneBasedSrc[i] - 1,
                                  oneBasedDest[i] - 1,
                                  weight == null ? 1 : weight[i]);
                result.add(e);
                if (!directedGraph) {
                    result.add(e.reverse());
                }
            }
            return result;
        }
        static List<List<Edge>> newSrcToEdges(int vertexCount,
                                              Collection<Edge> edges) {
            int[] edgeCount = new int[vertexCount];
            for (Edge e : edges) {
                edgeCount[e.src]++;
            }
            List<List<Edge>> result =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            for (int i = 0; i < vertexCount; i++) {
                result.set(i, new ArrayList<>(edgeCount[i]));
            }
            for (Edge e : edges) {
                result.get(e.src).add(e);
            }
            return result;
        }
        static List<List<Edge>> newDestToEdges(int vertexCount,
                                               Collection<Edge> edges) {
            int[] edgeCount = new int[vertexCount];
            for (Edge e : edges) {
                edgeCount[e.dest]++;
            }
            List<List<Edge>> result =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            for (int i = 0; i < vertexCount; i++) {
                result.set(i, new ArrayList<>(edgeCount[i]));
            }
            for (Edge e : edges) {
                result.get(e.dest).add(e);
            }
            return result;
        }
    }
    private static double f(double[] dp,
                            List<List<Edge>> srcToEdges,
                            int vertexId) {
        if (vertexId == dp.length - 1) {
            return 0.0;
        }
        if (dp[vertexId] != 0.0) {
            return dp[vertexId];
        }
        List<Edge> edges = srcToEdges.get(vertexId);
        double a = 0.0;
        for (Edge edge : edges) {
            a += f(dp, srcToEdges, edge.dest);
        }
        return dp[vertexId] = a / edges.size() + 1.0;
    }
    private static double g(double[] dp,
                            List<List<Edge>> srcToEdges,
                            int vertexId,
                            Edge maxExpectationEdge) {
        if (vertexId == dp.length - 1) {
            return 0.0;
        }
        if (dp[vertexId] != 0.0) {
            return dp[vertexId];
        }
        List<Edge> edges = srcToEdges.get(vertexId);
        int edgeCount = edges.size();
        double a = 0.0;
        for (Edge edge : edges) {
            if (maxExpectationEdge.equals(edge)) {
                edgeCount--;
            } else {
                a += g(dp, srcToEdges, edge.dest, maxExpectationEdge);
            }
        }
        return dp[vertexId] = a / edgeCount + 1.0;
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] s = new int[m];
        int[] t = new int[m];
        in.nextVerticalIntArrays(s, t);

        List<Edge> edges = Edge.newEdges(s, t, true);
        List<List<Edge>> srcToEdges = Edge.newSrcToEdges(n, edges);
        double[] dp = new double[n];
        double ans = f(dp, srcToEdges, 0);
        for (int i = 0; i < n; i++) {
            if (srcToEdges.get(i).size() <= 1) {
                continue;
            }
            Edge maxExpectationEdge = srcToEdges.get(i).get(0);
            double maxExpectation = dp[maxExpectationEdge.dest];
            for (int j = 1; j < srcToEdges.get(i).size(); j++) {
                Edge e = srcToEdges.get(i).get(j);
                if (maxExpectation < dp[e.dest]) {
                    maxExpectation = dp[e.dest];
                    maxExpectationEdge = e;
                }
            }
            ans = Math.min(ans,
                           g(new double[n], srcToEdges, 0, maxExpectationEdge));
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
