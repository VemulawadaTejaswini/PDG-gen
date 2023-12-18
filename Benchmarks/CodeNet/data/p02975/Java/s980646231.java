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
		int N = nextInt();
		long[] AR = new long[N+2];
		long[] AL = new long[N+2];
		for(int i=1;i<=N;i++) {
			AR[i]=nextLong();
			if(AR[i]>=100000) {
				AL[i] = AR[i]/100000;
				String As = String.valueOf(AR[i]);
				As = As.substring(As.length()-5, As.length());
				AR[i] = Long.valueOf(As);
			}
		}
		AR[0] = AR[N];
		AL[0] = AL[N];
		AR[N+1] = AR[1];
		AL[N+1] = AL[1];

		String res = "Yes";
		for(int i=1;i<=N;i++) {
			if((AR[i-1]^AR[i+1])!=(AR[i])){
				if((AL[i-1]^AL[i+1])!=(AL[i])) {
					res = "No";
					break;
				}
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

}