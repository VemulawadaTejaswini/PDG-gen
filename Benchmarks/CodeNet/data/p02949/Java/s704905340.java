import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class Main {
    static final class Vertex {
        final int id;
        int distance;
        int previous;
        Vertex(int id) {
            this(id, Integer.MAX_VALUE, -1);
        }
        Vertex(int id, int distance, int previous) {
            if (id < 0 || previous < -1)
                throw new IllegalArgumentException();

            this.id = id;
            this.distance = distance;
            this.previous = previous;
        }
        @Override
        public int hashCode() {
            return Objects.hash(distance, id, previous);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (!(obj instanceof Vertex))
                return false;
            Vertex other = (Vertex)obj;
            return distance == other.distance
                   && id == other.id
                   && previous == other.previous;
        }
        @Override
        public String toString() {
            return "Vertex [id="
                   + id
                   + ", distance="
                   + distance
                   + ", previous="
                   + previous
                   + "]";
        }
    }
    static final class Edge {
        final int src;
        final int dest;
        final int length;
        Edge(int src, int dest, int length) {
            if (src < 0 || dest < 0)
                throw new IllegalArgumentException();

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
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (!(obj instanceof Edge))
                return false;
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
        private static void dfs(Map<Integer, List<Integer>> m,
                                Set<Integer> s,
                                int i) {
            if (s.contains(i))
                return;
            s.add(i);
            for (Integer j : m.getOrDefault(i, Collections.emptyList())) {
                dfs(m, s, j);
            }
        }
        static List<Edge> reachableEdgesFromBothDir(Collection<Edge> edges,
                                                    int src,
                                                    int dest) {
            Map<Integer, List<Integer>> srcToDest = new HashMap<>();
            Map<Integer, List<Integer>> destToSrc = new HashMap<>();
            for (Edge edge : edges) {
                srcToDest.computeIfAbsent(edge.src, k -> new ArrayList<>())
                         .add(edge.dest);
                destToSrc.computeIfAbsent(edge.dest, k -> new ArrayList<>())
                         .add(edge.src);
            }
            Set<Integer> reachableFromSrc = new HashSet<>();
            Set<Integer> reachableFromDest = new HashSet<>();
            dfs(srcToDest, reachableFromSrc, src);
            dfs(destToSrc, reachableFromDest, dest);

            List<Edge> result = new ArrayList<>();
            for (Edge edge : edges) {
                if (reachableFromSrc.contains(edge.src)
                    && reachableFromSrc.contains(edge.dest)
                    && reachableFromDest.contains(edge.src)
                    && reachableFromDest.contains(edge.dest)) {
                    result.add(edge);
                }
            }
            return result;
        }
    }
    static final class BellmanFord {
        static final class NegativeCircleException extends Exception {
        }
        static List<Vertex> exec(int vertexNumber,
                                 Collection<Edge> edges,
                                 int start) throws NegativeCircleException {
            List<Vertex> vertexes = new ArrayList<>(vertexNumber);
            for (int i = 0; i < vertexNumber; i++) {
                vertexes.add(new Vertex(i));
            }
            vertexes.get(start).distance = 0;

            for (int i = 0; i < vertexNumber; i++) {
                for (Edge edge : edges) {
                    Vertex src = vertexes.get(edge.src);
                    Vertex dest = vertexes.get(edge.dest);
                    int newDistance = src.distance + edge.length;
                    if (dest.distance <= newDistance) {
                        continue;
                    }
                    if (i == vertexNumber - 1)
                        throw new NegativeCircleException();
                    dest.distance = newDistance;
                    dest.previous = src.id;
                }
            }
            return vertexes;
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();
        List<Edge> edges = new ArrayList<>(M);
        for (int i = 0; i < M; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            edges.add(new Edge(A - 1, B - 1, -(C - P)));
        }
        List<Edge> reachable = Edge.reachableEdgesFromBothDir(edges, 0, N - 1);
        try {
            List<Vertex> result = BellmanFord.exec(N, reachable, 0);
            out.println(Math.max(0, -result.get(N - 1).distance));
        } catch (BellmanFord.NegativeCircleException e) {
            out.println(-1);
        }
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
            if (c == -1)
                throw new NoSuchElementException();
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
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
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
            if (a.length != b.length)
                return false;
            for (int[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length)
                return false;
            for (char[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
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
            if (c == -1)
                throw new NoSuchElementException();
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
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
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
