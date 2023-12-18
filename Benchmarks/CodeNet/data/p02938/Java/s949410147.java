import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static long L, R;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        L = sc.nextLong();
        R = sc.nextLong();

        System.out.println(solve());
    }

    static int solve() {
        // 本番ではいつもの count(R) - count(L-1) をやろうとして無理じゃんとなった
        // で、解説動画を見て実装した
        // x, yを同時に決める感じの桁dpは初めて

        // lx: L < x を満たした(1) or まだ(Lと同じ)
        // ry: y < R を満たした(1) or まだ(Rと同じ)
        // msb: xとyのMSBが同じ(1) or まだ
        int[][][] curr = new int[2][2][2];
        curr[0][0][0] = 1;
        int K = Long.toBinaryString(R).length()-1;
        for (int k = K; k >= 0; k--) {
            int lb = (int)((L >> k) & 1);
            int rb = (int)((R >> k) & 1);
            // debug(lb, rb);
            int[][][] next = new int[2][2][2];

            for (int lx = 0; lx < 2; lx++) for (int ry = 0; ry < 2; ry++) for (int msb = 0; msb < 2; msb++) {
                if( curr[lx][ry][msb] == 0 ) continue; // やらなくてもよいけどまぁ

                for (int x = 0; x < 2; x++) for (int y = 0; y < 2; y++) {
                    // yのbitが立ってないとxは立たない
                    if( x == 1 && y == 0 ) continue;
                    // x < L
                    if( lx == 0 && lb == 1 && x == 0 ) continue;
                    // R < y
                    if( ry == 0 && rb == 0 && y == 1 ) continue;
                    // MSBが異なる
                    if( msb == 0 && x != y ) continue;

                    int nlx = lx, nry = ry, nmsb = msb;
                    // L < x を達成した
                    if( lx == 0 && lb == 0 && x == 1 ) nlx = 1;
                    // r < y を達成した
                    if( ry == 0 && rb == 1 && y == 0 ) nry = 1;
                    // MSBが同じ を達成した
                    if( msb == 0 && x == 1 && y == 1 ) nmsb = 1;

                    // debug(x, y, lx, ry, msb, "->", nlx, nry, nmsb);
                    next[nlx][nry][nmsb] += curr[lx][ry][msb];
                    next[nlx][nry][nmsb] %= MOD;
                }
            }
            curr = next;
        }
        int ans = 0;
        // lx, ryは未達成のままのケース(x == L, y == R)もある
        for (int lx = 0; lx < 2; lx++) {
            for (int ry = 0; ry < 2; ry++) {
                ans += curr[lx][ry][1];
                ans %= MOD;
            }
        }
        return ans;
    }

    static int MOD = 1_000_000_007;

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
            pw.print(as[i]);
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
