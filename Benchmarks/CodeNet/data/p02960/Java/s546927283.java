import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public class Main {
	public static String S;

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		S = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			char schar = S.charAt(i);
			if (schar == '?') {
				sb.append("9");
			} else {
				sb.append(String.valueOf(schar));
			}
		}
		long cnt = 0;
		String sMaxLongS = sb.toString();
		BigInteger sMaxLong = new BigInteger(sMaxLongS);
		BigInteger threeFive = new BigInteger("5");
		BigInteger threeFiveMath = new BigInteger("13");
		while (sMaxLong.compareTo(threeFive) >= 0) {
			cnt += create(threeFive);
			cnt %= 1000000007;
			threeFive = threeFive.add(threeFiveMath);
		}
		System.out.println(cnt);
	}

	private static int create(BigInteger target) {
		String tS = getZero(target);
		for (int i = 0; i < S.length(); i++) {
			char schar = S.charAt(i);
			char targetchar = tS.charAt(i);
			if (schar != '?' && schar != targetchar) {
				return 0;
			}
		}
		return 1;

	}

	private static String getZero(BigInteger target) {
		StringBuilder sb = new StringBuilder();
		String tagetS = String.valueOf(target);
		for (int i = 0; i < S.length() - tagetS.length(); i++) {
			sb.append("0");
		}
		sb.append(tagetS);
		return sb.toString();
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