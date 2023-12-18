import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int N = Integer.parseInt(scan.next());
		final int K = Integer.parseInt(scan.next());
		scan.close();

		for (int i = 1; i <= K; i++) {
			BigInteger ans =
					BinominalCoefficient(N - K + 1, i)
						.multiply(BinominalCoefficient(K - 1, i - 1))
						.mod(BigInteger.valueOf(1000000000 + 7));
			System.out.println(ans);
		}

	}

	private static Map<String, BigInteger> memo = new HashMap<String, BigInteger>();

	private static BigInteger BinominalCoefficient(int n, int k) {
		if (n == k || k == 0) {
			return BigInteger.valueOf(1);
		} else if (k == 1) {
			return BigInteger.valueOf(n);
		} else if (memo.containsKey(n + "," + k)) {
			return memo.get(n + "," + k);
		} else {
			BigInteger ans = BigInteger.valueOf(1);
			for (int i = 1; i <= k; i++) {
				ans = ans.multiply(BigInteger.valueOf(n - k + i)).divide(BigInteger.valueOf(i));
			}
			memo.put(n + "," + k, ans);
			return ans;
		}
	}

}