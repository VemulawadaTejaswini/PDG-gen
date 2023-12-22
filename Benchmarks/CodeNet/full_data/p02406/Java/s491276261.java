import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 1;
		int x = sc.nextInt();

		do {
			if (n % 3 == 0) {
				System.out.print(" " + n);

				n++;
			} else if (n > 10) {
				int m = n;
				if (m / 10 == 3) {

					System.out.print(" " + n);
				}

				n++;

			} else {

				n++;
			}
		} while (n != x + 1);
		System.out.println();
	}
}