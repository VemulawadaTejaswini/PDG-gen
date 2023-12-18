import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        // long[] x = new long[n];
        // long[] y = new long[n];
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            // x[i] = sc.nextLong();
            // y[i] = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            p[i] = new Pair(x, y);
        }
        Arrays.sort(p, (a, b) -> (int) a.x - (int) b.x);
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + k - 1; j < n; j++) {
                long dx = Math.abs(p[i].x - p[j].x);
                long min = Long.MAX_VALUE;
                long max = 0;
                for (int l = i; l <= j; l++) {
                    min = Math.min(min, p[l].y);
                    max = Math.max(max, p[l].y);
                }
                long dy = Math.abs(max - min);
                ans = Math.min(ans, dx * dy);
            }
        }
        System.out.println(ans);
    }
}

class Pair {
    long x;
    long y;

    public Pair(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long compareTo(Pair p) {
        return this.y - p.y;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair p = (Pair) o;
        return this.x == p.x && this.y == p.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return String.format("x = %s,y = %s", x, y);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
