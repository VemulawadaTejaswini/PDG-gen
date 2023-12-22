
import java.io.*;
import java.util.*;

public class Main {
	class Node {
		int idx;
		List<Path> next;
		List<Map<Integer, Integer>> state;
		int distance;

		public Node(int idx, int cnum) {
			this.idx = idx;
			distance = Integer.MAX_VALUE;
			next = new ArrayList<>();
			state = new ArrayList<>(cnum);
			for (int i = 0; i < cnum; i++) {
				state.add(new HashMap<>());
			}
		}

		public void addPath(Node to, int con, int weight) {
			next.add(new Path(this, to, con, weight));
		}

		public String toString() {
			return "[" + idx + "]";
		}
	}

	class Path {
		Node from;
		Node to;
		int weight;
		int con;

		public Path(Node from, Node to, int con, int weight) {
			this.from = from;
			this.to = to;
			this.con = con;
			this.weight = weight;
		}

		public String toString() {
			return String.format("%s->(%d,%d)->%s", from, con, weight, to);
		}
	}

	class State {
		Node pos;
		int base;
		int c;
		int clen;
		int distance;

		public State(Node pos, int base, int c, int clen) {
			this.pos = pos;
			this.distance = base + calcCost(c, clen);
			this.base = base;
			this.c = c;
			this.clen = clen;
		}
	}

	int N, M, C, S, G;
	Node[] nodes;
	int[][][] table;

	public void solve() {
		while (true) {
			N = nextInt();
			if (N == 0)
				break;
			M = nextInt();
			C = nextInt();
			S = nextInt() - 1;
			G = nextInt() - 1;
			nodes = new Node[N];
			for (int i = 0; i < N; i++) {
				nodes[i] = new Node(i, C);
			}

			for (int i = 0; i < M; i++) {
				int x = nextInt() - 1;
				int y = nextInt() - 1;
				int d = nextInt();
				int c = nextInt() - 1;
				nodes[x].addPath(nodes[y], c, d);
				nodes[y].addPath(nodes[x], c, d);
			}

			table = new int[C][][];
			for (int i = 0; i < C; i++) {
				table[i] = new int[nextInt()][2];
			}

			for (int i = 0; i < C; i++) {
				for (int j = 0; j < table[i].length - 1; j++) {
					table[i][j][0] = nextInt();
				}
				table[i][table[i].length - 1][0] = Integer.MAX_VALUE;

				for (int j = 0; j < table[i].length; j++) {
					table[i][j][1] = nextInt();
				}
			}
			
			dijkstra(nodes[S], nodes[G]);
			out.println(nodes[G].distance == Integer.MAX_VALUE ? -1 : nodes[G].distance);
		}
	}

	public void dijkstra(Node start, Node end) {
		start.distance = 0;
		PriorityQueue<State> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.distance, b.distance));
		queue.offer(new State(start, 0, 0, 0));
		while (!queue.isEmpty()) {
			State n = queue.poll();
			if(n.pos == end) break;
			for (Path p : n.pos.next) {
				State np;
				if (p.con == n.c) {
					np = new State(p.to, n.base, p.con, n.clen + p.weight);

				} else {
					np = new State(p.to, n.distance, p.con, p.weight);
				}

				Integer ii = p.to.state.get(np.c).get(np.clen);
				if (ii == null || ii > np.distance) {
					p.to.state.get(np.c).put(np.clen, np.distance);
					queue.offer(np);
					if (np.distance < p.to.distance) {
						p.to.distance = np.distance;
					}
				}

			}
		}
	}

	public int calcCost(int c, int len) {
		int ans = 0;
		int cur = 0;
		for (int i = 0; i < table[c].length; i++) {
			if (table[c][i][0] >= len) {
				ans += (len - cur) * table[c][i][1];
				break;
			} else {
				ans += (table[c][i][0] - cur) * table[c][i][1];
				cur = table[c][i][0];
			}
		}
		return ans;
	}

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while (!isAlNum(c = read())) {
		}
		StringBuilder build = new StringBuilder();
		build.append((char) c);
		while (isAlNum(c = read())) {
			build.append((char) c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if (bufferLength < 0)
			throw new RuntimeException();
		if (bufferIndex >= bufferLength) {
			try {
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufferLength <= 0)
				return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}