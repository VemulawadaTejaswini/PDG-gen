import java.io.*;
import java.util.*;

public class Main {
	static int[] prices;

	public static void main(String[] args) {
		try {
			BufferedReader br = createBufferedReader();
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			final int N = Integer.parseInt(st.nextToken());
			final int M = Integer.parseInt(st.nextToken());
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			prices = new int[N];
			for (int i = 0; i < N; i++) {
				prices[i] = Integer.parseInt(st.nextToken());
			}
			System.out.println(minimumPrice(0, M, 0));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.err.println("入力が正しくありません。");
		}
	}

	private static int discount(final int price, final int times) {
		int div = (int) Math.pow(2, times);
		return price / div;
	}

	private static long minimumPrice(final int index, final int discountN, final int times) {
		// 一番最後の商品の場合.
		if (index == prices.length - 1) {
			return discount(prices[index], discountN);
		}
		// 割引券がもうない場合.
		if (discountN == 0) {
			long sum = discount(prices[index], times);
			for (int i = index + 1; i < prices.length; i++) {
				sum += prices[i];
			}
			return sum;
		}
		// 割り引いた結果 index 個目の商品価格が 0となった場合, 次へ移る.
		if ((int) Math.pow(2, times) > prices[index]) {
			return minimumPrice(index + 1, discountN, 0);
		}
		long a = minimumPrice(index, discountN - 1, times + 1);
		long b = discount(prices[index], times) + minimumPrice(index + 1, discountN, 0);
		return min(a, b);
	}

	private static long min(final long a, final long b) {
		return (a < b) ? a : b;
	}

	// 以下問題問わずに共通部分
	// 標準入力の BufferedReader を返す.
	private static BufferedReader createBufferedReader() {
		InputStreamReader isr = new InputStreamReader(System.in);
		return new BufferedReader(isr);
	}
}
