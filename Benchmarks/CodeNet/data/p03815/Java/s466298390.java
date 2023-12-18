import java.util.Scanner;

public class Main {
	static long ans = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long ans = x / 11 * 2;
		long m = x % 11;
		if (m > 6) {
			System.out.println(ans + 2);
		} else {
			System.out.println(ans + 1);
		}
	}
}
