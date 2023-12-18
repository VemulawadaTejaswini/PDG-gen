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
    static int[] ans;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        p = new int[q][4];
        ans = new int[n];
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
        ans[0] = 1;
        long res = getMax(1);
        p(res);
    }

    public static long getMax(int i) {
        if(i == n) {
            return calcScore();
        }
        long max = 0;
        for(int j = ans[i-1]; j<=m; j++) {
            ans[i] = j;
            max = Math.max(max, getMax(i+1));
        }
        return max;
    }

    private static long calcScore() {
        long re = 0;
        for(int i = 0; i<q; i++) {
            int aa = p[i][0] - 1;
            int ab = p[i][1] - 1;
            int ac = p[i][2];
            int ad = p[i][3];
            int ka = ans[aa];
            int kb = ans[ab];
            //pe(keta+" "+a+" "+aa+" "+ab+" "+ka+" "+kb);
            if( kb - ka == ac) {
                re += ad;
            }
        }
        return re;
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
