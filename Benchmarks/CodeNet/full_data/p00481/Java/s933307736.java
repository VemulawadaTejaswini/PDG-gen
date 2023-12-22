import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {
	
	static int h, w, n;
	static byte[][] block;
	
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		
		block = new byte[h][w];
		int[][] point = new int[n + 1][2];
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				block[y][x] = sc.nextByte();
				if (block[y][x] == '.' || block[y][x] == 'X') {
					continue;
				} else if ('1' <= block[y][x] && block[y][x] <= '9') {
					point[block[y][x] - '0'] = new int[] { x, y };
				} else if (block[y][x] == 'S') {
					point[0] = new int[] { x, y };
				}
			}
		}
		
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += bfs(point[i][0], point[i][1], point[i + 1][0], point[i + 1][1]);
		}
		
		out.println(total);
		out.flush();
	}
	
	static int bfs(int sx, int sy, int gx, int gy) {
		Deque<int[]> q = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		q.offer(new int[] { sx, sy, 0 });
		while (!q.isEmpty()) {
			int[] now = q.poll();
			if (now[0] == gx && now[1] == gy) return now[2];
			visited[now[1]][now[0]] = true;
			if (0 <= now[0] - 1 && !visited[now[1]][now[0] - 1] && block[now[1]][now[0] - 1] != 'X') {
				visited[now[1]][now[0] - 1] = true;
				q.offer(new int[] { now[0] - 1, now[1], now[2] + 1 });
			}
			if (now[0] + 1 < w && !visited[now[1]][now[0] + 1] && block[now[1]][now[0] + 1] != 'X') {
				visited[now[1]][now[0] + 1] = true;
				q.offer(new int[] { now[0] + 1, now[1], now[2] + 1 });
			}
			if (0 <= now[1] - 1 && !visited[now[1] - 1][now[0]] && block[now[1] - 1][now[0]] != 'X') {
				visited[now[1] - 1][now[0]] = true;
				q.offer(new int[] { now[0], now[1] - 1, now[2] + 1 });
			}
			if (now[1] + 1 < h && !visited[now[1] + 1][now[0]] && block[now[1] + 1][now[0]] != 'X') {
				visited[now[1] + 1][now[0]] = true;
				q.offer(new int[] { now[0], now[1] + 1, now[2] + 1 });
			}
		}
		return -1;
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