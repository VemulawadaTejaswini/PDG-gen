import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}

			Arrays.sort(array, Comparator.reverseOrder());

			int alice = 0;
			int bob = 0;
			if (n >= 2) {
				for (int i = 0; i < n - 1; i += 2) {
					alice += array[i];
					bob += array[i + 1];
				}
			}

			if (n % 2 == 1) {
				alice += array[n - 1];
			}

			System.out.println(alice - bob);
		}
	}
}
