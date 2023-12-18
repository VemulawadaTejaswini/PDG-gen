

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int t = 0;
		if (n % r == 0) {
			t++;
		}
		if (n % g == 0) {
			t++;
		}
		if (n % b == 0) {
			t++;
		}
		for (int c = 1; c < n; c++) {
			for (int i = 1; i < n; i++) {
				for (int k = 1; k * g < n; k++) {

					if (i * r + k * g + c * b == n) {
						t += 1;
					}
				}
				if (n == i * r + c * g) {
					t++;
				}
				if (n == (i * g + c * b)) {
					t += 1;
				}
				if (n == i * r + c * b) {
					t += 1;
				}
			}
		}
		System.out.println( t);
	}
}