import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{

	/** 紙のマス目の数 **/
	public static int CELL_COUNT = 10 * 10;

	/** インクの落ちたマス目を保持するリスト **/
	public static List<String> droppingInkList = new ArrayList<String>();

	public static void main(String[] args) {

		// インプット
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			// 入力値をカンマ区切りで分割
			String[] inputs = sc.next().split(",");
			int x = Integer.parseInt(inputs[0]);
			int y = Integer.parseInt(inputs[1]);
			int size = Integer.parseInt(inputs[2]);

			// 滴が落ちたマス目をリストに追加
			droppingInkList.add(joinString(x, y));

			if (size == 1) {
				// 小の滴の場合
				addSmall(x, y);
			} else if (size == 2) {
				// 中の滴の場合
				addSmall(x, y);
				addMedium(x, y);
			} else if (size == 3) {
				// 大の滴の場合
				addSmall(x, y);
				addMedium(x, y);
				addLarge(x, y);
			}
		}
		// 色のついていない部分のマス目の個数
		System.out.println(String.valueOf(countWhiteCell(droppingInkList)));

		// １番濃いマス目の濃さ
		System.out.println(String
				.valueOf(countMostDroppingInk(droppingInkList)));
	}

	/**
	 * 入力値を「x_y」の形の文字列に結合して返す
	 *
	 * @param x
	 * @param y
	 * @return 結合した文字列
	 */
	public static String joinString(int x, int y) {
		StringBuilder result = new StringBuilder();
		result.append(x);
		result.append("_");
		result.append(y);
		return result.toString();
	}

	/**
	 * 入力した(x,y)の上下左右が紙の範囲内であればリストに追加する
	 *
	 * @param x
	 * @param y
	 */
	public static void addSmall(int x, int y) {
		if (y != 0) {
			droppingInkList.add(joinString(x, y - 1));
		}
		if (y != 9) {
			droppingInkList.add(joinString(x, y + 1));
		}
		if (x != 0) {
			droppingInkList.add(joinString(x - 1, y));
		}
		if (x != 9) {
			droppingInkList.add(joinString(x + 1, y));
		}
	}

	/**
	 * 入力した(x,y)の左上、左下、右上、右下が紙の範囲内であればリストに追加する
	 *
	 * @param x
	 * @param y
	 */
	public static void addMedium(int x, int y) {
		if (x != 0 && y != 0) {
			droppingInkList.add(joinString(x - 1, y - 1));
		}
		if (x != 0 && y != 9) {
			droppingInkList.add(joinString(x - 1, y + 1));
		}
		if (x != 9 && y != 0) {
			droppingInkList.add(joinString(x + 1, y - 1));
		}
		if (x != 9 && y != 9) {
			droppingInkList.add(joinString(x + 1, y + 1));
		}
	}

	/**
	 * 入力した(x,y)の上+1,下+1,左+1,右+1が紙の範囲内であればリストに追加する
	 *
	 * @param x
	 * @param y
	 */
	public static void addLarge(int x, int y) {
		if (y != 0 && y != 1) {
			droppingInkList.add(joinString(x, y - 2));
		}
		if (y != 8 && y != 9) {
			droppingInkList.add(joinString(x, y + 2));
		}
		if (x != 0 && x != 1) {
			droppingInkList.add(joinString(x - 2, y));
		}
		if (x != 8 && x != 9) {
			droppingInkList.add(joinString(x + 2, y));
		}
	}

	/**
	 * 色のついていないマス目の数を数えて返す
	 *
	 * @param list
	 * @return 色のついていないマス目の数
	 */
	public static int countWhiteCell(List<String> list) {
		HashSet<String> set = new HashSet<String>(list);
		// 紙のマス目から色のついているマス目を引いて返す
		return CELL_COUNT - set.size();
	}

	/**
	 * １番多くインクが落ちたマス目の濃さ（インクが落ちた回数）を数えて返す
	 *
	 * @param list
	 * @return １番濃いマス目の濃さ
	 */
	public static int countMostDroppingInk(List<String> list) {
		Collections.sort(list);
		String beforeStr = "";

		// １番濃いマス目の濃さ
		int mostCount = 0;
		// 現在数えているマス目の濃さ
		int count = 0;

		for (String str : list) {
			if (beforeStr.equals("")) {
				// 初回
				count++;
				beforeStr = str;
			} else if (!beforeStr.equals(str)) {
				// 文字列が変わったとき
				if (count > mostCount) {
					// 前回数えていた数がこれまでの数より大きい場合は１番濃いマス目の数を更新
					mostCount = count;
				}
				count = 1;
				beforeStr = str;
			} else {
				// 前回を同じ文字列のとき
				count++;
			}
		}

		if (count > mostCount) {
			// 最後に数えていた数がこれまでの数より大きい場合は１番濃いマス目の数を更新
			mostCount = count;
		}

		return mostCount;
	}

}