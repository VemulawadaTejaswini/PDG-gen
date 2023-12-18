import java.util.*;
import java.io.*;

//dijkstraによる解法
class Vertex{
	int x, y, dist;

	public Vertex(int x, int y, int dist) {
		super();
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
}

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";
	
	static int h, w;
	static char field[][];
	static int dist[][];

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		h = fs.nextInt(); w = fs.nextInt();
		field = new char[h][w];
		for(int i=0;i<h;i++) {
			String s = fs.next();
			for(int j=0;j<w;j++) {
				field[i][j] = s.charAt(j);
			}
		}
		dist = new int[h][w];
		dijkstra(0,0);
		System.out.println(dist[h-1][w-1]);
	}
	
	static void dijkstra(int x, int y) {
		PriorityQueue<Vertex> pq = new PriorityQueue<>((p1,p2)->p1.dist-p2.dist);
		for(int i=0;i<h;i++)Arrays.fill(dist[i], INF);
		if(field[0][0] == '#')dist[0][0] = 1;
		else dist[0][0] = 0;
		pq.add(new Vertex(0,0,dist[0][0]));
		int DX2[] = {1,0}, DY2[]= {0,1};
		while(!pq.isEmpty()) {
			Vertex now = pq.poll();
			if(dist[now.x][now.y]<now.dist)continue;
			for(int i=0;i<2;i++) {
				int nx = now.x + DX2[i], ny = now.y + DY2[i];
				if(0<=nx&&nx<h&&0<=ny&&ny<w) {
					int cost = 0;
					if(field[now.x][now.y]=='.'&&field[nx][ny]=='#')cost = 1;
					if(dist[nx][ny] > dist[now.x][now.y] + cost) {
						dist[nx][ny] = dist[now.x][now.y] + cost;
						pq.add(new Vertex(nx,ny,dist[nx][ny]));
					}
				}
			}
		}
	}
	

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}