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
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=nextInt();
		}
		sc.close();
		int[] L = new int[N];
		int[] R = new int[N];
		L[N-1] = a[N-1];
		for(int i=0;i<N-1;i++) {
			L[i]+=a[i];
			L[i+1]+=L[i];
		}
		R[0] = a[0];
		for(int i=N-1;i>0;i--) {
			R[i]+=a[i];
			R[i-1]+=R[i];
		}
		int minabs = 100010;
		for(int i=0;i<N-1;i++) {
			minabs = Math.min(Math.abs(L[i]-R[i+1]),minabs);
		}
		out.println(minabs);
	}

	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}
}
