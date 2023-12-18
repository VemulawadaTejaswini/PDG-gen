import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	void solve() {
		n = in.nextInt();
		int[] t = new int[n];
		int[] v = new int[n + 1];
		for (int i = 0; i < n; i++) {
			t[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			v[i] = in.nextInt();
		}
		v[n] = 0;

		double ret = 0;
		double speed = 0;
		for (int i = 0; i < n; i++) {
			double retTime = t[i];
			while (true) {
				if (v[i + 1] == speed - retTime) {
					// speed down
					ret += -1 * retTime * retTime / 2 + retTime * speed;
					speed = speed - retTime;
					break;
				} else if (v[i] == speed) {
					double tmpTime = 0;
					if (speed <= v[i + 1]) {
						tmpTime = 0;
						ret += speed * (retTime - tmpTime);
						break;
					} else {
						tmpTime = speed - v[i + 1];
						ret += speed * (retTime - tmpTime);
					}
					retTime = tmpTime;
				} else {
					// speed up
					double tmpTime = Math.max(0, v[i] - speed);
					// speed up pause
					if (tmpTime - v[i + 1] + speed >= (retTime - v[i + 1] + speed) / 2) {
						tmpTime = retTime - ((retTime + speed) - v[i + 1]) / 2;
						ret += 0.5 * tmpTime * tmpTime + speed * tmpTime;
						retTime -= tmpTime;
						speed = speed + tmpTime;
						continue;
					}
					tmpTime = Math.min(retTime, tmpTime);
					ret += 0.5 * tmpTime * tmpTime + speed * tmpTime;
					retTime -= tmpTime;
					speed = speed + tmpTime;
					if (retTime == 0.0) {
						break;
					}
				}
			}
		}

		out.println(BigDecimal.valueOf(ret).toPlainString());
	}

	// only call
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	// predefined
	FastScanner in = new FastScanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	int n, m, a, b, c, d, e, f;
	int ret;
	ArrayList<Integer> list = new ArrayList<>();
	ArrayDeque<Integer> q = new ArrayDeque<>();

	// 2D-map
	int H, W;
	final int[] dw = new int[] { 0, 1, 0, -1, 1, 1, -1, -1 };
	final int[] dh = new int[] { 1, 0, -1, 0, 1, -1, 1, -1 };

	boolean inField(int nw, int nh) {
		if (nw < 0 || nw >= W || nh < 0 || nh >= H) {
			return false;
		}
		return true;
	}

	// Yes/No
	static String yesno(boolean f) {
		return yesno(f, "Yes", "No");
	}

	static String yesno(boolean f, String yes, String no) {
		return (f ? yes : no);
	}

	// search
	PriorityQueue<Node> pq = new PriorityQueue<>();

	class Node implements Comparable<Node> {

		double score;

		@Override
		public int compareTo(Node o) {
			return Double.compare(this.score, o.score);
		}
	}

	// library
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

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

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
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

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}