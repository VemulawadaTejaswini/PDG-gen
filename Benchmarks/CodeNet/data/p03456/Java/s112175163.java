import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int a = sc.nextInt();
		final int b = sc.nextInt();

		final int num = Integer.valueOf(String.valueOf(a) + String.valueOf(b));

		String result = "No";
		for (int i = 1; i <= num; i++) {
			if (num % i > 0) {
				continue;
			} else if (i == num / i) {
				result = "Yes";
				break;
			}
		}

		System.out.print(result);

	}

}
