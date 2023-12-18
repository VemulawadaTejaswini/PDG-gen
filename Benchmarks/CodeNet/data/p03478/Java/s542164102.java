package test_a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();

		int sum = 0;
		int check = 0;
		for (int i = 1; i <= N; i++) {
			int a = i;
			check = 0;
			for (int j = 0; j <= String.valueOf(a).length(); j++) {
				a = a / 10;
				check += a % 10;
			}
			if (check >= A && check <= B) {
				sum += i;
			}

		}
		System.out.println(sum);

	}

}
