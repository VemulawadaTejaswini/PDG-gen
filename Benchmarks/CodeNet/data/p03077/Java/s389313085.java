import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long ans = 0, min = 0, div = 0;

		min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));

		if (n % min == 0) {
			div = n/min - 1;
		} else {
			div = Math.floorDiv(n, min);
		}
		if (min < n) {
			ans = (long) (5 + div);
		} else {
			ans = 5;
		}
		
		System.out.println(ans);

		sc.close();
	}
}
