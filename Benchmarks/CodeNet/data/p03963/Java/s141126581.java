

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long answer = k;

		for (int i = 1; i < n; i++) {
			answer = answer * (k - 1);
		}

		System.out.println(answer);
	}

}
