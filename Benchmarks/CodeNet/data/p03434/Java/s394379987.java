import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];
		int alice = 0;
		int bob = 0;

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);

		for (int i = n - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				alice += numbers[i];
			} else {
				bob += numbers[i];
			}
		}

		System.out.println(Math.abs(alice - bob));

		System.out.println();

		scanner.close();
	}
}