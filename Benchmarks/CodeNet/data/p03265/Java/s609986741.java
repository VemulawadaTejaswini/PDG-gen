import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = 0, y3 = 0, x4 = 0, y4 = 0, diff = 0, a = 0, b = 0;

		if (x1 == x2) {
			diff = Math.abs(y1 - y2);
			y3 = y2;
			y4 = y1;
			if (y1 > y2) {
				x3 = x1 + diff;
				x4 = x1 + diff;
			} else {
				x3 = x1 - diff;
				x4 = x1 - diff;
			}
		} else if (y1 == y2) {
			diff = Math.abs(x1 - x2);
			x3 = x2;
			x4 = x1;
			if (x1 > x2) {
				y3 = y1 - diff;
				y4 = y1 - diff;
			} else {
				y3 = y1 + diff;
				y4 = y1 + diff;
			}
		} else {
			a = x1 - x2;
			b = y1 - y2;
			y3 = y2 - a;
			x3 = x2 + b;
			y4 = y3 + b;
			x4 = x3 + a;

		}

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

		sc.close();
	}
}