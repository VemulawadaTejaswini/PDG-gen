
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.LongStream;

/*
 * diverta 2019 Programming Contest
 * https://www.youtube.com/watch?v=AQOZYEk54rw
 * diverta 2019 Programming Contest 解説放送
 */
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
		int numN = nextInt();
		int numK = nextInt();

		//		out.println(numN - numK + 1);

		long res = 0;
		for (int i = 0; i < numN - numK + 1; i++) {
			res++;
		}
		out.println(res);
	}

	private void solveB() {
		int r = nextInt();
		int g = nextInt();
		int b = nextInt();
		int n = nextInt();

		long res = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int wk = i * r + j * g;
				if ((n - wk) >= 0 && (n - wk) % b == 0) {
					res++;
				}
			}
		}

		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();
		String[] wk = new String[numN];
		long res = 0;
		int patternA = 0;
		int patternB = 0;
		int patternC = 0;
		for (int i = 0; i < wk.length; i++) {
			wk[i] = next();
			if (wk[i].charAt(0) == 'B' && wk[i].charAt(wk[i].length() - 1) == 'A') {
				patternA++;
			} else if (wk[i].charAt(0) == 'B' && wk[i].charAt(wk[i].length() - 1) != 'A') {
				patternB++;
			} else if (wk[i].charAt(0) != 'B' && wk[i].charAt(wk[i].length() - 1) == 'A') {
				patternC++;
			}
			String[] resA = wk[i].split("AB");
			res += resA.length - 1;
		}

		/*
		 * 場合分けのみで行けた
		 */
		//		if (patternA == 0) {
		//			res += Long.min(patternB, patternC);
		//		} else if (patternA > 0 && (patternB > 0 || patternC > 0)) {
		//			res += patternA + Long.min(patternB, patternC);
		//		} else if (patternA > 0 && (patternB == 0 && patternC == 0)) {
		//			res += patternA - 1;
		//		}

		/*
		 * 最初、再帰で解いた
		 * [][][]でmemo化してみたけどOOM発生することがあるためMapに変更
		 *
		 * 以下、[][][]でもmemoコード
		 * int max = Integer.max(Integer.max(patternA, patternB), patternC) + 1;
		 * long[][][] memo = new long[max + 1][max + 1][max + 1];
		 * res += saikiC(patternA, patternB, patternC, 0, memo);
		 */
		Map<String, Long> memo = new HashMap<String, Long>();
		res += saikiC(patternA, patternB, patternC, 0, memo);

		out.println(res);
	}

	/**
	 *
	 * @param a patteernA
	 * @param b patteernB
	 * @param c patteernC
	 * @param pair BとCでpairを作ったまたは、AとB,AとCでpairを作った
	 *         そのため、pairが>0の場合は、patternAを最後の1つまで使い切ることができる
	 * @param memo
	 * @return
	 */
	//	private long saikiC(int a, int b, int c, int pair, long[][][] memo) {
	private long saikiC(int a, int b, int c, int pair, Map<String, Long> memo) {
		if (a <= 0 && (b <= 0 || c <= 0)) {
			return 0;
		} else if (b <= 0 && a <= 0 && c <= 0) {
			return 0;
		}
		String key = a + ":" + b + ":" + c;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}
		long val1 = 0;
		long val2 = 0;
		long val3 = 0;

		if (b > 0 && c > 0) {
			val1 = saikiC(a, b - 1, c - 1, pair + 1, memo) + 1;
		} else if (a > 1 || (a > 0 && pair > 0)) {
			/*
			 * [pairがない=aのみで構成されている]場合は、aを最後まで使い切ることができない
			 * ただし、[pair>0=bとcまたは、aとb、aとcで組み合わせを行ったのでaのくっつけ先がある]場合は最後まで使い切ることができる
			 */
			val2 = saikiC(a - 1, b, c, pair, memo) + 1;
		} else if (a > 0 && (b > 0 || c > 0)) {
			val3 = saikiC(a - 1, b, c, pair + 1, memo) + 1;
		}
		long res = Long.max(val1, Long.max(val2, val3));
		memo.put(key, res);
		return res;
		//		return memo[a][b][c] = Long.max(val1, Long.max(val2, val3));
		//		return Long.max(val1, Long.max(val2, val3));
	}

	/*
	 * [n/m] = n%m (mod k)
	 * n = m*k+k
	 *   = k(m+1)
	 *
	 * (m+1)がNの約数なら、k*(m+1)はNの倍数
	 *   -> m=Nの約数-1なら、(m+1)はNの約数になる
	 *
	 */
	private void solveD() {
		long numN = nextLong();

		if (numN < 2) {
			out.println(0);
			return;
		}

		/*
		 * 約数のリストアップ
		 */
		long max = (long) Math.sqrt(numN);
		List<Long> wk = LongStream.range(1, max + 1).collect(() -> new ArrayList<Long>(), (t, i) -> {
			if (numN % i == 0) {
				t.add(i);
				if (i != numN / i) {
					t.add(numN / i);
				}
				//				if (i * i != numN && i <= numN / 2) {
				//					wk.add(numN / i);
				//				}
			}
		}, (t, u) -> {
			t.addAll(u);
		});

		/*
		 * 約数-1をとり出して以下を判定
		 * floor(n/約数-1) == n % 約数-1)
		 */
		long res = wk.stream().reduce(0L, (sum, i) -> {
			long tmp = i - 1;
			if (tmp > 0 && numN / tmp == numN % tmp) {
				sum += tmp;
			}
			return sum;
		});
		out.println(res);

	}

	private void solveD2() {
		int numN = nextInt();
		long res = 0;

		for (int i = 1; i < numN; i++) {
			if (numN / i == numN % i) {
				res += i;
			}
		}

		out.println(res);
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