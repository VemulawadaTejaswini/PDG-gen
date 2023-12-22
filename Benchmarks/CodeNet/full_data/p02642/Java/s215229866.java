import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}

		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return buflen > 0;
	}

	private int readByte() {
		return hasNextByte() ? buffer[ptr++] : -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public String nextLine() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}

		while (b != '\n') {
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] a = new int[n];
		int aMax = 0;
		for (int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			a[i] = tmp;
			aMax = Math.max(aMax, tmp);
		}
		Arrays.sort(a);

		boolean[] sieve = new boolean[aMax + 10];
		Arrays.fill(sieve, true);

		for (int i = 0; i < n; ++i) {
			if (!sieve[a[i]]) {
				continue;
			}

			if (i < n - 1 && a[i] == a[i + 1]) {
				sieve[a[i]] = false;
			}

			for (int j = a[i] * 2; j <= aMax; j += a[i]) {
				if (sieve[j]) {
					sieve[j] = false;
				}
			}
		}

		int ans = 0;
		for (int num : a) {
			if (sieve[num]) {
				++ans;
			}
		}

		System.out.println(ans);
	}

}
