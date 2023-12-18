import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		if (x <= 6) {
			System.out.println(1);
		} else if (x % 11 == 0) {
			System.out.println(x / (11 * 2));
		} else {
			long count = x / 11 * 2;
			count += x - 11 * count <= 6 ? 1 : 2;
			System.out.println(count);
		}
		in.close();
	}
}