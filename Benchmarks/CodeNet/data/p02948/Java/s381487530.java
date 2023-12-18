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
		int M = nextInt();

		int[][] AB = new int[N][2];
		for(int i=0;i<N;i++) {
			AB[i] = nextIntArray(2);
		}
		Arrays.sort(AB,(a1,a2)->Long.compare(a2[0],a1[0]));
		Arrays.sort(AB,(a1,a2)->Long.compare(a2[1],a1[1]));

		long sum = 0;
		for(int i=0;i<N&&0<M;i++,M--) {
			while(i<N) {
				if(AB[i][0]<=M) {
					sum += AB[i][1];
					break;
				}
				else i++;
			}

		}

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