import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        System.out.println(solve());
    }

    static long solve() {
        int[] cnt = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            cnt[c-'a']++;
        }
        {
            int odd = 0;
            for (int i = 0; i < 26; i++) {
                if( cnt[i]%2 == 1 ) odd++;
            }
            if( S.length()%2 == 1 ) {
                if( odd != 1 ) return -1;
            } else {
                if( odd != 0 ) return -1;
            }
        }
        
        long ans = 0;
        if( S.length()%2 == 1 ) {
            int odd = -1;
            for (int i = 0; i < 26; i++) {
                if( cnt[i]%2==1 ) {
                    odd = i;
                    break;
                }
            }

            char c = (char)('a' + odd);
            int count = 0;
            int mid = -1;
            for (int i = 0; i < S.length(); i++) {
                if( S.charAt(i) == c ) {
                    count++;
                    if( count == (cnt[odd]+1)/2 ) {
                        mid = i;
                        break;
                    }
                }
            }

            ans += Math.abs(mid-S.length()/2);
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if( i != mid ) {
                    b.append(S.charAt(i));
                }
            }
            S = b.toString();

            debug(S);
        }

        int N = S.length();
        FenwickTree bit = new FenwickTree(N, FenwickTree.SUM);
        ArrayDeque<Integer>[] indice = new ArrayDeque[26];
        for (int i = 0; i < 26; i++) {
            indice[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < N; i++) {
            indice[S.charAt(i)-'a'].addLast(i);
        }
        int done = 0;
        int i = 0;
        while(done < N/2) {
            char c = S.charAt(i);
            if( indice[c-'a'].isEmpty() ) {
                i++;
                continue;
            }
            // debug(indice[c-'a']);
            indice[c-'a'].pollFirst();
            int last = indice[c-'a'].pollLast();

            // last -> N-i-1
            // 抜かれている分を考慮する
            int move = (int)bit.query(last);

            ans += Math.abs(last-move-(N-done-1));
            bit.add(last, 1);
            i++;
            done++;
        }

        return ans;
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
