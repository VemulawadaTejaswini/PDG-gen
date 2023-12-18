import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N, H, A;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		H = nextInt();
		A = nextInt();

		int res = 0;
		if(H % A == 0) {
			res = H / A;
		}else {
			res = H / A + 1;
		}
		out.println(res);
	}

	static long modpow(long a, long n, long mod) {
	    long res = 1;
	    while (n > 0) {
	        if ((n & 1) != 0) res = res * a % mod;
	        a = a * a % mod;
	        n >>= 1;
	    }
	    return res;
	}
	static long modinv(long a, long mod) {
	    return modpow(a, mod - 2, mod);
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

	long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	}

	private final int[] sizeTable = {
	        9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE
	};

	public int stringSize(int x) {
	    for (int i = 0;; i++)
	        if (x <= sizeTable[i])
	            return i + 1;
	}
}