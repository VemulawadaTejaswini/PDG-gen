import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
            int x = in.nextInt();
            int l = in.nextInt();
            left[i] = x - l;
            right[i] = x + l;
        }
        Arrays.sort(p, Comparator.comparing(i -> right[i]));
        int m = compress(left, right);
        int[] a = new int[m + 1];
        for (int i = 0, j = 0; i <= m; i++) {
            if (i > 0) {
                a[i] = Math.max(a[i], a[i - 1]);
            }
            while (j < n && right[p[j]] <= i) {
                a[right[p[j]]] = Math.max(a[right[p[j]]], a[left[p[j]]] + 1);
                j++;
            }
        }
        out.println(a[m]);
    }

    static int compress(int[]... arrays) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] array : arrays) {
            for (int i : array) {
                map.put(i, 0);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.setValue(i++);
        }
        for (int[] array : arrays) {
            for (int j = 0; j < array.length; j++) {
                array[j] = map.get(array[j]);
            }
        }
        return map.size() - 1;
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
