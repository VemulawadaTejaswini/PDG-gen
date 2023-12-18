import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] aa = new long[n];
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			long x = 0;
			for (int j = 0; j < n; j++) {
				if (0 == i % 2 ^ 0 == j % 2 ^ j < i) {
					x -= aa[j];
				} else {
					x += aa[j];
				}
			}
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(x);
		}

	}
}