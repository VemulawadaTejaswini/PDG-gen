import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Main {
	static FastScanner sc = new FastScanner(System.in);
	public static void main(String[] args) {
		int[] prime = new int[1000000];
		for (int i=2; i<=999999; i++) {
			if (isPrime(i)) {prime[i] = 1;}
		}
		for (int i=2; i<=999999; i++) {
			prime[i] = prime[i]+prime[i-1];
		}
		while (sc.hasNext()) {
			out.println(prime[sc.nextInt()]);
		}
	}
	
	static boolean isPrime (int n) {
		if (n==2) {return true;}
		if (n<2 || n%2==0) {return false;}
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}
}



class FastScanner implements Closeable {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	public FastScanner(InputStream in) {this.in = in;}
	private boolean hasNextByte() {
		if (ptr < buflen) {return true;}
		else{
			ptr = 0;
			try {buflen = in.read(buffer);}
			catch (IOException e) {e.printStackTrace();}
			if (buflen <= 0) {return false;}
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
		if (b < '0' || '9' < b) {throw new NumberFormatException();}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){return minus ? -n : n;}
			else{throw new NumberFormatException();}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public void close() {
		try {in.close();}
		catch (IOException e) {}
	}
}
