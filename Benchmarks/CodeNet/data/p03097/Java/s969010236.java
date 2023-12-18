import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	int getMask() throws IOException {
		int k = nextInt();
		int ret = 0;
		for (int i = 0; i < k; i++) {
			int bit = nextInt() - 1;
			ret |= 1 << bit;
		}
		return ret;
	}
	
	int n;
	int ALL;

	void solve() {
		n = nextInt();
		ALL = (1 << n) - 1;
		int mask1 = nextInt();
		int mask2 = nextInt();

		List<Integer> ret = buildPath(mask1, mask2, (1 << n) - 1);
		if (ret.size() != 1 << n) {
			out.println("NO");
			return;
		}
		out.println("YES");
		for (int mask : ret) {
			out.print(mask + " ");
		}
	}

	static boolean test(int mask, int i) {
		return ((mask >> i) & 1) == 1;
	}

	List<Integer> buildPath(int from, int to, int active) {
		
		if (from == to)
			throw new AssertionError();

		int diff = from ^ to;
		if ((diff | active) != active)
			throw new AssertionError();

		if (Integer.bitCount(active) == 1) {
			return new ArrayList<>(Arrays.asList(from, to));
		}

		if (Integer.bitCount(diff) == 2 && Integer.bitCount(active) == 2) {
			int bit1 = Integer.highestOneBit(diff);
			int bit2 = Integer.lowestOneBit(diff);
			return new ArrayList<>(Arrays.asList(from, from ^ bit1, from ^ bit1
					^ bit2));
		}
		
		int midBit = Integer.lowestOneBit(diff);
		int newActive = active ^ midBit;
		int cutFrom = from & (~midBit);
		int cutTo = to & (~midBit);
		for (int i = 0; i < n; i++) {
			if (test(active, i) && (1 << i) != midBit && ((cutFrom ^ (1 << i)) != cutTo)) {
				int mid = cutFrom ^ (1 << i);
				
				int midFrom = mid | (from & midBit);
				int midTo = mid | (to & midBit);
				List<Integer> part1 = buildPath(from, midFrom, newActive);
				List<Integer> part2 = buildPath(midTo, to, newActive);
				part1.addAll(part2);
				return part1;
			}
		}
		
		throw new AssertionError();

	}
	
	void submit() {
		solve();
	}

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
