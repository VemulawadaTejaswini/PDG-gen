

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

public class Main {
	static InputReader reader = new InputReader(System.in);
    static Print p = new Print();
    static int R, C, K;
    static long [][] arr;
    static long [][][] dp;
    static long dp_solve(int r, int j, int m) {
      if(r >= R || j >= C)return 0; 
      if(r == R - 1 && j == C - 1)return arr[r][j];
      if(m > 3)return 0; 

      long sol1 = 0, sol2 = 0, sol3 = 0;
      if(dp[r][j][m] == 0) {
      sol1 = arr[r][j] + dp_solve(r, j + 1, m + 1);
      sol3 = dp_solve(r, j + 1, m);
      sol2 = arr[r][j] + dp_solve(r + 1, j, 1);
      dp[r][j][m] = Long.max(sol1, Long.max(sol2, sol3));
      }
      return dp[r][j][m]; 
    }
	public static void main(String[] args) throws Exception{
    R = reader.nextInt(); 
    C =  reader.nextInt();
    K =  reader.nextInt();

    arr = new long[K][K]; 
    dp = new long[K][K][4]; 
    for(int i = 0; i < K; i++)arr[reader.nextInt() - 1][reader.nextInt() - 1] = reader.readLong(); 
       
   p.printLine(Long.toString(dp_solve(0, 0, 1)));
    
   p.close();
	}
	static class InputReader {
	    private InputStream stream;
	    private byte[] buf = new byte[1024];
	 
	    private int curChar;
	 
	    private int numChars;
	 
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
	 
	    public int nextInt() {
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
	 
	    public long readLong() {
	        int c = read();
	        while (isSpaceChar(c))
	            c = read();
	        int sgn = 1;
	        if (c == '-') {
	            sgn = -1;
	            c = read();
	        }
	        long res = 0;
	        do {
	            if (c < '0' || c > '9')
	                throw new InputMismatchException();
	            res *= 10;
	            res += c - '0';
	            c = read();
	        } while (!isSpaceChar(c));
	        return res * sgn;
	    }
	 
	    public boolean isSpaceChar(int c) {
	        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	    }
	}
	static class Print
	{
		private final BufferedWriter bw;
		public Print()
		{
			bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(String str)throws IOException
		{
			bw.append(str);
		}
		public void printLine(String str)throws IOException
		{
			print(str);
			bw.append("\n");
		}
		public void close()throws IOException
		{
			bw.close();
		}
	}   


}
