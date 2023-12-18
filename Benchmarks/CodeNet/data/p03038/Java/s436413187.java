import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.IntStream;

class Main {
    private static TreeMap<Integer, Integer> map = new TreeMap<>(),
        cMap = new TreeMap<>();
    private static long total;
    public static void main(String... args) {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt(), m = scanner.nextInt();
        IntStream.range(0, n).forEach(i -> setMap(scanner.nextInt(), 1));
        IntStream.range(0, m)
            .forEach(i -> setCMap(scanner.nextInt(), scanner.nextInt()));
        int smallest, largest, counter = n;
        while (!cMap.isEmpty()
               && (smallest = map.firstKey()) < (largest = cMap.lastKey())
               && counter-- > 0) {
            int exchangeNum = Math.min(cMap.get(largest), map.get(smallest));
            setMap(largest, exchangeNum);
            cMap.put(largest, cMap.get(largest) - exchangeNum);
            if (cMap.get(largest) == 0) cMap.remove(largest);
            map.put(smallest, map.get(smallest) - exchangeNum);
            if (map.get(smallest) == 0) map.remove(smallest);
            total -= smallest * exchangeNum;
        }
        System.out.println(total);
    }
    private static void setMap(int value, int num) {
        map.put(value, Optional.ofNullable(map.get(value)).orElse(0) + num);
        total += value * (long) num;
    }
    private static void setCMap(int b, int c) {
        cMap.put(c, Optional.ofNullable(cMap.get(c)).orElse(0) + b);
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