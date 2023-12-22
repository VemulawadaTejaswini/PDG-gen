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
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int sy = in.nextInt() - 1;
        int sx = in.nextInt() - 1;
        int gy = in.nextInt() - 1;
        int gx = in.nextInt() - 1;
        char[][] s = in.nextCharGrid(h, w);
        int[][] dp = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(dp[i], iinf);
        }
        Point.h = h;
        Point.w = w;
        dp[sy][sx] = 0;
        Queue<Point> queue = new PriorityQueue<>(Comparator.comparingInt(p -> dp[p.y][p.x]));
        queue.add(new Point(sx, sy));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (Point q : p.neighborPoints(4)) {
                if (s[q.y][q.x] == '.' && dp[q.y][q.x] > dp[p.y][p.x]) {
                    dp[q.y][q.x] = dp[p.y][p.x];
                    queue.add(q);
                }
            }
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    Point np = new Point(p.x + i, p.y + j);
                    if (np.isInner() && s[np.y][np.x] == '.' && !np.equals(p) && dp[np.y][np.x] > dp[p.y][p.x] + 1) {
                        dp[np.y][np.x] = dp[p.y][p.x] + 1;
                        queue.add(np);
                    }
                }
            }
        }
        out.println(dp[gy][gx] == iinf ? -1 : dp[gy][gx]);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Point implements Comparable<Point> {
    static int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};
    static int h = -1, w = -1;
    final int x, y, z;

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
        return new Point(x + da[d], y + da[d + 1]);
    }

    boolean isInner() {
        if (h == -1 || w == -1) {
            throw new IllegalStateException("h/w is not initialized!");
        }
        return 0 <= x && x < w && 0 <= y && y < h;
    }

    List<Point> neighborPoints(int type) {
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

    int direction(Point o) {
        for (int i = 0; i < 8; i++) {
            if (move(i).equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compareTo(Point o) {
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point)o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
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

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
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

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
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

    void println(char[] s) {
        out.println(String.valueOf(s));
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
