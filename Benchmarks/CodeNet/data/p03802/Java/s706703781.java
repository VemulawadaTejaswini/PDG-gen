import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.TreeSet;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i ++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    
    int left = 0;
    int right = Integer.MAX_VALUE;
    
    while (left <= right) {
      int k = (left + right) / 2;
      
      TreeSet<Integer> set = new TreeSet<>();
      boolean ret = dfs(set, N, 0, k, x, y);
      if (ret) {
        left = k + 1;
      } else {
        right = k - 1;
      }
    }
    System.out.println(right);
   }

  private static boolean dfs(TreeSet<Integer> set, int n, int now, int min, int[] x, int[] y) {
    if (now == n) {
      return true;
    }

    int p = x[now];
    int q = y[now];
    
    Integer a = set.ceiling(p);
    Integer b = set.floor(p);
    Integer c = set.ceiling(q);
    Integer d = set.floor(q);
    
    if (a == null) {
      a = Integer.MAX_VALUE / 2;
    }
    if (b == null) {
      b = Integer.MAX_VALUE / 2;
    }
    if (c == null) {
      c = Integer.MAX_VALUE / 2;
    }
    if (d == null) {
      d = Integer.MAX_VALUE / 2;
    }
    
    if (Math.abs(p - a) >= min && Math.abs(p - b) >= min) {
      set.add(p);
      boolean ret = dfs(set, n, now + 1, min, x, y);
      if (ret) {
        return true;
      }
      set.remove(p);
    }

    if (Math.abs(q - c) >= min && Math.abs(q - d) >= min) {
      set.add(q);
      boolean ret = dfs(set, n, now + 1, min, x, y);
      if (ret) {
        return true;
      }
      set.remove(q);
    }
    
    return false;
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