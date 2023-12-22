import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;

		int[] S = new int[N + 1];  // 番兵入れるために要素数+1
		for(int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
		}

		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			S[N] = sc.nextInt();  // 探す値をそのまま番兵に設定
			ans += linear_search(S, S[N]);
		}

		System.out.println(ans);
		sc.close();
	}

	// 見つかれば1、見つからなければ0(番兵の存在が前提)
	public static int linear_search(int[] a, int x) {
		int i = 0;
		while(a[i] != x) {
			i++;  // 番兵を用いることでメインループ内の比較演算の回数を減らすことができる
		}
		if(i == a.length - 1) {
			return 0;
		}
		return 1;
	}
}
