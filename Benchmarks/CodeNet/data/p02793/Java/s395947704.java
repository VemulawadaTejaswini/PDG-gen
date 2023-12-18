import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long num1 = a[0];
		long num2;
		for (int i = 1; i < n; i++) {
			num2 = a[i];
			num1 = calLCM(num1, num2);
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			 sum += (num1 / a[i]);
		}

		int result = (int) (sum % (Math.pow(10, 9) + 7));

		System.out.println(result);

	}

	private static long calLCM(long a, long b) {
		long c = a * b;
		long tmp;
		while ((tmp = a % b) != 0) {
			a = b;
			b = tmp;
		}

		return c / b;
	}

}
