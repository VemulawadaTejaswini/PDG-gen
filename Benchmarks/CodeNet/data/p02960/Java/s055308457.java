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
		int N = S.length();
		char[] C = S.toCharArray();
		long[][] dp = new long[100010][15];
		dp[0][0]=1L;

		for(int i=0;i<N;i++) {
			for(int j=0;j<13;j++) {
				for(int k=0;k<=9;k++) {
					if(k==C[i]-'0'||C[i]=='?') {
						dp[i+1][(j*10+k)%13]=(dp[i+1][(j*10+k)%13]+dp[i][j])%Mod;
					}
				}
			}
		}
		out.println(dp[N][5]);
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