import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 2019L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		long L = nextLong();
		long R = nextLong();

		if(L <= Mod && Mod <= R || R - L >= Mod) {
			out.println(0);
			return;
		}


		long min = 2020;
		long ti = 0;
		
		// R-L < 2019
		for(long i=L;i<=R;i++) {
			long t = i % Mod;
			if(t < min) {
				min = t;
				ti = i;
			}
		}
		min = 2020;
		for(long i=ti+1;i<=R;i++) {
			long t = ti*i%Mod;
			 if(t < min) {
				 min = t;
				 ti = i;
			 }
		}

		out.println(min);
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