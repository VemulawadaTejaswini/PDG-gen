import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int H, W;
    static char[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        C = new char[H][];
        for (int i = 0; i < H; i++) {
            C[i] = sc.next().toCharArray();
        }

        System.out.println(solve());
    }

    static int solve() {
        // とりあえず柵を作る
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if( C[h][w] == 'X' ) {
                    if( h == 0 || h == H-1 || w == 0 || w == W-1) {
                        return -1;
                    }

                    for (int i = 0; i < 4; i++) {
                        int nh = DH[i] + h;
                        int nw = DW[i] + w;

                        if( C[nh][nw] == '.' ) {
                            C[nh][nw] = '#';
                        }
                    }
                }
            }
        }

        // 外を塗りつぶす
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if( C[h][w] == '.' ) {
                    bfs(h, w);
                }
            }
        }

        // 外に隣接してない柵は消す
        for (int h = 0; h < H; h++) {
            lo:
            for (int w = 0; w < W; w++) {
                if( C[h][w] != '#' ) continue;

                for (int i = 0; i < 4; i++) {
                    int nh = DH[i] + h;
                    int nw = DW[i] + w;

                    if( inRange(nh, nw) && C[nh][nw] == '0' ) {
                        continue lo;
                    }
                }
                C[h][w] = '.';
            }
        }


//        for (int i = 0; i < H; i++) {
//            debug(new String(C[i]) );
//        }

        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if( C[i][j] == '#' ) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static void bfs(int sh, int sw) {
        int[] q = new int[H*W];
        int u = 0, v = 0;
        q[v++] = sh * W + sw;
        C[sh][sw] = '0';
        while( u != v ) {
            int hw = q[u++];
            int h = hw / W;
            int w = hw % W;

            for (int i = 0; i < 4; i++) {
                int nh = h + DH[i];
                int nw = w + DW[i];
                if( inRange(nh, nw) && C[nh][nw] == '.' ) {
                    q[v++] = nh*W + nw;
                    C[nh][nw] = '0';
                }
            }
        }
    }

    static boolean inRange(int h, int w) {
        return 0 <= h && h < H && 0 <= w && w < W;
    }

    static int[] DH = {0, 1, 0, -1};
    static int[] DW = {1, 0, -1, 0};

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
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
