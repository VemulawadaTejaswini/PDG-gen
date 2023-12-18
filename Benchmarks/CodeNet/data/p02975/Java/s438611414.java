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
		int N = nextInt();
		long[] A = new long[N+2];
		for(int i=1;i<=N;i++) {
			A[i]=nextLong();
		}
		A[0] = A[N];
		A[N+1] = A[1];

		String res = "Yes";
		for(int i=1;i<=N;i++) {
			if((A[i-1]^A[i+1])!=A[i]){
				res = "No";
				break;
			}

		}
		out.println(res);
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