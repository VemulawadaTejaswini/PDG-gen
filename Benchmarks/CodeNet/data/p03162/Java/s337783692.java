import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		FastScanner fs = new FastScanner();
		int days = fs.nextInt();
		int[][] hap = new int[days][3];
		for (int i = 0; i < days; i++) {
			hap[i][0] = fs.nextInt();
			hap[i][1] = fs.nextInt();
			hap[i][2] = fs.nextInt();

		}
		int a[] = new int[days];
		int b[] = new int[days];
		int c[] = new int[days];
		System.out.println(getMaxHapiness(hap, a, b, c, days));
	}

	private static int getMaxHapiness(int[][] hap, int[] a, int[] b, int[] c, int days) {

		int[] dp = new int[days];
		a[0] = hap[0][0];
		b[0] = hap[0][1];
		c[0] = hap[0][2];
		dp[0] = Math.max(a[0], Math.max(b[0], c[0]));
		for (int i = 1; i < days; i++) {
			a[i] = hap[i][0] + Math.max(b[i - 1], c[i - 1]);
			b[i] = hap[i][1] + Math.max(a[i - 1], c[i - 1]);
			c[i] = hap[i][2] + Math.max(a[i - 1], b[i - 1]);

			dp[i] = Math.max(a[i], Math.max(b[i], c[i]));

		}

		return dp[days - 1];

	}

}

class FastScanner {
	StringTokenizer tok = new StringTokenizer("");
	BufferedReader in;

	FastScanner() {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() throws IOException {
		while (!tok.hasMoreElements())
			tok = new StringTokenizer(in.readLine());
		return tok.nextToken();
	}

	int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
}