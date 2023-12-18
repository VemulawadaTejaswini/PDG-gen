

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		long ans = 0;

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			ans = 0;
		} else {
			int max = Math.max(a, Math.max(b, c));
			ans = a * b * c / max;
		}

		System.out.println(ans);
	}

}
