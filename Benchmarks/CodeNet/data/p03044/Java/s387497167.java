import java.io.*;
import java.util.*;

class Main implements Runnable {

	public Main() {}
	static class Node 
	{
		int u,v,w;
		Node(int a, int b, int c)
		{
			u = a;
			v = b;
			w = c;
		}
		
	}
	static LinkedList<Node>[] adj ;
	static int n;
	static int[] color;
	public static void main(String[] args) {
		new Thread(null, new Main(),"Pratham", 1<<27).start();
	}
	public void run() {
		FastScanner s = new FastScanner();
		n = s.nextInt();
		adj = new LinkedList[n];
		for(int i = 0; i<n;i++) adj[i] = new LinkedList<>();
		
		for(int i = 0 ;i < n-1 ; i++)
		{
			int u = s.nextInt() - 1;
			int v = s.nextInt() - 1;
			int w = s.nextInt() ;
			adj[u].add(new Node(u,v,w));
			adj[v].add(new Node(v,u,w));
		}
		color = new int[n];
		dfs(0,-1);
		StringBuilder sb = new StringBuilder();
		for(int i  = 0;i<n;i++)
			sb.append(color[i]+"\n");
		System.out.print(sb+"");
	}
	
	static void dfs(int u , int p)
	{
		for(Node V : adj[u])
		{
			int v = V.v;
			if(v != p)
			{
				int w = V.w;
				if(w % 2 == 0)
				{
					color[v] = color[u];
				}
				else
				{
					color[v] = 1 - color[u];
				}
				dfs(v, u);
			}
		}
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
