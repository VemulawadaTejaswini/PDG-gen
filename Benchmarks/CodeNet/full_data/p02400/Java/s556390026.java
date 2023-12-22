

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println(String.format("%.6f %.6f", Math.pow(num1, 2)
				* Math.PI, num1 * 2 * Math.PI));
	}
}