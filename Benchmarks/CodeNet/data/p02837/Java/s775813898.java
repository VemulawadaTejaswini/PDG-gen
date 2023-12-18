import java.util.Scanner;

class Main {
	static int mod = 1000000007;
	private static long[] fact;
	private static long[] inv_fact;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[20];
		int[][] x = new int[20][20];
		int[][] y = new int[20][20];

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();

			for (int j = 0; j < a[i]; j++) {

				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();

			}
		}

		int ans = 0;

		// n = 3 なら 1 << n は 8, n = 10 なら 1024
		for (int bit = 1; bit < (1 << n); bit++) {
			boolean flag = true;

			for (int i = 0; i < n; ++i) {
				if ((bit & (1 << i)) == 0) {
					continue;
				}
				for (int j = 0; j < a[i]; j++) {
					// マスクしたい人の場所までシフト
					int shiftedBit = bit >> (x[i][j] - 1);
					// マスク
					int maskedBit = shiftedBit & 1;
					// 1:0 0:1 でなければよいのでXOR演算
					int xorBit = maskedBit ^ y[i][j];
					// xorBit == 1 のとき矛盾
					boolean result = xorBit == 1;
					if (result) {
						// 矛盾していたのでflagをfalseに
						flag = false;
					}
				}

			}
			if (flag)
				ans = Math.max(ans, counter(bit));

		}
		System.out.println(ans);

	}

	// 正直者の人数カウンタ
	static int counter(int x) {
		if (x == 0)
			return 0;
		return counter(x >> 1) + (x & 1);
	}

}