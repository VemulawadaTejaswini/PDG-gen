import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        final int N = fs.nextInt();
        final int K = fs.nextInt();

        Counter<Integer> c = new Counter<Integer>();

        for (int i = 0; i < N; i++) {
            Integer tmp = fs.nextInt();
            c.add(tmp);
        }

        // 降順
        // java.util.Collections.reverseOrder
        // java.util.Map.Entry.comparingByValue
        // java.util.stream.Collectors
        HashMap<Integer, Integer> hm = c.entrySet().stream()
            .sorted(Collections.reverseOrder(Entry.comparingByValue()))
            .collect(
                Collectors.toMap(Entry::getKey, Entry::getValue,
                      (e1, e2) -> e1,LinkedHashMap::new));

        Integer cnt = 0;
        int i = 0;

        for (Integer v : hm.values()) {
            i++;
            out.println(v);
            if (K < i) break;
            cnt += v;
        }

        out.println(N - cnt);

        out.flush();
    }
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
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
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
