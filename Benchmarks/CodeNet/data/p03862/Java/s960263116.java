import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[n];

		long count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (i != 0 && a[i - 1] + a[i] > x) {
				int tmp = a[i - 1] + a[i] - x;
				count += tmp;
				if (a[i] - tmp >= 0) {
					a[i] -= tmp;
				} else {
					a[i] = 0;
					tmp -= a[i];
					a[i - 1] -= tmp;
				}
			}
		}

		System.out.println(count);
	}
}