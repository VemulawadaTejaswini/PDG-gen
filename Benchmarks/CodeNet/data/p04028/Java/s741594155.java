import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = sc.next();

        System.out.println(solve());
        // debug("jikken", jikken());
    }

    static int MOD = 1_000_000_007;

    static int jikken() {
        char[] t = new char[N];
        return dfs(0, t);
    }

    static int dfs(int idx, char[] t) {
        if( idx == N ) {
            StringBuilder b = new StringBuilder();
            int len = 0;
            for (int i = 0; i < N; i++) {
                if( t[i] == 'B' ) {
                    if( len > 0 ) {
                        b.deleteCharAt(len-1);
                        len--;
                    } else {

                    }
                } else {
                    b.append(t[i]);
                    len++;
                }
            }
            if( S.equals(b.toString()) ) {
                debug(new String(t));
                return 1;
            } else {
                return 0;
            }
        }

        int cnt = 0;
        t[idx] = 'B';
        cnt += dfs(idx+1, t);
        t[idx] = '0';
        cnt += dfs(idx+1, t);
        t[idx] = '1';
        cnt += dfs(idx+1, t);
        return cnt;
    }

    static int solve() {
        int M = S.length();
        int[][] dp = new int[N+1][N+1];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                // B
                if( j > 0 ) {
                    dp[i+1][j-1] = add(dp[i+1][j-1], dp[i][j]);
                } else {
                    dp[i+1][j] = add(dp[i+1][j], dp[i][j]);
                }

                // 01
                dp[i+1][j+1] = add(dp[i+1][j+1], mul(dp[i][j], 2));
            }
        }

        return div(dp[N][S.length()], pow(2, M));
    }

    static int pow(int base, int exp) {
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
