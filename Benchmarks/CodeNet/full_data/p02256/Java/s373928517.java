import java.util.Scanner;

public class Main {

	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int gcd;
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		x %= y;
		for (int i = x; true; i--) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
		sc.close();
	}
}

