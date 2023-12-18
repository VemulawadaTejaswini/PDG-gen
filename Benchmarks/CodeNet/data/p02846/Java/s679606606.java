import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Main {

    static int T1, T2;
    static long A1, A2, B1, B2;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        T1 = sc.nextInt();
        T2 = sc.nextInt();
        A1 = sc.nextLong();
        A2 = sc.nextLong();
        B1 = sc.nextLong();
        B2 = sc.nextLong();

        System.out.println(solve());
    }

    static String solve() {
        // 距離にしてしまう
        A1 = A1 * T1;
        A2 = A2 * T2;
        B1 = B1 * T1;
        B2 = B2 * T2;

        if( A1 + A2 == B1 + B2 ) return "infinity";

        // A側を先に行くほうにする
        if( A1 + A2 < B1 + B2 ) {
            long t1 = A1;
            A1 = B1;
            B1 = t1;
            long t2 = A2;
            A2 = B2;
            B2 = t2;
        }

        // 先行する上に前半早いので追いつかない
        if( A1 > B1 ) return "0";

        // Aが後半早い+ 距離も長いのでそのうちBは追いつけなくなる
        // 何ターン目まで追いかけっこが成立するかでわかる
        // 算数するかにぶたんするか
        // ...算数が苦手なのでにぶたんする
        long turn = maximizeL(0, Long.MAX_VALUE/2, t -> {
            // Bが前半のうちにAを上回ることができるか
            // longがoverflowするのでBigInteger
            // 大した回数ではないので問題ない
            BigInteger b = BigInteger.valueOf(B1+B2).multiply(BigInteger.valueOf(t-1)).add(BigInteger.valueOf(B1));
            BigInteger a = BigInteger.valueOf(A1+A2).multiply(BigInteger.valueOf(t-1)).add(BigInteger.valueOf(A1));
            return b.compareTo(a) >= 0;
            // return (B1 + B2) * (t-1) + B1 >= (A1 + A2) * (t-1) + A1;
        });

        // 追っかけっこが成立してるターン * 2
        // 0の分を引く
        long ans = turn*2 - 1;

        // コーナーケース
        // 最後のターンの折り返し地点で同値になっている場合-1
        BigInteger lb = BigInteger.valueOf(B1+B2).multiply(BigInteger.valueOf(turn-1)).add(BigInteger.valueOf(B1));
        BigInteger la = BigInteger.valueOf(A1+A2).multiply(BigInteger.valueOf(turn-1)).add(BigInteger.valueOf(A1));
        if( lb.equals(la) ) {
            ans--;
        }
        return String.valueOf(ans);
    }

    static long maximizeL(long lo, long hi, LongPredicate p) {
        while(lo < hi) {
            long x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
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
