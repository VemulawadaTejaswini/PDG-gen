import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N;
	String S;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		int K = nextInt();
		int r = nextInt();
		int s = nextInt();
		int p = nextInt();

		String T = next();
		char []t = T.toCharArray();
		long sum = 0;
		// s < r < p < s
		char []c = new char[N];
		for(int i=0;i<N;i++) {
			if(K > i) {
				if(t[i]=='r') {
					c[i]='p';
					sum+=p;
				}else if(t[i]=='p'){
					c[i]='s';
					sum+=s;
				}else if(t[i]=='s'){
					c[i]='r';
					sum+=r;
				}
				continue;
			}

			if(t[i]=='r') {
				if(c[i-K]=='p')continue;
				c[i]='p';
				sum+=p;
			}else if(t[i]=='p'){
				if(c[i-K]=='s')continue;
				c[i]='s';
				sum+=s;
			}else if(t[i]=='s'){
				if(c[i-K]=='r')continue;
				c[i]='r';
				sum+=r;
			}

		}
		out.println(sum);
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