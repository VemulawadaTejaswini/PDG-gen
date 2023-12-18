import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int alice = 0;
		int bob = 0;
		int ans = 0;
		Arrays.sort(a);

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				alice += a[N - 1 - i];
			} else {
				bob += a[N - 1 - i];
			}
		}
		ans = alice - bob;

		// 出力
		System.out.println(ans);
	}
}
