import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int K = sc.nextInt();

    long[] sum = new long[N + 1];
    for (int i = 0; i < N; i ++) {
      int a = sc.nextInt();
      sum[i + 1] = sum[i] + (a - K);
    }
    
    int[] s = shrink(sum);
    BIT bit = new BIT(N + 1);
    long count = 0;
    for (int i = 0; i <= N; i ++) {
      count += bit.sum(s[i] + 1);
      bit.add(s[i] + 1, 1);
    }
    System.out.println(count);
    
  }
  
  public static int[] shrink(long[] a)
  {
      int n = a.length;
      long[] b = new long[n];
      for(int i = 0;i < n;i++)b[i] = (long)a[i]<<32|i;
      Arrays.sort(b);
      int[] ret = new int[n];
      int p = 0;
      for(int i = 0;i < n;i++) {
          if(i>0 && (b[i]^b[i-1])>>32!=0)p++;
          ret[(int)b[i]] = p;
      }
      return ret;
  }

}

class BIT {
  private long[] array;
  private int n;

  public BIT(int n) {
      this.array = new long[n + 1];
      this.n = n;
  }

  public void add(int a, long w) {
      for (int i = a; i <= n; i += (i & -i)) {
          array[i] += w;
      }
  }
  
  public long sum(int a) {
      long ret = 0;
      for (int i = a; i > 0; i -= (i & -i)) {
          ret += array[i];
      }
      return ret;
  }

  public long sum(int a, int b) {
      return a == 0 ? sum(b) : (sum(b) - sum(a - 1));
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