import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		if (x <= 6) {
			System.out.println(1);
		} else if (x % 11 == 0) {
			System.out.println((long) x / (long) (11 * 2));
		} else {
			long count = (long) x / (long) 11 * (long) 2;
			count += (x - 11 * count) % 11 < 6 ? 1 : 2;
			System.out.println(count);
		}
		in.close();
	}
}