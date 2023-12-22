import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = 0, y = 0, r = 90;

		while (true) {
			String[] s = sc.nextLine().split(",");
			int a = Integer.parseInt(s[0]);
			int r2 = Integer.parseInt(s[1]);
			if (a == 0 && r2 == 0) break;
			x += a * Math.cos(Math.toRadians(r));
			y += a * Math.sin(Math.toRadians(r));
			r -= r2;
		}

		System.out.printf("%d\n%d\n", (int)x, (int)y);

	}

}