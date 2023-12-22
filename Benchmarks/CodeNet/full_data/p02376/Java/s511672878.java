import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main  {
	static long MOD=1000000000+7;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		MAX_FLOW gFlow=new MAX_FLOW(v);
		for (int i = 0; i < e; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			gFlow.addEdge(a, b, c);
		}
		System.out.println(gFlow.max_flow(0, v-1));
 	}
	
	static class MAX_FLOW{
		static final int INF = (int)1e9 + 7;
		ArrayList<Edge>[] G;
		boolean[] used;
		@SuppressWarnings("unchecked")
		public MAX_FLOW(int n) {
			G = new ArrayList[n];
			used=new boolean[n];
			for(int i=0;i<n;i++){
				G[i] = new ArrayList<Edge>();
			}
		}
		class Edge{
			int to,cap,rev;
			public Edge(int to,int cap,int rev){
				this.to = to;
				this.cap = cap;
				this.rev = rev;
			}
		}
		public void addEdge(int from,int to,int cap){
			G[from].add(new Edge(to,cap,G[to].size()));
			G[to].add(new Edge(from,0,G[from].size()-1));
		}
		public int dfs(int v,int t,int f){
			if(v == t)return f;
			used[v] = true;
			for(int i = 0;i < G[v].size();i++){
				Edge e = G[v].get(i);
				if(!used[e.to] && e.cap > 0){
					int d = dfs(e.to,t,Math.min(f, G[v].get(i).cap));
					if(d > 0){
						G[v].get(i).cap -= d;
						G[e.to].get(e.rev).cap += d;
						return d;
					}
				}
			}
			return 0;
		}
		public int max_flow(int s,int t){
			int flow = 0;
			for(;;){
				Arrays.fill(used, false);
				int f = dfs(s,t,INF);
				if(f == 0)return flow;
				flow += f;
			}
		}
	}
	static long gcd(long a,long b) {
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	static int rev(int x) {
	    int res = 0;
	    while (x > 0) { res *= 10; res += x % 10; x /= 10; }
	    return res;
	}
	 static int ceil(int a,int b){
	        return a%b==0?a/b:a/b+1;
	    }
	 static int kumi(int i, int j, int W){
	        return i*W+j;//W列の２次配列を一次元にする
	    }
	

	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
 
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
