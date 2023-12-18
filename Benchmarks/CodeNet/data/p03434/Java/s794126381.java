import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int[] numbers;
		try (Scanner scanner = new Scanner(System.in)) {
			n = scanner.nextInt();

			numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = scanner.nextInt();
			}
		}

		Arrays.sort(numbers);

		int difference = 0;
		for (int i = 0; i < n; i++) {
			difference = numbers[i] - difference;
		}

		System.out.println(difference);
	}
}