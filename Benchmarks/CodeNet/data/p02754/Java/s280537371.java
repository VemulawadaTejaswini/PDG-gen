import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();

		long count = 0;

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
