import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int tmp;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 10 == 3) {
				System.out.print(" " + i);
			} else if (i >= 30) {
				tmp = i;
				while (tmp >= 30) {
					tmp /= 10;

					if (tmp == 3 || tmp % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
				}

			}
		}
		System.out.println();
	}
}