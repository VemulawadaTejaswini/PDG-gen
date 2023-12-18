import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (true) {
			if (isPrime(x)) {
				System.out.println(x);
				return;
			}
			x = x + 1;
		}
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		}

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
