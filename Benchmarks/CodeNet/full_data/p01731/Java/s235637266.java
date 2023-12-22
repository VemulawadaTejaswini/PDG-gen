import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	static Data[] list;
	public static void main(String[] args) {
		int n = sc.nextInt();
		list = new Data[n];
		for(int i = 0; i < n; i++) {
			list[i] = new Data(sc.nextInt(),sc.next());
		}
		for(int i = 0; i < n; i++) {
			if(list[i].al) continue;
			dep(list[i]);
		}
		out.flush();
	}
	static void dep(Data a) {
		if(a.al) return;
		else {
			out.println(makeDot(a.depth) + a.text);
			a.al = true;
			for(int i = 0; i < a.repData.size(); i++) {
				dep(a.repData.get(i));
			}
		}
		
	}
	static String makeDot(int a) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a; i++) {
			sb.append(".");
		}
		return sb.toString();
	}
	static class Data {
		String text;
		boolean al = false;
		int depth = 0;
		ArrayList<Data> repData = new ArrayList<Data>();
		Data(int rep, String data) {
			text = data;
			if(rep == 0) return;
			depth = list[rep-1].depth+1;
			list[rep-1].repData.add(this);
		}
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