import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
 
public class Main {
	int R,C,N;
	int[] r,c,a;
	int[][] b;
	boolean[][] used;
	ArrayList<Edge>[][] graph;
	
	private class Edge{
		int t,w;
		public Edge(int t,int w){
			this.t = t;
			this.w = w;
		}
	}
	
	private class P{
		int type,pos,weight;
		public P(int type,int pos,int weight){
			this.type = type;
			this.pos = pos;
			this.weight = weight;
		}
	}
	
	public void solve() {
		R = nextInt();
		C = nextInt();
		N = nextInt();
		
		r = new int[N];
		c = new int[N];
		a = new int[N];
		
		used = new boolean[2][];
		used[0] = new boolean[R];
		used[1] = new boolean[C];
		
		b = new int[2][];
		b[0] = new int[R];
		b[1] = new int[C];
		
		graph = new ArrayList[2][];
		graph[0] = new ArrayList[R];
		graph[1] = new ArrayList[C];
		
		for(int i = 0;i < R;i++){
			graph[0][i] = new ArrayList<Edge>();
		}
		
		for(int i = 0;i < C;i++){
			graph[1][i] = new ArrayList<Edge>();
		}
		
		for(int i = 0;i < N;i++){
			r[i] = nextInt() - 1;
			c[i] = nextInt() - 1;
			a[i] = nextInt();
			
			graph[0][r[i]].add(new Edge(c[i],a[i]));
			graph[1][c[i]].add(new Edge(r[i],a[i]));
		}
		
		for(int i = 0;i < N;i++){
			if(used[0][r[i]] || used[1][c[i]])continue;
			Queue<P> q = new ArrayDeque<P>();
			//type,pos,weight
			q.add(new P(0,r[i],0));
			while(q.size() > 0){
				P p = q.poll();
				if(used[p.type][p.pos])continue;
				used[p.type][p.pos] = true;
				b[p.type][p.pos] = p.weight;
				for(Edge e : graph[p.type][p.pos]){
					q.add(new P(((p.type + 1)&1),e.t,p.weight + e.w));
				}
			}
		}
		
		for(int i = 0;i < N;i++){
			if(a[i] - b[0][r[i]] - b[1][c[i]] >= 0)continue;
			out.println("No");
			return;
		}
		
		out.println("Yes");
	}
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
 
	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}
 
	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}
 
	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}
 
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt() {
		return Integer.parseInt(next());
	}
 
	public long nextLong() {
		return Long.parseLong(next());
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}