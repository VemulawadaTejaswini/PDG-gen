import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong(); // Long Xを受け取る
		long K = sc.nextLong(); // Long Kを受け取る
		long D = sc.nextLong(); // Long Dを受け取る

		sc.close(); // 標準入力を終了

		long x = X; // 現在の座標

		if(Math.abs(K * D) < Math.min(Math.abs(X + D / 2), Math.abs(X - D / 2))) {
			// X,Kに比べて、Dが極端に小さい場合
			x = Math.min(Math.abs(x + K * D), Math.abs(x - K * D));
			System.out.println(x);
			return; // プログラムを終了
		}

		for (int i = 0; i < K; i++) {
			x = Math.min(Math.abs(x + D), Math.abs(x - D));

			if(Math.abs(x) <= D / 2) {
				// 座標の絶対値の最小値

				// 残り回数が偶数か奇数か判定
				if((K - i - 1) % 2 == 0) {
					break;
				} else {
					// 奇数の場合は1回だけ動かす
					x = Math.min(Math.abs(x + D), Math.abs(x - D));
					break;
				}
			}
		}
		System.out.println(x);
	}

}