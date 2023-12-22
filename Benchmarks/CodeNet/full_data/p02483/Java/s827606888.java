import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (a > b) {
			if (a < c) {
				display(b, a, c);
			} else if (b > c) {
				display(c, b, a);
			} else {
				display(b, c, a);
			}
		} else if (a < b) {
			if (c < a) {
				display(c, a, b);
			} else if (c > b) {
				display(a, b, c);
			} else {
				display(a, c, b);
			}
		}

	}

	private static void display(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}