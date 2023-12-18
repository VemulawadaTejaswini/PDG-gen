import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class Main {

    static int N, K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        int sum = Arrays.stream(A).sum();

        int[] divs = enumDividors(sum);
        Arrays.sort(divs);

        for (int i = divs.length - 1; i >= 0; i--) {
            int d = divs[i];

            int[] M = new int[N];
            for (int j = 0; j < N; j++) {
                M[j] = A[j] % d;
            }
            Arrays.sort(M);
            long[] C = new long[N+1];
            long[] D = new long[N+1];
            for (int j = 0; j < N; j++) {
                C[j+1] = C[j] + M[j];
                D[j+1] = D[j] + (d-M[j]);
            }

            // -/+に分ける
            long best = Long.MAX_VALUE;
            for (int j = 1; j <= N-1; j++) {
                long m = C[j];
                long p = D[N] - D[j];
                best = Math.min(best, Math.min(m, p) + Math.abs(m-p));
            }
            if( best <= K ) return d;
        }
        return -1;
    }

    static int[] enumDividors(int n) {
        int[][] factors = enumFactorCounts(n);
        int[] cnt = new int[1];
        enumDividorsDfs(0, factors, 1, x -> cnt[0]++ );
        int[] dividors = new int[cnt[0]];
        enumDividorsDfs(0, factors, 1, x -> dividors[--cnt[0]] = x );
        return dividors;
    }

    static void enumDividorsDfs(int idx, int[][] factors, int n, IntConsumer c) {
        if( factors.length == idx || factors[idx] == null ) {
            c.accept(n);
            return;
        }

        int f = factors[idx][0];
        int cnt = factors[idx][1];
        for (int i = 0; i <= cnt; i++) {
            enumDividorsDfs(idx+1, factors, n, c);
            n *= f;
        }
    }

    static int[][] enumFactorCounts(int n) {
        List<int[]> fs = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int cnt = 0;
            while( n % i == 0 ) {
                n/=i;
                cnt++;
            }
            if( cnt > 0 ) {
                fs.add(new int[]{i, cnt});
            }
        }
        if( n != 1 ) {
            fs.add(new int[]{n, 1});
        }
        int[][] ret = new int[fs.size()][];
        for (int i = 0; i < fs.size(); i++) {
            ret[i] = fs.get(i);
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
