import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long a = Long.parseLong(sc.next());
			long b = Long.parseLong(sc.next());
			long x = Long.parseLong(sc.next());

			long ans = 0;
			if (a == 0 && b == 0) {
				ans = 1;
			} else if (a == 0) {
				ans = (b / x) + 1;
			} else {
				ans = (b / x) - ((a - 1) / x);
			}

			System.out.println(ans);

		} finally {
			sc.close();
		}
	}
}