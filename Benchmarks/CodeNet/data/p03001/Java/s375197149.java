import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();
		long h = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		double wh = w * h / 2;
		System.out.println(String.format("%.6f", wh));
		if (x * 2 == w & y * 2 == h) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		return;
	}
}