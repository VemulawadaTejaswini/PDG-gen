import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int N = sc.nextInt();
		long[] divide = new long[N];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			long val = sc.nextLong();
			divide[i] = val;
			sum += val;
		}
		long half = sum / 2;
		long pIndex = 0;
		long lIndex = 0;
		long tmpSum = 0;
		for (int i = 0; i < N; i++) {
			tmpSum += divide[i];
			if (tmpSum <= half) {
				pIndex = tmpSum;
			}
			if (tmpSum >= half) {
				lIndex = tmpSum;
				break;
			}
		}
		if (pIndex == lIndex) {
			System.out.println(0);
			return;
		}
		long pNear = half - pIndex;
		long lNear = lIndex - half;
		if (pNear < lNear) {
			long abs = Math.abs(pIndex - (sum - pIndex));
			System.out.println(abs);
			return;
		} else {
			long abs = Math.abs(lIndex - (sum - lIndex));
			System.out.println(abs);
			return;
		}
	}

}

class FScanner {
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