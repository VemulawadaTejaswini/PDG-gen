import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import static java.util.Arrays.sort;



public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int w = fsc.nextInt();
        int h = fsc.nextInt();
        long[][] pq = new long[w + h][2];
        long ans = 0;
        for (int i = 0; i < w + h; i++) {
            pq[i][0] = fsc.nextLong();
            pq[i][1] = i < w ? 0 : 1;
            ans += pq[i][0];
        }
        sort(pq, (u, v) -> Long.compare(u[0], v[0]));
        int x = w, y = h;
        long cnt = h + w;
        for (int i = 0; i < h + w; i++) {
            if (cnt == (long) (h + 1) * (w + 1) - 1) {
                break;
            }
            if (pq[i][1] == 0) {
                ans += pq[i][0] * y;
                cnt += y;
                x--;
            } else {
                ans += pq[i][0] * x;
                cnt += x;
                y--;
            }
        }
        System.out.println(ans);
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
