import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] An = new int[n];
		int[] Bn = new int[n];
		int idx;
		int idx2;
		for (idx = 0; idx < n; idx++) {
			An[idx] = Integer.parseInt(sc.next());
		}

		boolean result = false;

		// ループするので最初はどの要素でもよいからAn[0]とする
		int A1 = An[0];
		int A2 = 0;
		int rest = 0;
		int prev1 = 0;
		int prev2 = 0;
		boolean exists = false;

		for (idx = 1; idx < n; idx++) {
			prev1 = A1;
			rest = n - 2;
			// ディープコピー
			for (idx2 = 0; idx2 < n; idx2++) {
				Bn[idx2] = An[idx2];
			}

			// 2番目の要素を保持
			A2 = An[idx];
			prev2 = A2;
			// 1番目・2番目を-1に設定しておく
			Bn[0] = -1;
			Bn[idx] = -1;
			exists = false;

			while (rest > 0) {
				for (idx2 = 0; idx2 < n; idx2++) {
					if (Bn[idx2] == (prev1 ^ prev2)) {
						// xorである値が存在
						prev1 = prev2;
						prev2 = Bn[idx2];
						Bn[idx2] = -1;
						--rest;
						exists = true;
						break;
					}
				}
				if (!exists) {
					break;
				}
				if (rest == 0) {
					result = true;
				}
			}

			if (result) {
				break;
			}
		}

		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
