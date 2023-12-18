import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;

    static int solve() {
        int[] C = new int[N+1];
        for (int i = 0; i < N; i++) {
            C[i+1] = C[i] ^ A[i];
        }

        if( C[N] == 0 ) {
            return solve0(C);
        } else {
            return solveX(C, C[N]);
        }
    }

    static int solve0(int[] C) {
        int znt = 1; // 0の回数
        int[] dp0 = new int[1 << 20];
        Arrays.fill(dp0, 1);
        int[] dpX = new int[1 << 20];
        int[] dpZ = new int[1 << 20]; // 前にXが出現したときの0の回数

        for (int i = 0; i < N; i++) {
            if( C[i] == 0 ) {
                znt++;

            } else {
                // solveXを参考に考えると
                // 0 が何回か出現 -> X　が出現
                // ということになるのでそういう気持ちでやる
                int x = C[i];

                // 0が何回か出現
                int z = znt - dpZ[x];
                dp0[x] += mul(dpX[x], z);
                dp0[x] %= MOD;

                // Xが出現
                dpX[x] += dp0[x];
                dpX[x] %= MOD;

                // 0の出現回数を覚えておく
                dpZ[x] = znt;
            }
        }

        long ans = 0;

        // 0は別腹で計算
        // 0000みたいなものを区切る方法なので仕切りをどれだけ入れるかになる
        // zntは+1されてるので考慮する
        ans += pow(2, znt-2);
        ans %= MOD;

        for (int x = 0; x < 1 << 20; x++) {
            // 0で終わるのでXのほうを見る
            ans += dpX[x];
            ans %= MOD;
        }

        return (int)ans;
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

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) {
            c %= MOD;
        }
        return (int)c;
    }

    static int solveX(int[] C, int X) {
        int curr0 = 1;
        int currX = 0;
        for (int i = 1; i <= N; i++) {
            int next0;
            if( C[i] == 0 ) {
                next0 = curr0 + currX;
                next0 %= MOD;
            } else {
                next0 = curr0;
            }

            int nextX;
            if( C[i] == X ) {
                nextX = curr0 + currX;
                nextX %= MOD;
            } else {
                nextX = currX;
            }

            curr0 = next0;
            currX = nextX;
        }
        // 最後のxx...の部分は全部くっつけて一つのxとして評価するので0のほうを返す
        return curr0;
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
