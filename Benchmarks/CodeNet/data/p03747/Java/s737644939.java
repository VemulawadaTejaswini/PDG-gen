import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    long L = sc.nextLong();
    long T = sc.nextLong();
    
    long[][] ari = sc.nextLongTable(N, 2);
    
    long d = ari[0][1];
    long s = ari[0][0];
    
    long[] ret = new long[N];
    int ptr = 0;
    ArrayDeque<long[]> right = new ArrayDeque<>();
    ArrayDeque<long[]> left = new ArrayDeque<>();

    for (long[] a : ari) {
      if (a[1] == 1) {
        if (ptr > 0)
          right.addFirst(new long[]{a[0], 0});
        ret[ptr] = (a[0] + T) % L;
      } else {
        if (ptr > 0)
          left.addLast(new long[]{a[0], 0});
        ret[ptr] = ((a[0] - T) % L + L) % L;
      }
      ptr ++;
    }


    long time = 0;
    long pos = s;
    while (time <= T) {
      long myPos = 0;
      long myTime = 0;
      if (d == 1) {
        d = 2;
        long[] v = left.pollFirst();
        
        long len = (v[0] - (time - v[1]) - pos + L) % L;
        long nextPos = 0;
        if (len % 2 == 0) {
          myTime = time + len / 2;
          myPos = (pos + len / 2) % L;
          nextPos = (pos - len / 2 + L) % L;
        } else {
          myTime = time + (len + 1) / 2;
          myPos = (pos + len / 2) % L;;
          nextPos = (pos + len / 2 + 1) % L;
        }
        right.addLast(new long[] {nextPos, myTime});
      } else {

        d = 1;
        long[] v = right.pollFirst();
        
        long len = (pos + (L - (v[0] + (time - v[1])))) % L;
        long nextPos = 0;
        if (len % 2 == 0) {
          myTime = time + len / 2;
          myPos = (pos - len / 2 + L) % L;
          nextPos = (pos + len / 2) % L;
        } else {
          myTime = time + (len + 1) / 2;
          myPos = (pos - len / 2 + L) % L;
          nextPos = (pos - len / 2 + L - 1) % L;
        }
        left.addLast(new long[] {nextPos, myTime});
      }
      if (myTime < T) {
        pos = myPos;
        time = myTime;
      } else if(myTime == T) {
        pos = myPos;
        break;
      } else {
        pos += (T - time) * (d == 1 ? (L - 1) : 1);
        pos %= L;
        break;
      }
    }
    
    ptr = 0;
    for (; ptr < N; ptr ++) {
      if (ret[ptr] == pos) {
        break;
      }
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i ++) {
      sb.append(ret[(ptr + i) % N]);
      sb.append("\n");
    }
    
    System.out.println(sb);
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