import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long[] min = new long[n];
		long[] check = new long[n];
		check[0] = t[0];
		check[n-1] = a[n-1];
		boolean bad = false;
		for(int i = 1; i < n; i++) {
			if(t[i] != t[i-1]) {
				check[i] = t[i];
			}
		}
		for(int i = n-2; i >= 0; i--) {
			if(a[i] != a[i+1]) {
				if(check[i] != 0 && a[i] != check[i]) bad = true;
				check[i] = a[i];
			}
		}
		for(int i = 0; i < n; i++) {
			min[i] = Math.min(a[i], t[i]);
		}
		long sum = 1;
		for(int i = 0; i < n; i++) {
			if(check[i] != 0) {
				sum *= 1L;
			}
			else {
				sum = (min[i] * sum) % MOD;;
			}
		}
		if(t[n-1] != a[0]) {
			bad = true;
		}
		if(bad) {
			sum = 0;
		}
		System.out.println(sum);
		

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
    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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