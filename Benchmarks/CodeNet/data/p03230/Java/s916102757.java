import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int k = -1;
        for (int i = 1; (i - 1) * (i - 1) < 2 * n; i++) {
            if (i * (i - 1) == 2 * n) {
                k = i;
                break;
            }
        }
        if (k < 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        int[][] ans = new int[k][k - 1];
        int m = 1;
        for (int c = 0; c < k - 1; c++) {
            for (int cc = c; cc < k - 1; cc++) {
                ans[c][cc] = m + cc - c;
            }
            for (int r = c + 1; r < k; r++) {
                ans[r][c] = m++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < k; s++) {
            sb.append(k - 1).append(' ');
            for (int c = 0; c < k - 1; c++) {
                sb.append(ans[s][c]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
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
