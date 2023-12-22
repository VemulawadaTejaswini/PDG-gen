

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long rn = (long) Math.sqrt(n) + 1;
		int mod = 2;
		int ans = 0;
		int count = 0;

		while (mod < rn) {
			if (n % mod == 0) {
				count++;
				n = n / mod;
			} else {
				mod++;
				ans += h(count);
				count = 0;
				if (n == 1)
					break;
			}
		}

		if (n != 1 && ans == 0)
			ans = 1;

		System.out.println(ans);

	}

	static int h(int count) {
		for (int i = 40; i >= 0; i--) {
			if (2 * count >= i * (i + 1))
				return i;
		}
		return 0;
	}

}
