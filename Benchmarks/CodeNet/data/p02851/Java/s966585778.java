import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

	final long MOD = (long) 1e9 + 7;

	void run() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] sum = new long[N];
		HashMap<Long, Integer> map = new HashMap<>();
		map.put(0L, 1);
		long ans = 0;
		for (int i = 0; i < N; ++i) {
			if (i - K >= 0)
				map.put(sum[i - (int) K], map.get(sum[i - (int) K]) - 1);
			else if (i == K - 1) {
				map.put(0L, map.get(0L) - 1);
			}
			A[i] = sc.nextLong();
			--A[i];
			sum[i] = ((i > 0 ? sum[i - 1] : 0) + A[i]) % K;
			if (map.containsKey(sum[i])) {
				map.put(sum[i], map.get(sum[i]) + 1);
			} else {
				map.put(sum[i], 1);
			}
			long n = map.get(sum[i]);
			ans = (ans + n - 1);
		}
		System.out.println(ans);

	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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