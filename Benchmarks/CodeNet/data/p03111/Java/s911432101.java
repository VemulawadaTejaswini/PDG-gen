
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
			syntheticKadomatsu();
			//			 solveB();
			//			 solveC();
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

	private void syntheticKadomatsu() {
		int n = nextInt();
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int[] l = IntStream.range(0, n).map(i -> nextInt()).toArray();

		Args args = new Args(n, a, b, c);
		long res = recursiveA(args, l, 0, 0, 0, 0, 0);
		out.println(res);
	}

	private static class Args {
		int n;
		int a;
		int b;
		int c;

		public Args(int n, int a, int b, int c) {
			this.n = n;
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	private long recursiveA(Args args, int[] l, int cI, int lA, int lB, int lC, long mp) {

		if ((lA >= args.a && lB >= args.b && lC >= args.c) || cI >= args.n) {
			if (lA > 0 && lB > 0 && lC > 0) {
				long tmp = mp + Math.abs(lA - args.a) + Math.abs(lB - args.b) + Math.abs(lC - args.c) - 30;
				return tmp < 0 ? Long.MAX_VALUE : tmp;
			}
			return Long.MAX_VALUE;
		}

		long val1 = recursiveA(args, l, cI + 1, lA, lB, lC, mp);
		long val2 = recursiveA(args, l, cI + 1, lA + l[cI], lB, lC, mp + 10);
		long val3 = recursiveA(args, l, cI + 1, lA, lB + l[cI], lC, mp + 10);
		long val4 = recursiveA(args, l, cI + 1, lA, lB, lC + l[cI], mp + 10);
		return Math.min(Math.min(val1, val2), Math.min(val3, val4));
	}

	private void solveB() {
		int n = nextInt();

		out.println("");
	}

	private void solveC() {
		int n = nextInt();

		out.println("");
	}

	private void solveD() {
		int n = nextInt();

		out.println("");
	}

	private void solveE() {
		int n = nextInt();

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