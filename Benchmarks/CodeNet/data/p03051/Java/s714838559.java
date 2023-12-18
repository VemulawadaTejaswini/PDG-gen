import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int n = nextInt();
		int[] A = new int[n+1];
		for(int i=0;i<n;i++)A[i] = nextInt();
		sc.close();
		int[] XorA = new int[n];
		XorA[0]=A[0];
		for(int i=0;i<n-1;i++)XorA[i+1] = XorA[i]^A[i+1];

		int INF = 20;
		long[] dp1 = new long[1<<INF];
		long[] dp0 = new long[1<<INF];
		long[] cnt = new long[1<<INF];
		Arrays.fill(dp0, 1);
		int zero=0;
		for (int i=0;i<n;i++) {
			if (XorA[i]==0) {
				zero++;
			} else {
				dp0[XorA[i]]+=dp1[XorA[i]]*(zero-cnt[XorA[i]]);
				dp1[XorA[i]]+=dp0[XorA[i]];
				dp0[XorA[i]]%=Mod;
				dp1[XorA[i]]%=Mod;

				cnt[XorA[i]]=zero;
			}
		}

		if (XorA[n-1]>0) {
			out.println(dp0[XorA[n-1]]);
		} else {
			long sum = 1;
			for (int i=0;i<zero-1;i++) {
				sum*=2;
				sum-=sum<Mod?0:Mod;
			}
			for (int i=0;i<(1<<INF);i++) {
				sum+=dp1[i];
				sum%=Mod;
			}
			System.out.println(sum);
		}
	}
	@SuppressWarnings("unused")
	private int min(int a, int b) {
		return Math.min(a, b);
	}
	@SuppressWarnings("unused")
	private int nextInt() {
		return Integer.parseInt(next());
	}
	@SuppressWarnings("unused")
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}
}