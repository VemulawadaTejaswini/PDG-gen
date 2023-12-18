import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		String S = next();
		sc.close();
		int Slen = S.length();
		int winsum = 0;
		for(int i=0;i<Slen;i++) {
			winsum += S.substring(i, i+1).equals("o")?1:0;
		}

		String res = "NO";
		if(15-Slen+winsum>=8)res = "YES";

		out.println(res);
	}
	private long max(long a, long b) {
		return Math.max(a, b);
	}
	private long min(long a, long b) {
		return Math.min(a, b);
	}
	private static int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	private static long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}
	static long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

}