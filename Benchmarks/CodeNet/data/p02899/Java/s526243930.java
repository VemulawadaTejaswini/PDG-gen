import java.io.PrintStream;
import java.util.Arrays;
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
		int[][] A = new int[N][2];

		for(int i=0;i<N;i++) {
			A[i][0] = nextInt();
			A[i][1] = i+1; // index
		}
		Arrays.sort(A,(a1,a2)->Integer.compare(a1[0],a2[0]));

		StringBuilder buf = new StringBuilder();

		for(int i=0;i<N;i++) {
			if(i != 0)buf.append(" ");
			buf.append(A[i][1]);
		}
		out.println(buf);
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