import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

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

public class Main {
    static int MOD = 1000000007;

    public static class Mas {
        int x;
        int y;
        int step;

        Mas(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    static long pow(long l, long i) {
        if (i == 0)
            return 1;
        else {
            if (i % 2 == 0) {
                long val = pow(l, i / 2);
                return val * val % 2019;
            } else {
                return pow(l, i - 1) * l % 2019;
            }
        }
    }

    private static final int[] vX = { 1, 0, 0, -1 };
    private static final int[] vY = { 0, 1, -1, 0 };

    static class Edge {
        int idx;
        int node;

        public Edge(int n, int i) {
            this.idx = i;
            this.node = n;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        int n =fs.nextInt();
        int  m=fs.nextInt();
        long k = fs.nextLong();
        Queue<Long> a = new ArrayDeque<Long>();
        Queue<Long>b = new ArrayDeque<Long>();
        // int[] a = new int[n];
        // int[] b = new int[m];
        long count = 0;
        for (int i = 0; i < n; i++) {
            a.add(fs.nextLong());
            // a[i] = fs.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b.add(fs.nextLong());
            // b[i] = fs.nextInt();
        }

        while (k >= 0) {
            if (a.isEmpty() && !b.isEmpty()) {
                // System.out.println("b"+k);
                k -= b.poll();
                if (k >= 0) {
                    count++;
                } 
            } else if (!a.isEmpty() && b.isEmpty()) {
                // System.out.println("a" + k);
                k -= a.poll();
                if (k >= 0) {
                    count++;
                } 
            } else if (a.isEmpty() && b.isEmpty()) {
                break;
            } else if (a.peek() <= b.peek()) {
                // System.out.println("a" + k);
                k -= a.poll();
                if (k >= 0) {
                    count++;
                } 
            } else if (a.peek() > b.peek()) {
                // System.out.println("b" + k);
                k -= b.poll();
                if (k >= 0) {
                    count++;
                } 
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
