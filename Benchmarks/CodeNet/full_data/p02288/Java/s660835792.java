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
    static int[] heap;

    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        heap = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            heap[i] = fs.nextInt();
        }
        bulidMaxHeap(heap);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            sb.append(" ").append(heap[i]);
        }
        System.out.println(sb);
    }

    private static void bulidMaxHeap(int[] heap) {
        for (int i = (heap.length - 1) / 2; i > 0; i--) {
            maxHeapify(heap, i);
        }
    }

    private static void maxHeapify(int[] heap, int i) {
        int l = 2*i;
        int r = 2*i+1;
        int largest = i;
        if (l < heap.length && heap[l] > heap[i]) {
            largest = l;
        }
        if (r < heap.length && heap[r] > heap[largest]) {
            largest = r;
        }
        if (largest != i) {
            change(i, largest);
            maxHeapify(heap,largest);
        }
    }

    private static void change(int i, int j) {
        int i1 = heap[i];
        heap[i] = heap[j];
        heap[j] = i1;
    }
}
