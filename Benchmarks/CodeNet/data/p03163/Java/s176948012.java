import java.util.*; 
import java.io.*;

public class Main {	
	static long w[] = new long[1000] , v[] = new long[1000] ;  
	static long dp[][] = new long[105][100007]; 
	public static long fun(int n , int c) {
		if(dp[n][c] != -1) return dp[n][c]; 
		if(n == 0 || c == 0) {
			return 0; 
		}
		else if(w[n-1] > c) return fun(n-1,c); 
		
		else {
			     long temp1 =  fun(n-1 , c); 
			     long temp2 =  v[n-1] +  fun(n-1, (int) (c - w[n-1])); 
			     return dp[n][c] = Math.max(temp1, temp2); 
		     }
	}
	public static void solve(InputReader in) {
		int n = in.readInt(); 
		int W = in.readInt(); 
		for(int i = 0; i<105; i++) {
			for(int j = 0; j<100007; j++) {
				dp[i][j] = -1; 
			}
		}
		for(int i = 0; i<n; i++) {
			w[i] = in.readInt(); 
			v[i] = in.readInt(); 
		}
		System.out.println(fun(n,W));  
	}
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in); 
		int t = 1; 
		while(t-- > 0) {
			solve(in); 
		}
	}
}

class InputReader{
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
