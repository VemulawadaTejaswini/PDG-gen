import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		if(n == 0)      out.println("1");
		else if(n == 1) out.println("2");
		else if(n == 2) out.println("1");
		else            out.println("0");
		out.flush();
	}

}

//-----------------Template------------------//
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
	 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	 
 
}