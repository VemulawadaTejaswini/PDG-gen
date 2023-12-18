import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();

		int count = 0;
		while(a > 0 && c > 0) {
			count++;
			if(count % 2 != 0) {
				c -= b;
			} else {
				a -= d;
			}
		}

		if(a <= 0) {
			System.out.println("No");
		} else if(c <= 0) {
			System.out.println("Yes");
		}
	}
}
