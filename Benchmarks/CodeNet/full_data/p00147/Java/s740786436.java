import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	/** 対象外 */
	private static final int EXEMPT = -1;

	/** グループ数 */
	private static final int GROUP_NUM = 100;

	/** 座席数 */
	private static final int SEAT_NUM = 17;

	/** 標準入力 */
	private static BufferedReader br;

	/** 着席可能の最初の座席番号 */
	private static int firstSeatNum;

	/** 待ち時間 */
	private static int[] waitMinutes;

	/** 座席 */
	private static String[] seats;

	/** 初期化 */
	static {

		br = new BufferedReader(new InputStreamReader(System.in));
		waitMinutes = new int[GROUP_NUM];
		seats = new String[SEAT_NUM];

		// 待ち時間を作成
		calcuWaitMinutes();

	}

	/** メイン */
	public static void main(String[] args) throws IOException {
		String line;
		List<Integer> inputList = new ArrayList<Integer>();

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			inputList.add(Integer.parseInt(line));
		}
		for (int input : inputList) {
			System.out.println(waitMinutes[input]);
		}

	}

	/** グループの人数を取得する */
	private static int getCustomerNum(int i) {
		return i % 5 == 1 ? 5 : 2;
	}

	/** グループの到着時間を取得する */
	private static int getArrivedMinutes(int i) {
		return 5 * i;
	}

	/** グループの食事時間を取得する */
	private static int getMealMinutes(int i) {
		return SEAT_NUM * (i % 2) + 3 * (i % 3) + 19;
	}

	/** 待ち時間を作成する */
	private static void calcuWaitMinutes() {
		// 順番
		int groupOrder;

		// 行列リスト
		List<Integer> waitList = new ArrayList<Integer>();

		// 行列排除リスト
		List<Integer> removeList = new ArrayList<Integer>();

		for (int currentMinutes = 0, totalGroupNum = 0; totalGroupNum < GROUP_NUM; currentMinutes++) {
			// 行列が終了するまで、一分毎に繰り返す

			// 食事の時間が終了した客を離席させる
			outCustomer(currentMinutes);

			if ((groupOrder = arrivedCustomer(currentMinutes)) != EXEMPT) {
				// 到着時間の場合

				if (waitList.isEmpty()) {
					// 行列がない場合

					if (isEmpty(groupOrder)) {
						// 着席可能の場合

						// 座席に着席させる
						setSeat(Integer.toString(groupOrder));

						totalGroupNum++;

					} else {
						// 着席不可の場合

						// 行列に並ばせる
						waitList.add(groupOrder);
					}

				} else {
					// 行列がある場合

					// 行列に並ばせる
					waitList.add(groupOrder);
				}
			}

			if (!waitList.isEmpty()) {
				// 行列がある場合

				// 行列番号
				int i = 0;

				for (int wait : waitList) {
					// 行列リスト分、繰り返す

					if (isEmpty(wait)) {
						// 着席可能の場合

						// 座席に着席させる
						setSeat(Integer.toString(wait));

						totalGroupNum++;

						// 待った時間を設定する
						waitMinutes[wait] = currentMinutes
								- getArrivedMinutes(wait);

						// 着席したグループを行列排除リストに追加する
						removeList.add(i);

					} else {
						// 着席不可の場合

						// 行列の先頭が着席できないため、残りの行列も着席不可にする。
						break;
					}
					i++;
				}
			}

			if (!removeList.isEmpty()) {
				// 行列排除リストに着席したグループが追加されていた場合

				// リストの降順でソートする（リムーブするため）
				Collections.reverse(removeList);

				for (int remove : removeList) {
					// 行列排除リスト分、繰り返す

					// 行列リストから行列排除リストの番号を削除する
					waitList.remove(remove);
				}

				// 初期化
				removeList = new ArrayList<Integer>();
			}
		}
	}

	/** 現在時間に到着するグループ番号を検索し返す */
	private static int arrivedCustomer(int currentMinutes) {
		for (int i = 0; i < GROUP_NUM; i++) {
			if (getArrivedMinutes(i) == currentMinutes) {
				return i;
			}
		}
		return EXEMPT;
	}

	/** 離席させる */
	private static void outCustomer(int currentMinutes) {

		// 席番
		int seatNum = 0;

		for (String seat : seats) {
			// 座席数分繰り返す

			if (seat == null) {
				// 空席の場合
				seatNum++;
				continue;
			}

			if (finishedMeal(currentMinutes, seat)) {
				// 食事の時間が終了した場合

				// 空席にする
				seats[seatNum] = null;
			}
			seatNum++;
		}

	}

	/** 着席させる */
	private static void setSeat(String groupOrder) {

		for (int count = 0; count < getCustomerNum(Integer.parseInt(groupOrder)); count++) {
			// 着席する人数分繰り返す

			// 座席にグループ番号を設定する
			seats[firstSeatNum++] = groupOrder;
		}
	}

	/** 引数のグループ番号の客数分、空席の場合、trueを返す */
	private static boolean isEmpty(int groupOrder) {

		// 空席数
		int emptyseatsNum = 0;

		// 座席番号
		int seatOrder = 0;

		for (; seatOrder < SEAT_NUM
				|| getCustomerNum(groupOrder) <= SEAT_NUM - seatOrder; seatOrder++) {
			// 残座席数が客の数以下になるまで座席数分繰り返す

			if (emptyseatsNum == getCustomerNum(groupOrder)) {
				// 連続した空席が客の数だけあった場合

				break;

			}

			if (seats[seatOrder] == null) {
				// 空席かつ繰り返す席が顧客数分以上存在する場合

				emptyseatsNum++;

				continue;

			} else {
				// 空席でない場合

				// 空席数を初期化
				emptyseatsNum = 0;
			}
		}
		if (emptyseatsNum == getCustomerNum(groupOrder)) {
			// 空席の最初の座席番号を設定する
			firstSeatNum = seatOrder - emptyseatsNum;

			return true;
		}

		return false;
	}

	/** 食事の時間が終了した席の場合、trueを返す */
	private static boolean finishedMeal(int currentMinutes, String seat) {
		return currentMinutes
				- (getArrivedMinutes(Integer.parseInt(seat)) + waitMinutes[Integer
						.parseInt(seat)]) >= getMealMinutes(Integer
					.parseInt(seat));
	}
}