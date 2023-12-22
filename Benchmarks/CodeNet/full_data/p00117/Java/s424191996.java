import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
public class Main {
	int N,M,s,g,V,P;
	ArrayList<Integer>[] graph;
	int[][] cost;

	private class P implements Comparable<P>{
		int first,second;
		public P(int first,int second){
			this.first = first;
			this.second = second;
		}

		public int compareTo(P p){
			if(this.first == p.first){
				return this.second - p.second;
			}
			return this.first - p.first;
		}

	}

	public int dijkstra(int s,int t){
		int[] dis = new int[N];
		Arrays.fill(dis, (int)1e9 + 7);
		PriorityQueue<P> pq = new PriorityQueue<P>();
		pq.add(new P(0,s));
		dis[s] = 0;
		while(pq.size() > 0){
			P p = pq.poll();
			if(dis[p.second] < p.first)continue;
			dis[p.second] = p.first;
			for(int next : graph[p.second]){
				if(dis[next] > p.first + cost[p.second][next]){
					pq.add(new P(p.first + cost[p.second][next],next));
				}
			}
		}
		return dis[t];
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();
		cost = new int[N][N];
		graph = new ArrayList[N];
		for(int i = 0;i < N;i++){
			graph[i] = new ArrayList<Integer>();
		}
		for(int i = 0;i < M;i++){
			String[] line = next().split(",");
			int a = Integer.parseInt(line[0]) - 1;
			int b = Integer.parseInt(line[1]) - 1;
			int c = Integer.parseInt(line[2]);
			int d = Integer.parseInt(line[3]);

			cost[a][b] = c;
			cost[b][a] = d;

			graph[a].add(b);
			graph[b].add(a);
		}

		String[] line = next().split(",");
		s = Integer.parseInt(line[0]) - 1;
		g = Integer.parseInt(line[1]) - 1;
		V = Integer.parseInt(line[2]);
		P = Integer.parseInt(line[3]);

		int go = dijkstra(s,g);
		int back = dijkstra(g,s);

		out.println(V - go - back - P);
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