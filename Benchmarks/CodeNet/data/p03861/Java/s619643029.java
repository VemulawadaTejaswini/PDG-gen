import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long x = s.nextLong();
		long answer = 0;

		if ((b / x) - (a / x) > 0) {
			if ((b - a) % 2 == 0) {
				if (a == 0) {
					answer = (b / x) - (a / x) + 1;
				} else {

					answer = (b / x) - (a / x) + 1;
				}
			}
			if ((b - a) % 2 != 0) {
				if (a == 0) {
					answer = (b / x) - (a / x) + 1;
				} else {
					answer = (b / x) - (a / x);
				}
			}

		} else if ((b / x) - (a / x) == 0) {
			if (a % x == 0) {
				answer = 1;
			} else if (a % x != 0) {
				answer = 0;
			}

		}
		System.out.println(answer);
	}

}