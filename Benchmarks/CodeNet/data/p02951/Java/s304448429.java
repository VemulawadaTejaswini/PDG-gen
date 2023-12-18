

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int answer = 0;
		if (c >= a - b) {
			answer = c - a + b;
		}
		System.out.println(answer);

	}

}
