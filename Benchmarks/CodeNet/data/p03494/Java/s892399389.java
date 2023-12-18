import java.util.Scanner;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int two = 0;
		while (true) {
			if (sum % Math.pow(2, two + 1) != 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					break;
				}
			}
			two++;
		}
		System.out.println(two);
	}
}
