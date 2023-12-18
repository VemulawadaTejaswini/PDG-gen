package atcoder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int x = 0;
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String s = String.valueOf(N);

		for (int i = 1; i < s.length(); i++) {
			String A = s.substring(s.length() - i - 1, s.length() - i);
			if (A.equals("7")) {
				System.out.println("Yes");

			x = x + 1;
		}
		}
		if (x == 0) {
			System.out.println("No");
		}
	}
	}

