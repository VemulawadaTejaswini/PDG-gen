import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		for (int x = 0; x < k; x++) {
			for (int y = 0; y < k; y++) {
				for (int z = 0; z < k; z++) {
					if (x + y + z == k) {
						long ax = power(a, x);
						long by = power(b, y);
						long cz = power(z, z);
						if (ax < by && by < cz) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}

	static long power(long x, long n) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2);
		val = val * val;
		if (n % 2 == 1) {
			val = val * x;
		}
		return val;
	}
}
