import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		long result = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				continue;
			} else if (i % 3 == 0) {
				continue;
			} else if (i % 5 == 0) {
				continue;
			}
			result += i;
		}

		System.out.print(result);
	}

}
