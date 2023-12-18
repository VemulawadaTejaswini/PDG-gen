import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int[] p = in.nextIntArray(n);
        int[] q = in.nextIntArray(n);
        int a = 0, b = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        int i = 0;
        do {
            if (Arrays.equals(array, p)) {
                a = i;
            }
            if (Arrays.equals(array, q)) {
                b = i;
            }
            i++;
        } while (nextPermutation(array));
        out.println(Math.abs(a - b));
    }

    static boolean nextPermutation(int[] array) {
        if (array.length <= 1) {
            return false;
        }
        BiConsumer<Integer, Integer> swap = (a, b) -> {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        };
        int last = array.length;
        int i = last - 1;
        while (true) {
            int j = i;
            i--;
            if (array[i] < array[j]) {
                int k = last;
                while (array[i] >= array[--k]);
                swap.accept(i, k);
                while ((j != last) && (j != --last)) {
                    swap.accept(j++, last);
                }
                return true;
            }
            if (i == 0) {
                int first = 0;
                while ((first != last) && (first != --last)) {
                    swap.accept(first++, last);
                }
                return false;
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedInputStream reader = new BufferedInputStream(System.in);
    private byte[] buffer = new byte[0x10000];
    private int i = 0;
    private int length = 0;

    private int read() {
        if (i == length) {
            i = 0;
            try {
                length = reader.read(buffer);
            } catch (IOException ignored) {
            }
            if (length == -1) {
                return -1;
            }
        }
        return buffer[i++];
    }

    String next() {
        StringBuilder builder = new StringBuilder();
        int b = read();
        while (b < '!' || '~' < b) {
            b = read();
        }
        while ('!' <= b && b <= '~') {
            builder.appendCodePoint(b);
            b = read();
        }
        return builder.toString();
    }

    int nextInt() {
        return (int)nextLong();
    }

    long nextLong() {
        int b = read();
        while (b < '!' || '~' < b) {
            b = read();
        }
        int i = 0;
        if (b == '-') {
            i = 1;
            b = read();
        }
        long n = 0;
        while ('0' <= b && b <= '9') {
            n = n * 10 + b - '0';
            b = read();
        }
        return i == 0 ? n : -n;
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
