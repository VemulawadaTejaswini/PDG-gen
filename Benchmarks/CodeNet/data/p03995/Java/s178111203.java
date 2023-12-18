import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
	private static int[][][] DIR = { { { 1, 1 }, { 1, 0 }, { 0, 1 } }, { { -1, -1 }, { -1, 0 }, { 0, -1 } },
			{ { 1, -1 }, { 1, 0 }, { 0, -1 } }, { { -1, 1 }, { -1, 0 }, { 0, 1 } }, };

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int R = sc.nextInt();
		int C = sc.nextInt();

		int N = sc.nextInt();
		Map<Long, Long> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			long a = sc.nextInt();
			map.put(enc(r, c), a);
		}

		boolean ng = false;
		Map<Long, Long> now = map;
		loop: while (now.size() > 0) {
			Map<Long, Long> newMap = new HashMap<>();
			for (Map.Entry<Long, Long> entry : now.entrySet()) {
				int[] p = dec(entry.getKey());
				int r = p[0];
				int c = p[1];
				long a = entry.getValue();

				for (int[][] d : DIR) {

					long hx = enc(r + d[0][0], c + d[0][1]);
					long hy = enc(r + d[1][0], c + d[1][1]);
					long hz = enc(r + d[2][0], c + d[2][1]);
					Long x = map.get(hx);
					Long y = map.get(hy);
					Long z = map.get(hz);

					long hash = 0;
					long v = 0;
					if (x == null && y != null && z != null) {
						v = y + z - a;
						hash = hx;
					} else if (x != null && y == null && z != null) {
						v = a + x - z;
						hash = hy;
					} else if (x != null && y != null && z == null) {
						v = a + x - y;
						hash = hz;
					} else if (x != null && y != null && z != null) {
						if (x + a != y + z) {
							ng = true;
							break loop;
						}
					}
					if (v < 0) {
						ng = true;
						break loop;
					}
					if (hash > 0)
						newMap.put(hash, v);
				}
			}
			map.putAll(newMap);
			now = newMap;
		}

		System.out.println(ng ? "No" : "Yes");
	}

	private static long enc(int r, int c) {
		return (long) r * 100000 + c;
	}

	private static int[] dec(long hash) {
		return new int[] { (int) (hash / 100000), (int) (hash % 100000) };
	}
}

class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
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

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
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
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}