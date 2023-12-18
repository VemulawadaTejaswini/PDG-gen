import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = scanner.nextInt();

		scanner.close();

		int num;

		num = N - i + 1;

		if (num <= 0) {
			num = 1;
		}

		System.out.println(num);
	}
}
