import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		while (a < b || b < c || c < d || d < e) {
			int swap;
			if (a < b) {
				swap = a;
				a = b;
				b = swap;
			}
			if (b < c) {
				swap = b;
				b = c;
				c =swap;
			}
			if (c < d) {
				swap = c;
				c = d;
				d = swap;
			}
			if (d < e) {
				swap = d;
				d = e;
				e = swap;
			}
		}
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}
}