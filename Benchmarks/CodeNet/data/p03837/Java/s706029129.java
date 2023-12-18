import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	static final int INF = (int)1e9 + 7;
	int N,M;
	ArrayList<Edge>[] G;
	boolean[][] usedEdge;
	private class Edge{
		int to,cost;
		public Edge(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
	}

	private class P implements Comparable<P>{
		int to,cost;
		public P(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(P p) {
			return this.cost - p.cost;
		}
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();

		G = new ArrayList[N];
		for(int i = 0;i < N;i++){
			G[i] = new ArrayList<Edge>();
		}

		usedEdge = new boolean[N][N];

		for(int i = 0;i < M;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;
			int c = nextInt();

			G[a].add(new Edge(b,c));
			G[b].add(new Edge(a,c));
		}

		for(int i = 0;i < N;i++){
			int[] d = new int[N];
			int[] next = new int[N];
			Arrays.fill(next, -1);
			Arrays.fill(d, INF);
			d[i] = 0;
			PriorityQueue<P> pq = new PriorityQueue<P>();
			pq.add(new P(i,0));
			while(pq.size() > 0){

				P p = pq.poll();

				int now = p.to;
				int cost = p.cost;

				if(d[now] < cost)continue;
				for(Edge e : G[now]){
					if(d[e.to] > d[now]+e.cost){
						next[now] = e.to;
						d[e.to] = d[now] + e.cost;
						pq.add(new P(e.to,d[e.to]));
					}
				}
			}

			for(int j = i;next[j] != -1;j = next[j]){
				usedEdge[j][next[j]] = true;
				usedEdge[next[j]][j] = true;
			}
		}

		int ans = 0;
		boolean[][] used = new boolean[N][N];
		for(int i = 0;i < N;i++){
			for(Edge e : G[i]){
				if(used[i][e.to])continue;
				if(!usedEdge[i][e.to]){
					used[i][e.to] = used[e.to][i] = true;
					ans++;
				}
			}
		}

		out.println(ans);
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