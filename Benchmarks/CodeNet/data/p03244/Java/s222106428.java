import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.util.Collections;
//import java.util.Formatter;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Set;
//import java.util.Stack;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        final int n = fs.nextInt();

        int[] v = new int[n];

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            v[i] = fs.nextInt();
            if (!m.containsKey(v[i])) m.put(v[i], 0);
            m.put(v[i], m.get(v[i]) + 1);
        }

        if (m.size() == 1) {
            System.out.println(v.length / 2);
        } else {
            // 降順
            // java.util.Collections.reverseOrder
            // java.util.Map.Entry.comparingByValue
            HashMap<Integer, Integer> hm = m.entrySet().stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .collect(
                    Collectors.toMap(Entry::getKey, Entry::getValue,
                        (e1, e2) -> e1,LinkedHashMap::new));

            // java.util.Map.Entry
            // @SuppressWarnings("unchecked")
//            Set<Entry<Integer, Integer>> entrys = hm.entrySet();
//            Entry<Integer, Integer>[] entryArrays = new Entry[hm.size()];
//            entrys.toArray(entryArrays);
//System.out.println(entryArrays[hm.size() - 1]);
//System.out.println(entryArrays[0]);

            Integer[] a = new Integer[n];
            //System.arraycopy(v,0,a,0,v.length);
            for (int i = 0; i < n; i++) a[i] = v[i];

            Integer X = -1;
            Integer Y = -1;
            for (Integer i : hm.keySet()) {
                if (X == -1) X = i;
                else if (Y == -1) {
                    Y = i;
                    break;
                }
            }

            a[0] = X;
            a[1] = Y;

            int cnt = 0;
            for (int i = 2; i < n; i++) {
                if (a[i] != a[i - 2]) {
                    cnt++;
                    a[i] = a[i - 2];
                }
            }

            //System.arraycopy(v,0,a,0,v.length);
            for (int i = 0; i < n; i++) a[i] = v[i];

            a[0] = Y;
            a[1] = X;

            int cnt2 = 0;
            for (int i = 2; i < n; i++) {
                if (a[i] != a[i - 2]) {
                    cnt2++;
                    a[i] = a[i - 2];
                }
            }
            System.out.println(Math.min(cnt, cnt2));
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
