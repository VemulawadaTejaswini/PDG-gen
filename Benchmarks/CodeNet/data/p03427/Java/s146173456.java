import java.util.Scanner;

public class Main {

	private static int solve(long n) {

		int ret = 0;

		String s = String.valueOf(n);
		int l = s.length();

		for (int i = 0; i < l; i++) {

			if (1 < l && 0 == i) {
				ret += s.charAt(i) - '0' - 1;

			} else {
				ret += 9;
			}

		}

		return ret;

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();

			int result = solve(n);

			System.out.println(result);

		}

	}

}
