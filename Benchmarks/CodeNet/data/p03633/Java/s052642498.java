import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] t = new long[n];
		t[0] = scan.nextLong();
		for (int i = 0; i < n - 1; i++) {

			t[i + 1] = solve(t[i], scan.nextLong());

		}
		System.out.println(t[n - 1]);

	}

	static long solve(long a, long b) {
		long x = a;
		long y = b;
		long ans;
		while (true) {
			if (x > y) {
				if (x % y == 0) {
					ans = x;
					break;
				} else {
					x = x + a;
				}

			} else {
				if (y % x == 0) {
					ans = y;
					break;
				} else {
					y = y + b;
				}

			}
		}

		return ans;
	}

}