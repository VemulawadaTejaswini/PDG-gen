import java.util.Scanner;

public class Main {
	
	private static final long divisor = 1000000007L;

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		long l = n - k;
		long a = (l + 1) % divisor;
		System.out.println(a);
		for (int i = 1; i <= Math.min(k - 1, l + 1); i++) {
			a = (a * (k - i) * (l + 1 - i) / i / (i + 1)) % divisor;
			System.out.println(a);
		}
	}
}
