

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((c - c % b) / b <= (a - a % d) / d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
