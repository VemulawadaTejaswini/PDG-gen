import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	static final long MOD=1000000007;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		while (true) {
			int W=sc.nextInt();
			int H=sc.nextInt();
			if (H==0&&W==0) {
				break;
			}
			int[][] c=new int[H*2-1][];
			for (int i = 0; i < c.length; i++) {
				if (i%2==0) {
					c[i]=sc.nextIntArray(W-1);
				}else {
					c[i]=sc.nextIntArray(W);
				}
			}
			graph G=new graph(H*W);
			int[] dx= {1,-1,0,0};
			int[] dy= {0,0,1,-1};
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					for (int j2 = 0; j2 < dy.length; j2++) {
						if (j+dx[j2]>=0&&j+dx[j2]<W&&i+dy[j2]>=0&&i+dy[j2]<H) {
							if (dx[j2]==1) {
								if (c[2*i][j]==0) {
									G.addEdge(kumi(i, j, W), kumi(i+dy[j2],j+dx[j2], W), 1);
								}
							}else if (dx[j2]==-1) {
								if (c[2*i][j-1]==0) {
									G.addEdge(kumi(i, j, W), kumi(i+dy[j2],j+dx[j2], W), 1);
								}
							}else if (dy[j2]==-1) {
								if (c[2*i-1][j]==0) {
									G.addEdge(kumi(i, j, W), kumi(i+dy[j2],j+dx[j2], W), 1);
								}
							}else {
								if (c[2*i+1][j]==0) {
									G.addEdge(kumi(i, j, W), kumi(i+dy[j2],j+dx[j2], W), 1);
								}
							}
						}
					}
				}
			}
			long[] d=G.dijkstra(0);
			out.println(d[H*W-1]+1);
		}
		out.flush();
	}
	static int kumi(int i, int j, int W){
        return i*W+j;//W列の２次配列を一次元にする
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
		void Treedfs(int v, int p ) {
			for (Edge nv : list[v]) {
				if (nv.to == p) continue;  
				//処理書く
				Treedfs(nv.to, v);
			}
		}
		boolean nibugraph(int s,int colors) {
			color[s]=colors;
			for (Edge nv: list[s]) {
				if (color[nv.to]==colors) {
					return false;
				}
				if (color[nv.to]==0&&!nibugraph(nv.to, -colors)) {
					return false;
				}
			}
			return true;
		}
		long[] bfs(int s) {
			long[] l=new long[size];
			for (int i = 0; i < l.length; i++) {
				l[i]=-1;
			}
			l[s]=0;
			ArrayDeque<Integer> qArrayDeque=new ArrayDeque<Integer>();
			qArrayDeque.add(s);
			while (!qArrayDeque.isEmpty()) {
				int v=qArrayDeque.poll();
				for (Edge nv: list[v]) {
					if (l[nv.to]==-1) {
						l[nv.to]=l[v]+nv.v;
						qArrayDeque.add(nv.to);
					}
				}
			}
			return l;
		}
		long[] bellman_ford(int sv,int gv) {
			long[] d=new long[size];
			Arrays.fill(d, INF);
			d[sv]=0;
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[j]==INF) {
						continue;
					}
					for (Edge edge :list[j]) {
						if (d[edge.to]>d[j]+edge.v) {
							d[edge.to]=d[j]+edge.v;
						}
					}
				}
			}
			long ans=d[gv];
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[j]==INF) {
						continue;
					}
					for (Edge edge :list[j]) {
						if (d[edge.to]>d[j]+edge.v) {
							d[edge.to]=-INF;
							return null; //グラフのどこかに負のループがあれば判定したいとき
						}
					}
				}
			}
			if (ans!=d[gv]) {
				return null;
			}//sv~gv間に負の閉路があれば検出
			return d;
		}
		long[] dijkstra(int s){
	        long[] L = new long[size];
	        for(int i=0;i<size;i++){
	            L[i] = -1;
	        }
	        int[] visited = new int[size];
	        L[s] = 0;
	        PriorityQueue<Edge> Q = new PriorityQueue<Edge>();
	        Q.add(new Edge(s,0L));//Edgeに最短距離候補を持たせる
	        while(!Q.isEmpty()){
	            Edge C = Q.poll();
	            if(visited[C.to]==0){
	                L[C.to] = C.v;
	                visited[C.to] = 1;
	                for(Edge D:list[C.to]){
	                    Q.add(new Edge(D.to,L[C.to]+D.v));
	                }
	            }
	        }
	        return L;
	    }
	    int[] topological(){
			int[] indegree = new int[size];//入次数
	        for (int i = 0; i < size; i++) {
	        	for (Edge edge: list[i]) {
					indegree[edge.to]++;
				}
	        }
	        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	        int[] count=new int[size];
	        for (int i = 0; i < size; i++) {
	            if (indegree[i] == 0) {
	                q.addLast(i);
	            }
	        }
	        int cnt = 0;
	        List<Integer> res = new ArrayList<Integer>();
	        while (!q.isEmpty()) {
	            // 接続先の頂点を探索開始
	            int u = q.removeLast();
	            res.add(u);
	            for (Edge edge : list[u]) {
	                indegree[edge.to]--;
	                count[edge.to]=Math.max(count[u]+1,count[edge.to]);
	                if (indegree[edge.to] == 0) {
	                    q.addFirst(edge.to);
	                }
	            }
	            cnt++;
	        }
	        if (cnt<size) {
				return null;
			}//閉路があればその頂点は一度もキューに入らない
	        return count;
	        //countはその頂点までの最大パス長
	        //resにcountの値が小さい順にソートされたものが入っている。
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

