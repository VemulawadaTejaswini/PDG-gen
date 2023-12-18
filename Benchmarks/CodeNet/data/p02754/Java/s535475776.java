import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long count = 0;
		if (a == 0 && b == 0) {
			System.out.println(count);
		} else {
			long kurikaesi = n / (a + b);
			count += kurikaesi * a;

			long amari = n % (a + b);
			if (a <= amari) {
				count += a;
			} else {
				count += amari;
			}

			System.out.println(count);

		}
	}
}
