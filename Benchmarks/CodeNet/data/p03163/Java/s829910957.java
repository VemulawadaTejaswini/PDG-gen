
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveC2();

	}

	private long[][] arrayItem;
	private long[][] arrayMemo;
	private int itemNum = 0;
	private int weightTotalNum = 0;

	private long getSolveC(int currentI, long currenttWeight) {

		if (arrayMemo[currentI][(int) currenttWeight] != Integer.MIN_VALUE) {
			return arrayMemo[currentI][(int) currenttWeight];
		}

		long res = 0;
		if (currentI == itemNum) {
			return 0;
		} else if (arrayItem[currentI][0] > currenttWeight) {
			res = getSolveC(currentI + 1, currenttWeight);
		} else {
			long val1 = getSolveC(currentI + 1, currenttWeight);
			long val2 = getSolveC(currentI + 1, currenttWeight - arrayItem[currentI][0]) + arrayItem[currentI][1];
			res = Math.max(val1, val2);
		}
		arrayMemo[currentI][(int) currenttWeight] = res;
		return res;
	}

	private void solveC() {
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

			System.out.println(getSolveC(0, weightTotalNum));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveA() {
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

			//			for (int i = 0; i < arrayMemo.length; i++) {
			//				Arrays.fill(arrayMemo[i], 0);
			//			}

			for (int i = itemNum - 1; i >= 0; i--) {
				for (int j = 0; j <= weightTotalNum; j++) {
					if (j < arrayItem[i][1]) {
						arrayMemo[i][j] = arrayMemo[i + 1][j];
					} else {
						arrayMemo[i][j] = Math.max(arrayMemo[i + 1][j],
								arrayMemo[i + 1][j - (int) arrayItem[i][0]] + (int) arrayItem[i][1]);
					}
				}

			}
			for (int i = 0; i < arrayMemo.length; i++) {
				StringBuilder builder = new StringBuilder();
				builder.append(i + ": ");
				for (int j = 0; j <= weightTotalNum; j++) {
					builder.append(" ");
					builder.append(arrayMemo[i][j]);
					builder.append(" ");
				}
				System.out.println(builder.toString());
			}
			System.out.println(arrayMemo[0][weightTotalNum]);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private long getValue(int currentI, int remainWeight) {

		long result = 0;

		if (currentI == itemNum) {
			result = 0;
		} else if (arrayMemo[currentI][(int) remainWeight] != Integer.MIN_VALUE) {
			result = arrayMemo[currentI][(int) remainWeight];
		} else if (remainWeight < arrayItem[currentI][0]) {
			result = getValue(currentI + 1, remainWeight);
		} else {
			long kati1 = getValue(currentI + 1, (int) (remainWeight - arrayItem[currentI][0])) + arrayItem[currentI][1];
			long kati2 = getValue(currentI + 1, remainWeight);
			arrayMemo[currentI][remainWeight] = Math.max(kati1, kati2);
			result = arrayMemo[currentI][remainWeight];
		}
		return result;
	}

	private void solveB() {
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

	private long getSolveC2(int currentI, long currentWeight) {

		if (currentI == itemNum) {
			return 0;
		}
		long res = 0;
		if (arrayItem[currentI][0] > currentWeight) {
			res = getSolveC2(currentI + 1, currentWeight);
		} else {
			long val1 = getSolveC2(currentI + 1, currentWeight);
			long val2 = getSolveC2(currentI + 1, currentWeight - arrayItem[currentI][0]) + arrayItem[currentI][1];
			res = Math.max(val1, val2);
		}

		arrayMemo[currentI][(int) currentWeight] = res;
		return res;

	}

	private void solveC2() {
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

			System.out.println(getSolveC2(0, weightTotalNum));
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}