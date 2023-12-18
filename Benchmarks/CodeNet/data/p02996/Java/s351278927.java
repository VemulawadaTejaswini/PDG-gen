import java.io.PrintStream;
import java.util.Arrays;
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
		long[][] task = new long[N][2];
		for(int i=0;i<N;i++) {
			task[i][0] = nextLong();
			task[i][1] = nextLong();
		}

		Arrays.sort(task,(a1,a2)->Long.compare(a1[1],a2[1]));

		long cnt = 0;
		boolean f = true;
		for(int i=0;i<N;i++) {
			cnt += task[i][0];
			if(cnt > task[i][1]) {
				f = false;
				break;
			}
		}

		if(f)out.println("Yes");
		else out.println("No");
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