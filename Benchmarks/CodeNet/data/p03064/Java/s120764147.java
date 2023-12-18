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
//
//    static int count() {
//        int sum = 0;
//        for (int i = 0; i < N; i++) {
//            sum += A[i];
//        }
//
//        int[] colors = new int[N];
//        Arrays.fill(colors, -1);
//        int[] ret = dfs(colors, 0, sum);
//        debug(ret);
//        return ret[0];
//    }

//    static int[] dfs(int[] colors, int i, int sum) {
//        if( i == N ) {
//            int[] rgb = new int[3];
//            for (int j = 0; j < N; j++) {
//                int c = colors[j];
//                rgb[c] += A[j];
//            }
//            int r = rgb[0];
//            int g = rgb[1];
//            int b = rgb[2];
//            int[] ret = new int[3];
//
//            if( r == (sum+1)/2 && g == (sum+1)/2 ) {
//                debug(rgb, "2");
//                ret[2] = 1;
//            } else if( r == (sum+1)/2 && b == (sum+1)/2 ) {
//                debug(rgb, "2");
//                ret[2] = 1;
//            } else if( g == (sum+1)/2 && b == (sum+1)/2 ) {
//                debug(rgb, "2");
//                ret[2] = 1;
//
//            } else if( r >= (sum+1)/2 || g >= (sum+1)/2 || b >= (sum+1)/2 ) {
//                debug(rgb, "1");
//                ret[1] = 1;
//            } else if( r == 0 || g == 0 || b == 0 ) {
//                debug(rgb, "1");
//                ret[1] = 1;
//
//            } else {
//                debug(rgb, "0");
//                ret[0] = 1;
//            }
//            return ret;
//        }
//
//        int[] ret = new int[3];
//        for (int j = 0; j < 3; j++) {
//            colors[i] = j;
//            int[] r = dfs(colors, i+1, sum);
//            for (int k = 0; k < 3; k++) {
//                ret[k] += r[k];
//            }
//        }
//        return ret;
//    }

    static int MOD = 998244353;

    static int solve() {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        // ある色の総和がnである場合の数
        int[] curr1 = new int[sum+1];
        int[] next1 = new int[sum+1];
        Arrays.fill(curr1, -1);
        curr1[0] = 1;
        for (int i = 0; i < N; i++) {
            Arrays.fill(next1, -1);

            int a = A[i];
            for (int j = 0; j < sum; j++) {
                if( curr1[j] == -1 ) continue;

                // aを加える
                if( next1[j+a] == -1 ) {
                    next1[j+a] = curr1[j];
                } else {
                    next1[j+a] = add(next1[j+a], curr1[j]);
                }

                // aを加えない(二通り)
                if( next1[j] == -1 ) {
                    next1[j] = mul(curr1[j], 2);
                } else {
                    next1[j] = add(next1[j], mul(curr1[j], 2));
                }
            }

            int[] t = curr1;
            curr1 = next1;
            next1 = t;
        }

        // ある色の総和がnである時、もう一色に全部入れた場合の数
        int[] curr2 = new int[sum+1];
        int[] next2 = new int[sum+1];
        Arrays.fill(curr2, -1);
        curr2[0] = 1;

        for (int i = 0; i < N; i++) {
            Arrays.fill(next2, -1);

            int a = A[i];
            for (int j = 0; j < sum; j++) {
                if( curr2[j] == -1 ) continue;

                // aを加える
                if( next2[j+a] == -1 ) {
                    next2[j+a] = curr2[j];
                } else {
                    next2[j+a] = add(next2[j+a], curr2[j]);
                }

                // aをもう一色に加える(一通り)
                if( next2[j] == -1 ) {
                    next2[j] = curr2[j];
                } else {
                    next2[j] = add(next2[j], curr2[j]);
                }
            }

            int[] t = curr2;
            curr2 = next2;
            next2 = t;
        }

        // sum/2より大きい辺があるのは省く
        int dp1 = 0;
        for (int i = (sum+1)/2; i <= sum; i++) {
            if( curr1[i] != -1 ) {
                dp1 = add(dp1, curr1[i]);
            }
        }

        // 同時にsum/2を満たしている分
        int dp2;
        if( sum %2 == 1 ) {
            // 奇数だと満たすものがない
            dp2 = 0;
        } else {
            if( curr2[sum/2] != -1 ) {
                dp2 = curr2[sum/2];
            } else {
                dp2 = 0;
            }
        }

        int ans = modPow(3, N);
        ans = sub(ans, mul(3, dp1));
        ans = add(ans, mul(3, dp2));
        return ans;
    }

    static int modPow(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
            ret = mul(ret, a);
        }
        return ret;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) {
            c %= MOD;
        }
        return (int)c;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) {
            c %= MOD;
        }
        return c;
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
