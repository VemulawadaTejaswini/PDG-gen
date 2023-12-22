import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	static int INF = 2 << 27;
	static int[] vx = {1,0,-1,0};
	static int[] vy = {0,1,0,-1};
	static int[] vd = {0,1,2,3};
	static int p;
	static int q;
	static int a;
	static int n;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		//Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if(p == 0 && q == 0 && a == 0 && n == 0) break;
			int ret = solv(0,new int[8]);
			out.println(ret);
		}
		out.flush();
	}
	static int solv(int id, int[] v) {
		if(id != 0) {
			int pp = 1;
			int qq = v[0];
			for(int i = 1; i < id; i++) {
				int lcm = lcm(qq,v[i]);
				int ql = lcm / qq;
				qq = lcm;
				pp *= ql;
				
				int vl = lcm / v[i];
				pp += vl;
			}
			int lcm = lcm(qq,q);
			int ql = lcm / q;
			int ppx = p * ql;
			
			int qql = lcm / qq;
			pp *= qql;
			if(ppx < pp) return 0;
			if(ppx == pp) return 1;
		}
		if(id >= n) return 0;
		int max = 1;
		int now = 1;
		for(int i = 0; i < id; i++) {
			now *= v[i];
			max = Math.max(v[i], max);
		}
		int ret = 0;
		for(int i = max; ; i++) {
			if(now * i > a) break;
			v[id] = i;
			ret += solv(id+1,v);
			v[id] = 0;
		}
		return ret;
	}
	static int gcd(int a, int b) {
		if(b > a) {
			return gcd(b,a);
		}
		if(b == 0) return a;
		return gcd(b,a % b);
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a,b);
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}