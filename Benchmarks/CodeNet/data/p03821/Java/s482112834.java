import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    for (int i = 0; i < N; i ++) {
      A[i] = sc.nextLong();
      B[i] = sc.nextLong();
    }
    
    StarrySkyTree sst = new ConcreteTree(N);
    for (int i = 0; i < N; i++) {
      sst.queryUpdate(i, i + 1, A[i]);
    }

    long count = 0;
    for (int i = N - 1; i >= 0; i -- ) {
      long v = sst.query(i, i + 1);
      long mod = (B[i] - v % B[i]) % B[i];
      count += mod;
      sst.queryUpdate(0, i + 1, mod);
    }
    System.out.println(count);
  }

}

class ConcreteTree extends StarrySkyTree {
  public ConcreteTree(int size) {
      super(size, 0);
  }

  @Override
  public long calcAdd(long a, long b) {
      return a + b;
  }

  @Override
  public long calcGet(long a, long b) {
      return Math.max(a, b);
  }
}

abstract class StarrySkyTree {
  private final long UNIT;
  private final long[] tree;
  private final long[] add;
  private final int size;

  public StarrySkyTree(int size, int unit) {
      this.UNIT = unit;
      size = 1 << (32 - Integer.numberOfLeadingZeros(size));

      this.tree = new long[size * 2];
      this.add = new long[size * 2];
      for (int i = 0; i < size * 2; i ++) {
          this.tree[i] = UNIT;
          this.add[i] = UNIT;
      }
      this.size = size;
  }

  public abstract long calcAdd(long a, long b);
  public abstract long calcGet(long a, long b);

  private void queryUpdate(int a, int b, int k, int l, int r, long n) {
      if (b <= l || r <= a) {
          return;
      }

      if (a <= l && r <= b) {
          add[k] = calcAdd(add[k], n);
          while (k > 0) {
              k = (k - 1) / 2;
              long x1 = tree[2 * k + 1];
              long x2 = add[2 * k + 1];
              long y1 = tree[2 * k + 2];
              long y2 = add[2 * k + 2];
              long x = calcAdd(x1, x2);
              long y = calcAdd(y1, y2);
              tree[k] = calcGet(x, y);
          }
      } else {
          queryUpdate(a, b, 2 * k + 1, l, (l + r) / 2, n);
          queryUpdate(a, b, 2 * k + 2, (l + r) / 2, r, n);
      }
  }


  private long query(int a, int b, int k, int l, int r) {
      if (b <= l || r <= a) {
          return UNIT;
      }

      if (a <= l && r <= b) {
          long x1 = tree[k];
          long x2 = add[k];
          return calcAdd(x1, x2);
      } else {
          long ql = query(a, b, 2 * k + 1, l, (l + r) / 2);
          long qr = query(a, b, 2 * k + 2, (l + r) / 2, r);
          long x = calcGet(ql, qr);
          return calcAdd(x, add[k]);
      }
  }
  
  public long query(int a, int b) {
      return query(a, b, 0, 0, size);
  }
  
  public void queryUpdate(int a, int b, long n) {
      queryUpdate(a, b, 0, 0, size, n);
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