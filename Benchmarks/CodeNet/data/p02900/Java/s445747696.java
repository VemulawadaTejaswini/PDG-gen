import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		long A = nextLong();
		long B = nextLong();

		long n = gcd(A,B);

		int sum = 1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				sum++;
				while(n%i==0) {
					n/=i;
				}
			}
		}
		if(n>1)sum++;
		out.println(sum);
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