

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long a = 100;
		int ans = 0;

		while (a < x) {
			ans++;
			a += a / 100;
		}

		System.out.println(ans);
	}

}
