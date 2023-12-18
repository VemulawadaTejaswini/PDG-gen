

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	
	public static void main(String[] args) {
		String s = in.readString();
		
		int n = s.length();
		
		for(int i=0; i<n; i++) {
			if (s.charAt(i)!=s.charAt(n-i-1)) {
				System.out.println("No");
				return;
			}
		}
		int p = (n-1)/2-1;
		for(int i=0; i<=(n-1)/2-1; i++) {
			if (s.charAt(i)!=s.charAt(p-i)) {
				System.out.println("No");
				return;
			}
		}
		
		
		int j = n-1;
		for(int i=(n+3)/2-1; i<n; i++) {
			if (s.charAt(i)!=s.charAt(j)) {
				System.out.println("No");
				return;
			}
			j--;
		}
		System.out.println("Yes");
		
		out.flush();
		out.close();
		
	}
	
	

	//NONPROBLEM CODE
	
	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);
	
	private static class InputReader {
		 
		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;
 
		public InputReader(InputStream st) {
			this.stream = st;
		}
 
		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
 
		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
 
	}
	
	private static void debug(Object... o) {
		for(Object x: o) {
			out.write(x+" ");
		}
		out.write("\n");
		out.flush();
	}
	
}
