import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		for (long i = x; i < 1000000; i++) {
			if (isSosuu(i)) {
				System.out.println(i);
				return;
			}
		}
	}

	static boolean isSosuu(long n) {
		if (n < 2) return false;
		long end = (int) Math.sqrt(n);
		for (int i = 2; i <= end; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
