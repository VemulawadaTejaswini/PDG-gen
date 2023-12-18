import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        solve(pw);
        pw.flush();
    }

    static void solve(PrintWriter pw) {
        int[][] E = new int[N][N];
        int[] nodes = new int[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = i;
        }

        dfs(1, nodes, E);


        // 1-2, 1-3...... 1-N
        // 2-3. 2-4... 2-N
        for (int i = 0; i < N-1; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = i+1; j < N; j++) {
                sj.add( String.valueOf(E[i][j]) );
            }
            pw.println(sj.toString());
        }
    }

    static void dfs(int lv, int[] nodes, int[][] E) {
        int n = nodes.length;
        if( n <= 1 ) return;

        int[] lo = Arrays.copyOfRange(nodes, 0, n/2);
        int[] hi = Arrays.copyOfRange(nodes, n/2, n);

        for (int a : lo) {
            for (int b : hi) {
                if( a > b ) {
                    int t = a;
                    a = b;
                    b = t;
                }
                E[a][b] = lv;
            }
        }

        dfs(lv+1, lo, E);
        dfs(lv+1, hi, E);
    }

    static class Edge {
        int a, b;
        int lv;

        public Edge(int a, int b) {
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
