import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char c[] = S.toCharArray();
		// 一度東を向いている人の数をすべてカウント
		int n = 0;
		for (int i = 0; i < N; i++) {
			if (c[i] == 'E') {
				n++;
			}
		}
		// 答えの変数を用意
		int ans = n;
		for (int i = 0; i < N - 1; i++) {
			// 西を向いている人が居たらカウントに足す
			if (c[i] == 'W') {
				n++;
			}
			// 東を向いている人が居たらカウントから引く
			if (c[i + 1] == 'E') {
				n--;
			}
			// 一番小さい値が答えになる
			if (ans > n) {
				ans = n;
			}
		}
		System.out.println(ans);
	}
}
