import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            List<Long> list = new ArrayList<>();
            Map<Long, Long> map = new HashMap<>();
            while (in.hasNext()) list.add(in.nextLong());
            for (int i = 0; i < n; i++) {
                long key = list.get(i);
                if (map.containsKey(key)) {
                    out.println(map.get(key));
                } else {
                    List<Long> list2 = new ArrayList<>(list);
                    long count = 0;
                    list2.remove(i);
                    List<Long> list3 = new ArrayList<>(list2);
                    List<Long> list4 = new ArrayList<>();
                    list2.stream()
                            .distinct()
                            .forEach(integer -> list4.add(list3.stream().filter(integer::equals).count()));
                    for (long value : list4) {
                        long Val = calcNumOfCombination(value, 2);
                        count = count + Val;
                    }
                    map.put(key, count);
                    out.println(count);
                }
            }
        }

        long calcNumOfCombination(long n, long r) {
            long num = 1;
            for (long i = 1; i <= r; i++) {
                num = num * (n - i + 1) / i;
            }
            return num;
        }

    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;

        public Scanner(InputStream in) {
            this.in = in;
            this.buffer = new byte[1024];
            this.ptr = 0;
            this.buflen = 0;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isPrintableChar(byte c) {
            return '!' <= c && c <= '~';
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            byte b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
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
}

