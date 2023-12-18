import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		// 数値の入力
		int S = sc.nextInt();

		// 入力値の左側２けた
		int L = S / 100;
		// 入力値の右側２けた
		int R = S % 100;

		// 左が12を超えている(LL)
		if (L > 12 || L==0) {
			// 右が0～12の場合
			if (0 < R && R < 13) {
				System.out.print("YYMM");
			} else {
				System.out.print("NA");
			}
		}

		// 左が1～12(MM)の場合
		if (0 < L && L < 13) {
			// 右も1～12の場合
			if (0 < R && R < 13) {
				System.out.print("AMBIGUOUS");
				// 右が12を超えている
			} else if (R > 13 || R==00) {
				System.out.print("MMYY");
			} else {
				System.out.print("NA");
			}
		}
	}
}
