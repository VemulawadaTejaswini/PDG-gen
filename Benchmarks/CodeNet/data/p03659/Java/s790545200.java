import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		int sum = 0;
		int ave = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		ave = sum / 2;

		int front = 0;
		int back = 0;
		int check = 0;
		for (int i = 0; i < n; i++) {
			if (front <= ave && i != n - 1) {
				front += a[i];
				check++;
			} else {
				back += a[i];
			}
		}

		int min = Math.abs(front - back);
		if (check != 1) {
			front -= a[check - 1];
			back += a[check - 1];
			min = Math.min(min, Math.abs(front - back));
		}

		System.out.println(min);
	}
}