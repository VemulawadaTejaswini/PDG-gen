import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		int b = getInt(sc);
		int m = getInt(sc);

		int[] freezer = getIntArray(sc);
		int[] microwave = getIntArray(sc);

		int withCoupon = -1;
		// 割引券使用
		for (int i = 0; i < m; i++) {
			int[] coupon = getIntArray(sc);
			int price = freezer[coupon[0] - 1] + microwave[coupon[1] - 1] - coupon[2];
			if (price < withCoupon || i == 0) {
				withCoupon = price;
			}
		}

		// 割引券不使用
		int minFreezer = getMin(freezer);
		int minMicrowave = getMin(microwave);

		int withoutCoupon = minFreezer + minMicrowave;

		System.out.println(Math.min(withCoupon, withoutCoupon));

	}

	private static int getMin(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をintで返却
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をStringで返却
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をint配列で返却
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// 直前にnext()を実行していると改行コードだけ取ってしまうのでその対策
		while (line.equals("")) {
			line = sc.nextLine();
		}

		String[] strArray = line.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
