import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();

		if(k == 0) {
			System.out.println(n * n);
			System.exit(0);
		}

		if(n == 1) {
			System.out.println("0");
			System.exit(0);
		}

		long ans = 0;
		for(long i = 1;i <= n;i++) {
			long a = n / i;
			long b = n % i;

			if(i >= k) {
				ans += (i - k) * a;
			}
			if(b - k >= 0 ) {
				ans += b - k + 1;
			}
		}
		System.out.println(ans);
	}
}
