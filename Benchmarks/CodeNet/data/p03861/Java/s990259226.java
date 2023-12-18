import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long x = s.nextLong();
		long answer = 0;
		long ans = 0;

		if (a == b) {
			if (a % x != 0) {
				ans = 1;
			} else if (a % x == 0) {
				ans = 0;
			}

		} else if (a != b) {
			ans = (b - a);
		}

		if (ans % x == 0) {
			if (a == 0) {
				answer = (ans / x)+1 ;
			} else if (a != 0) {
				answer = (ans / x) ;
			}

		} else if (ans % x != 0) {
			answer = (ans / x);
		}
		System.out.println(answer);

	}

}