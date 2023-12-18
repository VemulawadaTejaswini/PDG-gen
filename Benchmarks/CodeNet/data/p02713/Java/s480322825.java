public class Main {

	private static int K;

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		K = sc.nextInt();
		long sum = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int k = 1; k <= K; k++) {
					sum += gcd(gcd(i, j), k);
				}
			}
		}
		System.out.println(sum);
	}

	public static long gcd(long p, long q) {
		return (p % q == 0) ? q : gcd(q, p % q);
	}
}
