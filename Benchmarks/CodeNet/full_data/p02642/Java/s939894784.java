import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// ABC170-D
public class Main {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		int N = sc.nextInt();

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}

		int result = 0;
		int count = 0;
		boolean skipFlg = false;

		List<Integer> divList = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			for (Integer num : divList) {
				if ((a.get(i) % num == 0) && (a.get(i) != num)) {
					count++;
					skipFlg = true;
					break;
				}
			}

			if (!skipFlg) {
				for (int j = 0; j < N; j++) {
					if (a.get(i) % a.get(j) == 0 && i != j) {
						divList.add(a.get(j));
						count++;
						break;
					}
				}
			}

			if (count == 0) {
				result++;
			}
			count = 0;
			skipFlg = false;
		}

		System.out.println(result);
		//		sc.close();
	}
}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
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
