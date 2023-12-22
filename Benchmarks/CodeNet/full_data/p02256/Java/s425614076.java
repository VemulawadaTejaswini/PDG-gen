import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(gcd(x, y));
		sc.close();

	}
	private static int gcd(int x, int y) {
		int x_tmp = 0;

		do {
			x_tmp = x;

			x = y;
			y = x_tmp % y;

		}while(y > 0);

		return x;
	}

}
