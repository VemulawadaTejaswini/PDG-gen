
import java.io.IOException;
import java.io.*;
import java.util.*;


 class Main {

	static class Res implements Comparable<Res>
	{
		String name;
		int score;
		int index;
		Res(int i,String x, int g)
		{
			index = i;
			name = x;
			score = g;
		}
		public int compareTo(Res res)
		{
			int c = name.compareTo(res.name);
			if(c==0)
			{
				return Integer.compare(res.score, score);
			}
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FastScanner s = new FastScanner();
			
			int n = s.nextInt();
			int m = s.nextInt();
			int[][] arr = new int[m][];
			int[] bulbs = new int[n];
			for(int i = 0;i<m;i++)
			{
				int k = s.nextInt();
				arr[i] = new int[k];
				for(int j = 0;j<k;j++)
				{
					arr[i][j] = s.nextInt()-1;
					bulbs[arr[i][j]]++;
				}
			}
			int[] p = new int[m];
			for(int i = 0;i<m;i++)
				p[i] = s.nextInt();
			int ans = 0;
			
			int[] check = new int[n];
			for(int i = 0 ; i<(1<<n) ;i++)
			{
				int comb = i;
				check = new int[n];
				//System.out.print(comb+" ");
				for(int j = 0; j<n;j++)
				{
					if((comb&(1<<j))!=0)
						check[j] = 1;
			//		System.out.print(check[j]+" ");
				}
			//	System.out.println();
				int b = 1;
				
				for(int q=0;q<m;q++)
				{
					int cnt = 0;
					
					for(int bulb : arr[q])
					{
						if(check[bulb]==1)
							cnt++;
						//System.out.print(bulb+" ");
					}
					//System.out.println();
					
					if(p[q]==cnt%2 )
						b = b*1;
					else b = 0;
				}
				if(b==1)ans++;
			}
			
			
			
			System.out.println(ans);
	}

static   class FastScanner {
		
	    private InputStream mIs;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner() {
			this(System.in);
		}

		public FastScanner(InputStream is) {
			mIs = is;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = mIs.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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

		public String nextString() {
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
			} while (!isSpaceChar(c));
			return res * sgn;
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

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		
		}	

	}

}
