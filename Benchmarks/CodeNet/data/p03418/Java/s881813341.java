import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long ans = 0;
		// a = 0考慮しているので、場合によっては後で引く
		for(long b = 1 ; b <= n ; b++) {
			long p = n / b;
			long r = n % b;
			ans += Math.max(0, b - k) * p + Math.max(0, r - k + 1);
		}
		System.out.println(k == 0 ? ans - n : ans);
	}
}
