import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 動物の総数
		int x = sc.nextInt();
		// 足の数
		int y = sc.nextInt();

		// yが奇数の場合はNo
		if (y % 2 != 0) {
			System.out.println("No");
			return;
		}
		// すべてカメと仮定する b:カメの数
		int b = x;
		if (4 * b == y) {
			// すべてカメの場合
			System.out.println("Yes");
			return;
		} else if (4 * b < y) {
			System.out.println("No");
			return;
		} else {
			// 差分の足の数鶴の数
			int a = (4 * b - y) / 2;
			if ((4 * b - y) % 2 != 0) {
				// 割り切れない場合
				System.out.println("No");
				return;
			}
			b -= a;
			if (a >= 0 && b >= 0 && (2 * a + 4 * b == y)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}