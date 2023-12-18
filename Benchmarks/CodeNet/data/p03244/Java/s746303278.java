import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		int[] odd = new int[n / 2];
		int[] even = new int[n / 2];
		int[] oCnt = new int[100001];
		int[] eCnt = new int[100001];

		int i;
		for(i = 0; i < n; i++) {
			if(i % 2 == 0) {
				odd[i/2] = scan.nextInt();
				oCnt[odd[i/2]]++;
			}
			else {
				even[i/2] = scan.nextInt();
				eCnt[even[i/2]]++;
			}
		}

		long omax = -1;
		long osubMax = 0;
		int oindex = 0;
		int osubIndex = 0;
		for(i = 0;i <= 100000; i++) {
			if(oCnt[i] >= omax) {
				osubMax = omax;
				omax = oCnt[i];
				osubIndex = oindex;
				oindex = i;
			}else if(oCnt[i] >= osubMax) {
				osubMax = oCnt[i];
				osubIndex = oindex;
			}
		}

		long emax = -1;
		long esubMax = 0;
		int eindex = 0;
		int esubIndex = 0;
		for(i = 0;i <= 100000; i++) {
			if(eCnt[i] >= emax) {
				esubMax = emax;
				emax = eCnt[i];
				esubIndex = eindex;
				eindex = i;
			}else if(eCnt[i] >= esubMax) {
				esubMax = eCnt[i];
				esubIndex = eindex;
			}
		}
		long ans = 0;
		if(oindex != eindex) {
			ans += (n / 2) - omax;
			ans += (n / 2) - emax;
		}else {
			if(omax > emax) {
				ans += (n / 2) - omax;
				ans += (n / 2) - esubMax;
			}else {
				ans += (n / 2) - emax;
				ans += (n / 2) - osubMax;
			}
		}
		out.print(ans);
		out.flush();
	}
}

class Po {
	int x;
	int y;
	long h;

	Po(int x, int y, long h) {
		this.x = x;
		this.y = y;
		this.h = h;
	}
}

class res {
	String name = "";
	int point = 0;
	int n = 0;

	res(String name, int point, int n) {
		this.name = name;
		this.point = point;
		this.n = n;
	}
}

class cal {
	long mod;

	cal(long x) {
		this.mod = x;
	}

	long mpow(long x, long n) {
		if (n == 0)
			return 1;
		if (n % 2 == 0) {
			long root = mpow(x, n / 2);
			return root * root % mod;
		} else {
			return x * mpow(x, n - 1) % mod;
		}
	}

	long mcomb(long a, long b) {
		if (b > a - b)
			return mcomb(a, a - b);
		long m = 1;
		long d = 1;
		long i;
		for (i = 0; i < b; i++) {
			m *= (a - i);
			m %= mod;
			d *= (i + 1);
			d %= mod;
		}
		long ans = m * mpow(d, mod - 2) % mod;

		return ans;
	}
}

class unionFind {
	int[] par;
	int[] size;

	unionFind(int x) {
		this.par = new int[x + 1];
		this.size = new int[x + 1];

		int i;
		for (i = 0; i <= x; i++)
			this.par[i] = i;
		Arrays.fill(this.size, 1);
	}

	int root(int x) {
		int r = x;
		while (r != this.par[r]) {
			r = this.par[r];
		}

		return r;
	}

	void union(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if (rx == ry)
			return;

		if (this.size[rx] < this.size[ry]) {
			this.size[ry] += this.size[rx];
			this.par[rx] = ry;
		} else {
			this.size[rx] += this.size[ry];
			this.par[ry] = rx;
		}
	}

	int size(int x) {
		return this.size[root(x)];
	}

	boolean same(int x, int y) {
		int rx = root(x);
		int ry = root(y);

		return rx == ry;
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
