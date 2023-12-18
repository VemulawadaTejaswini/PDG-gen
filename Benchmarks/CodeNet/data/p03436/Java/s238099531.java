import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.awt.Point;
import java.io.IOException;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		static final int[] dx = { 0, 1, 0, -1 };
		static final int[] dy = { 1, 0, -1, 0 };

		public void solve(int testNumber, Scanner in, PrintWriter out) {
			int h = in.nextInt();
			int w = in.nextInt();
			int black = 0;
			boolean[][] wall = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				char[] cs = in.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (cs[j] == '#') {
						wall[i][j] = true;
						black++;
					}
				}
			}
			int[][] dist = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					dist[i][j] = -1145141919;
				}
			}

			Point s = new Point(0, 0);
			Point g = new Point(w - 1, h - 1);
			Queue<Point> q = new ArrayDeque<>();
			q.offer(s);
			dist[s.y][s.x] = 0;

			while (!q.isEmpty()) {
				Point p = q.poll();

				if (p.equals(g)) break;

				for (int i = 0; i < 4; i++) {
					int x = p.x + dx[i];
					int y = p.y + dy[i];
					if ((0 <= x && x < w && 0 <= y && y < h) && !wall[y][x] && dist[y][x] < 0) {
						q.offer(new Point(x, y));
						dist[y][x] = dist[p.y][p.x] + 1;
					}
				}
			}

			out.println(dist[g.y][g.x] < 0 ? -1 : h * w - black - dist[g.y][g.x] - 1);
		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			byte b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
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

	}
}

