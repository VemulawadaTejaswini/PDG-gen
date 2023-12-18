import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int x3 = 0;
		int y3 = 0;
		long x2y3 = 0;
//		long x3y2 = 0;
		if (s <= 1000000000) {
			x2 = (int) s;
			y3 = 1;
		} else {
			x2 = (int) Math.ceil(Math.sqrt(s));
			y3 = x2;
			x2y3 = (long) x2 * y3;
			x3 = (int) (x2y3 - s);
			y2 = 1;
//			x3y2 = (long) x3 * y2;
		}
//		System.out.println("s     :" + s);
//		System.out.println("x2y3:" + x2y3);
//		System.out.println("x3y2:" + x3y2);
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
//		System.out.println("実S:" + Math.abs(x2y3 - x3y2));

		sc.close();
	}
}