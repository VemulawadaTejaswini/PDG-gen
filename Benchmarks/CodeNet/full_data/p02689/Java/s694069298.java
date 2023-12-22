import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
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
		// TODO 自動生成されたメソッド・スタブ
		FastScanner fs = new FastScanner();
		int n = fs.nextInt(), m = fs.nextInt();

		int[] heights = new int[n + 10];
		for (int i = 1; i <= n; ++i) {
			heights[i] = fs.nextInt();
		}

		HashMap<Integer, HashSet<Integer>> adjacentMap = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < m; ++i) {
			int a = fs.nextInt(), b = fs.nextInt();
			adjacentMap.putIfAbsent(a, new HashSet<Integer>());
			adjacentMap.get(a).add(b);
			adjacentMap.putIfAbsent(b, new HashSet<Integer>());
			adjacentMap.get(b).add(a);
		}

		int ans = 0;
		for (int protagonist = 1; protagonist <= n; ++protagonist) {
			if (isGood(protagonist, adjacentMap, heights)) {
				++ans;
			}
		}
		System.out.println(ans);
	}

	static boolean isGood(int protagonist, HashMap<Integer, HashSet<Integer>> adjacentMap, int[] heights) {
		HashSet<Integer> adjacents = adjacentMap.get(protagonist);
		if (adjacents == null) {
			return true;
		}

		for (int deck : adjacents) {
			if (heights[protagonist] <= heights[deck]) {
				return false;
			}
		}

		return true;
	}

}
