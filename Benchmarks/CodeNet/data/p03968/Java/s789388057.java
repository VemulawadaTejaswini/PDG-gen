import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  private static int N;
  private static int count = 0;
  private static int[][] C;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    N = sc.nextInt();
    C = sc.nextIntTable(N, 4);
    
    for (int i = 0; i < N; i ++) {
      int[] color = {C[i][0], C[i][1], C[i][2], C[i][3], -1, -1, -1, -1};
      boolean[] used = new boolean[N];
      used[i] = true;

      dfs(0, color, used);
    }

    System.out.println(count / 6);
  }
  
  
  private static final int[][] edge = {
      {0, 4, 6, 1},
      {1, 6, 7, 2},
      {0, 3, 5, 4},
      {4, 5, 7, 6},
      {3, 2, 7, 5}
  };
  
  private static void dfs(int place, int[] color, boolean[] used) {
    if (place == 5) {
      count ++;
      return;
    }

    int a = edge[place][0];
    int b = edge[place][1];
    int c = edge[place][2];
    int d = edge[place][3];
    int preA = color[a];
    int preB = color[b];
    int preC = color[c];
    int preD = color[d];

    for (int i = 0; i < N; i ++) {
      if (!used[i]) {
        used[i] = true;
            
        for (int j = 0; j < 4; j ++) {
          if ((color[a] < 0 || C[i][(j + 0) % 4] == color[a])
              && (color[b] < 0 || C[i][(j + 1) % 4] == color[b])
              && (color[c] < 0 || C[i][(j + 2) % 4] == color[c])
              && (color[d] < 0 || C[i][(j + 3) % 4] == color[d])
              ) {
            
            color[a] = C[i][(j + 0) % 4];
            color[b] = C[i][(j + 1) % 4];
            color[c] = C[i][(j + 2) % 4];
            color[d] = C[i][(j + 3) % 4];
            dfs(place + 1, color, used);
          }
        }
        used[i] = false;
      }
    }
    color[a] = preA;
    color[b] = preB;
    color[c] = preC;
    color[d] = preD;
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