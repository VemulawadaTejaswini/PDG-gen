import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	static long[] dp1;
	static long[] dp2;
	static long[] ans;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		long M=sc.nextLong();
		graph G=new graph(N);
		for (int i = 0; i < N-1; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			G.addEdge(a, b, 1);
			G.addEdge(b, a, 1);
		}
		dp1=new long[N];
		dp2=new long[N];
		ans=new long[N];
		G.dfs1(0, -1, M);
		G.dfs2(0, -1, M);
		G.dfs3(0, -1, M);
		for (long l: ans) {
			out.println(l);
		}
		out.flush();
 	}
	static class graph{
		ArrayList<Edge>[] list;
		int size;
		long INF=Long.MAX_VALUE/2;
		int[] color;
		@SuppressWarnings("unchecked")
		public graph(int n) {
			size = n;
			list = new ArrayList[n];
			color =new int[n];
			for(int i=0;i<n;i++){
				list[i] = new ArrayList<Edge>();
			}
		}
		void addEdge(int from,int to,long w) {
			list[from].add(new Edge(to,w));
		}
		void dfs1(int v,int p,long M) {
			long dpmul=1L;
			for (Edge edge: list[v]) {
				if (edge.to==p) {
					continue;
				}
				dfs1(edge.to, v,M);
				dpmul*=dp1[edge.to];
				dpmul%=M;
			}
			dp1[v]=dpmul+1;
			dp1[v]%=M;
		}
		void dfs2(int v,int p,long M) {
			if (p==-1) {
				dp2[v]=1;
			}
			long[] left=new long[list[v].size()+1];
			long[] right=new long[list[v].size()+1];
			left[0]=1;
			right[right.length-1]=1;
			for (int i = 1; i < right.length; i++) {
				if (list[v].get(i-1).to==p) {
					left[i]=left[i-1];
					continue;
				}
				left[i]=left[i-1]*dp1[list[v].get(i-1).to];
				left[i]%=M;
			}
			for (int i = right.length-2; i >= 0; i--) {
				if (list[v].get(i).to==p) {
					right[i]=right[i+1];
					continue;
				}
				right[i]=right[i+1]*dp1[list[v].get(i).to];
				right[i]%=M;
			}
			for (int i = 0; i < list[v].size(); i++) {
				int to=list[v].get(i).to;
				if (to==p) {
					continue;
				}
				dp2[to]=(left[i]*right[i+1]*dp2[v]+1)%M;
				dfs2(to, v, M);
			}
		}
		void dfs3(int v,int p,long M) {
			long a=1;
			for (Edge edge: list[v]) {
				if (edge.to==p) {
					a*=dp2[v];
					a%=M;
				}else {
					a*=dp1[edge.to];
					a%=M;
					dfs3(edge.to, v, M);
				}
			}
			ans[v]=a;
		}
	}
	static class Edge implements Comparable<Edge>{
		int to;
		long v;
		public Edge(int to,long v) {
			this.to=to;
			this.v=v;
		}
		@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Edge) {
    			Edge other = (Edge) obj;
    			return other.to==this.to && other.v==this.v;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.to,this.v);
    	}
    	@Override
		  public int compareTo( Edge p2 ){
			 if (this.v>p2.v) {
				return 1;
			}
			 else if (this.v<p2.v) {
				return -1;
			}
			 else {
				return 0;
			}
		  }
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
