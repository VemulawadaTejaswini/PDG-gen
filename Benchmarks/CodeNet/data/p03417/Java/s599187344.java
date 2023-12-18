
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveC2();

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

		revertCard(cardNumN, cardNumM);

		if (cardNumN - 1 >= 0) {
			revertCard(cardNumN - 1, cardNumM);
		}
		if (cardNumN - 1 >= 0 && cardNumM + 1 < numM) {
			revertCard(cardNumN - 1, cardNumM + 1);
		}
		if (cardNumM + 1 < numM) {
			revertCard(cardNumN, cardNumM + 1);
		}
		if (cardNumN + 1 < numN && cardNumM + 1 < numM) {
			revertCard(cardNumN + 1, cardNumM + 1);
		}
		if (cardNumN + 1 < numN) {
			revertCard(cardNumN + 1, cardNumM);
		}
		if (cardNumN + 1 < numN && cardNumM - 1 >= 0) {
			revertCard(cardNumN + 1, cardNumM - 1);
		}
		if (cardNumM - 1 >= 0) {
			revertCard(cardNumN, cardNumM - 1);
		}
		if (cardNumN - 1 >= 0 && cardNumM - 1 >= 0) {
			revertCard(cardNumN - 1, cardNumM - 1);
		}

	}

	private void revertCard(int cardNumN, int cardNumM) {

		long wk = masu.get(cardNumN).get(cardNumM) * -1;
		masu.get(cardNumN).set(cardNumM, wk);
	}

	private List<List<Long>> masu;
	private int numN = 0;
	private int numM = 0;

	private void solveC() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			masu = new ArrayList<List<Long>>();

			for (int i = 0; i < numN; i++) {
				List<Long> wkList = new ArrayList<Long>();
				for (int j = 0; j < numM; j++) {
					wkList.add((long) -1);
				}
				masu.add(wkList);
			}

			for (int i = 0; i < numN; i++) {
				for (int j = 0; j < numM; j++) {
					returnCard(i, j);
				}
			}
			int result = 0;
			for (int i = 0; i < numN; i++) {
				for (int j = 0; j < numM; j++) {
					if (masu.get(i).get(j) == 1) {
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

	private void solveC2() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();

			if (numN == 1 && numM == 1) {
				System.out.println(1);
			} else if (numN == 1 && numM > 1) {
				int wkEdge = 2;
				long wkNaka = numM - wkEdge;
				System.out.println(wkNaka);
			} else {
				long wkNaka = (numN - 2) * (numM - 2);
				System.out.println(wkNaka);
			}

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