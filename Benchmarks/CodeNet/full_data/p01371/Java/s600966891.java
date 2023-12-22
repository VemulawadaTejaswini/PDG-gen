
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int[] minCost = new int[(1 << 16)];
	
	class State implements Comparable<State> {
		int n;
		State(int n) {
			this.n = n;
		}
		@Override
		public int compareTo(State arg0) {
			int c1 = minCost[n], c2 = minCost[arg0.n];
			if (c1 > c2) return 1;
			else if (c1 < c2) return -1;
			return 0;
		}
	}
	
	int INF = 100000000;
	public void run() {
		while (true) {
			int N = in.nextInt();
			if (N == 0) break;
			Arrays.fill(minCost, INF);
			int[][] t = new int[N][N+1];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= N; j++) {
					t[i][j] = in.nextInt();
				}
			}
			
			minCost[0] = 0;
			PriorityQueue<State> pq = new PriorityQueue<State>();
			pq.add(new State(0));
			while (!pq.isEmpty()) {
				int next = pq.poll().n;
				for (int i = 0; i < N; i++) {
					int bit = (1 << i);
					if ((next & bit) != 0) continue;
					
					int x = bit | next;
					int cost = t[i][0];
					for (int j = 1; j <= N; j++) {
						if (((x >> (j-1)) & 1) == 1 && i != j - 1) {
							cost = Math.min(t[i][j], cost);
						}
					}
					
					if (minCost[x] > minCost[next] + cost) {
						minCost[x] = minCost[next] + cost;
						pq.add(new State(x));
					}
				}
			}
			
			System.out.println(minCost[(1 << N) - 1]);
		}
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}