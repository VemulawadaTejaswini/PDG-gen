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
		int L = nextInt();

		int[] apple = new int[N];

		for(int i=0;i<N;i++) {
			apple[i] = i+L;
		}
		long sum = 0;
		int minabs = Math.abs(apple[0]);
		int minabs_i = 0;
		for(int i=0;i<N;i++) {
			sum += apple[i];
			int t_abs = Math.abs(apple[i]);
			if(t_abs<minabs) {
				minabs = t_abs;
				minabs_i = i;
			}
		}
		sum -= apple[minabs_i];
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
}