
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			solveD();
			//			solveE();
			//			solveF();
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
		int numX = nextInt();
		int numY = nextInt();

		Map<Integer, Integer> wk = new HashMap<Integer, Integer>();
		wk.put(1, 1);
		wk.put(3, 1);
		wk.put(5, 1);
		wk.put(7, 1);
		wk.put(8, 1);
		wk.put(10, 1);
		wk.put(12, 1);
		wk.put(4, 2);
		wk.put(6, 2);
		wk.put(9, 2);
		wk.put(11, 2);
		wk.put(2, 3);
		out.println(wk.get(numX) == wk.get(numY) ? "Yes" : "No");
	}

	private void solveB() {
		int numH = nextInt();
		int numW = nextInt();

		IntStream.range(0, numH + 2).forEach(i -> {
			StringBuilder builder = new StringBuilder();

			char[] wk = new char[numW];
			if (i != 0 && i != numH + 1) {
				wk = next().toCharArray();
			}
			for (int j = 0; j < numW + 2; j++) {
				if (i == 0 || i == numH + 1) {
					builder.append("#");
					continue;
				}
				if (j == 0 || j == numW + 1) {
					builder.append("#");
				} else {
					builder.append(wk[j - 1]);
				}
			}

			out.println(builder.toString());
		});

		//		char[][] wk = new char[numH][numW];
		//
		//		for (int i = 0; i < numH; i++) {
		//			wk[i] = next().toCharArray();
		//		}
		//
		//		for (int i = 0; i < numH + 2; i++) {
		//			StringBuilder builder = new StringBuilder();
		//
		//			for (int j = 0; j < numW + 2; j++) {
		//				if (i == 0 || i == numH + 1) {
		//					builder.append("#");
		//					continue;
		//				}
		//				if (j == 0 || j == numW + 1) {
		//					builder.append("#");
		//				} else {
		//					builder.append(wk[i - 1][j - 1]);
		//				}
		//			}
		//
		//			out.println(builder.toString());
		//		}

	}

	long answer = Long.MAX_VALUE;

	private void solveC() {

		//			System.out.println((long) (100000 * (100000 - 1)));
		//			System.out.println((long) 100000 * (99999));
		//			System.out.println((long) 99999 * 100000);
		//			System.out.println(w);
		//			System.out.println((h - i));
		//			System.out.println(w * (h - i));

		int numH = nextInt();
		int numW = nextInt();

		out.println(chkSolvceC(numH, numW));
	}

	/**
	 *
	 * HWWWWWWW
	 * HWWWWWWW
	 * HWWWWWWW
	 * HWWWWWWW
	 *
	 */
	private long chkSolvceC(long numH, long numW) {

		long res = Long.MAX_VALUE;
		long pHW = Long.MAX_VALUE;

		if (numH % 3 == 0 || numW % 3 == 0) {
			//このパターンにおいては均等に3分割可能なため、差分が0になる
			return 0;
		}
		/*
		 * 最小値の初期化
		 *
		 * 以下の形のチョコの場合、A=1列目、B=2列目、C=3と4列目が最も簡単にわかる分割方法
		 * つまり、最低この形をクリアするのは必須
		 * 1234
		 * PPPP
		 * PPPP
		 * PPPP
		 * PPPP
		 *
		 */

		/*
		 * 縦
		 * 最小パターンのためにnum%3の余りを分配
		 * 単純に(numH -numH/3)をHとして扱ってしまうと、mod3=2の時に問題が出る
		 *
		 * これは困る
		 * H/3 * W
		 * H/3 * W
		 * H/3+2 * W
		 *
		 * こうしたい
		 * H/3 * W
		 * H/3+1 * W
		 * H/3+1 * W
		 */
		long m1 = 0;
		long m2 = 0;
		long m3 = 0;
		switch ((int) numH % 3) {
		case 0:
			break;
		case 1:
			m3 = 1;
			break;
		case 2:
			m2 = 1;
			m3 = 1;
			break;
		}
		long pA1 = (numH / 3 + m1) * numW;
		long pA2 = (numH / 3 + m2) * numW;
		long pA3 = (numH / 3 + m3) * numW;
		pHW = pA3 - pA1;
		res = Math.min(res, pHW);

		//横　最小パターンのためにnum%3の余りを分配
		switch ((int) numW % 3) {
		case 0:
			break;
		case 1:
			m3 = 1;
			break;
		case 2:
			m2 = 1;
			m3 = 1;
			break;
		}
		long pB1 = (long) (numW / 3 + m1) * numH;
		long pB2 = (long) (numW / 3 + m2) * numH;
		long pB3 = (long) (numW / 3 + m3) * numH;
		pHW = pB3 - pB1;
		res = Math.min(res, pHW);

		for (int i = 0; i < 2; i++) {
			int wkH = 0;
			int wkW = 0;
			if (i == 0) {
				wkH = numH;
				wkW = numW;
			} else {
				wkH = numW;
				wkW = numH;
			}
			long wkH1 = (wkH / 2);
			long wkH2 = (wkH - wkH / 2);
			for (int j = 1; j < wkW; j++) {

				long wkW1 = (wkW - j);
				long p1 = (long) wkH * j;
				long p2 = (long) wkH1 * wkW1;
				long p3 = (long) wkH2 * wkW1;

				long max = Math.max(Math.max(p1, p2), p3);
				long min = Math.min(Math.min(p1, p2), p3);
				res = Math.min(res, max - min);
			}
		}

		//三分割(再帰で書いたらstackoveflowした)
		//		pHW = saikiC(1, numH, numW);
		//		res = Math.min(res, pHW);
		//
		//		pHW = saikiC(1, numW, numH);
		//		res = Math.min(res, pHW);
		return res;
	}

	private long saikiC(int currentWI, int numH, int numW) {
		if (currentWI > numW) {
			return Long.MAX_VALUE;
		}
		long res = Long.MAX_VALUE;

		long p1 = numH * currentWI;
		long p2 = (numH / 2) * (numW - currentWI);
		long p3 = (numH / 2 + numH % 2) * (numW - currentWI);

		long max = Math.max(Math.max(p1, p2), p3);
		long min = Math.min(Math.min(p1, p2), p3);
		res = Math.abs(max - min);

		return Math.min(res, saikiC(currentWI + 1, numH, numW));
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