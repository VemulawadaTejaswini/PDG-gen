import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int n = nextInt();
		int k = nextInt();
		out.println(n-k+1);
	}
	@SuppressWarnings("unused")
	private int min(int a, int b) {
		return Math.min(a, b);
	}
	@SuppressWarnings("unused")
	private int nextInt() {
		return Integer.parseInt(next());
	}
	@SuppressWarnings("unused")
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}
}
