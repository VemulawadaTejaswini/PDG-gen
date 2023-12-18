import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        final Integer n = fs.nextInt();
        final Integer hf = n / 2;

        HashMap<Integer, Integer> e = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> o = new HashMap<Integer, Integer>();

        Integer ev = 0;
        Integer ov = 0;
        for (int i = 0; i < n; i++) {
            Integer x = fs.nextInt();
            if (i % 2 == 0) {
                if (!e.containsKey(x)) e.put(x, 0);
                e.put(x, e.get(x) + 1);
                ev = x;
            } else {
                if (!o.containsKey(x)) o.put(x, 0);
                o.put(x, o.get(x) + 1);
                ov = x;
            }
        }

        if (e.size() == 1 && o.size() == 1 && ev.equals(ov)) {
            System.out.println(hf);
            return;
        }

        // 降順
        // java.util.Collections.reverseOrder
        // java.util.Map.Entry.comparingByValue
        HashMap<Integer, Integer> em = e.entrySet().stream()
            .sorted(Collections.reverseOrder(Entry.comparingByValue()))
            .collect(
                Collectors.toMap(Entry::getKey, Entry::getValue,
                    (e1, e2) -> e1,LinkedHashMap::new));

        HashMap<Integer, Integer> om = o.entrySet().stream()
            .sorted(Collections.reverseOrder(Entry.comparingByValue()))
            .collect(
                Collectors.toMap(Entry::getKey, Entry::getValue,
                    (e1, e2) -> e1,LinkedHashMap::new));

        // java.util.Map.Entry
        // @SuppressWarnings("unchecked")
        Set<Entry<Integer, Integer>> es = em.entrySet();
        Entry<Integer, Integer>[] ea = new Entry[em.size()];
        es.toArray(ea);

        Integer EK1 = ea[0].getKey();
        Integer E1 = ea[0].getValue();
        Integer E2 = -n;
        if (1 < ea.length) E2 = ea[1].getValue();

        Set<Entry<Integer, Integer>> os = om.entrySet();
        Entry<Integer, Integer>[] oa = new Entry[om.size()];
        os.toArray(oa);

        Integer OK1 = oa[0].getKey();
        Integer O1 = oa[0].getValue();
        Integer O2 = -n;
        if (1 < oa.length) O2 = oa[1].getValue();

        if (EK1.equals(OK1)) {
            if (1 == ea.length) {
                System.out.println(n - E1 - O2);
                return;
            } else if (1 == oa.length) {
                System.out.println(n - E2 - O1);
                return;
            }
            System.out.println(
                Math.min(n - E1 - O2, n - E2 - O1));
        } else {
            System.out.println(n - E1 - O1);
        }
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
