
import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a = sc.nextLong();
        long LCM = 0;
        for(int i = 1; i < n; i++) {
        	long b = sc.nextLong();
        	LCM = lcm(a, b);
        	a = LCM;
        }
        long half = LCM / 2;
        long cnt = 0;
        if (half > m) cnt = 0;
        else {
        	cnt = 1;
        	while (half <= m) {
        		half += LCM;
        		if (half <= m)cnt++;
        	}
        }
        out.println(cnt);
        
	
}
	  //最小公倍数を求めるメソッド
	  private static long lcm(long m, long n) {
		    return m * n / gcd(m, n);
		}
	  //最大公約数を求めるメソッド
	  private static long gcd(long m, long n) {
		    if(m < n) return gcd(n, m);
		    if(n == 0) return m;
		    return gcd(n, m % n);
		}

static class FastScanner {
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
}
