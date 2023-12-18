import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static Integer[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        PrintWriter pw = new PrintWriter(System.out);
        solve(pw);
        pw.flush();
    }

    static void solve(PrintWriter pw) {
        PriorityQueue<Integer> pos = new PriorityQueue<>();
        PriorityQueue<Integer> neg = new PriorityQueue<>(Comparator.reverseOrder());
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if( A[i] >= 0 ) {
                pos.add(A[i]);
            } else {
                neg.add(A[i]);
            }
        }

        if( pos.isEmpty() ) {
            int a = neg.poll();
            int b = neg.poll();
            // -1 - -2 -> 1
            ans.add( a + " " + b);
            pos.add( a - b );

        } else if( neg.isEmpty() ) {
            int a = pos.poll();
            int b = pos.poll();
            // 1 - 2
            ans.add( a + " " + b);
            neg.add( a - b );
        }

        while(pos.size() + neg.size() > 2) {
            // かならず一つは入っている状態を維持する
            int p = pos.poll();
            int n = neg.poll();
            if( pos.isEmpty() ) {
                // posになるようにする
                ans.add( p + " " + n);
                pos.add( p - n );

            } else {
                ans.add(n + " " + p);
                neg.add( n - p );
            }
        }


        if( pos.size() == 1 && neg.size() == 1 ) {
            ans.add(pos.peek() + " " + neg.peek());
            pw.println(pos.peek() - neg.peek());
            for (String an : ans) {
                pw.println(an);
            }
        } else {
            pw.println(pos.isEmpty() ? neg.poll() : pos.peek());
            for (String an : ans) {
                pw.println(an);
            }
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
