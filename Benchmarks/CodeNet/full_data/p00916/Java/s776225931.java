import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] RECT;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(true) {
            N = sc.nextInt();
            if( N == 0 ) break;

            RECT = new int[N][4];
            for (int i = 0; i < N; i++) {
                RECT[i][0] = sc.nextInt();
                RECT[i][1] = sc.nextInt();
                RECT[i][2] = sc.nextInt();
                RECT[i][3] = sc.nextInt();
            }
            pw.println( solve() );
        }
        pw.flush();
    }

    static int solve() {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int l = RECT[i][0];
            int t = RECT[i][1];
            int r = RECT[i][2];
            int b = RECT[i][3];

            xSet.add(l);
            ySet.add(t);
            xSet.add(r);
            ySet.add(b);
        }
        xSet.add(-1);
        xSet.add(1_000_000_000);
        ySet.add(-1);
        ySet.add(1_000_000_000);
        int[] xs = xSet.stream().mapToInt(i -> i).toArray();
        int[] ys = ySet.stream().mapToInt(i -> i).toArray();
        Arrays.sort(xs);
        Arrays.sort(ys);
        Map<Integer, Integer> xIdx = new HashMap<>();
        for (int i = 0; i < xs.length; i++) {
            xIdx.put(xs[i], i);
        }
        Map<Integer, Integer> yIdx = new HashMap<>();
        for (int i = 0; i < ys.length; i++) {
            yIdx.put(ys[i], i);
        }

        int X = xs.length;
        int Y = ys.length;
        long[][] C = new long[X][Y];

        for (int i = 0; i < N; i++) {
            int l = RECT[i][0];
            int t = RECT[i][1];
            int r = RECT[i][2];
            int b = RECT[i][3];

            long v = 1L << i;
            C[xIdx.get(l)][yIdx.get(b)] += v;
            C[xIdx.get(l)][yIdx.get(t)] -= v;
            C[xIdx.get(r)][yIdx.get(b)] -= v;
            C[xIdx.get(r)][yIdx.get(t)] += v;
        }

        accumlate(X, Y, C);

        q = new int[X * Y];

        // 連結成分
        int ans = 0;
        boolean[][] done = new boolean[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if( !done[i][j] ) {
                    bfs(i, j, X, Y, C, done);
                    ans++;
                }
            }
        }
        return ans;
    }

    static int[] q;

    static void bfs(int sx, int sy, int X, int Y, long[][] C, boolean[][] done) {
        int u = 0, v = 0;
        q[v++] = sy * 1000 + sx;
        done[sx][sy] = true;
        long sc = C[sx][sy];

        while(u != v) {
            int xy = q[u++];
            int x = xy % 1000;
            int y = xy / 1000;

            for (int i = 0; i < 4; i++) {
                int nx = x + DX[i];
                int ny = y + DY[i];

                if( inRange(nx, ny, X, Y) && C[nx][ny] == sc && !done[nx][ny]) {
                    done[nx][ny] = true;
                    q[v++] = ny * 1000 + nx;
                }
            }
        }
    }

    static int[] DX = {1, 0, -1, 0};
    static int[] DY = {0, 1, 0, -1};

    static boolean inRange(int x, int y, int X, int Y) {
        return 0 <= x && x < X && 0 <= y && y < Y;
    }

    static void accumlate(int h, int w, long[][] c) {
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                c[i][j] += c[i][j-1];
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = 1; i < h; i++) {
                c[i][j] += c[i-1][j];
            }
        }
    }

    // 左上が (h1, w1), 左下が(h2, w2), 閉区間
    long get(int h1, int w1, int h2, int w2, int[][] c) {
        // d c
        // b a
        int abcd = c[h2][w2];

        int cd;
        if( h1 > 0 ) {
            cd = c[h1-1][w2];
        } else {
            cd = 0;
        }

        int bd;
        if( w1 > 0 ) {
            bd = c[h2][w1-1];
        } else {
            bd = 0;
        }

        int d;
        if( w1 > 0 && h1 > 0 ) {
            d = c[h1-1][w1-1];
        } else {
            d = 0;
        }

        return abcd - cd - bd + d;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

