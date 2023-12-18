import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Long[] a = new Long[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);

		long ans = 0;

		for (int i = 0; i < N - K; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}