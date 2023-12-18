import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = (long) Math.floor(Math.sqrt(n));

		long ans = Long.MAX_VALUE;
		for (long i = m; i > 0; i--) {
			if (n%i==0) {
				long r = n/i;
				ans = Math.min(ans, i + r -2);
			}
		}
		System.out.println(ans);

	}
}
