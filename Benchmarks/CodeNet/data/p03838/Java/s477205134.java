
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long y = sc.nextLong();
		long ans = 0;

		if (x > 0) {

			if (y > 0) {
				if (x > y) {
					ans = x - y + 2;
				} else {
					ans = y - x;
				}
			} else {
				if (x > Math.abs(y)) {
					ans = x - Math.abs(y) + 1;
				} else {
					ans = Math.abs(y) - x + 1;
				}
			}

		} else {

			if (y > 0) {
				if (Math.abs(x) > y) {
					ans = Math.abs(x) - y + 1;
				} else {
					ans = y - Math.abs(x) + 1;
				}

			} else {
				if (Math.abs(x) > Math.abs(y)) {
					ans = Math.abs(x) - Math.abs(y);
				} else {
					ans = Math.abs(y) - Math.abs(x) + 2;
				}
			}

		}

		System.out.println(ans);

	}

}
