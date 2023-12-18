import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Throwable {
		MyScanner sc = new MyScanner();
		Integer[] nm = sc.nextIntArr();
		int n = nm[0];
		int m = nm[1];

		Integer[] prices = sc.nextIntArr();
		// M回ループして一番大きいところを半額にしていく
		for (int i = 0; i < m; i++) {
			// 昇順にソート
			Arrays.sort(prices);
			int maxPrice = prices[n - 1];
			int secondMaxPrice = 0;
			if (n > 2) {
				secondMaxPrice = prices[n - 2];
			}
			if (maxPrice == 0) {
				System.out.println("0");
				System.exit(0);
			}
			// 最大の価格の半額(小数切り捨て)で置き換え
			int newPrice = maxPrice / 2;
			prices[n - 1] = newPrice;
			// 最大が二番目よりまだ大きければ更に繰り返す
			while (prices[n - 1] > secondMaxPrice) {
				newPrice = maxPrice / 2;
				prices[n - 1] = newPrice;
				i++;
			}
		}

		// 合計額計算
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += prices[i];
		}
		System.out.println(sum);

	}

	static class MyScanner {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public String nextString() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(nextString());
		}

		public String[] nextStringArr() throws IOException {
			return nextString().split(" ");
		}

		public Integer[] nextIntArr() throws IOException {
			String[] strArr = nextStringArr();
			Integer[] intArr = new Integer[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			return intArr;
		}
	}

}
