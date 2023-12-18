public class Example05 {

	public static void main(String[] args) {

		// 画面の初期値
		int x = Integer.parseInt(args[0]);
		// 目標の画面の値
		int y = Integer.parseInt(args[1]);

		// ボタン最小押下回数
		long count = 1;

		// [x]と[y]の絶対値が同一の場合は何もしない
		if (Math.abs(x) != Math.abs(y)) {

			// 変数x,yがどちらも0以上
			if (x >= 0 && y >= 0) {
				if (x < y) {
					count = y - x;
				} else {
					count = x + y + 1;
				}
			} else if (x < 0 && y >= 0) {
				// 変数xが負数で変数yが0以上
				if (Math.abs(x) < y) {
					count = y - Math.abs(x) + 1;
				} else {
					count = Math.abs(x) - y + 1;
				}
			} else if (x >= 0 && y < 0) {
				// 変数xが0以上で変数yが負数
				if (x < Math.abs(y)) {
					count = Math.abs(y) - x + 1;
				} else {
					count = x - Math.abs(y) + 1;
				}
			} else {
				// 変数x,yがどちらも負数
				if (Math.abs(x) < Math.abs(y)) {
					count = Math.abs(y) - Math.abs(x) + 2;
				} else {
					count = Math.abs(x) - Math.abs(y);
				}
			}
		} else {
			;// do nothing
		}

		// ボタン最小押下回数出力
		System.out.println(count);
	}

}