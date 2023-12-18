import java.util.*; 
import java.io.*;
 
public class Main {
	
	public static void solve(InputReader in) {
		int n = in.readInt(); 
		int jumps[] = new int[n]; 
		for(int i = 0; i<n; i++)
			jumps[i] = in.readInt(); 
		
		int dp[] = new int[n]; 
		dp[0] = 0; 
		dp[1] = Math.abs(jumps[1] - jumps[0]); 
		for(int i = 2; i<n; i++) {
			dp[i] = Math.min(Math.abs(jumps[i] - jumps[i-1]) + dp[i-1] , Math.abs(jumps[i] - jumps[i-2] + dp[i-2]));
		}
		System.out.println(dp[n-1]); 
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
