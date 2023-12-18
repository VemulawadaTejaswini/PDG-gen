import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			Arrays.sort(a);
			int count = 1;

			for (int i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					count++;
				} else {
					break;
				}
			}

			if ((n - count) % (k - 1) != 0) {
				System.out.println((n - count) / (k - 1) + 1);
			} else {
				System.out.println((n - count) / (k - 1));
			}
		}
	}
}