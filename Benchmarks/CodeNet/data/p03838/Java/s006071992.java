import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    long x = sc.nextLong();
    long y = sc.nextLong();
    System.out.println(solve(x, y));
    
//    for (int i = -3; i <= 3; i ++) {
//      for (int j = -3; j <= 3; j ++) {
//        long ret = solve(i, j);
//        long ret2 = dfs(i, j, 0);
//        System.out.printf("%d %d %d %d\n", i, j, ret, ret2);
//        if (ret != ret2) {
//          System.out.println("NG");
//        }
//      }
//    }
  }
  
  private static long solve(long x, long y) {
    long ax = Math.abs(x);
    long ay = Math.abs(y);
    long d = Math.abs(ax - ay);
    
    if (x == y) {
      return 0;
    } else if (ax <= ay) {
      if (y >= 0 && x >= 0) {
        return d;
      } else if (x * y <= 0){
        return d + 1;
      } else {
        return d + 2;
      }
    } else {
      if (y >= 0 && x >= 0) {
        return d + (y == 0 ? 1 : 2);
      } else if (x >= 0 && y <= 0){
        return d + 1;
      } else if (x <= 0 && y >= 0){
        return ax - y + (y == 0 ? 0 : 1);
      } else {
        return d;
      }
    }
  }
  
  
  private static long dfs(long x, long y, int depth) {
    if (depth > 4) {
      return 100;
    }
    
    if (x == y) {
      return 0;
    }
    
    long ret = Integer.MAX_VALUE;
    
    ret = Math.min(ret, dfs(-x, y, depth + 1) + 1);
    ret = Math.min(ret, dfs(x + 1, y, depth + 1) + 1);
    return ret;
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