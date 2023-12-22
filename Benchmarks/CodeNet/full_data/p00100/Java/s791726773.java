import java.util.Scanner;

public class Main {
	static class Point {
		double x, y;

		Point (double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag;

		n = sc.nextInt();
		while (n != 0) {
			flag = true;
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				int cost   = sc.nextInt();
				int lotsOf = sc.nextInt();
				if (1000000L <= (long)(cost * lotsOf)) {
					System.out.println(number);
					flag = false;
				}
			}
			if (flag) {
				System.out.println("NA");
			}
			n = sc.nextInt();
		}
	}
}