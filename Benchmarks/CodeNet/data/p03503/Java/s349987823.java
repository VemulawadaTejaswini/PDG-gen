import java.util.Scanner;

class Main {
	static final int TZ = 10; // time zone
	static int n;
	static int maxProfit = -10_000_000;
	static int[][] f;
	static int[][] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		f = new int[n][TZ];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < TZ; j++) {
				f[i][j] = sc.nextInt();
			}
		}

		p = new int[n][TZ + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p[i].length; j++) {
				p[i][j] = sc.nextInt();
			}
		}

		// debug
//		for (int i = 0; i < f.length; i++) {
//			for (int j = 0; j < f[i].length; j++) {
//				System.out.println("f[" + i + "][" + j
//						+ "] : " + f[i][j]);
//			}
//		}
//
//		for (int i = 0; i < p.length; i++) {
//			for (int j = 0; j < p[i].length; j++) {
//				System.out.println("p[" + i + "][" + j
//						+ "] : " + p[i][j]);
//			}
//		}


		getMaxProfit(0, "");
		getMaxProfit(1, "");

		System.out.println(maxProfit);

		sc.close();
	}

	static void getMaxProfit(int b, String s) {
		s += b;
		if (s.length() < TZ) {
			getMaxProfit(0, s);
			getMaxProfit(1, s);
			return;
		}

		if (s.contains("1")) {
			int profit = getProfit(s);
			if (profit > maxProfit) {
				maxProfit = profit;
				// debug
//				System.out.println("maxProfitPattern : " + s);
			}
		}
	}

	static int getProfit(String s) {
		int profit = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1'
					&& f[i][j] == 1) {
					cnt++;
				}
			}
			profit += p[i][cnt];
		}

		// debug
//		System.out.println(s);
//		System.out.println("profit : " + profit);
		return profit;
	}
}
