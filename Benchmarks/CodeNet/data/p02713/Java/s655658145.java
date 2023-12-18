import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int k = 1; k <= K; k++) {
					sum += gcd(i, j, k);
				}
			}
		}

		System.out.println(sum);
	}

	public static int gcd(int x, int y) {
		if (y == 0)
			return x;

		return gcd(y, x % y);
	}

	public static int gcd(int x, int y, int z) {
		return gcd(gcd(x, y), z);
	}
}