import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
    static boolean[] s;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
       	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int v = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
         
        WDGraph g = new WDGraph(v);
         
        for(int i=0;i<e;i++){
            g.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
         
        long[] d = g.BellmanFord(r);
         
        if(d[0]==Long.MIN_VALUE){
            out.println("NEGATIVE CYCLE");
        }
        else{
            for(int i=0;i<v;i++){
                if(d[i]==Long.MAX_VALUE){
                    out.println("INF");
                }
                else{
                    out.println((long)d[i]);
                }
            }
        }
        
        out.flush();
    }

}

class WDGraph {
	public WEdgeList[] elist;
	
	public WDGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}
	
	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int from, int to, int w){
		elist[from].add(new WEdge(to,w));
	}
	
	//頂点数を返す
	public int vnum(){
		return elist.length;
	}
	
	//自身から伸びる全ての辺を返す
	public WEdgeList EList(int n){
		return elist[n];
	}
	
	//ダイクストラ法でsからの最短距離列を求める。到達不可はMAXVALUE。
	public long Dijkstra(int start, int goal){
		
		PriorityQueue<NextNode> frontier = new PriorityQueue<>((x,y)->Long.compare(x.g, y.g));
		boolean[] isExplored = new boolean[vnum()];
		long[] g = new long[vnum()];
		Arrays.fill(g, Long.MAX_VALUE);
		
		g[start] = 0;
		frontier.add(new NextNode(start,0));
		
		while(!frontier.isEmpty()){
			NextNode now = frontier.poll();
			if(now.i == goal){
				return g[now.i];
			}
			
			if(!isExplored[now.i]){
				isExplored[now.i] = true;
				
				for(WEdge e:EList(now.i)){
					if(isExplored[e.to]){
						continue;
					}
					
					int next = e.to;
					if(g[next] <= g[now.i] + e.w){
						continue;
					}
					
					g[next] = now.g + e.w;
					frontier.add(new NextNode(next,g[next]));
				}	
			}
		}
		
		return -1;
	}
	//ダイクストラ法でsからの最短距離列を求める。到達不可はMAXVALUE。
	public long[] DijkstraArray(int start){
		
		PriorityQueue<NextNode> frontier = new PriorityQueue<>((x,y)->Long.compare(x.g, y.g));
		boolean[] isExplored = new boolean[vnum()];
		long[] g = new long[vnum()];
		Arrays.fill(g, Long.MAX_VALUE);
		
		g[start] = 0;
		frontier.add(new NextNode(start,0));
		
		while(!frontier.isEmpty()){
			NextNode now = frontier.poll();
			
			if(!isExplored[now.i]){
				isExplored[now.i] = true;
				
				for(WEdge e:EList(now.i)){
					if(isExplored[e.to]){
						continue;
					}
					
					int next = e.to;
					if(g[next] <= g[now.i] + e.w){
						continue;
					}
					
					g[next] = now.g + e.w;
					frontier.add(new NextNode(next,g[next]));
				}	
			}
		}
		
		return g;
	}
	class NextNode{
		int i;
		long g;
		public NextNode(int i, long g){
			this.i=i;
			this.g=g;
		}
	}
	
	//ベルマンフォード法でsからの最短距離列を求める。到達不可はMAX_VALUE。sから到達可能な負閉路があれば-1の列を返す。
	//負辺がないならダイクストラの方が速い。
	public long[] BellmanFord(int start){
		long[] d = new long[vnum()];
		Arrays.fill(d,Long.MAX_VALUE);
		d[start] = 0;
		
		for(int p=0;p<vnum()-1;p++){
			for(int i=0;i<vnum();i++){
				for(WEdge e:elist[i]){
					if(d[i] != Long.MAX_VALUE){
						d[e.to] = Math.min(d[e.to],d[i]+e.w);
					}
				}
			}
		}
		
		//V回目のループで更新が起きるなら負閉路が存在
		for(int i=0;i<vnum();i++){
			for(WEdge e:elist[i]){
				if(d[i] != Long.MAX_VALUE){
					if(d[e.to] > d[i] + e.w){
						Arrays.fill(d,Long.MIN_VALUE);
					}
				}
			}
		}
		
		return d;
	}
	
	//全点対最短距離をワーシャルフロイド法で求める（自身への距離が負になる要素を持つ⇔負閉路を持つ）
	public int[][] WarshallFloyd(){
		int[][][] d = new int[vnum()+1][vnum()][vnum()]; //頂点0～k-1とi,jのみを使うiからjへの最短路
		
		for(int k=0;k<vnum()+1;k++){
			for(int i=0;i<vnum();i++){
				Arrays.fill(d[k][i], Integer.MAX_VALUE);
				d[k][i][i] = 0;
			}
		}

		for(int i=0;i<vnum();i++){
			for(WEdge e:elist[i]){
				d[0][i][e.to] = e.w;
			}
		}
		
		for(int k=1;k<vnum()+1;k++){
			for(int i=0;i<vnum();i++){
				for(int j=0;j<vnum();j++){
					if((d[k-1][i][k-1] != Integer.MAX_VALUE) && (d[k-1][k-1][j] != Integer.MAX_VALUE)){
						d[k][i][j] = Math.min(d[k-1][i][j], d[k-1][i][k-1] + d[k-1][k-1][j]);
					}
					else{
						d[k][i][j] = d[k-1][i][j];
					}
				}
			}
		}
		
		return d[vnum()];
	}
	
	public class WEdgeList extends ArrayList<WEdge>{
		private static final long serialVersionUID = -3222721656143220018L;
	}
	public class WEdge{
		public int to;
		public int w;
		
		public WEdge(int to, int w){
			this.to = to;
			this.w = w;
		}
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
