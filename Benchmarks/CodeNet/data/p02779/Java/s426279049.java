package abc154;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			long input = scan.nextLong();
			long nowIndex = sb.length();
			if (sb.toString().indexOf(String.valueOf(input) + ",") < nowIndex) {
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
