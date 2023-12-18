import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	static final long INF = 10_000_000_001L;
	int N,HP;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		HP =  nextInt();
		N = nextInt();

		int []A = new int[N];
		int []B = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = nextInt();
			B[i] = nextInt();
		}

		long []dp = new long [HP+1];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int w = 0; w < HP; w++) {
				int nw = Math.min(w + A[i],HP);
				dp[nw] = Math.min(dp[nw], dp[w]+B[i]);
			}
		}

		out.println(dp[HP]);
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

}