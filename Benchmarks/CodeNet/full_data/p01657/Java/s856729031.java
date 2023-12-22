import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int n, x, m, max = -114514;
	static int[] l, r, s, array, ans;

	static void solve() {
		n = sc.nextInt();
		x = sc.nextInt();
		m = sc.nextInt();
		l = new int[m];
		r = new int[m];
		s = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
			s[i] = sc.nextInt();
		}
		array = new int[n];
		po(0, array);
		if (max == -114514) {
			out.println(-1);
		} else {
			out.print(ans[0]);
			for (int i = 1; i < n; i++) {
				out.print(" ");
				out.print(ans[i]);
			}
		}
		out.flush();
	}

	public static void main(String[] args) {
		solve();
	}

	static void po(int index, int[] array) {
		if (index == n) {
			for (int i = 0; i < m; i++) {
				int lion = 0;
				for (int j = l[i]; j <= r[i]; j++) {
					lion += array[j];
				}
				if (lion != s[i]) {
					return;
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += array[i];
			}
			if (sum > max) {
				max = sum;
				ans = array.clone();
			}
			return;
		}
		for (int i = 0; i <= x; i++) {
			array[index] = i;
			po(index + 1, array);
		}
	}

}

class FastScanner {
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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int n = 0;
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