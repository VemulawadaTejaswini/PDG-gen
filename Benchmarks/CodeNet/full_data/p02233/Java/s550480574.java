import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_A
 * 
 * @author Kyoro
 *
 */
public class Main {

	BufferedReader reader;
	private int n;
	private long dp[];

	public Main() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		Main main = new Main();
		try {
			main.read();
			long result = main.solve();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void init() {
		dp = new long[50];
	}

	private long solve() {
		// return fib(n);
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

	/**
	 * Recursion: TLE
	 */
	private long fib(int x) {
		if (x == 0 || x == 1) {
			return 1;
		}
		return fib(x - 1) + fib(x - 2);
	}

	private void read() throws IOException {
		init();
		String line = reader.readLine();
		n = Integer.parseInt(line);
	}

}
