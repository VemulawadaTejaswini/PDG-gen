import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next()) * 2;
		long x = Integer.parseInt(sc.next());
		long y = Integer.parseInt(sc.next());
		long am = 0;
		long bm = 0;
		if (x < y) {
			am = c * x;
			bm = (y - x) * b;
			bm = Math.min(bm, (y - x) * c);
		}
		else {
			bm = c * y;
			am = (x - y) * a;
			am = Math.min(am, (x - y) * c);
		}
		if (a * x + b * y < am + bm) {
			am = a * x;
			bm = b * y;
		}
		System.out.println(am + bm);
	}
}