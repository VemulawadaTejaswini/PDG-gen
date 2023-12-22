import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pw.println( solve(sc.next()) );
        }
        pw.flush();
    }

    static int solve(String S) {
        return dfs(S, 0, S.length()-1).get();
    }

    // [u, v]
    // S.substring(u, v+1)
    static Tree dfs(String S, int u, int v) {
        if( S.charAt(u+1) == '[' ) {
            // [[?][?]]
            // -> Composite([?], [?])
            Composite comp = new Composite();
            int L = 0;
            int start = -1;
            for (int i = u+1; i <= v-1; i++) {
                if( S.charAt(i) == '[' ) {
                    if( L == 0 ) {
                        start = i;
                    }
                    L++;
                } else if( S.charAt(i) == ']' ) {
                    L--;
                    if( L == 0 ) {
                        Tree child = dfs(S, start, i);
                        comp.add(child);
                        start = -1;
                    }
                }
            }
            return comp;

        } else {
            // [n]
            int n = Integer.parseInt(S.substring(u+1, v));
            return new Leaf(n);
        }
    }

    interface Tree {
        int get();
    }

    static class Composite implements Tree {

        List<Tree> childs = new ArrayList<>();

        void add(Tree child) {
            childs.add(child);
        }


        @Override
        public int get() {
            PriorityQueue<Integer> q = new PriorityQueue<>();
            for (Tree child : childs) {
                q.add(child.get());
            }
            int win = (childs.size()+1)/2;
            int ret = 0;
            for (int i = 0; i < win; i++) {
                ret += q.poll();
            }
            return ret;
        }
    }

    static class Leaf implements Tree {
        int n;

        public Leaf(int n) {
            this.n = n;
        }

        @Override
        public int get() {
            return (n+1)/2;
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

