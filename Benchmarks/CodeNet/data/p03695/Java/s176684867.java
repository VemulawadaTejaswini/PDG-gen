import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int N = sc.nextInt();
		int[] scoreType = new int[9];
		for (int i = 0; i < N; i++) {
			int score = sc.nextInt();
			if (1 <= score && score <= 399) {
				scoreType[0] += 1;
			} else if (400 <= score && score <= 799) {
				scoreType[1] += 1;
			} else if (800 <= score && score <= 1199) {
				scoreType[2] += 1;
			} else if (1200 <= score && score <= 1599) {
				scoreType[3] += 1;
			} else if (1600 <= score && score <= 1999) {
				scoreType[4] += 1;
			} else if (2000 <= score && score <= 2399) {
				scoreType[5] += 1;
			} else if (2400 <= score && score <= 2799) {
				scoreType[6] += 1;
			} else if (2800 <= score && score <= 3199) {
				scoreType[7] += 1;
			} else if (3200 <= score) {
				scoreType[8] += 1;
			}
		}

		if (scoreType[8] > 0) {
			int whatColor = scoreType[8];
			scoreType[8] = 0;
			int[] sortScoreType = scoreType;
			Arrays.sort(sortScoreType);
			int type = 0;
			for (int data : sortScoreType) {
				if (data == 0) {
					type++;
				}
			}
			type--;
			int typo = 8 - type + whatColor;
			if (typo > 8) {
				typo = 8;
			}
			int minType = 8 - type;
			if (minType == 0) {
				minType = 1;
			}
			System.out.println(minType + " " + typo);
			return;
		}
		int type2 = 0;
		for (int data : scoreType) {
			if (data != 0) {
				type2++;
			}
		}
		System.out.println(type2 + " " + type2);
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