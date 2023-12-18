import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	long N,A,B;
	String S;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextLong();
		A = nextLong();
		B = nextLong();

		long abs = B-A;
		long res;
		if(abs % 2 == 0) {
			res = abs/2;
		}else {
			long ans1 = A + (B-A)/2;

			long ans2 = (N-B) + ((N-A)-(N-B))/2+1;
			out.println(ans1+" "+ans2);

			res = Math.min(ans1,ans2);
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