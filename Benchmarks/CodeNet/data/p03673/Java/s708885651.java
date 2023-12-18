import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		if (n % 2 == 0) {
			int k = n / 2;
			int g = n / 2 - 1;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					a[k] = scanner.nextInt();
					k++;
				} else {
					a[g] = scanner.nextInt();
					g--;
				}
			}
		} else {
			int k = n / 2;
			int g = n / 2 + 1;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					a[k] = scanner.nextInt();
					k--;
				} else {
					a[g] = scanner.nextInt();
					g++;
				}
			}
		}

		for (int tar : a) {
			System.out.println(tar);
		}

	}
}