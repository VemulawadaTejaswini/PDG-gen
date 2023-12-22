import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scan s = new Scan();
		s.getNum();
	}
}

class Scan {
	public static void getNum() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a < b && b < c) {		
			System.out.println(a + " " + b + " " + c);
		} else if (a > b && b > c) {
			System.out.println(c + " " + b + " " + a);
		} else if (b > a && a > c) {
			System.out.println(c + " " + a + " " + b);
		} else if (a > b && a < c) {
			System.out.println(b + " " + a + " " + c);
		} else if (a < c && b > c) {
			System.out.println(a + " " + c + " " + b);
		} else if (b < c && a > c) {
			System.out.println(b + " " + c + " " + a);
		}
	}
}