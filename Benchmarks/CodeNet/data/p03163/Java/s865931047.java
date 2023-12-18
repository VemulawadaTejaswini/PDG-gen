
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().solve();

	}

	private long[][] arrayItem;
	private long[][] arrayMemo;
	private int itemNum = 0;
	private int weightTotalNum = 0;

	private void solve() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			itemNum = scanner.nextInt();
			weightTotalNum = scanner.nextInt();

			arrayItem = new long[itemNum][2];
			arrayMemo = new long[itemNum + 1][weightTotalNum + 1];
			for (int i = 0; i < arrayItem.length; i++) {
				arrayItem[i][0] = scanner.nextInt();
				arrayItem[i][1] = scanner.nextInt();
			}

			for (int i = itemNum - 1; i >= 0; i--) {
				for (int j = 0; j <= weightTotalNum; j++) {
					if (j < arrayItem[i][0]) {
						arrayMemo[i][j] = arrayMemo[i + 1][j];
					} else {
						arrayMemo[i][j] = Math.max(arrayMemo[i + 1][j],
								arrayMemo[i + 1][j - (int) arrayItem[i][0]] + (int) arrayItem[i][1]);
					}
				}

			}
			//			for (int i = 0; i < arrayMemo.length; i++) {
			//				StringBuilder builder = new StringBuilder();
			//				builder.append(i + ": ");
			//				for (int j = 0; j <= weightTotalNum; j++) {
			//					builder.append(" ");
			//					builder.append(arrayMemo[i][j]);
			//					builder.append(" ");
			//				}
			//				System.out.println(builder.toString());
			//			}
			System.out.println(arrayMemo[0][weightTotalNum]);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}