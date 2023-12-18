import java.io.*;
import java.util.*;
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

    static int solve() {
        TreeSet<Integer> tree = new TreeSet<>();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Integer lo = tree.lower(A[i]);
            if( lo != null ) {
                remove(tree, cnt, lo);
                add(tree, cnt, A[i]);

            } else {
                add(tree, cnt, A[i]);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            ans += entry.getValue();
        }
        return ans;
    }

    static void add(TreeSet<Integer> tree, HashMap<Integer, Integer> cnt, int a) {
        if( tree.contains(a) ) {
            cnt.put( a, cnt.get(a) + 1 );
        } else {
            tree.add(a);
            cnt.put( a, 1 );
        }
    }

    static void remove(TreeSet<Integer> tree, HashMap<Integer, Integer> cnt, int a) {
        int c = cnt.getOrDefault(a, 0);
        if( c == 0 ) throw new IllegalArgumentException("wtf : " + a);
        if( c == 1 ) {
            tree.remove(a);
            cnt.remove(a);
        } else {
            cnt.put(a, c-1);
        }
    }

    static int lis(int[] A) {
        int[] table = new int[A.length];
        Arrays.fill(table, Integer.MAX_VALUE);
        table[0] = A[0];
        int last = 0;

        for (int i = 1; i < A.length; i++) {
            int a = A[i];

            if (a < table[0]) {
                table[0] = a;

            } else if (A[i] > table[last]) {
                table[++last] = a;

            } else {
                int idx = lowerBound(table, 0, last+1, a);
                table[idx] = a;
            }
        }
        return last + 1;
    }

    static int lowerBound(int[] array, int low, int high, int value) {
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( array[mid] < value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
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
