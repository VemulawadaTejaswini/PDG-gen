import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main{
	static final int INF = (int)1e9 + 7;
	int N,u,v;
	ArrayList<Integer>[] G;
	boolean[] used;

	private class P implements Comparable<P>{
		int v,c;
		public P(int v,int c){
			this.v = v;
			this.c = c;
		}

		public int compareTo(P p){
			return this.c - p.c;
		}
	}

	public void dijkstra1(int s,int[] dis){
		Arrays.fill(dis, INF);
		dis[s] = 1;

		PriorityQueue<P> pq = new PriorityQueue<P>();
		used[s] = true;
		pq.add(new P(s,1));

		while(pq.size() > 0){
			P p = pq.poll();
			if(dis[p.v] < p.c)continue;
			for(int n : G[p.v]){
				if(n == v)continue;
				if(dis[p.v]+1 <= N/2 && dis[n] > dis[p.v]+1){
					used[n] = true;
					dis[n] = dis[p.v]+1;
					pq.add(new P(n,p.c+1));
				}
			}
		}
	}

	public void dijkstra2(int s,int[] dis){
		Arrays.fill(dis, INF);
		dis[s] = 1;

		PriorityQueue<P> pq = new PriorityQueue<P>();
		pq.add(new P(s,1));

		while(pq.size() > 0){
			P p = pq.poll();
			if(used[p.v])continue;
			if(dis[p.v] < p.c)continue;
			for(int n : G[p.v]){
				if(used[p.v])continue;
				if(dis[p.v]+1 <= N/2 && dis[n] > dis[p.v]+1){
					dis[n] = dis[p.v]+1;
					pq.add(new P(n,p.c+1));
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		u = nextInt()-1;
		v = nextInt()-1;

		G = new ArrayList[N];
		for(int i = 0;i < N;i++)G[i] = new ArrayList<Integer>();
		for(int i = 0;i < N-1;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;
			G[a].add(b);
			G[b].add(a);
		}

		if(N % 2 == 1){
			out.println("No");
			return;
		}
		int[] dis1 = new int[N],dis2 = new int[N];
		used = new boolean[N];
		dijkstra1(u,dis1);
		dijkstra2(v,dis2);

		int du=-1,dv=-1;
		for(int i = 0;i < N;i++){
			if(dis1[i] == N/2)du = i;
			if(dis2[i] == N/2)dv = i;
		}

		if(du==-1||dv==-1){
			out.println("No");
		}else{
			out.println("Yes");
		}
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