import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	int N, M;
	long C, D;
	int[] union;
	Edge[] edges;

	private class Edge{
		int from, to, c, d;

		public Edge(int from, int to, int c, int d) {
			this.from = from;
			this.to = to;
			this.c = c;
			this.d = d;
		}
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public int find(int x) {
		return union[x] = (union[x] == x ? x : find(union[x]));
	}

	public void unite(int x, int y) {
		x = find(x);
		y = find(y);

		if (same(x, y))
			return;

		if (x < y) {
			union[y] = x;
		} else {
			union[x] = y;
		}
	}

	public void solve() {
		N = nextInt();
		M = nextInt();

		C = 0;
		D = 0;

		edges = new Edge[M];
		for (int i = 0; i < M; i++) {
			int a = nextInt();
			int b = nextInt();
			int c = nextInt();
			int d = nextInt();
			edges[i] = new Edge(a, b, c, d);
			C += c;
			D += d;
		}
		union = new int[N];

		double ans = 0;
		double low = 0;
		double high = 100000;

		for(int x = 0;x < 1000;x++){
			double mid = (high+low)/2;

			Arrays.sort(edges,new Comparator<Edge>(){
				public int compare(Edge e1, Edge e2) {
					double a = e1.d - e1.c * mid;
					double b = e2.d - e2.c * mid;

					if(a < b){
						return 1;
					}else if(a > b){
						return -1;
					}
					return 0;
				}
			});

			for (int i = 0; i < N; i++) {
				union[i] = i;
			}

			long takeC = 0;
			long takeD = 0;

			for (int i = 0; i < M; i++) {
				Edge e = edges[i];

				if (!same(e.from, e.to)) {
					unite(e.from, e.to);
					takeC += e.c;
					takeD += e.d;
				}
			}
			double sum = (D-takeD) * 1.0 / (C - takeC);
			if(C - takeC == 0)sum = 0;

			if(sum > ans){
				ans = sum;
				high = mid;
			}else{
				low = mid;
			}
		}

		out.println(String.format("%.07f",ans));
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}