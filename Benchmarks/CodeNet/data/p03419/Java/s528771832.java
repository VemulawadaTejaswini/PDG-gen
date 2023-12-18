import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		long x = Math.min(n, m);
		long y = Math.max(n, m);
		if (x == 1) {
			if (y == 1) {
				System.out.println(1);
			} else if (y == 2) {
				System.out.println(0);
			} else {
				System.out.println(y - 2);
			}
		} else if (x == 2) {
			System.out.println(0);
		} else {
			System.out.println((x - 2) * (y - 2));
		}
	}
}
