import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		solve(is);
	}

	private static void solve(InputStream is) {
		try (Scanner cin = new Scanner(is)) {
			int m = cin.nextInt();
			int n = cin.nextInt();

			if (m == 0) {
				if (n != 100) {
					System.out.println(n);
				} else {
					System.out.println(101);
				}
			} else if (m == 1) {
				if (n != 100) {
					System.out.println(100 * n);
				} else {
					System.out.println(10100);
				}
			} else {
				if (n != 100) {
					System.out.println(10000 * n);
				} else {
					System.out.println(1010000);
				}
			}
		}
	}
}
