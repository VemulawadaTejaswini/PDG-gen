

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a > b) {
			int box = a;
			a = b;
			b = box;
		}
		if (b > c) {
			int box = b;
			b = c;
			c = box;
		}
		if (a > b) {
			int box = b;
			b = a;
			a = box;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
