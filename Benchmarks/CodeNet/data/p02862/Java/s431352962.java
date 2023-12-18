import java.util.*;
import static java.lang.System.*;
import java.io.*;
public class Main {
	static int X, Y;
	static int INF = 1000000007;
	static boolean[][] seen;
	static int[][] cnt;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		X = sc.nextInt();
		Y = sc.nextInt();
		seen = new boolean[Y + 1][X + 1];
	    cnt = new int[Y + 1][X + 1];
		seen[0][0] = true;
		cnt[0][0]  = 1;
		
		func(Y, X);
		out.println(cnt[Y][X]);
	}
	
static int  func(int y ,int x) {
	int x1 = x - 2, y1 = y - 1, x2 = x - 1, y2 = y - 2;
	int a = 0, b = 0;
	if( x1 < 0 || y1 < 0)
		a = 0;
	else if( seen[y1][x1]) {
		a = cnt[y1][x1];
	} else {
		a = func(y1, x1);		
	}
	if (x2 < 0 || y2 < 0)
		b = 0;
	else if (seen[y2][x2]) {
		b = cnt[y2][x2];
	} else {
		b = func(y2, x2);
	}
	seen[y][x] = true;
	cnt[y][x] =  a % INF + b % INF;
	return cnt[y][x];
	
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
