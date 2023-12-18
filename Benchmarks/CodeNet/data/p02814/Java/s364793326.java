import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N, M, A[];

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        // s + lcm + lcm + lcm...　みたいなかんじになる
        // sを探したい
        // sはAi/2を奇数倍したものなので2を調達できない
        //  => count_2(Ai)が全部等しい必要がある

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = A[i]/2;
        }

        int cnt2 = count_2(B[0]);
        for (int i = 1; i < N; i++) {
            if( count_2(B[i]) != cnt2 ) return 0;
        }
        int lcm_half = lcm(B);
        if( lcm_half == -1 ) return 0;

        if( lcm_half > M ) return 0;

        int lcm = lcm(A);
        if( lcm == -1 ) return 1;

        return (M - lcm_half) / lcm + 1;
    }

    static int count_2(int n) {
        int ret = 0;
        while(n%2 == 0 ) {
            ret++;
            n/=2;
        }
        return ret;
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int c = a;
            a = b;
            b = c % b;
        }
        return a;
    }

    static int gcd(int[] A) {
        int ret = A[0];
        for (int i = 1; i < A.length; i++) {
            ret = gcd(ret, A[i]);
        }
        return ret;
    }

    static int lcm(int a, int b) {
        int g = gcd(a, b);
        long ret = ((long)a * b) / g;
        if( ret > Integer.MAX_VALUE ) return -1; // overflow
        return (int)ret;
    }

    static int lcm(int[] A) {
        int ret = A[0];
        for (int i = 1; i < A.length; i++) {
            ret = lcm(ret, A[i]);
            if( ret == -1 ) return -1; // overflow
        }
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
}
