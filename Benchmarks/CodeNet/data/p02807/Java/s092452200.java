import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// スライムの人数(?)Nを取得
		long suraimuCount = scanner.nextLong();

		// スライムの座標リストを取得
		List<Long> suraimuPointList = new ArrayList<Long>();
		for (long i = 0; i < suraimuCount; i++) {
			suraimuPointList.add(scanner.nextLong());
		}

		scanner.close();

		// 移動距離の最大総和を取得
		Long sumIdoukyoriMax = null;
		for (long i = suraimuCount - 1; i > 0; i--) {
			if (sumIdoukyoriMax == null) {
				// 右端から一つ左隣のスライムまでの距離を取得
				sumIdoukyoriMax = suraimuPointList.get((int) suraimuCount) - suraimuPointList.get((int) i);
				continue;
			}

			sumIdoukyoriMax += sumIdoukyoriMax
					+ (
							suraimuPointList.get((int) suraimuCount)
							- suraimuPointList.get((int) i)
						);
		}

		// 移動距離の最小総和を取得
		long sumIdoukyoriMin = suraimuPointList.get((int) suraimuCount)
				- suraimuPointList.get(0);

		// 期待値を算出
		long kitaiti = (sumIdoukyoriMax + sumIdoukyoriMin) / 2;

		// 階乗を取得
		long kaijou = factorial(suraimuCount - 1);

		// 回答算出 (期待値 * 階乗) % (10^9 + 7)
		long ans = (kitaiti * kaijou) % (10^9 + 7);

		System.out.println(ans);
	}

	// 階乗算出メソッド
	private static long factorial(long n) {
		if (n == 0) {
		  return 1;
		}
		return n * factorial(n-1);
	}
}