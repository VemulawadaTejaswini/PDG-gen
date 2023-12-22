import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
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
		int n = fs.nextInt();
		int m = fs.nextInt();

		HashMap<Integer, HashSet<Integer>> conMap = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < m; ++i) {
			int a = fs.nextInt();
			int b = fs.nextInt();
			conMap.putIfAbsent(a, new HashSet<Integer>());
			conMap.get(a).add(b);
			conMap.putIfAbsent(b, new HashSet<Integer>());
			conMap.get(b).add(a);
		}

		int[] distances = new int[n + 10];
		Arrays.fill(distances, 2, n + 1, 1 << 30);
		int[] traces = new int[n + 10];

		ArrayDeque<Integer> adjacent = new ArrayDeque<Integer>();
		adjacent.add(1);
		while (!adjacent.isEmpty()) {
			int current = adjacent.removeFirst();
			HashSet<Integer> destinations = conMap.get(current);
			for (int node : destinations) {
				if (distances[current] + 1 < distances[node]) {
					adjacent.addLast(node);
					distances[node] = distances[current] + 1;
					traces[node] = current;
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Yes");
		for (int i = 2; i <= n; ++i) {
			pw.println(traces[i]);
		}
		pw.flush();
	}

}
