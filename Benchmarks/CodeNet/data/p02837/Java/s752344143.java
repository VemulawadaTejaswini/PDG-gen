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

				// System.out.println("j:" + j);
				// System.out.println("x:" + x + " y:" + y);
			}
		}

		int ans = 0;
		for (int bit = 0; bit < (1 << n); bit++) {
			boolean flag = true;

			for (int i = 0; i < n; ++i) {
				if ((bit & (1 << i)) == 0) {
					continue;
				}
				for (int j = 0; j < a[i]; j++) {
					if ((((bit >> (x[i][j] - 1)) & 1) ^ y[i][j]) != 0) {
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