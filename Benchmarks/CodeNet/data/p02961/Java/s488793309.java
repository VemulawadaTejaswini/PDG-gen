import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        long k = fsc.nextLong();
        int x = fsc.nextInt();
        int y = fsc.nextInt();
        int rx = x >= 0 ? 1 : -1;
        int ry = y >= 0 ? 1 : -1;
        x *= rx;
        y *= ry;
        if (k % 2 == 0 && (x + y) % 2 != 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        long a = 0;
        
        long bx = 0;
        long by = 0;
        if (x + y > 2 * k) {
            long ts = (x + y - k - 1) / k;
            long tx = x / k;
            bx += k * tx;
            for (int i = 1; i <= tx; i++) {
                sb.append(k * i * rx).append(' ').append(0).append('\n');
                a++;
            }
            long ty = ts - tx;
            by += k * ty;
            for (int i = 1; i <= ty; i++) {
                sb.append(bx * rx).append(' ').append(k * i * ry).append('\n');
                a++;
            }
            x -= bx;
            y -= by;
        }
        if (x + y == k) {
            a++;
            sb.append((bx + x) * rx).append(' ').append((by + y) * ry).append('\n');
        } else if (x + y > 0) {
            if (k % 2 == 1 && (x + y) % 2 == 1) {
                if (x + y < k) {
                    sb.append(bx * rx).append(' ').append((by - k) * ry).append('\n');
                    by -= k;
                    y += k;
                } else {
                    sb.append((bx + x) * rx).append(' ').append((by + k - x) * ry).append('\n');
                    bx += x;
                    by += k - x;
                    y -= k - x;
                    x = 0;
                }
                a++;
            }
            for (int i = 0; i < 1 << 4; i++) {
                int s = (i & (1 << 0)) == 0 ? -1 : 1;
                int t = (i & (1 << 1)) == 0 ? -1 : 1;
                int u = (i & (1 << 2)) == 0 ? -1 : 1;
                int v = (i & (1 << 3)) == 0 ? -1 : 1;
                int inv = s * v - t * u;
                if (inv == 0) {
                    continue;
                }
                long x1 = -t * u * x - t * v * y + v * k + t * k;
                long y1 = +s * u * x + s * v * y - u * k - s * k;
                long x2 = +s * v * x + t * v * y - v * k - t * k;
                long y2 = -s * u * x - t * u * y + u * k + s * k;
                if (((x1 & 1) | (y1 & 1) | (x2 & 1) | (y2 & 1)) == 0) {
                    x1 /= inv;
                    y1 /= inv;
                    x2 /= inv;
                    y2 /= inv;
                    if (x1 * s >= 0 && y1 * t >= 0 && x2 * u >= 0 && y2 * v >= 0) {
                        sb.append((bx + x1) * rx).append(' ').append((by + y1) * ry).append('\n');
                        sb.append((bx + x1 + x2) * rx).append(' ').append((by + y1 + y2) * ry).append('\n');
                        a += 2;
                        break;
                    }
                }
            }
        }
        System.out.println(a);
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
