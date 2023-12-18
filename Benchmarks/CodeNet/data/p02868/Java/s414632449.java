import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] LRC;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        LRC = new int[M][3];
        for (int i = 0; i < M; i++) {
            LRC[i][0] = sc.nextInt()-1;
            LRC[i][1] = sc.nextInt()-1;
            LRC[i][2] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static long solve() {
        long INF = Long.MAX_VALUE / 2;
        RangeUpdate seg = new RangeUpdate(N, RangeUpdate.MIN);
        Arrays.sort(LRC, Comparator.comparingInt(lrc -> lrc[0]));
        seg.update(0, 1, 0);

        for (int i = 0; i < M; i++) {
            int l = LRC[i][0];
            int r = LRC[i][1];
            int c = LRC[i][2];

            long curr = seg.get(l);
            // debug(l, r, c, curr);
            if( curr == INF ) return -1;
            seg.update(l+1, r+1, curr+c); // l -> [l+1, r]
        }

        long ans = seg.get(N-1);
        return ans == INF ? -1 : ans;
    }

    static class RangeUpdate {
        interface Monoid {
            long identity();
            long apply(long a, long b);
        }

        static Monoid ADD = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return a + b; }
        };

        static Monoid MAX = new Monoid() {
            public long identity() { return Long.MIN_VALUE / 2; }
            public long apply(long a, long b) { return Math.max(a, b); }
        };

        static Monoid MIN = new Monoid() {
            public long identity() { return Long.MAX_VALUE / 2; }
            public long apply(long a, long b) { return Math.min(a, b); }
        };

        int size;
        long[] tree;
        Monoid m;
        long identity;

        RangeUpdate(int size, Monoid m) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.tree = new long[this.size*2];
            this.m = m;
            this.identity = m.identity();
            if( this.identity != 0 ) {
                Arrays.fill(this.tree, this.identity);
            }
        }

        // [from, to)
        void update(int from, int to, long v) {
            _update(from, to, 1, 0, size, v);
        }

        void _update(int from, int to, int idx, int l, int r, long v) {
            if (from <= l && r <= to) {
                tree[idx] = m.apply(tree[idx], v);
                return;
            }

            int mid = (l+r)/2;
            if (from < mid) _update(from, to, idx*2, l, mid, v);
            if (mid < to) _update(from, to, idx*2+1, mid, r, v);
        }

        long get(int idx) {
            long ret = identity;
            idx += size;
            while( idx > 0 ) {
                ret = m.apply(tree[idx], ret);
                idx /= 2;
            }
            return ret;
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
