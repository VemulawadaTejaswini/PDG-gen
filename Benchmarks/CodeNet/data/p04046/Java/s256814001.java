import java.awt.geom.Point2D;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.*;



class Main {
	static long[] a = new long[300001];
	static long MOD = 1000000007;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		a[0] = 1;
		for(int i = 1; i < Main.a.length; i++) {
			a[i] = (a[i-1] * i) % MOD;
		}
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long ans = 0;
		a[1] = 1;
		a[0] = 1;
		for(int i = 0; ; i++) {
			int w = B + i + 1;
			int h = H - A - i;
			if(w > W || h <= 0) break;
			//System.out.println(h +" " +  w);
			long k1 = pp(w + h - 2) % MOD;
			long k1k = (pp(w - 1) * pp(h - 1)) % MOD;
			k1k = new BigInteger(String.valueOf(k1k)).modInverse(new BigInteger(String.valueOf(MOD))).longValue();
			k1k %= MOD;
			k1 *= k1k;
			
			long k2 = pp(W - w+H - h);
			long k2k = (pp(W - w) * pp(H - h)) % MOD;
			k2k = new BigInteger(String.valueOf(k2k)).modInverse(new BigInteger(String.valueOf(MOD))).longValue();
			k2k %= MOD;
			k2 *= k2k;
			k1 %= MOD;
			k2 %= MOD;
			k1 *= k2;
			k1 %= MOD;
			ans = ans + k1;
			ans %= MOD;
		}
		System.out.println(ans);
		
		
	}
	static long pp(long a) {
		return Main.a[(int)a];
		
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
}

