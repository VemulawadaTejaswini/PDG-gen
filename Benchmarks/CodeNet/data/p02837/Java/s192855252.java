import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
        List<List<Pair>> li = new ArrayList<>();
        for (int i = 0; i < N; ++i) li.add(new ArrayList<>());
        for (int i = 0; i < N; ++i) {
            int A = fs.nextInt();
            for (int j = 0; j < A; ++j) {
                int x = fs.nextInt() - 1;
                int y = fs.nextInt();
                li.get(i).add(new Pair(x, y));
            }
        }

        int res = 0;
        for (int bit = 0; bit < (1<<N); ++bit) {
            boolean flag = true;
            for (int i = 0; i < N; ++i) {
                if ((bit & (1<<i)) == 0) continue;

                for (Pair pair : li.get(i)) {
                    if (pair.y == 1 && (bit & (1<<pair.x)) == 0) flag = false;
                    if (pair.y == 0 && (bit & (1<<pair.x)) != 0) flag = false;
                }
            }

            int n = bit;
            if (flag) {
                int cnt = 0;
                while (n > 0) {
                    cnt += n & 1;
                    n >>= 1;
                }

                res = Math.max(res, cnt);
            }
        }

        System.out.println(res);
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



























