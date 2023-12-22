import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        AddSum seg = new AddSum(N);
        PrintWriter pw = new PrintWriter(System.out);

        // 他の問題で0-originだったのにこっちでは1-origin...
        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            if( type == 0 ) { // add
                int s = sc.nextInt()-1;
                int t = sc.nextInt()-1;
                int x = sc.nextInt();
                seg.update(s, t+1, x);

            } else { // sum
                int s = sc.nextInt()-1;
                int t = sc.nextInt()-1;
                pw.println( seg.query(s, t+1) );
            }
        }
        pw.flush();
    }

    static class AddSum {
        int size;
        long[] all;
        long[] part;

        AddSum(int size) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.all = new long[this.size*2];
            this.part = new long[this.size*2];
        }

        // [from, to)
        void update(int from, int to, long v) {
            _update(from, to, 1, 0, size, v);
        }

        void _update(int from, int to, int idx, int l, int r, long v) {
            if (from <= l && r <= to) {
                all[idx] += v;

            } else if(l < to && from < r) {
                part[idx] += (Math.min(to ,r) - Math.max(from, l)) * v;

                int mid = (l+r)/2;
                if (from < mid) _update(from, to, idx*2, l, mid, v);
                if (mid < to) _update(from, to, idx*2+1, mid, r, v);
            }
        }

        // [from, to)
        long query(int from, int to) {
            return _query(from, to, 1, 0, size);
        }

        long _query(int from, int to, int idx, int l, int r) {
            if (from <= l && r <= to) {
                return all[idx]*(r-l) + part[idx];

            } else if(l < to && from < r) {
                long ret = 0;
                ret += (Math.min(to ,r) - Math.max(from, l)) * all[idx];
                int mid = (l+r)/2;
                if (from < mid) ret += _query(from, to, idx*2, l, mid);
                if (mid < to) ret += _query(from, to, idx*2+1, mid, r);
                return ret;

            } else {
                return 0;
            }
        }
    }

    static class AddMax {

        static AddMax MAX(int size) {
            return new AddMax(size, Math::max, Long.MIN_VALUE);
        }

        static AddMax MIN(int size) {
            return new AddMax(size, Math::min, 2147483647);
        }

        int size;
        long[] add;
        long[] max;
        LongBinaryOperator op;
        long id;

        AddMax(int size, LongBinaryOperator op, long id) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.add = new long[this.size*2];
            this.max = new long[this.size*2];
            this.op = op;
            this.id = id;
        }

        // [from, to)
        void update(int from, int to, long v) {
            _update(from, to, 1, 0, size, v);
        }

        void _update(int from, int to, int idx, int l, int r, long v) {
            if( r <= from || to <= l ) return;

            if (from <= l && r <= to) {
                add[idx] += v;
                return;
            }

            int mid = (l+r)/2;
            if (from < mid) _update(from, to, idx*2, l, mid, v);
            if (mid < to) _update(from, to, idx*2+1, mid, r, v);
            max[idx] = op.applyAsLong(add[idx*2] + max[idx*2], add[idx*2+1] + max[idx*2+1]);
        }

        // [from, to)
        long query(int from, int to) {
            return _query(from, to, 1, 0, size);
        }

        long _query(int from, int to, int idx, int l, int r) {
            if( r <= from || to <= l ) return id;

            if (from <= l && r <= to) {
                return add[idx] + max[idx];
            }

            int mid = (l+r)/2;
            long lo = _query(from, to, idx*2, l, mid);
            long hi = _query(from, to, idx*2+1, mid, r);
            return op.applyAsLong(lo, hi) + add[idx];
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

