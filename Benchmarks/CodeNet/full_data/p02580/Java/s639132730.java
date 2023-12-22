import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int M=sc.nextInt();
		HashSet<Pair2> hashSet= new HashSet<>();
		HashMap<Integer, Long> hashMaph=new HashMap<>();
		HashMap<Integer, Long> hashMapw=new HashMap<>();
		for (int i = 0; i < M; i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			if (hashMaph.containsKey(h)) {
				hashMaph.put(h, hashMaph.get(h)+1);
			}else {
				hashMaph.put(h, 1L);
			}
			if (hashMapw.containsKey(w)) {
				hashMapw.put(w, hashMapw.get(w)+1);
			}else {
				hashMapw.put(w, 1L);
			}
			hashSet.add(new Pair2(h, w));
		}
		long xmax=0;
		long ymax=0;
		ArrayList<Integer> arrayListx=new ArrayList<>();
		ArrayList<Integer> arrayListy=new ArrayList<>();
		for (Integer integer: hashMaph.keySet()) {
			long h=hashMaph.get(integer);
			xmax=Math.max(xmax, h);
		}
		for (Integer integer: hashMapw.keySet()) {
			long w=hashMapw.get(integer);
			ymax=Math.max(ymax, w);
		}
		for (Integer integer: hashMaph.keySet()) {
			long h=hashMaph.get(integer);
			if (h==xmax) {
				arrayListx.add(integer);
			}
		}
		for (Integer integer: hashMapw.keySet()) {
			long w=hashMapw.get(integer);
			if (w==ymax) {
				arrayListy.add(integer);
			}
		}
		for (Integer y : arrayListy) {
			for (Integer x : arrayListx) {
				if (!hashSet.contains(new Pair2(x, y))) {
					System.out.println(xmax+ymax);
					return;
				}
			}
		}
		System.out.println(xmax+ymax-1);
 	}
	static class Pair2 implements Comparable<Pair2>{
    	public int x;
    	public int y;
    	public Pair2(int x,int y) {
    		this.x=x;
    		this.y=y;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair2) {
    			Pair2 other = (Pair2) obj;
    			return other.x==this.x && other.y==this.y;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair2 p2 ){
    		if (this.x<p2.x) {
    			return 1;
    		}
    		else if (this.x>p2.x) {
    			return -1;
    		}
    		else {
    			return 0;
    		}
    	}
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
