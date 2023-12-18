import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static int iinf = 0xfffffff;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        Point.h = h;
        Point.w = w;
        int k = in.nextInt();
        boolean[][] a = new boolean[h][w];
        int sx = -1, sy = -1;
        for (int i = 0; i < h; i++) {
            String s = in.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == 'S') {
                    sx = j;
                    sy = i;
                }
                a[i][j] = s.charAt(j) != '#';
            }
        }
        int[][] dist = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                dist[i][j] = iinf;
            }
        }
        dist[sy][sx] = 0;
        Deque<Point> deque = new ArrayDeque<>();
        deque.addFirst(new Point(sx, sy));
        while (!deque.isEmpty()) {
            Point p = deque.pollLast();
            if (dist[p.y][p.x] == k) {
                continue;
            }
            for (Point q : p.aroundPoints(4)) {
                if (a[q.y][q.x] && dist[q.y][q.x] > dist[p.y][p.x] + 1) {
                    dist[q.y][q.x] = dist[p.y][p.x] + 1;
                    deque.addFirst(q);
                }
            }
        }
        long ans = inf;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (dist[i][j] < iinf) {
                    ans = Math.min(ans, 1 + (Math.min(Math.min(i, j), Math.min(h - 1 - i, w - 1 - j)) + k - 1) / k);
                }
            }
        }
        out.println(ans);
    }


    static class Point implements Comparable<Point> {
        static int h, w;
        static int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};
        int x, y, z;

        Point(int z) {
            this.x = z % w;
            this.y = z / w;
            this.z = z;
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.z = y * w + x;
        }

        Point move(int d) {
            x += da[d];
            y += da[d + 1];
            return this;
        }

        boolean isInner() {
            return 0 <= x && x < w && 0 <= y && y < h;
        }

        List<Point> aroundPoints(int type) {
            List<Point> list = new ArrayList<>();
            for (int i = 0; i < type; i++) {
                int nx = x + da[i];
                int ny = y + da[i + 1];
                Point point = new Point(nx, ny);
                if (point.isInner()) {
                    list.add(point);
                }
            }
            return list;
        }

        @Override
        public int compareTo(Point o) {
            return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
