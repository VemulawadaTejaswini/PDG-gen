import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int A, B, Q;
    static long[] S, T, X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        Q = sc.nextInt();
        S = sc.nextLongArray(A);
        T = sc.nextLongArray(B);
        X = sc.nextLongArray(Q);

        writeLines(solve());
    }

    static long[] solve() {
        long[] ans = new long[Q];
        for (int i = 0; i < Q; i++) {
            ans[i] = calc(X[i]);
        }
        return ans;
    }

    static long calc(long x) {
        long s1, s2;
        {
            int slo = lowerBound(S, x);
            if (slo == A) {
                s1 = s2 = S[A - 1];
            } else if (slo == 0) {
                s1 = s2 = S[0];
            } else if (S[slo] == x) {
                s1 = s2 = S[slo];
            } else {
                s1 = S[slo - 1];
                s2 = S[slo];
            }
        }
        long t1, t2;
        {
            int tlo = lowerBound(T, x);
            if( tlo == B ) {
                t1 = t2 = T[B-1];
            } else if( tlo == 0 ) {
                t1 = t2 = T[0];
            } else if( T[tlo] == x ) {
                t1 = t2 = T[tlo];
            } else {
                t1 = T[tlo-1];
                t2 = T[tlo];
            }
        }

        long ret = Long.MAX_VALUE / 2;
        ret = Math.min(ret, dist(s1, t1, x));
        ret = Math.min(ret, dist(s1, t2, x));
        ret = Math.min(ret, dist(s2, t1, x));
        ret = Math.min(ret, dist(s2, t2, x));
        return ret;
    }

    static long dist(long s, long t, long x) {
        long ret = Long.MAX_VALUE / 2;
        ret = Math.min(ret, Math.abs(x-s) + Math.abs(s-t));
        ret = Math.min(ret, Math.abs(x-t) + Math.abs(s-t));
        return ret;
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

    static int lowerBound(long[] array, long value) {
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

    static int upperBound(long[] array, long value) {
        int low = 0;
        int high = array.length;
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( array[mid] <= value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
