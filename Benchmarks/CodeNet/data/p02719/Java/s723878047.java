

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());

		long ans = n % k;

		if (k - ans < ans) {
			ans = k - ans;
		}

		System.out.println(ans);

	}

}
