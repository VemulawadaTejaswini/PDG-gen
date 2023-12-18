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
		int D = nextInt();
		int[][] space = new int[N][D];
		for(int i=0;i<N;i++) {
			space[i]=nextIntArray(D);
		}
		int cnt = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				double sum = 0;
				for(int k=0;k<D;k++) {
					sum += Math.abs(space[i][k]-space[j][k])*Math.abs(space[i][k]-space[j][k]);
				}
				double sqrt = Math.sqrt(sum);

				String S = String.valueOf(sqrt);

				if(S.indexOf(".0")==S.length()-2&&sqrt>0) {
					cnt++;
					//out.println(S);
				}
			}
		}
		out.println(cnt);
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