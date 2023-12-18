import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.Delayed;
import java.util.logging.Logger;

import javax.transaction.xa.Xid;


public class Main {
	static final long MOD=998244353;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int S=sc.nextInt();
		graph G=new graph(N);
		int[] C_=new int[N];
		long[] D_=new long[N];
		for (int i = 0; i < M; i++) {
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int A=sc.nextInt();
			long B=sc.nextLong();
			G.addEdge(u, v, B,A);
			G.addEdge(v, u, B,A);
		}
		for (int i = 0; i < D_.length; i++) {
			C_[i]=sc.nextInt();
			D_[i]=sc.nextLong();
		}
		long[][] l=G.dijkstra(0, S, C_, D_);
		for (int i = 1; i < N; i++) {
			long min=Long.MAX_VALUE;
			for (int j = 0; j <= 2500; j++) {
				if (l[i][j]!=-1) {
					min=Math.min(min, l[i][j]);
				}
			}
			out.println(min);
		}
		out.flush();
	}
	static class Edge implements Comparable<Edge>{
		int to;
		long v;
		int from;
		public Edge(int to,long v,int from) {
			this.to=to;
			this.v=v;
			this.from=from;
		}
		@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Edge) {
    			Edge other = (Edge) obj;
    			return other.to==this.to && other.v==this.v&&other.from==this.from;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.to,this.v,this.from);
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
		void addEdge(int from,int to,long w,int A) {
			list[from].add(new Edge(to,w,A));
		}
		long[][] dijkstra(int s,int S,int[] C_,long[] D_){
	        long[][] L = new long[size][2501];
	        for(int i=0;i<size;i++){
	            for (int j = 0; j <= 2500; j++) {
					L[i][j]=-1;
				}
	        }
	        int[][] visited = new int[size][2501];
	        L[s][Math.min(S, 2500)] = 0;
	        PriorityQueue<Edge> Q = new PriorityQueue<Edge>();
	        Q.add(new Edge(s,0L,Math.min(S, 2500)));//Edgeに最短距離候補を持たせる
	        while(!Q.isEmpty()){
	            Edge C = Q.poll();
	            if(visited[C.to][C.from]==0){
	                L[C.to][C.from] = C.v;
	                visited[C.to][C.from] = 1;
	                for(Edge D:list[C.to]){
	                	if (C.from>=D.from) {
							Q.add(new Edge(D.to, L[C.to][C.from]+D.v, C.from-D.from));
						}
	            }
	                Q.add(new Edge(C.to, L[C.to][C.from]+D_[C.to], Math.min(C.from+C_[C.to],2500)));
                }
	        }
	        return L;
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
