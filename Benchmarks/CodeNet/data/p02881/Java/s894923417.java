import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int x = a;

		int y = 0;

		int z = 0;

		int j = 0;

		//因数分解
		for (int i = 2; i <= a;) {

			if (x % i == 0) {

				if (x != i) {

					x /= i;

					if (y == 0) {

						y = i;

					} else {
						y = y * i;

					}
					j = i;

				}
			} else {

				i++;

			}

		}

		//最低回数
		System.out.println((j - 1) + (y - 1));

	}
}
