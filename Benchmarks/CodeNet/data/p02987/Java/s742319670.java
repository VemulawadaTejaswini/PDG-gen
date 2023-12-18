
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
			solveA();
			//			solveB();
			//			solveC();
			//			solveD();
			//			solveE();
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
		String[] a = next().split("");

		//		Map<String, Integer> memo = new HashMap<String, Integer>();
		//		for (int i = 0; i < a.length; i++) {
		//			memo.merge(a[i], 1, (oldV, newV) -> oldV + newV);
		//		}
		Map<String, Long> memo = Arrays.stream(a).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		for (long elm : memo.values()) {
			if (elm != 2) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}

	private void solveB() {
		int n = nextInt();
		int[] p = IntStream.range(0, n).map(i -> nextInt()).toArray();

		int res = 0;
		for (int i = 0; i < p.length - 2; i++) {
			if ((p[i] < p[i + 1] && p[i + 1] < p[i + 2]) || (p[i + 2] < p[i + 1] && p[i + 1] < p[i])) {
				res++;
			}
		}

		out.println(res);
	}

	private void solveC() {
		int n = nextInt();
		int[] d = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();

		out.println(d[n / 2] - d[n / 2 - 1]);
	}

	/**
	 * http://www.geisya.or.jp/~mwm48961/kou3/onajimono1.htm
	 */
	private void solveD() {
		int n = nextInt();
		int k = nextInt();
		int blue = k;
		int red = n - k;

		final long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		for (int i = 1; i <= k; i++) {
			long mole = 1;
			long moleMax = red;
			if (i != k) {
				moleMax += i;
			}
			for (int j = 1; j <= moleMax; j++) {
				mole *= j;
				mole %= CONST_MOD;
			}
			long deno = 1;
			for (int j = 1; j <= red; j++) {
				deno *= j;
				deno %= CONST_MOD;
			}
			long qMax = 0;
			if (i != k) {
				qMax += i;
			}
			for (int j = 1; j <= qMax; j++) {
				deno *= j;
				deno %= CONST_MOD;
			}

			/*
			 * mod 100000007における denoの逆元を求める
			 * deno^-1(mod CONST_MOD)
			 */
			BigInteger denoModInverse = new BigInteger(Long.toString(deno))
					.modInverse(new BigInteger(Long.toString(CONST_MOD)));
			long res = new BigInteger(Long.toString(mole)).multiply(denoModInverse)
					.mod(new BigInteger(Long.toString(CONST_MOD))).longValue();
			long res2 = getMul(red, i - 1);
			out.println(res * res2 % CONST_MOD);
		}

	}

	private long getMul(int red, int i) {
		final long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		long mole = 1;
		long moleMax = red + i;
		for (int j = 1; j <= moleMax; j++) {
			mole *= j;
			mole %= CONST_MOD;
		}
		long deno = 1;
		for (int j = 1; j <= red; j++) {
			deno *= j;
			deno %= CONST_MOD;
		}
		long qMax = i;
		for (int j = 1; j <= qMax; j++) {
			deno *= j;
			deno %= CONST_MOD;
		}

		/*
		 * mod 100000007における denoの逆元を求める
		 * deno^-1(mod CONST_MOD)
		 */
		BigInteger denoModInverse = new BigInteger(Long.toString(deno))
				.modInverse(new BigInteger(Long.toString(CONST_MOD)));
		return new BigInteger(Long.toString(mole)).multiply(denoModInverse)
				.mod(new BigInteger(Long.toString(CONST_MOD))).longValue();
	}

	private void solveE() {
		int n = nextInt();
		int m = nextInt();
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int from = nextInt() - 1;
			int to = nextInt() - 1;
			adj.get(from).add(to);
		}

		int s = nextInt();
		int t = nextInt();

		// 入次数が0のものを判定するための配列
		int indegree[] = new int[n];
		// 入次数0を判定
		for (int i = 0; i < n; i++) {
			List<Integer> temp = adj.get(i);
			//iをfromとするnode達
			for (int node : temp) {
				//入次数の個数
				indegree[node]++;
			}
		}

		/*
		 * queueの作成
		 * 入次数0のものをqueueに詰める
		 * 入次数0から調査していく
		 */
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		//		for (int i = 0; i < n; i++) {
		//			if (indegree[i] == 0) {
		//				q.addLast(i);
		//			}
		//		}
		q.addLast(s);
		//訪問済み頂点数
		int cnt = 0;

		// トポロジカルソートの結果
		List<Integer> res = new ArrayList<Integer>();

		/*
		 * BFS
		 */
		while (!q.isEmpty()) {
			// 接続先の頂点を探索開始
			int u = q.removeFirst();
			//入次数0なのでリザルトにadd
			res.add(u);

			/*
			 * この頂点の次の接続先の入次数を-する
			 * その結果、入次数=0となる場合はソートリザルトに追加し、次の探索に利用する
			 */
			for (int node : adj.get(u)) {

				indegree[node]--;
				if (indegree[node] == 0) {
					q.addFirst(node);
				}
			}
			cnt++;
			if (cnt > n) {
				System.out.println("graph内に循環有");
				//				return;
			}
		}

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

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