import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int L=sc.nextInt();
		minigraph G=new minigraph(N);
		for (int i = 0; i < M; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int c=sc.nextInt();
			if (c>L) {
				continue;
			}
			G.addEdge(a, b, c);
			G.addEdge(b, a, c);
		}
		long[][] ans=new long[N][N];
		int Q=sc.nextInt();
		for (int i = 0; i < N; i++) {
			ans[i]=G.dijkstra(i, L);
		}
		for (int i = 0; i < Q; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			out.println(ans[a][b]);
		}
		out.flush();
   	}
	static class Pair2 implements Comparable<Pair2>{
    	public int x;
    	public int y;
    	public int z;
    	public Pair2(int x,int y,int z) {
    		this.x=x;
    		this.y=y;
    		this.z=z;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair2) {
    			Pair2 other = (Pair2) obj;
    			return other.x==this.x && other.y==this.y&& other.z==this.z;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y,this.z);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair2 p2 ){
    		if (this.y>p2.y) {
    			return 1;
    		}
    		else if (this.y<p2.y) {
    			return -1;
    		}
    		else {
    			if (this.z<p2.z) {
					return 1;
				}else if (this.z>p2.z) {
					return -1;
				}else {
					return 0;
				}
    		}
    	}
    }
	static class minigraph {
        int n;
        int[][] distance;
        int INF = Integer.MAX_VALUE / 3;//到達不能点においてはINFとなる
        int[] color;
        public minigraph(int N) {
            n = N;
            color =new int[n];
            distance=new int[n][n];
            for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i==j) {
						distance[i][j]=0;
					}
					else {
						distance[i][j]=INF;
					}
				}
			}
        }
        long[] dijkstra(int s,int X) {
        	long[] L = new long[n];
	        for(int i=0;i<n;i++){
	            L[i] = -1;
	        }
	        int[] visited = new int[n];
	        L[s] = 0;
	        PriorityQueue<Pair2> Q = new PriorityQueue<Pair2>();//親,補給回数,残量
	        Q.add(new Pair2(s, 0, X));//Edgeに最短距離候補を持たせる
	        while(!Q.isEmpty()){
	            Pair2 C = Q.poll();
	            if(visited[C.x]==0){
	                L[C.x] = C.y;
	                visited[C.x] = 1;
	                for (int i = 0; i < n; i++) {
						if (i==C.x||distance[C.x][i]==INF) {
							continue;
						}
						if (C.z<distance[C.x][i]) {
	                		Q.add(new Pair2(i, C.y+1, X-(int)distance[C.x][i]));
						}else {
							Q.add(new Pair2(i, C.y, C.z-(int)distance[C.x][i]));
						}
					}
	            }
	        }
	        return L;
        }
        public void addEdge(int from, int to, int cost) {
            distance[from][to] = cost;
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
