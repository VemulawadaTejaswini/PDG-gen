import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	int N, M;
	boolean[] used;
	ArrayList<ArrayList<E>> graph;
	HashMap<Long, Integer> map;

	private class E {
		int v, c;
		public E(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	public long h(int v, int t) {
		return v * (long) 1e9 + t;
	}

	public int dfs(int v, int t) {
		if (v == N - 1) {
			return t;
		}
		long hash = h(v, t);
		if (map.containsKey(hash))
			return map.get(hash);

		if (used[v])
			return -1;
		used[v] = true;
		int ret = -1;
		for (E e : graph.get(v)) {
			if (t <= e.c) {
				ret = Math.max(ret, dfs(e.v, e.c));
			}
		}
		used[v] = false;
		map.put(hash, ret);
		return ret;
	}

	public void solve() {
		N = nextInt();
		M = nextInt();
		graph = new ArrayList<ArrayList<E>>();
		for (int i = 0; i < N; i++) {
			graph.add(new ArrayList<E>());
		}
		used = new boolean[N];

		for (int i = 0; i < M; i++) {
			int a = nextInt() - 1;
			int b = nextInt() - 1;
			int c = nextInt();
			graph.get(a).add(new E(b, c));
		}
		map = new HashMap<Long, Integer>();
		System.out.println(dfs(0, 0));
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