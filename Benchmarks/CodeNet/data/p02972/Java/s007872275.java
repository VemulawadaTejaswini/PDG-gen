import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			a[idx] = Integer.parseInt(sc.next());
		}

		boolean ansFlg = true;

		int i;
		int ballSum = 0;
		int ballNum = 0;
		int[] ballIdx = new int[N];
		for (i = 1; i <= N; i++) {
			// iの倍数のボールの和
			ballSum = 0;
			for (idx = i; idx <= N; idx += i) {
				ballSum += a[idx - 1];
			}
			// ai の中身が i の倍数の総和 % 2かどうか
			if (a[i - 1] == (ballSum % 2)) {
				// 合ってるので、余り1だったらボール入れる
				if (a[i - 1] == 1) {
					ballIdx[ballNum] = i; // 1始まり
					++ballNum;
				}
			} else {
				// 解なし
				ansFlg = false;
				break;
			}

		}

		if (ansFlg) {
			System.out.println(ballNum);
			if (ballNum > 0) {
				for (idx = 0; idx < ballNum; idx++) {
					if (idx > 0) {
						System.out.print(" ");
					}
					System.out.print(ballIdx[idx]);
				}
				System.out.println();
			}
		} else {
			System.out.println(-1);
		}

	}

}
