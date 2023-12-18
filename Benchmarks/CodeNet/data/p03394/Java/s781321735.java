import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (n <= 4) {
            sb.append(2 + " " + 5 + " " + 63);
            if (n == 4) {
                sb.append(" " + 20);
            }
            System.out.println(sb);
            return;
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 1; i <= 15000; i++) {
            if (i % 3 == 0 || i % 3 == 2) {
                l2.add(i);
            }
        }
        ArrayList<Integer> l3 = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            if (i % 4 == 0 || i % 4 == 3) {
                l3.add(i);
            }
        }
        HashSet<Integer> s = new HashSet<>();
        for (int i : l2) {
            for (int j : l3) {
                int s2 = i / 3;
                int s3 = j / 2;
                int m = i + j - Math.min(s2, s3);
                if (n == m) {
                    for (int i2 = 1; i2 <= i; i2++) {
                        s.add(i2 * 2);
                    }
                    for (int i3 = 1; i3 <= j; i3++) {
                        s.add(i3 * 3);
                    }
                    s.forEach(e -> sb.append(e).append(' '));
                    System.out.println(sb);
                    return;
                }
            }
        }
    }

    public static Range range(int n) {
        return new Range(n);
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
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

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


class Range implements Iterable<Integer>, Iterator<Integer> {
    private int l;
    private int r;

    private int iter;

    public Range(int l, int r) {
        this.l = l;
        this.r = r;
    }

    public Range(int r) {
        this(0, r);
    }

    public Iterator<Integer> iterator() {
        iter = l;
        return this;
    }

    public Integer next() {
        return hasNext() ? iter++ : null;
    }

    public boolean hasNext() {
        return iter < r;
    }

    public boolean contains(int v) {
        return in(l, v, r);
    }

    public boolean contains(Range r) {
        return contains(this.l, this.r, r.l, r.r);
    }

    public boolean crosses(Range r) {
        return crosses(this.l, this.r, r.l, r.r);
    }

    /**
     * judge value is in [l, r).
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is in [l, r)
     */
    public static boolean in(int l, int value, int r) {
        return l <= value && value < r;
    }

    /**
     * judge value is out of [l, r). (i.e. value is in (-infty, l) or [r, infty))
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is out of [l, r) (i.e. value is in (-infty, l) or [r, infty))
     */
    public static boolean outOf(int l, int value, int r) {
        return !in(l, value, r);
    }

    /**
     * judge value is in [l, r).
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is in [l, r)
     */
    public static boolean in(long l, long value, long r) {
        return l <= value && value < r;
    }

    /**
     * judge value is out of [l, r). (i.e. value is in (-infty, l) or [r, infty))
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is out of [l, r) (i.e. value is in (-infty, l) or [r, infty))
     */
    public static boolean outOf(long l, long value, long r) {
        return !in(l, value, r);
    }

    public static boolean crosses(int l1, int r1, int l2, int r2) {
        return l1 < r2 && r1 < l2;
    }

    public static boolean contains(int l1, int r1, int l2, int r2) {
        return l1 <= l2 && r2 <= l1;
    }
}
