import java.util.Scanner;

public class Main {

	public static void sort(Integer a, Integer b) {
		int d;
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;
		if (a > b) {
			if (a > c) {
				d = a;
				a = c;
				c = d;
				if (a > b) {
					d = a;
					a = b;
					b = d;
				}
			} else {
				d = a;
				a = b;
				b = d;

			}
		} else {
			if (b > c) {
				d = b;
				b = c;
				c = d;
			}
		}

		System.out.println(a + " " + b + " " + c);
		// if (a==b) System.out.println("a == b");
		// else if(a>b) System.out.println("a > b");
		// else System.out.println("a < b");
		// System.out.printf("%f %f", a, b);
		sc.close();
	}

}