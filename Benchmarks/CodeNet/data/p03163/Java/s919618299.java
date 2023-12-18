
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new SaikiMain2().solve();

	}

	private long getValue(int currentI, int currentWeight) {
		if (arrayMemo[currentI][currentWeight] != Integer.MIN_VALUE) {
			return arrayMemo[currentI][currentWeight];
		}
		long res = 0;
		if (currentI >= itemNum) {
			res = 0;
		} else if (currentWeight < arrayItem[currentI][0]) {
			res = getValue(currentI + 1, currentWeight);
		} else {
			res = Math.max(
					getValue(currentI + 1, currentWeight - (int) arrayItem[currentI][0]) + arrayItem[currentI][1],
					getValue(currentI + 1, currentWeight));
		}
		arrayMemo[currentI][currentWeight] = res;
		return res;
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

			for (int i = 0; i < arrayMemo.length; i++) {
				Arrays.fill(arrayMemo[i], Integer.MIN_VALUE);
			}

			System.out.println(getValue(0, weightTotalNum));
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}