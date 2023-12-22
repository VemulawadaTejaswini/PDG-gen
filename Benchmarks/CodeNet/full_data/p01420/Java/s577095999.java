import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    static int N, M, L;
    static int[] P, T, V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();

        P = new int[N];
        T = new int[N];
        V = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            T[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }


        double[] ans = solve();
        for (double d : ans) {
            pw.println(BigDecimal.valueOf(d).toPlainString());
        }
        pw.flush();
    }

    static double[] solve() {
        long[] B = calcBinominal(M);

        double[][] prob = new double[N][M+1];
        double[][] probCum = new double[N][M+1];
        for (int i = 0; i < N; i++) {
            double[] use = calcProbs((double)P[i]/100);
            double[] notUse = calcProbs((double)(100-P[i])/100);
            for (int m = M; m >= 0; m--) {
                // Mの休憩所のうちm回休む確率
                double p = use[m] * notUse[M-m] * B[m];
                prob[i][m] = p;
                probCum[i][m] = p;
                if( m != M ) {
                    probCum[i][m] += probCum[i][m+1];
                }
            }
        }

        double[] ans = new double[N];

        for (int i = 0; i < N; i++) {
            for (int m = 0; m <= M; m++) {
                double time = (double)L/V[i] + m * T[i];

                double p = prob[i][m];

                for (int j = 0; j < N; j++) {
                    if( i == j ) continue;
                    int fj = j;
                    int a = minimize(0, M+1, x -> {
                        double s = (double)L/V[fj] + x * T[fj];
                        return s > time;
                    });

                    if( a == M+1 ) {
                        p = 0.0;
                    } else {
                        p *= probCum[j][a];
                    }
                }
                ans[i] += p;
            }
        }

        return ans;
    }

    static int minimize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x + 1;
            }
        }
        return lo;
    }

    static double EPS = 1e-11;

    static double[] calcProbs(double p) {
        double[] probs = new double[M+1];
        probs[0] = 1.0;
        for (int i = 0; i < M; i++) {
            probs[i+1] = probs[i] * p;
        }
        return probs;
    }

    static long[] calcBinominal(int n) {
        long[] b = new long[n+1];
        b[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                b[j] += b[j-1];
            }
        }
        return b;
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

