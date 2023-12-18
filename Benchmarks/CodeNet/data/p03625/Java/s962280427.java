import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();

        Counter<Integer> A = new Counter<>();

        for (int i = 0; i < N; i++) A.add(nextInt());

        int mx = 0;
        int nt = 0;

        for (Entry<Integer, Integer> e : A.entrySet()) {
            int k = e.getKey().intValue();
            int v = e.getValue().intValue();

            if (v < 2) continue;

            if (mx < k && 4 <= v) {
                mx = k;
                nt = k;
            } else if (mx < k && 2 <= v) {
                nt = mx;
                mx = k;
            } else if (nt < k) nt = k;
        }

        out.println((long)mx * nt);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
// JDK 1.8 Map.getOrDefault
class Counter<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void add(T key) {
        int v = get(key);
        map.put(key, v + 1);
    }

    public int get(T key) {
        return map.getOrDefault(key, 0);
    }

    public Set<T> keySet() {
        return map.keySet();
    }

    public Set<Entry<T, Integer>> entrySet() {
        return map.entrySet();
    }

    public Collection<Integer> values() {
        return map.values();
    }
}
