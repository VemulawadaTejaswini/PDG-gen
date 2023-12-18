import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		char[] ds = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		int last = -1;
		
		loop2:for(int i=ds.length-t.length;i>=0;i--){
			boolean can = true;
			loop:for(int j=0;j<t.length;j++){
				if(ds[i+j]=='?'||ds[i+j]==t[j]){
					
				}
				else{
					can = false;
					break loop;
				}
			}
			if(can){
				last = i;
				break loop2;
			}
		}
		
		if(last == -1){
			System.out.println("UNRESTORABLE");
		}
		else{
			for(int i=0;i<ds.length;i++){
				if(ds[i]=='?'){
					ds[i]='a';
				}
			}
			for(int i=0;i<t.length;i++){
				ds[i+last] = t[i];
			}
			
			for(int i=0;i<ds.length;i++){
				System.out.print(ds[i]);
			}
		}
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
	private static boolean isPrintableChar(int c) {
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