

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			String input = scan.next();

			if (i == 0) {
				sb.append(input + ",");
			} else if (i == 1 && sb.toString().indexOf(input + ",") > 0) {
				System.out.println("NO");
				scan.close();
				return;
			}

			if (sb.toString().indexOf("," + input + ",") > 0) {
				System.out.println("NO");
				scan.close();
				return;
			}
			sb.append(input + ",");
		}

		scan.close();
		System.out.println("YES");
	}

}
