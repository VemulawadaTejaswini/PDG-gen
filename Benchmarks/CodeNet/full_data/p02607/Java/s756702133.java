

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long ans = 0;
		for (long i = 0; i < n; i++) {
			long a = sc.nextInt();

			if (i % 2 != 0 && a % 2 != 0) {
				ans++;
			}

		}

		System.out.println(ans);

	}

}
