import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * お遊び
 *
 * @author s-sugimoto
 */
public class Main {

	/**
	 * 隠蔽
	 */
	private Main() {
	}

	/**
	 * メイン
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 100A
		int a = scanner.nextInt();
		// 100B
		int b = scanner.nextInt();
		// C
		int c = scanner.nextInt();
		// D
		int d = scanner.nextInt();
		// 砂糖は100GあたりEとけるらしい
		int e = scanner.nextInt();
		// 砂糖と水の質量の合計がF
		int f = scanner.nextInt();

		// Aを使って砂糖水をつくる
		int ae = 100 * a * e;
		// Bを使って砂糖水をつくる
		int be = 100 * b + e;

		int satoumizu = 0;
		int satou = 0;
		double noudo = 0;
		for (int i = 0; i * a * 100 < (f); i++) {
			for (int j = 0; (i * a + j * b) * 100 < f; j++) {
				// まず水の量だけ弾いた残りの容量
				int withoutWater = f - (i * a + j * b) * 100;
				// 溶かすことのできる砂糖の量
				int satouLimit = (i * a + j * b) * e;
				for (int k = 0; k * c <= satouLimit && withoutWater + satouLimit < f; k++) {
					int dsSatouLimitCount = (satouLimit - k * c) / d;

					if (i + j != 0 && k + dsSatouLimitCount != 0
					        && noudo < k * c + dsSatouLimitCount * d / (i * 100 + j * 100 + k * c + dsSatouLimitCount * d)) {
						satoumizu = i * 100 + j * 100 + k * c + dsSatouLimitCount * d;
						satou = k * c + dsSatouLimitCount * d;
					}
				}
			}
		}

		System.out.println(satoumizu + " " + satou);
	}

}