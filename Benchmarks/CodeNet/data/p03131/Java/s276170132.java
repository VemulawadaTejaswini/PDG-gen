import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();

		// 交換しない場合
		if (k <= a || b - a < 3) {
			System.out.println(k + 1);
			sc.close();
			return;
		}

		// 交換する場合
		long ans = a + (1 + (k - (a + 1)) / 2) * (b - a);
		if ((k - (a + 1) % 2 == 1)) {
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}

}