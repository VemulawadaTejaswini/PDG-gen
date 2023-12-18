import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.IntStream;

class Main {
    private static TreeMap<Integer, Long> map = new TreeMap<>();
    public static void main(String... args) {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt(), m = scanner.nextInt();
        IntStream.range(0, n)
            .forEach(i -> {
                    setMap(scanner.nextInt());
                });
        IntStream.range(0, m)
            .forEach(i -> {
                    int b = scanner.nextInt(), c = scanner.nextInt();
                    IntStream.range(0, b)
                        .forEach(j -> {
                                int key = map.firstKey();
                                if (key >= c) return;
                                long newValue = map.get(key) - (long) key;
                                setMap(c);
                                if (newValue == 0) {
                                    map.remove(key);
                                } else {
                                    map.put(key, newValue);
                                }
                            });
                        });
        System.out.println(map.values().stream().mapToLong(l -> l).sum());
    }
    private static void setMap(int value) {
        map.put(value, Optional.ofNullable(map.get(value)).orElse(0l) + (long) value);
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1; }
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126; }
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte(); }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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
        while(true) {
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next()); }
}