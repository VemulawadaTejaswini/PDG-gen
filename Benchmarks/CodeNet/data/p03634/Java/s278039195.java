import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    
    int[] from = new int[N - 1];
    int[] to = new int[N - 1];
    int[] w = new int[N - 1];
    for (int i = 0; i < N - 1; i ++) {
      from[i] = sc.nextInt() - 1;
      to[i] = sc.nextInt() - 1;
      w[i] = sc.nextInt();
    }
   
    int[][][] g = packWU(N, from, to, w);
    int Q = sc.nextInt();
    int root = sc.nextInt() - 1;
    
    long[] len = new long[N];
    dfs(root, -1, g, len);
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i ++) {
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;
      
      sb.append(len[x] + len[y]);
      sb.append("\n");
    }
    System.out.println(sb);
  }
  
  private static void dfs(int now, int pre, int[][][] g, long[] len) {
    for (int[] next : g[now]) {
      if (next[0] != pre) {
        len[next[0]] = len[now] + next[1];
        dfs(next[0], now, g, len);
      }
    }
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] w){ return packWU(n, from, to, w, from.length); }
  public static int[][][] packWU(int n, int[] from, int[] to, int[] w, int sup)
  {
      int[][][] g = new int[n][][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < sup;i++)p[to[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
      for(int i = 0;i < sup;i++){
          --p[from[i]];
          g[from[i]][p[from[i]]][0] = to[i];
          g[from[i]][p[from[i]]][1] = w[i];
          --p[to[i]];
          g[to[i]][p[to[i]]][0] = from[i];
          g[to[i]][p[to[i]]][1] = w[i];
      }
      return g;
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