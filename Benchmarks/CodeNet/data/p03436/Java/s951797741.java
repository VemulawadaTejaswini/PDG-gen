import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class Main{
	static int h;
	static int w;
	static String[] s;
	static int[][] visited;
	static ArrayDeque<Integer> deque;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		h = sc.nextInt();
		w = sc.nextInt();
		s = new String[h + 2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < w + 2; i++) {
			sb.append("#");
		}
		for (int i = 0; i < h + 2; i++) {
			s[i] = sb.toString();
		}
		for (int i = 1; i <= h; i++) {
			s[i] = "#" + sc.next() + "#";
		}
		visited = new int[h + 2][w + 2];
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				visited[i][j] = -1;
			}
		}
		deque = new ArrayDeque<>();
		visited[1][1] = 0;
		deque.add(100 + 1);
		while (!deque.isEmpty() && visited[h][w] == -1) {
			int tmp = deque.remove();
			int ht = tmp / 100;
			int wt = tmp % 100;
			if (s[ht - 1].charAt(wt) == '.' && visited[ht - 1][wt] == -1) {
				visited[ht - 1][wt] = visited[ht][wt] + 1;
				deque.add((ht - 1) * 100 + wt);
			}
			if (s[ht + 1].charAt(wt) == '.' && visited[ht + 1][wt] == -1) {
				visited[ht + 1][wt] = visited[ht][wt] + 1;
				deque.add((ht + 1) * 100 + wt);
			}
			if (s[ht].charAt(wt + 1) == '.' && visited[ht][wt + 1] == -1) {
				visited[ht][wt + 1] = visited[ht][wt] + 1;
				deque.add((ht) * 100 + (wt + 1));
			}
			if (s[ht].charAt(wt - 1) == '.' && visited[ht][wt - 1] == -1) {
				visited[ht][wt - 1] = visited[ht][wt] + 1;
				deque.add((ht) * 100 + (wt - 1));
			}
		}
		if (visited[h][w] == -1) {
			System.out.println(-1);
		} else {
			int count = 0;
			for (int i = 0; i < h + 2; i++) {
				for (int j = 0; j < w + 2; j++) {
					if (s[i].charAt(j) == '.') {
						count++;
					}
				}
			}
			System.out.println(count - visited[h][w] - 1);
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
