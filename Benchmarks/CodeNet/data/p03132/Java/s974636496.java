import java.util.*;
import java.io.*;
import static java.lang.Math.*;

/* spar5h */

public class Main implements Runnable{    
	
	public void run() {
		
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		int n = s.nextInt();
		
		int[] a = new int[n + 2];
		
		for(int i = 1; i <= n; i++) 
			a[i] = s.nextInt();
		
		long[] preOdd = new long[n + 2];
		long[] preEven = new long[n + 2];
		long[] preSum = new long[n + 2];
		
		long[] sufOdd = new long[n + 2];
		long[] sufEven = new long[n + 2];
		long[] sufSum = new long[n + 2];
		
		for(int i = 1; i <= n; i++) {
			
			preOdd[i] = preOdd[i - 1];
			preEven[i] = preEven[i - 1];
			preSum[i] = preSum[i - 1];
			
			preOdd[i] += 1 - (a[i] % 2);
			
			if(a[i] == 0)
				preEven[i] += 2L;
			else
				preEven[i] += a[i] % 2;
			
			preSum[i] += a[i];
			
			preOdd[i] = min(preOdd[i], preSum[i]);
			preEven[i] = min(preEven[i], preSum[i]);
		}
		
		for(int i = n; i >= 1; i--) {
			
			sufOdd[i] = sufOdd[i + 1];
			sufEven[i] = sufEven[i + 1];
			sufSum[i] = sufSum[i + 1];
			
			sufOdd[i] += 1 - (a[i] % 2);
			
			if(a[i] == 0)
				sufEven[i] += 2L;
			else
				sufEven[i] += a[i] % 2;
			
			sufSum[i] += a[i];
			
			sufOdd[i] = min(sufOdd[i], sufSum[i]);
			sufEven[i] = min(sufEven[i], sufSum[i]);
		}
		
		long curr = 0;
		
		long res = Long.MAX_VALUE;
		
		for(int i = 0; i <= n; i++) {
			//w.println(i + " //");
			//w.println(preOdd[i] + sufEven[i + 1]);
			//w.println(preEven[i] + sufOdd[i + 1]);
			
			curr = min(preEven[i], curr + a[i] % 2);
			
			res = min(curr + sufEven[i + 1], res);
			res = min(preOdd[i] + sufEven[i + 1], res);
			res = min(preEven[i] + sufOdd[i + 1], res);
		}
		
		w.println(res);
		
		w.close();
	}
	
	static class InputReader {
		
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		
		public InputReader(InputStream stream)
		{
			this.stream = stream;
		}
		
		public int read()
		{
			if (numChars==-1) 
				throw new InputMismatchException();
			
			if (curChar >= numChars)
			{
				curChar = 0;
				try 
				{
					numChars = stream.read(buf);
				}
				catch (IOException e)
				{
					throw new InputMismatchException();
				}
				
				if(numChars <= 0)				
					return -1;
			}
			return buf[curChar++];
		}
	 
		public String nextLine()
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
		}
		public int nextInt()
		{
			int c = read();
			
			while(isSpaceChar(c)) 
				c = read();
			
			int sgn = 1;
			
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			
			int res = 0;
			do 
			{
				if(c<'0'||c>'9') 
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c)); 
			
			return res * sgn;
		}
		
		public long nextLong() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			long res = 0;
			
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c));
				return res * sgn;
		}
		
		public double nextDouble() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') 
			{
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') 
			{
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) 
				{
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		
		public String readString() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
			
			return res.toString();
		}
	 
		public boolean isSpaceChar(int c) 
		{
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	 
		public String next() 
		{
			return readString();
		}
		
		public interface SpaceCharFilter 
		{
			public boolean isSpaceChar(int ch);
		}
	}
    
	public static void main(String args[]) throws Exception
	{
		new Thread(null, new Main(),"Main",1<<26).start();
	}
}