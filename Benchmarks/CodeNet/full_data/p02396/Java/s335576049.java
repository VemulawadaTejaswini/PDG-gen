

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (true) {
			int num1 = scanner.nextInt();
			if (num1 == 0)
				break;
			else {
				System.out.println(String.format("Case %s: %s", i, num1));
				i++;
			}
		}
	}
}