import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(1 << N);

        writeLines(solve());
    }

    static int[] solve() {
        int[][] dp = new int[1<<N][];
        dp[0] = new int[]{0, -1};

        int M = (1<<N)-1;
        dfs(M, dp);
        int[] ans = new int[M];
        for (int i = 1; i <= M; i++) {
            ans[i-1] = Math.max(A[dp[i][0]] + A[dp[i][1]], i == 1 ? 0 : ans[i-2]);
        }
        return ans;
    }

    static int[] dfs(int n, int[][] dp) {
        if( dp[n] != null ) return dp[n];

        if( Integer.bitCount(n) == 1 ) {
            dp[n] = new int[]{0, n};
            return dp[n];
        }

        Set<Integer> nodes = new HashSet<>();
        nodes.add(n);
        for (int i = 0; i < N; i++) {
            if( (n & 1<<i) > 0 ) {
                int[] result = dfs(n & ~(1<<i), dp);
                nodes.add(result[0]);
                nodes.add(result[1]);
            }
        }

        int idx = 0;
        int[][] values = new int[nodes.size()][2];
        for (Integer node : nodes) {
            values[idx][0] = node;
            values[idx][1] = A[node];
            idx++;
        }

        Arrays.sort(values, Comparator.<int[]>comparingInt(arr -> arr[1]).reversed());
        int[] ret = new int[2];
        ret[0] = values[0][0];
        ret[1] = values[1][0];
        dp[n] = ret;
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
