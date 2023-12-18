import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntFunction;

public class Main {

    static int H, W, h, w;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        h = sc.nextInt();
        w = sc.nextInt();

        int[][] ans = solve();
        if( ans != null ) {
            PrintWriter pw = new PrintWriter(System.out);
            pw.println("Yes");
            for (int i = 0; i < H; i++) {
                StringJoiner sj = new StringJoiner(" ");
                for (int j = 0; j < W; j++) {
                    sj.add( String.valueOf(ans[i][j]) );
                }
                pw.println(sj.toString());
            }
            pw.flush();

        } else {
            System.out.println("No");
        }
    }

    static int[][] solve() {
        if( h == 1 && w == 1 ) {
            return null;

        } else if( h == 1 ) {
            // h' = 1, w' = 2w - 1
            // h'w'でHWを被覆するときに何個必要か
            int w_dash = 2*w-1;
            return gen( i -> OptionalInt.of(1), j -> isCenter(W, w_dash, j) );

        } else if( w == 1 ) {
            int h_dash = 2*h-1;
            return gen( i -> isCenter(H, h_dash, i), j -> OptionalInt.of(1) );

        } else {
            int w_dash = 2*w-1;
            int h_dash = 2*h-1;
            return gen( i -> isCenter(H, h_dash, i), j -> isCenter(W, w_dash, j) );
        }
    }

    // nの長さをwの何かで被覆するときiはその中心か
    // wは奇数前提
    static OptionalInt isCenter(int n, int w, int i) {
        int q = n / w;
        int r = n % w;

        if( i < w * q ) {
            if( i % w == w / 2 ) {
                return OptionalInt.of(w/2 + 1);
            } else {
                return OptionalInt.empty();
            }

        } else {
            // 余りの部分のどこか真ん中に置けば大丈夫、だろう
            if( i % w == r/2 ) {
                return OptionalInt.of(w/2 + 1);
            } else {
                return OptionalInt.empty();
            }
        }
    }

    static int[][] gen(IntFunction<OptionalInt> fh, IntFunction<OptionalInt> fw) {
        int[][] ret = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                OptionalInt h = fh.apply(i);
                OptionalInt w = fw.apply(j);
                if( h.isPresent() && w.isPresent() ) {
                    ret[i][j] = - h.getAsInt() * w.getAsInt();
                } else {
                    ret[i][j] = 1;
                }
            }
        }

        // チェック
        int sum = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                sum += ret[i][j];
            }
        }
        return sum > 0 ? ret : null;
    }

    static class Center {
        int w;

        public Center(int w) {
            this.w = w;
        }
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
            pw.print(i);
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg == null ? "null" : arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(array[i]);
        }
        System.out.println();
    }

    static int lowerBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] < value) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int upperBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] <= value) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
