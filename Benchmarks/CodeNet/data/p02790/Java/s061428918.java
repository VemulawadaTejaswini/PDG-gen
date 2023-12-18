import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int a,b;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		a = nextInt();
		b = nextInt();

		long res = 0;
		if(a < b) {
			for(int i=0,multi = 1;i<b;i++,multi*=10) {
				res += a * multi;
			}
		}else {
			for(int i=0,multi = 1;i<a;i++,multi*=10) {
				res += b * multi;
			}
		}

		out.println(res);
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
}