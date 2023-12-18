import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextLong();
		}
		long plus = 0;
		long minus = 0;
		String ans = "Yes";

		for (int i = 0; i < N; i++) {
			if (a[i] < b[i]) {
				plus += b[i] - a[i];
			} else {
				minus += a[i] - b[i];
			}
		}

		if (minus * 2 > plus) {
			ans = "No";
		}

		// 出力
		System.out.println(ans);
	}
}
