import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long x = in.nextLong();
		in.close();

		long count = 0;

		if ((b - a) == 0) {
			count = 0;
		} else if (((b - a) + 1) / x == 0) {
			count = (b - a) / x;

		} else {
			count = (1 + (b - a)) / x;
		}
		System.out.println(count);
	}
}