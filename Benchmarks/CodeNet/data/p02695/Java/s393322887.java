//master
import java.io.*;
import java.util.*;
class point {
    int a,b,c,d;
    public point(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
public class Main {
    static int n, m, q;
    static int[][] p;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        p = new int[q][4];
        for(int i = 0; i<q; i++) { 
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
            p[i][2] = sc.nextInt();
            p[i][3] = sc.nextInt(); 
        }
        if(q==1) {
            p(p[0][3]);
            return;
        }
        long ans = getMax(1, 1);
        p(ans);
    }

    public static long getMax(int i, long a) {
        if(i == n) {
            return calcScore(a);
        }
        long max = 0;
        for(int j = (int)a%10; j<=m; j++) {
            max = Math.max(max, getMax(i+1, a*10+j));
        }
        return max;
    }

    private static long calcScore(long a) {
        long keta = (long)Math.pow(10,(long)Math.log10(a));
        long ans = 0;
        for(int i = 0; i<q; i++) {
            int aa = p[i][0];
            int ab = p[i][1];
            int ac = p[i][2];
            int ad = p[i][3];
            long ka = a / (keta/(long)Math.pow(10,aa-1)) %10;
            long kb = a / (keta/(long)Math.pow(10,ab-1)) %10;
            //pe(keta+" "+a+" "+aa+" "+ab+" "+ka+" "+kb);
            if( kb - ka == ac) {
                ans += ad;
            }
        }
        return ans;
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
