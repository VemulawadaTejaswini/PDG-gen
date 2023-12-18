import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n / 2; i++) {
			int a = i;
			int b = n - a;
			int sum = sum(a, b);
			if (sum < min)
				min = sum;
		}

		System.out.println(min);

		sc.close();
	}

	static int sum(int a, int b) {
		return sumDigits(a) + sumDigits(b);
	}

	static int sumDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
