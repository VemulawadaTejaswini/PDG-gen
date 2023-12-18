//master
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Long, Long> m1 = new HashMap<>();
        HashMap<Long, Long> m2 = new HashMap<>();
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            long l = a[i] + i;
            long r = i - a[i];
            if(!m1.containsKey(l)) m1.put(l, 0L);
            if(!m2.containsKey(r)) m2.put(r, 0L);
            m1.put(l, m1.get(l)+1);
            m2.put(r, m2.get(r)+1);
        }
        long ans = 0;
        for(long m : m1.keySet()) {
            if(m2.containsKey(m)) ans += m1.get(m)*m2.get(m);
        }
        p(ans);
    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pe(T message) {
        System.err.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
