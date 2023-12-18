import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Greedy 0に気を付ける
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		// sortするとカード番号がずれるのでソートはしない。
		long ans = 0L;
		for (int i = 1; i <= n; i++) {
			// Ai同士でペアを作って、1余ったら残して次とペアにしたいのでmodする
			ans += a[i - 1] / 2;
			a[i - 1] %= 2;

			// Aiの残り部分と次の値がペアにできるなら先にペアにしておく
			if (a[i] > 0 && a[i - 1] > 0) {
				ans++;
				a[i]--;
				a[i - 1]--;
			}
		}

		System.out.println(ans);
	}
}
