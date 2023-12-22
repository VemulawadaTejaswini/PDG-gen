import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 10 == 3) {
				System.out.print(" " + i);
				continue;
			}
			if (i % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			if (i % 10 == 3) {
				System.out.print(" " + i);
				continue;
			}
			if (i >= 30) {
				x = i;
				x = x / 10;
				if (x % 10 == 3) {
					System.out.print(" " + i);
					continue;
				}
				x = i;
				x = x / 100;
				if (x % 100 == 3) {
					System.out.print(" " + i);
					continue;
				}
				x = i;
				x = x / 1000;
				if (x % 1000 == 3) {
					System.out.print(" " + i);
					continue;
				}

			}

		}
		System.out.print("\n");
	}
}