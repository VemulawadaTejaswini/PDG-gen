import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int N = sc.nextInt();
		Map<String, Integer> m = new HashMap<String, Integer>();
		long cnt = 0;
		for (int i = 0; i < N; i++) {
			String s = getRunLength(sc.next());
			if (m.containsKey(s)) {
				m.put(s, m.get(s) + 1);
			} else {
				m.put(s, 1);
			}
		}
		Iterator<Map.Entry<String, Integer>> itr2 = m.entrySet().iterator();
		while (itr2.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr2.next();
			if (entry.getValue() != 0) {
				cnt += get(entry.getValue());
			}
		}
		System.out.println(cnt);

	}

	public static String getRunLength(String str) {
		char[] list = new char[str.length()];
		list = str.toCharArray();
		Arrays.sort(list);
		return new String(list);
	}

	public static long get(int n) {
		long ret = 0;
		for (int i = n - 1; i > 0; i--) {
			ret += i;
		}
		return ret;
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