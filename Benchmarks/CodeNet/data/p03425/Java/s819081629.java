import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {
	   InputReader in = new InputReader(System.in);
	   int n = in.readInt(); 
	   long d[] = new long[5];
	   int P[]={0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,2};
	   int Q[]={1 ,1 ,1 ,2 ,2 ,3 ,2 ,2 ,3 ,3};
	   int R[]={2 ,3 ,4 ,3 ,4 ,4 ,3 ,4 ,4 ,4};
	   
	   for(int i = 0; i<n; i++) {
		   char s[] = in.readString().toCharArray();
		   if ( s[0]== 'M') d[0]++;
		   if ( s[0]== 'A') d[1]++;
		   if ( s[0]== 'R') d[2]++;
		   if ( s[0]== 'C') d[3]++;
		   if ( s[0]== 'H') d[4]++;
	   }
	   long res = 0; 
	   for(int i = 0; i<10; i++) {
		   int s = P[i];  
		   int t = Q[i]; 
		   int u = R[i]; 
		   res += d[s]*d[t]*d[u]; 
	   }
	   System.out.println(res); 
	}
}

class InputReader {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long readLong() {
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
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
