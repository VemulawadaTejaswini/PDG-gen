import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    static int N, QN;
    static int[] A, Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        QN = sc.nextInt();
        A = sc.nextIntArray(N);
        Q = sc.nextIntArray(QN);

        writeLines( solve() );
    }

    static long[] C;
    static long[] E;

    static long[] solve() {
        C = new long[N+1];
        for (int i = 1; i <= N; i++) {
            C[i] = C[i-1] + A[i-1];
        }
        
        E = new long[N];
        E[0] = A[0];
        for (int i = 1; i < N; i++) {
            E[i] = E[i-1];
            if( i % 2 == 0 ) {
                E[i] += A[i];
            }
        }

        long[] ans = new long[QN];
        for (int i = 0; i < QN; i++) {
            ans[i] = calc(Q[i]);
        }
        return ans;
    }

    static long calc(int q) {
        int mt = maximize(0, N, t -> isOk(t, q));

        int compe = A[N-1-mt];
        int otherSize = (N-1-mt-mt >= 0) ? A[N-1-mt-mt] : Integer.MIN_VALUE;

        long tak = C[N] - C[N-mt];
        int r;
        if( Math.abs(q-otherSize) <= Math.abs(compe-q) ) {
            // compeは高橋君が取る
            tak += compe;
            r = N - (mt+1) * 2;
        } else {
            r = N - mt *2;
        }

        // rを高橋君から取得する
        // rはminusの可能性があるので注意する
        if( r <= 0 ) return tak;

        if( N % 2 == 0 ) {
            // 0, 1, 2, 3, 4, 5の
            // 1, 3, 5が欲しい
            return tak + (C[r] - E[r-1]);
        } else {
            // 0, 1, 2, 3, 4の
            // 0, 2, 4が欲しい
            return tak + E[r-1];
        }
    }

    // t: 経過turn数
    static boolean isOk(int t, int q) {
        if( t == 0 ) return true;

        // 高橋君は t個確保している -> [n-t, n-1] が高橋君のもの
        // 青木君は高橋君が確保したもの以外をぶつからずに確保できるか

        // 右側(同じ値含む)で確保しうる数
        int r = count(q, A[N-t], A);
        // 右側だけでok
        if( r >= t ) return true;

        // 足りない分を左側に求める必要があるので足りてるかどうか調べる
        int d = A[N-1-t] - q;
        int l = count(q-d, q, A);

        return l + r >= t;
    }

    static int maximize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    // [from, to)
    static int count(int from, int to, int[] array) {
        int f = lowerBound(array, from);
        int t = lowerBound(array, to);
        return t - f;
    }

    static int lowerBound(int[] array, int value) {
        int low = 0;
        int high = array.length;
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( array[mid] < value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
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
