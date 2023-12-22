
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

//suppose that every capacity is in the domaion of integer.
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		new Main().solver();

		out.flush();
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	class P {
		int first;
		int second;

		P(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	@SuppressWarnings("unchecked")
	void solver() {
		while (true) {
			int sz = 0;
			int H, W, C, M, Nw, Nc, Nm;
			H = ni();
			W = ni();
			C = ni();
			M = ni();
			Nw = ni();
			Nc = ni();
			Nm = ni();
			if (H < 0 && W < 0 && C < 0 && M < 0 && Nw < 0 && Nc < 0 && Nm < 0) {
				break;
			}
			ArrayList<P> h = new ArrayList<>();
			for (int i = 0; i < H; i++) {
				h.add(new P(sz++, sz++));
			}
			ArrayList<P> w = new ArrayList<>();
			for (int i = 0; i < W; i++) {
				w.add(new P(sz++, sz++));
			}
			ArrayList<P> c = new ArrayList<>();
			for (int i = 0; i < C; i++) {
				c.add(new P(sz++, sz++));
			}
			ArrayList<P> m = new ArrayList<>();
			for (int i = 0; i < M; i++) {
				m.add(new P(sz++, sz++));
			}
			P nw = new P(sz++, sz++);
			P nc = new P(sz++, sz++);
			P nm = new P(sz++, sz++);
			int S = sz++;
			int T = sz++;
			ArrayList<Edge>[] g = new ArrayList[sz];
			for (int i = 0; i < sz; i++) {
				g[i] = new ArrayList<>();
			}
			for (int i = 0; i < H; i++) {
				g[S].add(new Edge(S, h.get(i).first, 1));
				g[h.get(i).first].add(new Edge(h.get(i).first, h.get(i).second, 1));
			}
			for (int i = 0; i < W; i++) {
				g[w.get(i).first].add(new Edge(w.get(i).first, w.get(i).second, 1));
			}
			for (int i = 0; i < C; i++) {
				g[c.get(i).first].add(new Edge(c.get(i).first, c.get(i).second, 1));
			}
			for (int i = 0; i < M; i++) {
				g[m.get(i).first].add(new Edge(m.get(i).first, m.get(i).second, 1));
				g[m.get(i).second].add(new Edge(m.get(i).second, T, 1));
			}
			g[nw.first].add(new Edge(nw.first, nw.second, Nw));
			g[nc.first].add(new Edge(nc.first, nc.second, Nc));
			g[nm.first].add(new Edge(nm.first, nc.second, Nm));
			g[nm.second].add(new Edge(nm.second, T, Nm));

			for (int i = 0; i < W; i++) {
				int ni = ni();
				for (int j = 0; j < ni; j++) {
					int hero_id = ni() - 1;
					g[h.get(hero_id).second].add(new Edge(h.get(hero_id).second, w.get(i).first, 1));
				}
			}

			for (int i = 0; i < C; i++) {
				int ni = ni();
				for (int j = 0; j < ni; j++) {
					int warrior_id = ni() - 1;
					g[w.get(warrior_id).second].add(new Edge(w.get(warrior_id).second, c.get(i).first, 1));
				}
			}
			for (int i = 0; i < H; i++) {
				g[h.get(i).second].add(new Edge(h.get(i).second, nw.first, 1));
			}
			for (int i = 0; i < W; i++) {
				g[w.get(i).second].add(new Edge(w.get(i).second, nc.first, 1));
			}
			for (int i = 0; i < C; i++) {
				g[c.get(i).second].add(new Edge(c.get(i).second, nm.first, 1));
			}
			for (int i = 0; i < M; i++) {
				int ni = ni();
				for (int j = 0; j < ni; j++) {
					int cleric_id = ni() - 1;
					g[c.get(cleric_id).second].add(new Edge(c.get(cleric_id).second, m.get(i).first, 1));
				}
			}

			Preflow_Relabel pr = new Preflow_Relabel(S, T, g);
			out.println(pr.calc());
		}

	}

	class Preflow_Relabel {
		int n;
		int s;
		int t;
		ArrayList<Edge>[] g;
		int[][] flow;
		int[][] capacity;
		int[] excess;
		int[] height;
		ArrayDeque<Integer>[] B;

		void global_relabeling() {
			ArrayDeque<Integer> que = new ArrayDeque<>();
			boolean[] arrived = new boolean[n];
			que.add(t);
			while (!que.isEmpty()) {
				int v = que.poll();
				for (Edge e : g[v]) {
					if (residue(e.dst, v) > 0 && (height[v] + 1 < height[e.dst] || !arrived[e.dst])) {
						height[e.dst] = height[v] + 1;
						arrived[e.dst] = true;
					}
				}
			}
		}

		@SuppressWarnings("unchecked")
		public Preflow_Relabel(int s, int t, ArrayList<Edge>[] g) {
			this.g = g;
			this.s = s;
			this.t = t;
			n = g.length;
			flow = new int[n][n];
			capacity = new int[n][n];
			height = new int[n];
			height[s] = n;
			excess = new int[n];
			B = new ArrayDeque[n + 1];
			for (int i = 0; i <= n; i++) {
				B[i] = new ArrayDeque<>();
			}
			B[height[s]].add(s);

			for (int i = 0; i < n; i++) {
				for (Edge e : g[i]) {
					if (e.weight > 0) {
						g[e.dst].add(new Edge(e.dst, e.src, 0));
						capacity[e.src][e.dst] += e.weight;
					} else if (e.weight == 0) {
						continue;
					}
				}
			}
		}

		int b = 0;

		@SuppressWarnings("unchecked")
		int calc() {
			int count = 0;
			for (Edge e : g[s]) {
				excess[s] += e.weight;
				push(s, e.dst);
				B[height[e.dst]].add(e.dst);
			}
			global_relabeling();
			for (b = height[s]; b >= 0;) {
//				tr("excess",excess,"height",height);
				if (B[b].isEmpty()) {
					b--;
					continue;
				}
				int v = B[b].poll();
				if (excess[v] == 0 || v == t || v == s || height[v] > n) {
					continue;
				}

				for (Edge e : g[v]) {
					if (height[e.src] == height[e.dst] + 1) {
						if (residue(e.src, e.dst) > 0) {
							push(e.src, e.dst);
							if (excess[v] == 0)
								break;
						}
					}
				}
				if (excess[v] > 0) {
					int min = 1 << 30;
					for (Edge e : g[v]) {
						if (residue(e.src, e.dst) > 0) {
							min = Math.min(min, height[e.dst]);
						}
					}
					height[v] = min + 1;
					if (height[v] < n) {
						B[height[v]].add(v);
						if (height[v] > b)
							b = height[v];
					}
				}
				if (++count % n == 0) {
					global_relabeling();
				}
			}
			return excess[t];
		}

		int residue(int s, int t) {
			return capacity[s][t] - flow[s][t];
		}

		void push(int u, int v) {
			int delta = Math.min(excess[u], residue(u, v));
			flow[u][v] += delta;
			flow[v][u] -= delta;
			excess[v] += delta;
			excess[u] -= delta;
			if (v != t && v != s && height[v] < n) {
				B[height[v]].add(v);
				if (b < height[v]) {
					b = height[v];
				}
			}
		}
	}

	class Edge {
		int src;
		int dst;
		int weight;

		Edge(int src, int dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}