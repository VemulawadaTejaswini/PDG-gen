
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();

		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;

		String[] wkArray = new String[3];

		try {
			StringBuffer buff = new StringBuffer();
			scanner = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				wkArray[i] = scanner.next();
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j) {
						buff.append((wkArray[i].toCharArray())[j]);
					}
				}
			}

			System.out.println(buff.toString());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;

		int startNum = 0;
		int endNum = 0;

		try {
			scanner = new Scanner(System.in);
			startNum = scanner.nextInt();
			endNum = scanner.nextInt();

			int count = 0;
			for (int i = startNum; i <= endNum; i++) {
				char[] num = Integer.toString(i).toCharArray();
				if (num[0] == num[4] && num[1] == num[3]) {
					count++;
				}
			}

			System.out.println(count);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void returnCard(int cardNumN, int cardNumM) {

		masu[cardNumN][cardNumM] *= -1;

		if (cardNumN - 1 >= 0) {
			masu[cardNumN - 1][cardNumM] *= -1;
		}
		if (cardNumN - 1 >= 0 && cardNumM + 1 < numM) {
			masu[cardNumN - 1][cardNumM + 1] *= -1;
		}
		if (cardNumM + 1 < numM) {
			masu[cardNumN][cardNumM + 1] *= -1;
		}
		if (cardNumN + 1 < numN && cardNumM + 1 < numM) {
			masu[cardNumN + 1][cardNumM + 1] *= -1;
		}
		if (cardNumN + 1 < numN) {
			masu[cardNumN + 1][cardNumM] *= -1;
		}
		if (cardNumN + 1 < numN && cardNumM - 1 >= 0) {
			masu[cardNumN + 1][cardNumM - 1] *= -1;
		}
		if (cardNumM - 1 >= 0) {
			masu[cardNumN][cardNumM - 1] *= -1;
		}
		if (cardNumN - 1 >= 0 && cardNumM - 1 >= 0) {
			masu[cardNumN - 1][cardNumM - 1] *= -1;
		}

	}

	private long[][] masu;
	private int numN = 0;
	private int numM = 0;

	private void solveC() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			masu = new long[numN][numM];

			for (int i = 0; i < masu.length; i++) {
				Arrays.fill(masu[i], -1);
			}

			for (int i = 0; i < numN; i++) {
				for (int j = 0; j < numM; j++) {
					returnCard(i, j);
				}
			}
			int result = 0;
			for (int i = 0; i < numN; i++) {
				for (int j = 0; j < numM; j++) {
					if (masu[i][j] == 1) {
						result++;
					}
				}
			}

			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}