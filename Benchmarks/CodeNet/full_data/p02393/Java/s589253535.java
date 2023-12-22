import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a >= 1 && b >= 1 && c >= 1 && a <= 10000 && b <= 10000
				&& c <= 10000) {
			if (a > b && b < c && c > a) {
				System.out.println(b + " " + a + " " + c);
			} else if (b > a && a > c && b > c) {
				System.out.println(c + " " + a + " " + b);
			} else if (a > b && b < c && a > c) {
				System.out.println(c + " " + b + " " + a);
			} else {
				System.out.println(a + " " + b + " " + c);
			}
		}

	}

}


