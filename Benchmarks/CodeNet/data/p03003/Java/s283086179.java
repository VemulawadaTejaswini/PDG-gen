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
		int N = nextInt();int M = nextInt();
		int[] S = new int [2020];
		int[] T = new int [2020];
		S = nextIntArray(N);
		T = nextIntArray(M);

		long[][] num = new long[2020][2020];
		long[][] sum = new long[2020][2020];

		for(int i=0;i < 2020;i++) {
			sum[i][0]=1;
			sum[0][i]=1;
		}

		long res = 1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(S[i]==T[j]) {
					num[i+1][j+1]=(sum[i][j])%Mod;
					res+=num[i+1][j+1];
				}
				sum[i+1][j+1]=(sum[i][j+1]+sum[i+1][j]+Mod-sum[i][j]+num[i+1][j+1])%Mod;
			}
		}
		out.println(res%Mod);
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