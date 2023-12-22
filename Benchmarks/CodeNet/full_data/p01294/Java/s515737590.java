import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, D;
    static int[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        while(true) {
            N = sc.nextInt();
            D = sc.nextInt();
            if( N == 0 ) break;

            C = new int[N][];
            for (int i = 0; i < N; i++) {
                int m = sc.nextInt();
                C[i] = sc.nextIntArray(m);
            }

            System.out.println(solve() ? "Yes" : "No");
        }
    }

    static boolean solve() {
        Country[] cs = new Country[N];
        int rest = 0;
        for (int i = 0; i < N; i++) {
            cs[i] = new Country(C[i]);
            rest += C[i].length;
        }

        lo:
        while(rest > 0) {
            Context ctx = getContext(cs);
//            for (int i = 0; i < N; i++) {
//                debug(i, cs[i].sum);
//            }
            // debug(ctx.max, ctx.maxIdx, ctx.sndMax, "rest", rest);
            for (int i = 0; i < N; i++) {
                Country c = cs[i];
                if( !c.hasMissile() ) continue;

                if( ctx.maxIdx == i ) {
                    if( ctx.sndMax - (c.sum - c.nextMissile()) <= D ) {
                        // debug("remove", i);
                        c.disposeMissile();
                        rest--;
                        continue lo;
                    }

                } else {
                    if( ctx.max - (c.sum - c.nextMissile()) <= D ) {
                        // debug("remove", i);
                        c.disposeMissile();
                        rest--;
                        continue lo;
                    }
                }
            }
            return false;
        }
        return true;
    }

    static Context getContext(Country[] cs) {
        int max = cs[0].sum;
        int maxIdx = 0;
        int sndMax = -1;
        for (int i = 1; i < N; i++) {
            Country c = cs[i];
            if( c.sum > max ) {
                sndMax = max;
                max = c.sum;
                maxIdx = i;

            } else if( c.sum > sndMax ) {
                sndMax = c.sum;
            }
        }
        return new Context(max, maxIdx, sndMax);
    }

    static class Context {
        int max;
        int maxIdx;
        int sndMax;

        public Context(int max, int maxIdx, int sndMax) {
            this.max = max;
            this.maxIdx = maxIdx;
            this.sndMax = sndMax;
        }
    }

    static class Country {
        int[] ms;
        int sum;
        int idx;

        public Country(int[] ms) {
            this.ms = ms;
            for (int i = 0; i < ms.length; i++) {
                sum += ms[i];
            }
            this.idx = ms.length-1;
        }

        boolean hasMissile() {
            return idx >= 0;
        }

        int nextMissile() {
            return ms[idx];
        }

        void disposeMissile() {
            sum -= ms[idx--];
        }
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

