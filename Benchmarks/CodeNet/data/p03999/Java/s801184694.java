
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

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
		int numA = nextInt();
		int numB = nextInt();
		int numH = nextInt();

		out.println((numA + numB) * numH / 2);
	}

	private void solveB() {
		char[] a = next().toCharArray();
		char[] b = next().toCharArray();
		char[] c = next().toCharArray();

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		char num = 'a';
		while (true) {

			switch (num) {
			case 'a':
				if (cntA < a.length) {
					num = a[cntA];
					cntA++;
				} else {
					out.println("A");
					return;
				}
				break;
			case 'b':
				if (cntB < b.length) {
					num = b[cntB];
					cntB++;
				} else {
					out.println("B");
					return;
				}
				break;
			case 'c':
				if (cntC < c.length) {
					num = c[cntC];
					cntC++;
				} else {
					out.println("C");
					return;
				}
				break;
			}
		}

	}

	private void solveC() {
		String first = next();
		String[] input = first.split("");

		int[] wk = Arrays.stream(input).mapToInt(i -> Integer.parseInt(i)).toArray();

		System.out.println(chkC(input));
	}

	private long chkC(String[] number) {
		long res = 0;
		/*
		 * +-は最大9個
		 * 000000000から、111111111までの配列を作成。2の剰余を入れていけば2進数に変換できる。
		 * 最大は 2^9
		 * 最小は 2^0
		 *
		 */
		int maskMax = number.length - 1;

		/*
		 * マスクの最大値を設定
		 * ex:1024 -> 1111111111
		 */
		int max = (int) Math.pow(2, maskMax);
		for (int i = 0; i < max; i++) {
			int[] plusMinus = new int[maskMax];
			int wkBit = i;
			for (int j = 0; j < maskMax; j++) {
				plusMinus[j] = wkBit % 2;
				wkBit /= 2;
			}
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < number.length; j++) {
				builder.append(number[j]);
				if (j < plusMinus.length && plusMinus[j] == 1) {
					builder.append("@");
				}
			}
			String[] numS = builder.toString().split("@");
			for (String long1 : numS) {
				res += Long.parseLong(long1);
			}
		}

		return res;
	}

	/**
	 * ほかの人のサンプルdfs
	 * @param number
	 * @param start
	 * @param last
	 * @param sum
	 * @return
	 */
	public static long dfs(String number, int start, int last, long sum) {
		long num = Long.parseLong(number.substring(start, last));
		System.out.printf("number : %s / start : %5d / last : %5d / sum : %5d / num : %5d", number, start, last, sum,
				num);
		System.out.println();
		if (last == number.length()) {

			return sum + num;
		}
		return dfs(number, start, last + 1, sum) + dfs(number, last, last + 1, sum + num);

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