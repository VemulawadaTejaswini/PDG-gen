
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			solveB();
			//			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int n = nextInt();
		int s = nextInt();
		int t = nextInt();
		int w = nextInt();

		long sum = w;
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sum += nextInt();
			}
			if (s <= sum && sum <= t) {
				res++;
			}
		}

		out.println(res);
	}

	private void solveB() {
		int numN = nextInt();

		Map<Integer, Long> tmp = IntStream.range(0, numN).map(i -> nextInt()).mapToObj(i -> new Integer(i))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		long res = tmp.values().stream().filter(i -> i.longValue() > 1).reduce(0L, (sum, i) -> sum += (i - 1));

		//		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();
		//		Map<Integer, Long> tmp = Arrays.stream(wk).mapToObj(i -> new Integer(i))
		//				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		//		long res = tmp.values().stream().filter(i -> i.longValue() > 1).reduce(0L, (sum, i) -> sum += (i - 1));

		out.println(res);
	}

	private void solveC() {
		final long CONST_INF = Long.MAX_VALUE / 10;

		int n = nextInt();
		int m = nextInt();
		long[][] graphWithOutStart = new long[n][n];
		long[][] graph = new long[n][n];
		List<Long> edgeNearByStart = new ArrayList<Long>();

		/*
		 * graphの初期化
		 * [1]を含めた隣接行列と[1]を入れない隣接行列の作成
		 */
		for (int i = 0; i < n; i++) {
			Arrays.fill(graph[i], CONST_INF);
			Arrays.fill(graphWithOutStart[i], CONST_INF);
			graphWithOutStart[i][i] = 0;
			graph[i][i] = 0;
		}

		for (int i = 0; i < m; i++) {

			/*
			 * 添え字に合わせて-1して取り込み
			 */
			int from = nextInt() - 1;
			int to = nextInt() - 1;
			int cost = nextInt();
			if (from != 0) {
				/*
				 * [1]を除いたgraph
				 */
				graphWithOutStart[to][from] = cost;
				graphWithOutStart[to][to] = cost;
			} else {
				/*
				 * [1]に隣接している頂点たち
				 */
				edgeNearByStart.add((long) to);
			}
			graph[from][to] = cost;
			graph[to][from] = cost;
		}

		long res = Long.MAX_VALUE;

		Collections.sort(edgeNearByStart);

		/*
		 *  Warshall–Floyd法で頂点の更新
		 */

		for (int k = 1; k < n; k++) {
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i != j) {
					res = Math.min(res, graph[0][i] + graph[i][j] + graph[j][0]);
				}
			}
		}
		//		getMinByWashall(graphWithOutStart, n);
		//
		//		for (int i = 0; i < edgeNearByStart.size() - 1; i++) {
		//			for (int j = i + 1; j < edgeNearByStart.size(); j++) {
		//				if (i == j) {
		//					continue;
		//				}
		//				int start = edgeNearByStart.get(i);
		//				int end = edgeNearByStart.get(j);
		//				/*
		//				 * [1]から[隣接する頂点1]のコスト + [隣接する頂点1][隣接する頂点2]のコスト + [隣接する頂点2]から[1]のコスト
		//				 */
		//				int total = graph[0][start] + graphWithOutStart[start][end] + graph[0][end];
		//				//低い値を採用
		//				res = Long.min(res, total);
		//			}
		//
		//		}

		out.println(res >= CONST_INF ? -1 : res);

	}

	private void getMinByWashall(int[][] edge, int point) {
		for (int k = 0; k < point; ++k) {
			for (int i = 0; i < point; ++i) {
				for (int j = 0; j < point; ++j) {
					edge[i][j] = Integer.min(edge[i][j], edge[i][k] + edge[k][j]);
				}
			}
		}

	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}