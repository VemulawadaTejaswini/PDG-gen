import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double wh = w * h / 2;
		System.out.println(String.format("%.6f", wh));
		if (x  * 2 == w & y * 2 == h) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		return;
	}
}