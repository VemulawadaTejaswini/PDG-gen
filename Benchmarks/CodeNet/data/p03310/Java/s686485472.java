import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		long[] A = new long[N+1];
		for (int i = 1; i <= N; i++) {
			A[i] = A[i-1] + sc.nextInt();
		}
		long ans = Integer.MAX_VALUE;
		int preL = 1;
		int preR = 3;
		long[] block = new long[4];
		for (int i = 2; i < N - 1; i++) {
			long minL = Integer.MAX_VALUE;
			for (int j = preL; j < i; j++) {
				long t0 = A[j];
				long t1 = A[i] - A[j];
				long dif = Math.abs(t1 - t0);
				if (dif <= minL) {
					minL = dif;
					preL = j;
					block[0] = t0;
					block[1] = t1;
				} else {
					break;
				}
			}
			long minR = Integer.MAX_VALUE;
			for (int j = Math.max(preR, i+1); j < N; j++) {
				long t2 = A[j] - A[i];
				long t3 = A[N] - A[j];
				long dif = Math.abs(t3 - t2);
				if (dif <= minR) {
					minR = dif;
					preR = j;
					block[2] = t2;
					block[3] = t3;
				} else {
					break;
				}
			}
			Arrays.sort(block);
			long t = block[3] - block[0];
			if (t <= ans) {
				ans = t;
			}
		}
		System.out.println(ans);
	}



	public static long gcd(long a, long b) {
		long remainder = a % b;
		if (remainder == 0) {
			return b;
		} else {
			return gcd(b, remainder);
		}
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
            if (buflen <= 0) {
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

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
