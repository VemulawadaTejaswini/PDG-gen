import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {

	static int w, h;
	static boolean[][] rWall, dWall;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) break;

			rWall = new boolean[h][w - 1];
			dWall = new boolean[h - 1][w];
			for (int i = 0; i < h - 1; i++) {
				for (int j = 0; j < w - 1; j++) {
					if (sc.nextByte() == '1') rWall[i][j] = true;
				}
				for (int j = 0; j < w; j++) {
					if (sc.nextByte() == '1') dWall[i][j] = true;
				}
			}
			for (int j = 0; j < w - 1; j++) {
				if (sc.nextByte() == '1') rWall[h - 1][j] = true;
			}

			System.out.println(bfs(0, 0, w - 1, h - 1));
		}
	}

	static int bfs(int sx, int sy, int gx, int gy) {
		Deque<int[]> q = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		q.offer(new int[] { sx, sy, 1 });
		while (!q.isEmpty()) {
			int[] now = q.poll();
			if (now[0] == gx && now[1] == gy) return now[2];
			visited[now[1]][now[0]] = true;
			if (0 <= now[0] - 1 && !visited[now[1]][now[0] - 1] && !rWall[now[1]][now[0] - 1]) {
				visited[now[1]][now[0] - 1] = true;
				q.offer(new int[] { now[0] - 1, now[1], now[2] + 1 });
			}
			if (now[0] + 1 < w && !visited[now[1]][now[0] + 1] && !rWall[now[1]][now[0]]) {
				visited[now[1]][now[0] + 1] = true;
				q.offer(new int[] { now[0] + 1, now[1], now[2] + 1 });
			}
			if (0 <= now[1] - 1 && !visited[now[1] - 1][now[0]] && !dWall[now[1] - 1][now[0]]) {
				visited[now[1] - 1][now[0]] = true;
				q.offer(new int[] { now[0], now[1] - 1, now[2] + 1 });
			}
			if (now[1] + 1 < h && !visited[now[1] + 1][now[0]] && !dWall[now[1]][now[0]]) {
				visited[now[1] + 1][now[0]] = true;
				q.offer(new int[] { now[0], now[1] + 1, now[2] + 1 });
			}
		}
		return 0;
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
			if (buflen <= 0) return false;
		}
		return true;
	}

	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private boolean isPrintableChar(int c) {
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
	
	public byte nextByte() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		return readByte();
	}

	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
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