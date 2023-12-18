import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;

/* spar5h */

public class Main implements Runnable {    
	
	static void addMap(TreeMap<Integer, Integer> hm, int x) {
		
		if(hm.get(x) != null)
			hm.put(x, hm.get(x) + 1);
		else
			hm.put(x, 1);
	}
	
	static boolean change(TreeMap<Integer, Integer> tm, int len, int k) {
		
		tm.put(len - 1, tm.ceilingEntry(len - 1).getValue());
		
		while(tm.lastKey() > len - 1)
			tm.remove(tm.lastKey());
		
		int i = len - 1;
		
		while(i >= 0) {
			
			int temp = tm.ceilingEntry(i).getValue();
			
			if(i - 1 >= 0 && tm.get(i - 1) == null)
				tm.put(i - 1, temp);
			
			if(tm.ceilingEntry(i).getValue() < k - 1) {
				tm.put(i, tm.ceilingEntry(i).getValue() + 1); break;
			}
			
			tm.put(tm.ceilingKey(i), 0);
			
			i--;
		}
		
		/*
		for(Map.Entry<Integer, Integer> e : tm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		System.out.println("????");
		*/
		
		if(i == -1)
			return false;
		
		return true;
	}
	
	static boolean check(int n, int[] a, int k) {
		
		//System.out.println(k + "//// ");
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		int i = 1;
		
		while(i < n && a[i] > a[i - 1])
			i++;
		
		tm.put(a[i - 1] - 1, 0);
		
		/*
		for(Map.Entry<Integer, Integer> e : tm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		System.out.println("????");
		*/
		
		while(i < n) {
			
			if(!change(tm, a[i], k))
				return false;
			
			int temp = a[i] - 1;
			
			i++;
			
			while(i < n && a[i] > a[i - 1]) 
				 i++;
			
			if(a[i - 1] - 1 > temp)
				tm.put(a[i - 1] - 1, 0);
		}
		
		return true;
	}
	
	public void run() {
		
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		
		int n = s.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = s.nextInt();
		
		int left = 1, right = n;
		
		int res = n;
		
		while(left <= right) {
			
			int mid = (left + right) / 2;
			
			if(check(n, a, mid)) {
				res = mid; right = mid - 1;
			}
			else 
				left = mid + 1;
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
		
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
		
		public int read() {
			
			if (numChars==-1) 
				throw new InputMismatchException();
			
			if (curChar >= numChars) {
				
				curChar = 0;
				
				try {
					numChars = stream.read(buf);
				}
				catch (IOException e) {
					throw new InputMismatchException();
				}
				
				if(numChars <= 0)				
					return -1;
			}
			
			return buf[curChar++];
		}
		 
		public String nextLine() {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str = "";
	        
			try {
	            str = br.readLine();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
			
	        return str;
		}
		
		public int nextInt() {
		
			int c = read();
			
			while(isSpaceChar(c)) 
				c = read();
			
			int sgn = 1;
			
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			
			int res = 0;
			
			do {
				if(c<'0'||c>'9') 
					throw new InputMismatchException();
				
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c)); 
			
			return res * sgn;
		}
		
		public long nextLong() {
			
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
			}
			
			while (!isSpaceChar(c));
				return res * sgn;
		}
		
		public double nextDouble() {
			
			int c = read();
			
			while (isSpaceChar(c))
				c = read();
			
			int sgn = 1;
			
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			
			double res = 0;
			
			while (!isSpaceChar(c) && c != '.') {
				
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				
				res *= 10;
				res += c - '0';
				c = read();
			}
			
			if (c == '.') {
				
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
		
		public String readString() {
			
			int c = read();
			
			while (isSpaceChar(c))
				c = read();
			
			StringBuilder res = new StringBuilder();
			
			do {
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
			
			return res.toString();
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

	public static void main(String args[]) throws Exception {
		new Thread(null, new Main(),"Main",1<<26).start();
	}
}   