import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static String S;
    static Query[] Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        N = sc.nextInt();
        S = sc.next();
        int q = sc.nextInt();
        Q = new Query[q];
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if( type == 1 ) {
                Q[i] = new Change(sc.nextInt()-1, sc.next().charAt(0));
            } else {
                Q[i] = new Question(sc.nextInt()-1, sc.nextInt()-1);
            }
        }

        solve(pw);
        pw.flush();
    }

    interface Query {
    }

    static class Change implements Query {
        int idx;
        char c;

        public Change(int idx, char c) {
            this.idx = idx;
            this.c = c;
        }
    }

    static class Question implements Query {
        int l, r;

        public Question(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    static void solve(PrintWriter pw) {
        RangeGet seg = new RangeGet(N, RangeGet.OR);
        for (int i = 0; i < N; i++) {
            int c = S.charAt(i) - 'a';
            seg.update(i, 1 << c);
        }

        for (Query each : Q) {
            if( each instanceof Change ) {
                Change ch = (Change) each;
                seg.update(ch.idx, 1 << (ch.c - 'a'));

            } else {
                Question q = (Question) each;
                long r = seg.query(q.l, q.r+1);
                pw.println(Long.bitCount(r));
            }
        }
    }

    static class RangeGet {

        interface Monoid {
            long identity();
            long apply(long a, long b);
        }

        static Monoid OR = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return a | b; }
        };

        static Monoid MOD_SUM(int mod) {
            return new Monoid() {
                public long identity() { return 0; }
                public long apply(long a, long b) {
                    long c = a + b;
                    if( c >= mod ) {
                        c %= mod;
                    }
                    return c;
                }
            };
        }

        static Monoid SUM = new Monoid() {
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

        RangeGet(int size, Monoid m) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.tree = new long[this.size*2];
            this.m = m;
            this.identity = m.identity();
            if( this.identity != 0 ) {
                Arrays.fill(this.tree, this.identity);
            }
        }

        void update(int idx, long v) {
            idx += size;
            tree[idx] = v;

            while(idx > 0) {
                idx /= 2;
                tree[idx] = m.apply(tree[idx*2], tree[idx*2+1]);
            }
        }

        // [from, to)
        long query(int from, int to) {
            return _query(from, to, 1, 0, size);
        }

        private long _query(int from, int to, int idx, int l, int r) {
            if (r <= from || to <= l) return identity;

            if (from <= l && r <= to) {
                return tree[idx];

            } else {
                int mid = (l+r)/2;
                long vl = _query(from, to, idx*2, l, mid);
                long vr = _query(from, to, idx*2+1, mid, r);
                return m.apply(vl, vr);
            }
        }

        long get(int idx) {
            return tree[idx+size];
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
