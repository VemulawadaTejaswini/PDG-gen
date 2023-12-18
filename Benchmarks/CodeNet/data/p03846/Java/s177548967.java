import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		Arrays.sort(a);

		boolean judge = false;
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n / 2; j++) {
				if (i == 0 && n % 2 == 1 && a[0] == 0) {
					i++;
				}
				if (Math.abs(n - 1 - j - j) == a[i]) {
					judge = true;
					break;
				}
			}
			if (!judge) {
				break;
			}
		}

		if (judge) {
			System.out.println((int) Math.pow(2, n / 2));
		} else {
			System.out.println(0);
		}
	}
}
