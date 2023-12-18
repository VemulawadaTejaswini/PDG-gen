
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		int numR = nextInt();
		int numG = nextInt();

		out.println(numG * 2 - numR);
	}

	private void solveB() {
		final int numN = nextInt();
		final int numK = nextInt();

		int res = IntStream.range(0, numN).reduce(1, (sum, i) -> {
			if (sum * 2 > sum + numK) {
				sum += numK;
			} else {
				sum *= 2;
			}
			return sum;
		});

		out.println(res);
	}

	private void solveC() {
		char[] strS = next().toCharArray();
		char[] strT = next().toCharArray();

		int resT = chkC(strS, strT, 0, 0);

		String temp = new String(strS);
		String res = temp.replace("?", "a");
		out.println(resT > 0 ? res : "UNRESTORABLE");
	}

	private int chkC(char[] strS, char[] strT, int indexS, int indexT) {
		int wkIndexS = indexS;
		if (indexT >= strT.length || wkIndexS >= strS.length) {
			return 0;
		}

		int res = 0;

		for (int i = indexS; i < strS.length; i++) {
			if (strS[i] != '?') {
				wkIndexS = i;
				break;
			}
		}

		char wk = strS[wkIndexS];

		/*
		 * 文字列Sのindex番の文字が、文字列Tに存在するのか
		 * 存在するindexを調べる。
		 */
		if (strT[indexT] == wk) {
			/*
			 * Tの最初の出現位置を調べて、マッチするか確認
			 * indexTの位置がindexSより前ならそこはマッチしていない
			 * 後ろも調べる
			 */
			if (wkIndexS >= indexT || (strS.length - wkIndexS >= strT.length - indexT)) {
				int cntS = wkIndexS - indexT;
				int cntT = 0;
				boolean isMatch = true;
				for (int j = 0; j < strT.length; j++) {
					if (strS[cntS] != '?' && strS[cntS] != strT[cntT]) {
						isMatch = false;
						break;
					}
					cntS++;
					cntT++;
				}
				int voidCnt = cntS;
				//この文字列は正解なので置換開始
				cntS = wkIndexS - indexT;
				cntT = 0;
				if (isMatch) {
					for (int j = 0; j < strT.length; j++) {
						strS[cntS] = strT[cntT];
						cntS++;
						cntT++;
					}
					res++;
				}
				//もう一回開始
				res += chkC(strS, strT, voidCnt, indexT);
			}

		}

		//この場合はindexSのみ進める
		res += chkC(strS, strT, wkIndexS + 1, indexT);

		return res;
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