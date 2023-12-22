import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p[] = new int[123456];

		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (isPrime(i)) {
					//System.out.println(i);
					count++;
				}
			}
			System.out.println(count);
		}
	}

	private static boolean isPrime(int a) {

		if (a == 1 && a == 2) return true;

		for (int i = 2; i * i <= a; i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
}

