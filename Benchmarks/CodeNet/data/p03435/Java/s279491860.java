import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		FastScanner sc = new FastScanner();
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		String ans = "Yes";
		for (int i = 0; i < 3; i++) {
			int p = 0;
			int q = 0;
			for (int j = 0; j < 3; j++) {
				int s = Math.abs(a[i][j]-a[(i+1)%3][j]);
				int t = Math.abs(a[j][i]-a[j][(i+1)%3]);
				if (j != 0 && (p != s || q != t)) {
					out("No");
					return;
				}
				p = s;
				q = t;
			}
		}
		out(ans);
	}

	class Combination {
		final int mod;
		final int max;

		final long[] fact;
		final long[] inv;
		final long[] invfact;

		public Combination(int n) {
			this(n, 1_000_000_007);
		}

		public Combination(int n, int mod) {
			this.mod = mod;
			max = n + 1;
			fact = new long[max];
			invfact = new long[max];
			inv = new long[max];

			inv[1] = 1;
			for (int i = 2; i < inv.length; i++) {
				inv[i] = inv[mod % i] * (mod - mod / i) % mod;
			}

			fact[0] = 1;
			invfact[0] = 1;
			for (int i = 1; i < inv.length; i++) {
				fact[i] = i * fact[i - 1] % mod;
				invfact[i] = inv[i] * invfact[i - 1] % mod;
			}
		}

		public long get(int n, int r) {
			return fact[n] * invfact[n - r] % mod * invfact[r] % mod;
		}
	}


	public long gcd(long a, long b) {
		long remainder = a % b;
		if (remainder == 0) {
			return b;
		} else {
			return gcd(b, remainder);
		}
	}

	void out(String a) {
		System.out.println(a);
	}

	void out(int a) {
		System.out.println(a);
	}

	void out(long a) {
		System.out.println(a);
	}

	void out(double a) {
		System.out.println(a);
	}

	void out(char a) {
		System.out.println(a);
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

    private boolean isPrintableChar(int c) {
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
