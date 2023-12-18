
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
			//			solveC();
			solveD();
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
		int numA = nextInt();
		int numB = nextInt();

		int cnt = 0;
		for (int i = 0; i < 2; i++) {
			if (numA > numB) {
				cnt += numA;
				numA--;
			} else {
				cnt += numB;
				numB--;
			}
		}

		out.println(cnt);
	}

	private void solveB() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int cnt = 1;
		int baseHeight = wk[0];
		for (int i = 1; i < wk.length; i++) {
			if (wk[i - 1] <= wk[i] && baseHeight <= wk[i]) {
				cnt++;
			}
			baseHeight = Math.max(baseHeight, wk[i]);
		}

		out.println(cnt);
	}

	private void solveC() {
		String[] wk = next().split("");

		int bC = 0;//奇数を白から黒くする
		int wC = 0;//奇数を黒から白くする
		int bC2 = 0;//偶数を白から黒くする
		int wC2 = 0;//偶数を黒から白くする

		for (int i = 0; i < wk.length; i++) {

			if (i % 2 != 0) {
				if (wk[i].equals("0")) {
					//奇数を白くするときの回数
					wC++;
				} else {
					//奇数を黒くするときの回数
					bC++;
				}
			} else {
				if (wk[i].equals("0")) {
					//偶数を白くするときの回数
					wC2++;
				} else {
					//偶数を黒くするときの回数
					bC2++;
				}

			}
		}

		int val1 = bC + wC2;
		int val2 = bC2 + wC;
		out.println(Math.min(val1, val2));
	}

	private void solveD() {
		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		int[][] resA = new int[numN][2];
		int resAnum = 0;
		//最初の判定をしておく
		if (wk[0].equals("0")) {
			resA[resAnum][0] = 0;
			resA[resAnum][1] = 1;
		} else {
			resA[resAnum][0] = 1;
			resA[resAnum][1] = 1;
		}
		for (int i = 1; i < wk.length; i++) {
			if (wk[i].equals(wk[i - 1])) {
				resA[resAnum][1] += 1;
			} else {
				resAnum++;
				resA[resAnum][0] = Integer.parseInt(wk[i]);
				resA[resAnum][1] = 1;
			}
		}

		int totalRes = 0;

		for (int first = 0; first < resA.length; first++) {
			int res = 0;
			int cnt = numK;
			int zeroCnt = 0;
			for (int i = first; i < resA.length; i++) {
				if (resA[i][0] == 0) {
					cnt--;
					zeroCnt++;
					if (cnt >= 0) {
						res += resA[i][1];
					} else {
						break;
					}
				} else if (resA[i][0] == 1) {
					res += resA[i][1];
				}
			}
			if (zeroCnt > 0) {
				totalRes = Math.max(totalRes, res);
			}
		}

		out.println(totalRes);
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