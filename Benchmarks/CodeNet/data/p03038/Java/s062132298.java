import java.io.*;

import java.util.*;


 class Main {

	static class Node implements Comparable<Node>
	{
		int b,c;
		Node(int a, int d)
		{
			this.b = a;
			c = d;
		}
		public int compareTo(Node node)
		{
			return Integer.compare(node.c,c);
		}
	}
	
	public static void main(String[] args) {
		
		FastScanner s = new FastScanner();
		
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		Node[] query = new Node[m];
		for(int i = 0;i<m;i++)
		{
			query[i] = new Node(s.nextInt(), s.nextInt());
		}
		Arrays.sort(query);
		
		int j = 0;
		int[] cnt = new int[m];
		Arrays.sort(arr);
		int last = -1;
		for(int i = 0;i<n ;i++)
		{
			int C = query[j].c;
		//	System.out.println(C);
			if(arr[i] < C)
			{
				cnt[j]++;
				last = i;
				if(cnt[j] < query[j].b)
				continue;
			}
			j++;
			if(j>=m)break;
		}
		
		for(int i = 1;i<n;i++)
		{
			arr[i] = arr[i] + arr[i-1];
		}
		long ans = 0;
		for(int i = 0;i<=j;i++)
		{
          if(j<m)
			ans = ans + cnt[i] *1L* query[i].c;
		}
		if(last>=0)
		ans  =  ans + arr[n-1] - arr[last];
		else if(last == -1)
			ans = arr[n-1];
		
		
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
