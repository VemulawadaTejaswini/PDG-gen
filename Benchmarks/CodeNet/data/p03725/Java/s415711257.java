import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;


public class Main {
  private static int[][] DIR = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
  private static int H;
  private static int W;
  private static int K;
  private static char[][] map;
  private static int[] start;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    H = sc.nextInt();
    W = sc.nextInt();
    K = sc.nextInt();
    map = new char[H + 2][W + 2];

    start = new int[2];
    for (int i = 1; i <= H; i ++) {
      String s = sc.next();
      for (int j = 1; j <= W; j ++) {
        char c = s.charAt(j - 1);
        if (c == 'S') {
          start[0] = i;
          start[1] = j;
          c = '.';
        }
        map[i][j] = c;
      }
    }
    int ret = Integer.MAX_VALUE;
    for (int i = 0; i < 4; i ++) {
      ret = Math.min(ret, calc(i));
    }
    
    long[][] d = dijkstra(map, start);
    for (int i = 1; i <= W; i ++) {
      if (d[1][i] <= K || d[H][i] <= K) {
        System.out.println(1);
        return;
      }
    }
    for (int i = 1; i <= H; i ++) {
      if (d[i][1] <= K || d[i][W] <= K) {
        System.out.println(1);
        return;
      }
    }
    System.out.println(ret);
  }

  public static long[][] dijkstra(char[][] map, int[] start) {
    int w = map[0].length;
    int h = map.length;
    long[][] len = new long[h][w];
    for (int i = 0; i < h; i ++) {
        for (int j = 0; j < w; j ++) {
            len[i][j] = Long.MAX_VALUE;
        }
    }

    PriorityQueue<long[]> queue = new PriorityQueue<long[]>(new Comparator<long[]>() {
        @Override
        public int compare(long[] o1, long[] o2) {
            return Long.compare(o1[2], o2[2]);
        }
    });

    queue.add(new long[]{start[1], start[0], 0});
    
    boolean[][] visited = new boolean[h][w];

    while (queue.size() > 0) {
        long[] pos = queue.poll();
        int x = (int)pos[0];
        int y = (int)pos[1];
        len[y][x] = pos[2];
        if (visited[y][x]) {
            continue;
        }
        visited[y][x] = true;

        for (int[] d : DIR) {
            int nextX = x + d[0];
            int nextY = y + d[1];
            if (map[nextY][nextX] == '.') {
                if (!visited[nextY][nextX]) {
                    long newCost = pos[2] + 1;
                    queue.add(new long[]{nextX, nextY, newCost});
                }
            }
        }
    }
    return len;
  }
  
  private static int calc(int dir) {
    char[][] m = new char[map.length][];
    for (int i = 0; i < map.length; i++) {
      m[i] = Arrays.copyOf(map[i], map[i].length);
    }
    
    int[] d = DIR[dir];
    int y = start[0];
    int x = start[1];

    int count = 0;
    while (m[y + d[0]][x + d[1]] != 0) {
      for (int i = 0; i < K && m[y + d[0]][x + d[1]] == '.'; i ++) {
        y += d[0];
        x += d[1];
      }
      
      int ny = y;
      int nx = x;
      for (int i = 0; i < K && m[ny + d[0]][nx + d[1]] != 0;) {
        ny += d[0];
        nx += d[1];
        if (m[ny][nx] == '#') {
          i ++;
          m[ny][nx] = '.';
        }
      }
      count ++;
    }
    return count;
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
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}