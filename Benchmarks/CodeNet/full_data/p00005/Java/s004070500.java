import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("%d %d\n",gcd(a, b) ,lcm(a, b));
		}
		sc.close();

	}

	private static long lcm(int i, int j) {
		long lcm = i / gcd(i, j) * j;
		return lcm;
	}

	private static int gcd(int x, int y) {
		int x_tmp = 0;

		do {
			x_tmp = x;

			x = y;
			y = x_tmp % y;
		}while(y > 0);

		int gcd = x;

		return gcd;
	}

}
