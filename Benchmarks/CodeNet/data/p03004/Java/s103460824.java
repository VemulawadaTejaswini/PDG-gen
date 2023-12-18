import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static int N;
    static int[] X, Y;
    static char[] D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        X = new int[N];
        Y = new int[N];
        D = new char[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt() * 2;
            Y[i] = sc.nextInt() * 2;
            D[i] = sc.next().charAt(0);
        }

        System.out.println(BigDecimal.valueOf(solve()).toPlainString());
    }

    static double solve(int n, int[] x, int[] y, char[] d) {
        N = n;
        X = Arrays.stream(x).map( a -> a * 2).toArray();
        Y = Arrays.stream(y).map( a -> a * 2).toArray();
        D = d;
        return solve();
    }

    static double solve() {
        Widthes w = new Widthes();
        Widthes h = new Widthes();
        for (int i = 0; i < N; i++) {
            int x = X[i];
            int y = Y[i];
            char d = D[i];
            if( d == 'L' ) {
                w.addLeft(x);
                h.addFix(y);
            } else if( d == 'R' ) {
                w.addRight(x);
                h.addFix(y);
            } else if( d == 'U' ) {
                w.addFix(x);
                h.addRight(y);
            } else {
                w.addFix(x);
                h.addLeft(y);
            }
        }

        Set<Integer> events = new HashSet<>();
        events.addAll( w.getEvents() );
        events.addAll( h.getEvents() );
        events.add(0);

        double min = Double.MAX_VALUE;
        for (int t : events) {
            // debug(t, w.width(t), h.width(t));
            min = Math.min(min, (double)w.width(t) * h.width(t)/4);
        }
        return min;
    }

    static int INF = 1_000_000_000;

    static class Widthes {
        int lmin = INF, lmax = -INF;
        int rmin = INF, rmax = -INF;
        int fmin = INF, fmax = -INF;

        public long width(int t) {
            long min = min(lmin-t, fmin, rmin+t);
            long max = max(lmax-t, fmax, rmax+t);
            return max-min;
        }

        public List<Integer> getEvents() {
            List<Integer> events = new ArrayList<>();
            events.add((lmax-rmax)/2);
            events.add(fmax-rmax);
            events.add(lmax-fmax);
            events.add((lmin-rmin)/2);
            events.add(fmin-rmin);
            events.add(lmin-fmin);
            return events.stream().filter(t -> t >= 0 ).collect(Collectors.toList());
        }

        public void addLeft(int a) {
            lmin = Math.min(lmin, a);
            lmax = Math.max(lmax, a);
        }

        public void addRight(int a) {
            rmin = Math.min(rmin, a);
            rmax = Math.max(rmax, a);
        }

        public void addFix(int a) {
            fmin = Math.min(fmin, a);
            fmax = Math.max(fmax, a);
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
