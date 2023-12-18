
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int numC = nextInt();

		if (numA <= numC && numC <= numB) {
			out.println("Yes");
		} else if (numB <= numC && numC <= numA) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		out.println("");
	}

	private void solveB() {
		int numN = nextInt();
		String sS = next();
		int numK = nextInt();

		char tmp = sS.charAt(numK - 1);

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < sS.length(); i++) {
			if (sS.charAt(i) != tmp) {
				builder.append('*');
			} else {
				builder.append(tmp);
			}
		}

		out.println(builder.toString());
	}

	private void solveC() {

		/* read */
		int n = nextInt();
		String s = next();
		boolean[] b = new boolean[n];

		int white = 0;
		int black = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '.') { // black
				white++;
			}
		}

		/* logic */

		// first target is all false.
//		int count = 0;
//		for (int i = 0; i < n; i++) {
//			if (b[i]) {
//				count++;
//			}
//		}

		int answer = white;
		for (int i = 0; i < n; i++) {
			// target is [0..i] is true, [i + 1..n - 1]  is false
			// i index should be true
			if (!b[i]) {
				white++;
			} else {
				white--;
			}
			answer = Math.min(answer, white);
		}
		out.print(answer);
	}

	private void solveCOrigin() {
		int numN = nextInt();
		String sS = next();
		char[] tmp = sS.toCharArray();

		int black = 0;
		int white = 0;
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] == '.') {
				white++;
			}
		}

		int res = white;
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] == '.') {
				white--;
			} else {
				black++;
			}
			res = Math.min(res, white + black);
		}
		out.print(res);

	}

	final int CONST_NUM = 998244353;

	private void solveD() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int[] memo = new int[numN];
		int res = solveDSub(wk, 0, memo, 0, 0, 0);
		out.println(res % CONST_NUM);
		//		out.println(cnt % CONST_NUM);
	}

	long cnt = 0;
	Map<String, Integer> memoMap = new HashMap<String, Integer>();

	private int solveDSub(int[] wk, int currentI, int[] memo, int r, int g, int b) {
		if (currentI >= wk.length) {
			//			StringBuilder builder = new StringBuilder();
			//			for (int i : memo) {
			//				builder.append(i);
			//			}
			//			if(memoMap.containsKey(builder.toString())) {
			//
			//			}
			int[] tmpSort = new int[] { r, g, b };
			Arrays.sort(tmpSort);
			if (tmpSort[0] + tmpSort[1] >= tmpSort[2]) {
				cnt++;
				cnt %= CONST_NUM;
				return 1;
			} else {
				return 0;
			}
		}

		memo[currentI] = 1;
		int val1 = solveDSub(wk, currentI + 1, memo, r + wk[currentI], g, b) % CONST_NUM;
		memo[currentI] = 2;
		int val2 = solveDSub(wk, currentI + 1, memo, r, g + wk[currentI], b) % CONST_NUM;
		memo[currentI] = 3;
		int val3 = solveDSub(wk, currentI + 1, memo, r, g, b + wk[currentI]) % CONST_NUM;
		return (val1 + val2 + val3) % CONST_NUM;
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