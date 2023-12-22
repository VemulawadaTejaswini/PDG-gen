import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int b = sc.nextInt();
	static int c = sc.nextInt();
	static int d = sc.nextInt();
	static int p = sc.nextInt();

	public static void main(String[] args) {
		waterRate();
	}

	private static void waterRate() {
		int X = 0;
		int Y = 0;

		X = p * a;

			if ( p <= c ) {
				Y = b;
			} else {
				Y = b + (p - c) * d;
			}

		System.out.println(Math.min(X, Y));
	}
}
