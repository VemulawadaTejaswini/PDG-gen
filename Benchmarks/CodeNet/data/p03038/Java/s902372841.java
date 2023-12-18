import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		solve(fs);
	}

	public static void solve(FastScanner fs) {
		int n = fs.nextInt();
		int m = fs.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = fs.nextLong();
		Arrays.sort(a);
		List<Query> q = new ArrayList<Query>();
		for (int i = 0; i < m; i++) {
			q.add(new Query(fs.nextInt(), fs.nextLong()));
		}

		q.sort((x, y) -> y.c - x.c > 0 ? 1 : -1);

		int nowIndex = 0;
		boolean end = false;
		for (int i = 0; i < m; i++) {
			Query query = q.get(i);

			for (int j = nowIndex; j < nowIndex + query.b && j < n; j++) {
				if (a[j] < query.c) {
					a[j] = query.c;
				} else {
					end = true;
					break;
				}
			}

			if (end) {
				break;
			}

			nowIndex += query.b;
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		System.out.println(sum);
	}
}

class Query {
	int b;
	long c;

	public Query(int b, long c) {
		this.b = b;
		this.c = c;
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
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