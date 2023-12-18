import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3;
		int y3;
		int x4;
		int y4;

		if (y1 >= y2) {
			x3 = x2 + (y1 - y2);
			x4 = x1 + (y1 - y2);
		} else {
			x3 = x2 - (y2 - y1);
			x4 = x1 - (y2 - y1);
		}

		if (x1 >= x2) {
			y3 = y2 - (x1 - x2);
			y4 = y1 - (x1 - x2);
		} else {
			y3 = y2 + (x2 - x1);
			y4 = y1 + (x2 - x1);
		}

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

	}
}