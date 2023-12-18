import java.io.*;
import java.util.*;
import java.util.function.ToIntFunction;

public class Main {

    static int N;
    static Machine[] M;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = new Machine[N];
        for (int i = 0; i < N; i++) {
            M[i] = new Machine(sc.nextInt(), sc.nextInt());
        }

        System.out.println(solve());
    }

    static int solve() {
        Arrays.sort(M, Comparator.comparingInt(m -> m.x));

        // どこまで届くか
        //   正直もっとマシなやりようがありそう...
        RangeGet reach = new RangeGet(N, RangeGet.MAX);
        for (int i = N - 1; i >= 0; i--) {
            if( i == N-1 ) {
                reach.update(i, N-1);
            } else {
                Machine me = M[i];
                int idx = lowerBound(M, m -> m.x, me.x + me.d);
                int max = Math.max((int)reach.query(i, idx), idx-1);
                reach.update(i, max);
            }
        }

        int sum = 0;
        ArrayDeque<Node> q = new ArrayDeque<>();

        // 空集合相当
        q.add(new Node(Integer.MAX_VALUE, 1));
        sum++;

        for (int i = N-1; i >= 0; i--) {
            int curr = sum;
            int reachIdx = (int)reach.get(i);
            // 起動する -> 届く範囲のものを消す
            while( !q.isEmpty() ) {
                Node node = q.pollFirst();
                if( node.idx <= reachIdx ) {
                    // remove
                    sum -= node.cnt;

                } else {
                    // 戻す
                    q.addFirst(node);
                    break;
                }
            }

            // 起動しない
            q.addFirst( new Node(i, curr) );
            sum += curr;
        }

        int ans = 0;
        while(!q.isEmpty()) {
            Node node = q.pollFirst();
            ans = add(ans, node.cnt);
        }
        return ans;
    }

    static class Node {
        int idx;
        int cnt;

        public Node(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }
    }

    static class RangeGet {

        interface Monoid {
            long identity();
            long apply(long a, long b);
        }

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

    static <A> int lowerBound(A[] array, ToIntFunction<A> f, int value) {
        int low = 0;
        int high = array.length;
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( f.applyAsInt(array[mid]) < value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    static int MOD = 998244353;

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
    }

    static class Machine {
        final int x, d;

        public Machine(int x, int d) {
            this.x = x;
            this.d = d;
        }
    }

    static class FenwickTree {
        interface Monoid {
            long identity();
            long apply(long a, long b);
            long inverse(long a);
        }

        static Monoid SUM = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return a+b; }
            public long inverse(long a) { return -a; }
        };

        static Monoid MAX = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return Math.max(a, b); }
            public long inverse(long a) { throw new RuntimeException("no inverse"); }
        };


        int size;
        long[] bit;
        Monoid m;
        long identity;

        FenwickTree(int size, Monoid m) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.bit = new long[this.size+1];
            this.identity = m.identity();
            if( this.identity != 0 ) {
                Arrays.fill(this.bit, this.identity);
            }
            this.m = m;
        }

        void add(int i, long v) {
            i++; // 0 index -> 1 index

            while( i <= size ) {
                bit[i] = m.apply(bit[i], v);
                i += i & -i;
            }
        }

        // [0, r)
        long query(int r) {
            // 0 index -> 1 index -> -1
            long ret = identity;
            while(r > 0) {
                ret = m.apply(ret, bit[r]);
                r -= r & -r;
            }
            return ret;
        }

        long query(int l, int r) {
            return query(r) + m.inverse(query(l));
        }

        int lowerBound(int v) {
            if( bit[size] < v ) return size;

            int x = 0;
            for (int k = size/2; k > 0; k /= 2 ) {
                if( bit[x + k] < v ) {
                    v -= bit[x+k];
                    x += k;
                }
            }
            return x;
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
}
