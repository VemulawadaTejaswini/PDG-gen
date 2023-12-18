import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Optional;
import java.util.stream.IntStream;

class Main {
    public static void main(String... args) {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        Map<String, Integer> map = createMap(scanner.next());
        int counter = n;
        while (!map.isEmpty() && --counter > 0) {
            Map<String, Integer> m = createMap(scanner.next());
            m.keySet().stream().filter(k -> map.get(k) != null)
                .forEach(k -> map.put(k, Math.min(map.get(k), m.get(k))));
            map.keySet().retainAll(m.keySet());
        }
        map.keySet().stream().forEach(k -> IntStream.range(0, map.get(k)).forEach(i -> System.out.print(k)));
        System.out.println();
    }
    private static Map<String, Integer> createMap(String s) {
        Map<String, Integer> m = new TreeMap<>();
        Arrays.stream(s.split(""))
            .forEach(c -> m.put(c, Optional.ofNullable(m.get(c)).orElse(0) + 1));
        return m;
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}