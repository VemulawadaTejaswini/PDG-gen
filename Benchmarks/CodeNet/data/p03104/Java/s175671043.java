import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static long A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();

        System.out.println(solve());
    }

    static Map<Long, Integer> toIndex;
    static Map<Long, long[]> fullBits;

    static long solve() {
        toIndex = new HashMap<>();
        for (int i = 0; i < 40; i++) {
            toIndex.put(1L << i, i);
        }
        fullBits = new HashMap<>();
        fullBits.put(0L, new long[45]);
        long[] one = new long[45];
        one[0] = 1;
        fullBits.put(1L, one);
        for (int i = 2; i < 45; i++) {
            long s = (1L << i) - 1;
            long[] bits = new long[45];
            long[] prev = fullBits.get(s - Long.highestOneBit(s));
            for (int j = 0; j < 45; j++) {
                bits[j] = prev[j] * 2;
            }
            bits[i-1] += (s+1)/2;
            fullBits.put(s, bits);
        }

        long[] bits = new long[45];
        dfs(B, bits);

        long[] bits2 = new long[45];
        dfs(A-1, bits2);

        for (int i = 0; i < 45; i++) {
            bits[i] -= bits2[i];
            bits[i] = Math.abs(bits[i]);
            bits[i] %= 2;
        }

        long ans = 0;
        for (int i = 0; i < 45; i++) {
            if( bits[i] > 0 ) {
                ans += 1L << i;
            }
        }
        return ans;
    }

    static void dfs(long n, long[] bits) {
        if( n == 0 ) return;
        long high = Long.highestOneBit(n);
        bits[toIndex.get(high)] += n - high + 1;
        dfs(n-high, bits);

        long[] full = fullBits.get(high-1);
        for (int i = 0; i < 45; i++) {
            bits[i] += full[i];
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
