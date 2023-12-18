import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static Item[] I;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        I = new Item[N];
        for (int i = 0; i < N; i++) {
            I[i] = new Item(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println(solve());
    }

    static long solve() {
        // 二つ選んで上になったほうがうれしいもの、というものを定義できるとソートしてDPできるようになる

        // i, jを比較したとき
        // wi < sj の場合i, wj < sw の場合jが上になることが可能
        // 両方満たしているときより余裕があるほうを選んだほうがうれしい
        // sj - wi > si - wj の場合, iを上に乗せたほうが余裕がある

        // 素直に式を書いたらintellijにこっちのほうがよくね、されてこうなった
        Comparator<Item> c = (i, j) -> Integer.compare(i.s - j.w, j.s - i.w);

        Arrays.sort(I, c);

        // w -> v
        long[][] dp = new long[N+1][10002];
        for (long[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {
            Item item = I[i];
            for (int j = 0; j <= 10001; j++) {
                if( dp[i][j] != - 1 ) {
                    dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j]);

                    if( j <= item.s ) {
                        int w = Math.min(item.w + j, 10001);
                        dp[i+1][w] = Math.max(dp[i][j] + item.v, dp[i][j]);
                    }
                }
            }
        }

        long max = 0;
        for (long v : dp[N]) {
            if( v != -1 ) {
                max = Math.max(v, max);
            }
        }
        return max;
    }

    static class Item {
        int w, s, v;

        public Item(int w, int s, int v) {
            this.w = w;
            this.s = s;
            this.v = v;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(i);
        }
        pw.println();
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
            else j.add(arg == null ? "null" : arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(array[i]);
        }
        System.out.println();
    }

    static int lowerBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] < value) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int upperBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] <= value) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
