import java.io.*;

public class Main {

    void solve() {

        int n = io.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = io.nextInt();
        }

        int idx = partition(A, 0, A.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == idx) {
                sb.append(String.format(" [%d]", A[i]));
            } else {
                sb.append(String.format(" %d", A[i]));
            }
        }
        System.out.println(sb.toString().trim());
    }

    int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i += 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    void swap(int[] A, int idx1, int idx2) {
        int tmp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = tmp;
    }

    public static void main(final String[] args) {
        new Main().solve();
    }

    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;

        private boolean hasNextByte() {
            if (ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }

        public char nextChar() {
            byte b = readByte();
            while (!isAscii(b)) b = readByte();
            return (char) b;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isAscii(b)) {
                sb.append((char) b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return Integer.valueOf(next());
        }

        public long nextLong() {
            return Long.valueOf(next());
        }

        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}

