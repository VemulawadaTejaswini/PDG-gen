import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static int n;
    static int[] a;

    static int f(int x) {
        int ope = 0;
        int cur = 0;

        for (int i = 0; i < n; i++) {
            // 同符号
            int aim = a[i];

            // 異符号
            if (x * a[i] < 0)
                aim = x * (Math.abs(cur) + 1);
            // 同符号
            else if (Math.abs(a[i]) <= Math.abs(cur) + 1)
                aim = x * (Math.abs(cur) + 1);

            ope += Math.max(a[i], aim) - Math.min(a[i], aim);

            cur += aim;

            // 符号反転
            x *= -1;
        }

        return ope;
    }


    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        n = nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) a[i] = nextInt();

        int plus = f(1);
        int minus = f(-1);

        out.println(Math.min(plus, minus));

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
