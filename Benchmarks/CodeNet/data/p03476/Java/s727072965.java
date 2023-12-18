public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int Q = sc.nextInt();
		int[] cumulativeSum = new int[999999];
		for (int i = 1; i < cumulativeSum.length; i++) {
			if (isPrime(i) && isPrime((i + 1) / 2)) {
				cumulativeSum[i]++;
			}
			cumulativeSum[i] += cumulativeSum[i - 1];
		}
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int count = cumulativeSum[r] - cumulativeSum[l - 1];
			ans.append(count);
			if (i < Q - 1) {
				ans.append("\n");
			}
		}
		System.out.println(ans.toString());
	}

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}