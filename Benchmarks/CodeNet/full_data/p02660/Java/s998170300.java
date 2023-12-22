import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long num = sc.nextLong();

			//double limit = Math.sqrt(num);

			if (isPrime(num)) {
				System.out.println(1);
				return;
			}

			int result = 0;
			for (int i = 2; i <= num; i++) {
				if (num == 1) {
					break;
				}
				if (num % i == 0) {
					num /= i;
					//limit = Math.sqrt(num);
					//System.out.println(i);
					result++;
				}
			}
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isPrime(long num) {
		if (num < 2)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
