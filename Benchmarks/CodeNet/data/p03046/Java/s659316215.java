import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    static int M, K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        M = sc.nextInt();
        K = sc.nextInt();

        int[] ans = solve();
        if( ans != null ) {
            StringJoiner j = new StringJoiner(" ");
            for (int an : ans) {
                j.add(String.valueOf(an));
            }
            System.out.println(j.toString());

        } else {
            System.out.println(-1);
        }
    }

    static int[] solve() {
        if( M <= 2 ) {
            return jikken();
        } else {
            return null;
        }
    }

    static int[] jikken() {
        int size = 1 << (M+1);
        int[] arr = new int[size];
        int idx = 0;
        for (int i = 0; i < 1 << M; i++) {
            arr[idx++] = i;
            arr[idx++] = i;
        }

        try {
            heapPermutation(arr, size, p -> {
                if (check(p)) {
                    throw new AnswerException(p);
                }
            });
        } catch( AnswerException e ) {
            return e.ans;
        }
        return null;
    }

    static class AnswerException extends RuntimeException {
        int[] ans;

        public AnswerException(int[] ans) {
            this.ans = ans;
        }
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < 1 << M; i++) {
            int fst = -1;
            int snd = -1;
            for (int j = 0; j < arr.length; j++) {
                if( arr[j] == i ) {
                    if( fst == -1 ) {
                        fst = j;
                    } else {
                        snd = j;
                    }
                }
            }

            int xor = 0;
            for (int j = fst; j <= snd; j++) {
                xor ^= arr[j];
            }
            if( xor != K ) return false;
        }
        return true;
    }

    static void heapPermutation(int[] arr, int size, Consumer<int[]> c) {
        if (size == 1) {
            c.accept(arr);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(arr, size-1, c);

            if (size % 2 == 1) {
                int temp = arr[0];
                arr[0] = arr[size-1];
                arr[size-1] = temp;

            } else {
                int temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
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
