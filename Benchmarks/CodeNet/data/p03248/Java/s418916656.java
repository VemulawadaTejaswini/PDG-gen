import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        char[] c = fsc.next().toCharArray();
        int n = c.length;
        boolean[] b = new boolean[n + 1];
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (b[i + 1] = c[i] == '1') {
                one.add(i + 1);
            } else if (i < n - 1) {
                zero.add(i + 1);
            }
        }
        if (!b[1]) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i <= n >> 1; i++) {
            if (b[i] ^ b[n - i]) {
                System.out.println(-1);
                return;
            }
        }
        one.add(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.size() - 1; i++) {
            sb.append(one.get(i)).append(' ').append(one.get(i + 1)).append('\n');
        }
        for (int e : zero) {
            int l = 0;
            int r = one.size();
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (one.get(m) < e) {
                    l = m;
                } else {
                    r = m;
                }
            }
            sb.append(e).append(' ').append(one.get(r)).append('\n');
        }
        System.out.print(sb);
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
