import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long X = sc.nextInt();
		long[] x = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);

		long[] dist = new long[N];
		for (int i = 0; i < x.length; i++) {
			dist[i] = Math.abs(x[i] - X);
		}

		long ans = Integer.MAX_VALUE;
		if (dist.length == 1) {
			ans = dist[0];
		} else {
			for (int i = 1; i < dist.length; i++) {
				ans = Math.min(ans, gcd(dist[i], dist[i - 1]));
			}
		}

		System.out.println(ans);
	}

	private static long gcd(long x, long y) {
		if (x < y) return gcd(y, x);
		if (y == 0) return x;
		return gcd(y, x % y);
	}
}