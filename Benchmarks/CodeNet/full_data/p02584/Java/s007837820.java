import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long tmp1 = 0;
		long tmp2 = 0;
		int cnt = 0;

		if (x < 0) {
			for (int i = 0; i < k; i++) {
				x += d;
				if (x > 0) {
					cnt = i + 1;
					break;
				}
			}
		} else {
			for (int i = 0; i < k; i++) {
				x -= d;
				if (x < 0) {
					cnt = i + 1;
					break;
				}
			}

			if ((k - cnt) % 2 == 0) {
				System.out.println(Math.abs(x));
			} else {
				if (x < 0) {
					System.out.println(Math.abs(x + d));
				} else if (x > 0) {
					System.out.println(Math.abs(x - d));
				} else {
					System.out.println(Math.abs(x - d));
				}
			}

		}
		

	}

}
