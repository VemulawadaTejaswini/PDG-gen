
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long h = sc.nextLong();
		long s = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		long[] minValue = new long[4];
		minValue[0] = q;
		minValue[1] = Math.min(2 * minValue[0], h);
		minValue[2] = Math.min(2 * minValue[1], s);
		minValue[3] = Math.min(2 * minValue[2], d);
		long ans = n / 2 * minValue[3] + n % 2 * minValue[2];
		System.out.println(ans);
	}
}