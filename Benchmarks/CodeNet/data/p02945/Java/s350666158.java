package abc137_a;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A, B;
		A = scan.nextInt();
		B = scan.nextInt();
		scan.close();
		int a, b, c;
		a = A + B;
		b = A * B;
		c = A - B;
		System.out.println(a + "," + b + "," + c);
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else{
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
	}
}