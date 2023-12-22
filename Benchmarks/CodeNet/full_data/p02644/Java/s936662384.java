import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    int h;
    int w;
    int k;
    char[][] c;
    void solve(MyScanner in, MyWriter out) {
        h = in.nextInt();
        w = in.nextInt();
        k = in.nextInt();
        int x1 = in.nextInt() - 1;
        int y1 = in.nextInt() - 1;
        int x2 = in.nextInt() - 1;
        int y2 = in.nextInt() - 1;
        c = in.next2dCharArray(h, w);
        Vertex[][][] dist = dijkstra(x1, y1);
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            Vertex v = dist[x2][y2][i];
            if (v != null)
                ans = Math.min(ans, v.dist);
        }
        out.println(ans == Long.MAX_VALUE ? -1 : ans);
    }
    private static final int[] di = {-1, 0, 1, 0};
    private static final int[] dj = {0, 1, 0, -1};
    private Vertex[][][] dijkstra(int startI, int startJ) {
        var done = new boolean[h][w][4];
        var dist = new Vertex[h][w][4];
        dist[startI][startJ][0] = new Vertex(startI, startJ, 0, k, 0);
        var q = new PriorityQueue<Vertex>();
        q.offer(dist[startI][startJ][0]);
        while (!q.isEmpty()) {
            Vertex v = q.poll();
            if (done[v.i][v.j][v.dir])
                continue;
            done[v.i][v.j][v.dir] = true;
            for (int dir = 0; dir < 4; dir++) {
                if (dir == v.dir) {
                    int ni = v.i + di[dir];
                    int nj = v.j + dj[dir];
                    if (nj < 0 || nj >= w || ni < 0 || ni >= h)
                        continue;
                    if (c[ni][nj] == '@')
                        continue;
                    if (done[ni][nj][v.dir])
                        continue;
                    var newv = new Vertex(ni,
                                          nj,
                                          v.dir,
                                          (v.currentK + 1) % (k + 1),
                                          v.dist + (v.currentK == k ? 1 : 0));
                    Vertex oldv = dist[ni][nj][v.dir];
                    if (oldv == null || oldv.compareTo(newv) > 0) {
                        dist[ni][nj][v.dir] = newv;
                        q.offer(newv);
                    }
                } else {
                    for (int nextDir = 0; nextDir < 4; nextDir++) {
                        if (dir == nextDir)
                            continue;
                        var newv = new Vertex(v.i, v.j, nextDir, 0, v.dist + 1);
                        Vertex oldv = dist[v.i][v.j][nextDir];
                        if (oldv == null || oldv.compareTo(newv) > 0) {
                            dist[v.i][v.j][nextDir] = newv;
                            q.offer(newv);
                        }
                    }
                }
            }
        }
        return dist;
    }
    private static final class Vertex implements Comparable<Vertex> {
        final int i;
        final int j;
        final int dir;
        final int currentK;
        final long dist;
        Vertex(int i, int j, int dir, int currentK, long dist) {
            this.i = i;
            this.j = j;
            this.dir = dir;
            this.currentK = currentK;
            this.dist = dist;
        }
        int currentK() {
            return currentK;
        }
        long dist() {
            return dist;
        }
        static final Comparator<Vertex> COMP =
                Comparator.comparingLong(Vertex::dist)
                          .thenComparingInt(Vertex::currentK);
        @Override
        public int compareTo(Vertex o) {
            return COMP.compare(this, o);
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
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
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
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
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
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
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
