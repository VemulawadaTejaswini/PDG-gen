import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = 0;
		if (a > b) {
			sum = a;
			a = b;
			b = sum;
		} else if (b > c) {
			sum = b;
			b = c;
			c = sum;
		}
		if (a > c) {
			sum = a;
			a = c;
			c = sum;
		}
		System.out.println(a + " " + b + " " + c);
	}

}