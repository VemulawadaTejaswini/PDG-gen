import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static Entry[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        E = new Entry[N];
        for (int i = 0; i < N; i++) {
            E[i] = new Entry(sc.nextInt(), sc.nextInt());
        }

        System.out.println(solve());
    }

    static long solve(int n, int[] A, int[] B) {
        N = n;
        E = new Entry[N];
        for (int i = 0; i < N; i++) {
            E[i] = new Entry(A[i], B[i]);
        }
        return solve();
    }

    static long solve() {
        Entry[] TAK = new Entry[N];
        Entry[] AOK = new Entry[N];
        for (int i = 0; i < N; i++) {
            TAK[i] = E[i];
            AOK[i] = E[i];
        }
        Arrays.sort(TAK, (e1, e2) -> {
            int u = e1.a - e2.b;
            int v = e2.a - e1.b;
            return Integer.compare(v, u);
        });

        Arrays.sort(AOK, (e1, e2) -> {
            int u = e1.b - e2.a;
            int v = e2.b - e2.a;
            return Integer.compare(v, u);
        });

        long totalTak = 0;
        long totalAok = 0;
        int taki = 0;
        int aoki = 0;
        for (int i = 0; i < N; i++) {
            if( i % 2 == 0 ) {
                if( TAK[taki].used ) taki++;

                totalTak += TAK[taki].a;
                TAK[taki].used = true;
                taki++;
            } else {
                if( AOK[aoki].used ) aoki++;

                totalAok += AOK[aoki].b;
                AOK[aoki].used = true;
                aoki++;
            }
        }
        return totalTak - totalAok;
    }

    static class Entry {
        int a, b;
        boolean used;

        public Entry(int a, int b) {
            this.a = a;
            this.b = b;
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
