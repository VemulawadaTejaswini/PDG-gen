import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/* spar5h */

public class Main implements Runnable{    
	
	final static long mod = (long)1e9 + 7;
	
	public void run() {
		
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		char[] a = s.next().toCharArray();
		int n = a.length;
		
		int[] preA = new int[n];
		int[] sufC = new int[n];
		
		int[] preQ = new int[n];
		int[] sufQ = new int[n];
		
		for(int i = 1; i < n; i++) {
			
			preA[i] = preA[i - 1];
			
			if(a[i - 1] == 'A')
				preA[i]++;
			
			preQ[i] = preQ[i - 1];
			
			if(a[i - 1] == '?')
				preQ[i]++;
		}
		
		for(int i = n - 2; i >= 0; i--) {
			
			sufC[i] = sufC[i + 1];
			
			if(a[i + 1] == 'C')
				sufC[i]++;
			
			sufQ[i] = sufQ[i + 1];
			
			if(a[i + 1] == '?')
				sufQ[i]++;
		}
		
		long[] pow3 = new long[n + 1]; pow3[0] = 1;
		
		for(int i = 1; i <= n; i++)
			pow3[i] = (pow3[i - 1] * 3) % mod;
		
		long res = 0;
		int q = preQ[n - 1] + sufQ[n - 2];
		
		for(int i = 0; i < n; i++) {
			
			if(a[i] == '?') {
				
				res = (res + preA[i] * sufC[i] % mod * pow3[q - 1] % mod) % mod;
				
				if(q - 2 >= 0) {
					res = (res + preA[i] * sufQ[i] % mod * pow3[q - 2] % mod) % mod;
					res = (res + preQ[i] * sufC[i] % mod * pow3[q - 2] % mod) % mod;
				}
				
				if(q - 3 >= 0)
					res = (res + preQ[i] * sufQ[i] % mod * pow3[q - 3] % mod) % mod;
			}
			
			else if(a[i] == 'B') {
				
				res = (res + preA[i] * sufC[i] % mod * pow3[q] % mod) % mod;
				
				if(q - 1 >= 0) {
					res = (res + preA[i] * sufQ[i] % mod * pow3[q - 1] % mod) % mod;
					res = (res + preQ[i] * sufC[i] % mod * pow3[q - 1] % mod) % mod;
				}
				
				if(q - 2 >= 0)
					res = (res + preQ[i] * sufQ[i] % mod * pow3[q - 2] % mod) % mod;
			}
			
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