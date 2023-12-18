import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/* spar5h */

public class Main implements Runnable{    
	
	static class Pair {
		
		int i;
		long w;
		
		Pair(int i, long w) {
			this.i = i; this.w = w;
		}
	}
	
	static class comp implements Comparator<Pair> {
		
		public int compare (Pair x, Pair y) {
			
			if(x.w > y.w)
				return -1;
			
			if(x.w < y.w)
				return 1;
			
			return 0;
		}
	}
	
	public void run() {
		
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		int t = 1;
		
		while(t-- > 0) {
			
			int n = s.nextInt();
			
			long[] a = new long[n];
			
			for(int i = 0; i < n; i++)
				a[i] = s.nextLong();
			
			long[] b = new long[n];
			
			for(int i = 0; i < n; i++)
				b[i] = s.nextLong();
			
			Pair[] p = new Pair[n];
			
			for(int i = 0; i < n; i++)
				p[i] = new Pair(i, a[i] - b[i]);
			
			Arrays.sort(p, new comp());
			
			long[] pre = new long[n];
			
			long pos = 0, neg = 0;
			
			for(int i = 0; i < n; i++) {
				
				if(p[i].w >= 0)
					pos += p[i].w;
				else
					neg -= p[i].w;
				
				if(i - 1 >= 0)
					pre[i] = pre[i - 1];
				
				pre[i] += p[i].w;
			}
			
			if(pos < neg) {
				w.println(-1); continue;
			}
			
			long[] c = a.clone();
			
			long k = 0;
			
			for(int i = 0; i < n; i++) {
				
				if(k + p[i].w >= neg) {
					c[p[i].i] -= (neg - k);
					k = neg;
					break;
				}
				
				k += p[i].w;
				c[p[i].i] = b[p[i].i];
			}
			
			for(int i = 0; i < n; i++)
				if(c[i] < b[i])
					c[i] = b[i];
			
			int res = 0;
			
			for(int i = 0; i < n; i++)
				if(a[i] != c[i])
					res++;
			
			w.println(res);
			
		}
		
		
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