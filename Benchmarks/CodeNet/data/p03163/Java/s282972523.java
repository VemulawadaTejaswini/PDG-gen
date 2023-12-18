import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		FastScanner fs = new FastScanner();
		int noOfIt = fs.nextInt();
		int capacity = fs.nextInt();
		int w[] = new int[noOfIt];
		int[] pr = new int[noOfIt];
		for (int i = 0; i < noOfIt; i++) {
			w[i] = fs.nextInt();
			pr[i] = fs.nextInt();

		}
		Long[][] dp = new Long[noOfIt][capacity+1];
		System.out.println(getMaxProfit(capacity, 0, w, pr, dp, noOfIt));
	}

	private static long getMaxProfit(int capacity, int idx, int[] w, int[] pr, Long[][] dp, int noOfIt) {
		// TODO Auto-generated method stub

		if (idx >= noOfIt || capacity <= 0)
			return 0;
		if(dp[idx][capacity]!=null)
			return dp[idx][capacity];
		long p1 = 0;
		if (capacity >= w[idx]) {
			p1 = pr[idx] + getMaxProfit(capacity - w[idx], idx + 1, w, pr, dp, noOfIt);
		}
		long p2 = getMaxProfit(capacity, idx + 1, w, pr, dp, noOfIt);

		dp[idx][capacity] = Math.max(p1, p2);

		return dp[idx][capacity];

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