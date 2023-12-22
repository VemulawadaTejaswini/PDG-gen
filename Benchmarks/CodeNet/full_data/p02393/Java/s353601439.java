

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int num;

		if(a > b) {
			num = a;
			a = b;
			c = num;
		}

		if(b > c) {
			num = b;
			b = c;
			c = num;
		}

		if(c > a) {
			num = c;
			c = a;
			b = num;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}