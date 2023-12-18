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

		long[] dist = new long[N];
		for (int i = 0; i < x.length; i++) {
			dist[i] = Math.abs(x[i] - X);
		}

		long ans = dist[0];
		for (int i = 0; i < dist.length; i++) {
			ans = gcd(ans, dist[i]);
		}

		System.out.println(ans);
	}

	private static long gcd(long x, long y) {
		if (x < y) return gcd(y, x);
		if (y == 0) return x;
		return gcd(y, x % y);
	}
}