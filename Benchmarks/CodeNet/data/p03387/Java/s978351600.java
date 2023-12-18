

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = Math.max(a, b);
		max = Math.max(max, c);
		int sum = a + b + c;
		
		if (sum % 2 == (3 * max) % 2) {
			System.out.println((3*max - sum) / 2);
		} else {
			System.out.println((3*(max + 1) - sum) / 2);
		}
		scanner.close();
	}

}
