import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		long all = scan.nextLong();
		long left = 0;
		long right = 0;
		for (int i = 0; i < all; i++) {
			long a = scan.nextLong();
			String p = scan.next();
			long num = scan.nextLong();
			if (p.equals("(")) {
				left += num;
			} else {
				right += num;
			}

			if (left == right) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
		scan.close();

	}
}