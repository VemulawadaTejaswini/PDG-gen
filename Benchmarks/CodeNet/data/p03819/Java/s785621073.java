import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by zzt on 17-1-29.
 */
public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        List<List<Integer>> stations = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            stations.add(new ArrayList<>());
        }

        int l, r;
        for (int i = 0; i < n; i++) {
            l = (int) scanner.nextLong();
            r = (int) scanner.nextLong();
            for (int j = l; j <= r; j++) {
                stations.get(j).add(i);
            }
        }

        Set<Integer> s = new TreeSet<>();
        for (int i = 1; i <= m; i++) {
            s.clear();
            for (int j = 0; j <= m; j++) {
                if (j % i == 0)
                    s.addAll(stations.get(j));
            }
            System.out.println(s.size());
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufferLength <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
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
                if ('0' <= b || b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else
                    throw new NumberFormatException();
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}