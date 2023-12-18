
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
		int numN = nextInt();
		String sS = next();
		char[] tmp = new char[numN];
		char[] tmp2 = new char[numN];

		for (int i = 0; i < numN; i++) {
			tmp[i] = sS.charAt(i);
			tmp2[i] = sS.charAt(i);
		}
		int res = 0;
		for (int i = 1; i < numN; i++) {
			if (tmp[i] == '.' && tmp[i - 1] == '#') {
				res++;
				tmp[i] = '#';
			}
		}

		int res2 = 0;
		for (int i = 1; i < numN; i++) {
			if (tmp2[i] == '.' && tmp2[i - 1] == '#') {
				res2++;
				tmp2[i - 1] = '.';
			}
		}

		out.println(Integer.min(res, res2));
	}

	private void solveD() {
		final int CONST = 998244353;
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

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