import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 2000000000000000005L;

    void solve() {
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        long left = -inf;
        long right = inf + 1;
        while (right - left > 1) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int i = 0; i < n; i++) {
                long c = 0;
                if (a[i] == 0) {
                    c += mid >= 0 ? i : 0;
                } else {
                    long t = mid / a[i];
                    if (t * a[i] > mid) {
                        if (t < 0) {
                            t--;
                        } else {
                            t++;
                        }
                    }
                    if (a[i] < 0) {
                        int j = lowerBound(a, t);
                        j = j < i ? j - i : 0;
                        c += j;
                    } else {
                        c += Math.min(upperBound(a, t), i);
                    }
                }
                count += c;
            }
            if (k <= count) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println(right);
    }

    static int lowerBound(long[] array, long value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] < value) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
    static int upperBound(long[] array, long value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] <= value) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}
