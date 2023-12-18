import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		int s = (int) Math.ceil(Math.sqrt(n));
		for (long i = s; i <= n; i++) {
			if (n % i == 0) {
				System.out.println((long) Math.floor(Math.log10(i)) + 1);
				return;
			}
		}
	}
}
