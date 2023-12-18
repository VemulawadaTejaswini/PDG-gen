import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        long[][] dp = new long[5][N+1];
        for (long[] arr : dp) {
            Arrays.fill(arr, Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;

        IntUnaryOperator cost1 = i -> {
            int a = A[i];
            if( a == 0 ) {
                return 1;
            } else {
                return a % 2 == 1 ? 0 : 1;
            }
        };

        IntUnaryOperator cost2 = i -> {
            int a = A[i];
            if( a == 0 ) {
                return 2;
            } else {
                return a % 2 == 0 ? 0 : 1;
            }
        };

        // debug("[" + 0 + "]", dp[0][0], dp[1][0], dp[2][0], dp[3][0], dp[4][0]);

        for (int i = 0; i < N; i++) {
            // debug("cost", A[i], cost1.applyAsInt(i), cost2.applyAsInt(i));
            // 0 -> [0, 2, 1, 2, 0]
            dp[0][i+1] = Math.min(dp[0][i+1], dp[0][i] + A[i]);
            dp[1][i+1] = Math.min(dp[1][i+1], dp[0][i] + cost2.applyAsInt(i));
            dp[2][i+1] = Math.min(dp[2][i+1], dp[0][i] + cost1.applyAsInt(i));
            dp[3][i+1] = Math.min(dp[3][i+1], dp[0][i] + cost2.applyAsInt(i));
            dp[4][i+1] = Math.min(dp[4][i+1], dp[0][i] + A[i]);

            // 2 -> [2, 1, 2, 0]
            dp[1][i+1] = Math.min(dp[1][i+1], dp[1][i] + cost2.applyAsInt(i));
            dp[2][i+1] = Math.min(dp[2][i+1], dp[1][i] + cost1.applyAsInt(i));
            dp[3][i+1] = Math.min(dp[3][i+1], dp[1][i] + cost2.applyAsInt(i));
            dp[4][i+1] = Math.min(dp[4][i+1], dp[1][i] + A[i]);

            // 1 -> [1, 2, 0]
            dp[2][i+1] = Math.min(dp[2][i+1], dp[2][i] + cost1.applyAsInt(i));
            dp[3][i+1] = Math.min(dp[3][i+1], dp[2][i] + cost2.applyAsInt(i));
            dp[4][i+1] = Math.min(dp[4][i+1], dp[2][i] + A[i]);

            // 2 -> [2, 0]
            dp[3][i+1] = Math.min(dp[3][i+1], dp[3][i] + cost2.applyAsInt(i));
            dp[4][i+1] = Math.min(dp[4][i+1], dp[3][i] + A[i]);

            // 0 -> 0
            dp[4][i+1] = Math.min(dp[4][i+1], dp[4][i] + A[i]);

            // debug("[" + (i+1) + "]", dp[0][i+1], dp[1][i+1], dp[2][i+1], dp[3][i+1], dp[4][i+1]);
        }

        long ans = Long.MAX_VALUE / 2;
        for (int i = 0; i < 5; i++) {
            ans = Math.min(dp[i][N], ans);
        }
        return ans;
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
