import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

	// 入力なしを表す定数
	private static int NO_INPUT = -1;
	// 空席を表す定数
	private static int EMPTY = -1;

	// アクション定義
	private static enum Action {
		IN, OUT
	};

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {

			int target = readNumber(reader);
			// 入力がない場合は終了
			if (target == NO_INPUT) {
				return;
			}

			// 初期化
			int[] table = { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
					EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
					EMPTY, EMPTY };

			// 対象グループまで来店イベントを登録しておく
			Map<Integer, List<Event>> eventMap = new HashMap<Integer, List<Event>>();
			for (int i = 0; i <= target; i++) {
				List<Event> e = new ArrayList<Event>();
				e.add(new Event(i, Action.IN));
				eventMap.put(i * 5, e);
			}

			// 待ち行列を用意する
			List<Wait> waitList = new ArrayList<Wait>();

			// 1秒ごとにシミュレーションを進める
			int waitTime = 0;
			for (int i = 0;; i++) {

				// イベントも待ち行列もなくなったら終了
				if (eventMap.isEmpty() && waitList.isEmpty()) {
					break;
				}

				// イベントチェック
				if (eventMap.containsKey(i)) {

					List<Event> eventList = eventMap.get(i);
					eventMap.remove(i);

					// 入店処理
					for (Event e : eventList) {

						if (e.action == Action.IN) {

							// 入れるかどうかチェック
							int count = ((e.group) % 5 == 1) ? 5 : 2;
							int index = getEmptyIndex(table, count);

							if (index == NO_INPUT || !waitList.isEmpty()) {
								// 空席がない場合は待ち行列に追加する
								Wait wait = new Wait(e.group, i);
								waitList.add(wait);

							} else {
								// 空席がある場合は着席し帰宅イベントを登録する
								for (int j = 0; j < count; j++) {
									table[index + j] = e.group;
								}
								int outTime = i + 17 * (e.group % 2) + 3
										* (e.group % 3) + 19;
								Event event = new Event(e.group, Action.OUT);
								List<Event> eList = eventMap.get(outTime);
								if (eList == null) {
									eList = new ArrayList<Event>();
									eventMap.put(outTime, eList);
								}
								eList.add(event);
							}
						}
					}

					// 出店処理
					for (Event e : eventList) {
						if (e.action == Action.OUT) {
							for (int j = 0; j < table.length; j++) {
								if (table[j] == e.group) {
									table[j] = EMPTY;
								}
							}
						}
					}

				}

				// 待ち行列が入店できるかチェックする
				List<Wait> deleteList = new ArrayList<Wait>();
				for (Wait w : waitList) {
					int count = ((w.group) % 5 == 1) ? 5 : 2;
					int index = getEmptyIndex(table, count);

					if (index == NO_INPUT) {
						// 空きがなくなったらその時点で終了
						break;

					} else {
						// 空席がある場合は着席し帰宅イベントを登録する
						for (int j = 0; j < count; j++) {
							table[index + j] = w.group;
						}
						int outTime = i + 17 * (w.group % 2) + 3
								* (w.group % 3) + 19;
						Event event = new Event(w.group, Action.OUT);
						List<Event> eList = eventMap.get(outTime);
						if (eList == null) {
							eList = new ArrayList<Event>();
							eventMap.put(outTime, eList);
						}
						eList.add(event);

						// 待ち行列から削除する
						deleteList.add(w);

						// 調査対象のグループの場合は待ち時間を記録する
						if (w.group == target) {
							waitTime = i - w.start;
						}
					}
				}
				for (Wait w : deleteList){
					waitList.remove(w);
				}

				// デバッグ
				/*
				System.out.print(i + ": ");
				for (int j = 0; j < table.length; j++) {
					System.out.print(table[j] + " ");
				}
				System.out.println();
				System.out
						.println("Event: " + eventMap + ", Wait: " + waitList);
						*/

			}

			// 結果を出力する
			System.out.println(waitTime);
		}

	}

	/**
	 * ストリームから1行読み込んで、数値として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 数値
	 */
	private static int readNumber(BufferedReader reader) {
		int result = 0;
		try {
			String line = reader.readLine();
			if (line == null || line.isEmpty()) {
				return NO_INPUT;
			}
			result = Integer.parseInt(line);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}

	/**
	 * 空席の開始インデックスを取得する。
	 *
	 * @param table
	 *            テーブル
	 * @param count
	 *            人数
	 * @return 空席があればそのインデックス、なければNO_INPUTを返す
	 */
	private static int getEmptyIndex(int[] table, int count) {
		int c = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] == EMPTY) {
				c++;
				if (c >= count) {
					return i - count + 1;
				}
			} else {
				c = 0;
			}
		}
		return NO_INPUT;
	}

	private static class Event {
		public int group;
		public Action action;

		public Event(int group, Action action) {
			this.group = group;
			this.action = action;
		}

		@Override
		public String toString() {
			return "group=" + group + ", action=" + action;
		}

	}

	private static class Wait {
		public int group;
		public int start;

		public Wait(int group, int start) {
			this.group = group;
			this.start = start;
		}

		@Override
		public String toString() {
			return "group=" + group + ", start=" + start;
		}
	}

}