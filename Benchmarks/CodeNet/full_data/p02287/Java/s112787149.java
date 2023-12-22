import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
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
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
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
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        int[] heap = new int[n+1];
        for (int i = 1; i <= n; i++) {
            heap[i] = fs.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sb.append("node ").append(i).append(": ").append("key = ").append(heap[i]).append(", ");
            if (Math.floor(i / 2) >= 1) {
                int m = (int) Math.floor(i / 2);
                sb.append("parent key = ").append(heap[m]).append(", ");
            }
            if (i * 2 <= n) {
                sb.append("left key = ").append(heap[i * 2]).append(", ");
            }
            if (i * 2 + 1 <= n) {
                sb.append("right key = ").append(heap[i * 2 + 1]).append(", ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
