
import java.util.*;
import java.io.*;
class Main {
    static int[] a,b;
    static int H,N;
    static long[] power;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        H = sc.nextInt();
        N = sc.nextInt();
        a = new int[N];
        b = new int[N];
        power = new long[H+1];
        for(int i = 0; i<H+1; i++) power[i] = -1;
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        p(fnc((long)H));
    }
    public static long fnc(long h) {
        long min = Long.MAX_VALUE;
        if(h<=0) return 0;
        for(int i = 0; i<N; i++) {
            if(h-a[i]<0) {
                min = Math.min(min, b[i]);
                continue;
            }
            if(power[(int)h-a[i]]==-1) power[(int)h-a[i]] = fnc(h-a[i]);
            min = Math.min(min, power[(int)h-a[i]]+b[i]);
        }
        return min;
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
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