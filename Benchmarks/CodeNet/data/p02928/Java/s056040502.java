import java.io.PrintStream;
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
		int N = nextInt();
		long K = nextLong();
		int[] A = nextIntArray(N);

		long bef = 0;
		long aft = 0;
		for(int i=0;i<N;i++) {
			for(int j = 0; j<N;j++) {
				if(A[i]>A[j])bef++;
				else aft++;
			}
		}
		long b = K*(K+1)/2%Mod;
		long c = K*(K-1)/2%Mod;
		long ans = bef*b%Mod+aft*c%Mod;
		out.println(ans%Mod);
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
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

}