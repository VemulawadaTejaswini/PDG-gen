import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		int K = nextInt();
		int Q = nextInt();
		int[] A = new int[N];


		int AC = Q-K+1;

		for(int i=0;i<Q;i++) {
			A[nextInt()-1]++;
		}

		for(int i=0;i<N;i++) {
			out.println(A[i]>=AC?"Yes":"No");
		}

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