import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, A[];

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve() ? "Yes" : "No");
    }

    static boolean solve() {
        // x, x^y, y, x, x^y, y....
        // のように3で循環する

        // 1. 全部0
        // 2. x, y, z(x^y^z==0 && N%3==0)
        // 3. x, x, 0....(N%3==0)
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < N; i++) {
            cnt.merge(A[i], 1, (a, b) -> a + b);
        }

        if( cnt.getOrDefault(0, 0) == N ) return true; // 1. 全部0
        if( isSecondCase(cnt) ) return true;
        if( isThridCase(cnt) ) return true;
        return false;
    }

    // 2. x, y, z(x^y^z==0 && N%3==0)
    static boolean isSecondCase(Map<Integer, Integer> cnt) {
        if( N % 3 != 0 ) return false;
        if( cnt.keySet().size() != 3 ) return false;

        List<Integer> keys = new ArrayList<>(cnt.keySet());
        int x = keys.get(0);
        int y = keys.get(1);
        int z = keys.get(2);

        return (x^y^z) == 0 && cnt.get(x) == N/3 && cnt.get(y) == N/3 && cnt.get(z) == N/3;
    }

    // 3. x, x, 0....(N%3==0)
    static boolean isThridCase(Map<Integer, Integer> cnt) {
        if( N % 3 != 0 ) return false;
        if( cnt.keySet().size() != 2 ) return false;

        for (Integer key : cnt.keySet()) {
            if( key == 0 && cnt.get(key) != N/3 ) return false;
            if( key != 0 && cnt.get(key) != N/3*2 ) return false;
        }
        return true;
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
