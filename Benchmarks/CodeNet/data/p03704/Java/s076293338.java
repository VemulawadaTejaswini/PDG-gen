import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        D = sc.nextInt();

        System.out.println(solve());
    }

    static long[] DEC;

    static long solve() {
        DEC = new long[19];
        DEC[0] = 1;
        for (int i = 0; i < 18; i++) {
            DEC[i+1] = DEC[i] * 10;
        }

        long ans = 0;
        for (int k = 1; k <= 18; k++) {
            ans += dfs(k, D, true);
        }
        return ans;
    }

    static long dfs(int k, long d, boolean first) {
        if( k == 0 ) {
            if( d == 0 ) {
                return 1;
            } else {
                return 0;
            }

        } else if( k == 1 ) {
            // a = a なので0でないと困る
            if( d == 0 ) {
                return first ? 9 : 10;
            } else {
                return 0;
            }
        }

        long ret = 0;
        int r = (int)(d % 10);

        //   ak ... a1
        // - a1 ... ak
        //   -r ... r

        // a1 >= ak のケース
        // rになる組み合わせは (9, 9-r)...(r, 0)
        int s = 9-r+1;
        ret += s * dfs(k-2, (d - (r - r * DEC[k-1]))/10, false);

        r -= 10;
        // a1 < ak のケース
        // firstの場合 a1が0になれないので除外する
        int t = 10 - s;
        if( first && t > 0 ) t--;
        ret += t * dfs(k-2, (d - (r - r * DEC[k-1]))/10, false);
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
