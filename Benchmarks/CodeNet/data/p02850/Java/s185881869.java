import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class Main{
	static ArrayList<Edge>[] tree;
	static int[] color;
	static int max;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		tree = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			tree[a].add(new Edge(i, b));
			tree[b].add(new Edge(i, a));
		}
		color = new int[n - 1];
		dfs(0, 0);
		System.out.println(max);
		for (int i = 0; i < n - 1; i++) {
			System.out.println(color[i]);
		}
	}
	static void dfs(int n, int par) {
		int col = 1;
		for (Edge edge:
			 tree[n]) {
			if (color[edge.n] == 0) {
				if (col == par) {
					col++;
				}
				color[edge.n] = col;
				dfs(edge.to, col);
				max = Math.max(col, max);
				col++;
			}
		}
	}
}

class Edge {
	int n;
	int to;
	Edge(int n, int to) {
		this.n = n;
		this.to = to;
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
