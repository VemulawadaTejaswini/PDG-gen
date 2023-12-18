import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();

		long ans = 0;
		if (2 * n > m) {
			System.out.println(m / 2);
		}

		m -= n * 2;
		ans += n;
		if (m < 4) System.out.println(ans);

		ans += m / 4;
		System.out.println(ans);

		sc.close();

	}

}