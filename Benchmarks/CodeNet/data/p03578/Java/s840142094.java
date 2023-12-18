import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.nextInt();
		}
		TreeMap<Integer, Integer> dmap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			if (!dmap.containsKey(d[i])) {
				dmap.put(d[i], 1);
			} else {
				dmap.put(d[i], dmap.get(d[i]) + 1);
			}
		}
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		for (int i = 0; i < m; i++) {
			if (!tmap.containsKey(t[i])) {
				tmap.put(t[i], 1);
			} else {
				tmap.put(t[i], tmap.get(t[i]) + 1);
			}
		}
		boolean ok = true;
		for (int key: tmap.keySet()) {
			int need = tmap.get(key);
			if (!dmap.containsKey(key) || dmap.get(key) < need) {
				ok = false;
				break;
			}
 		}
		if (ok) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
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
		if (nl < Integer.MIN_VALUE || Integer.MAX_VALUE < nl) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}