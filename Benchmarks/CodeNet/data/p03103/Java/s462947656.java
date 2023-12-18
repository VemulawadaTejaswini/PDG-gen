
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numH = 0;
		int numW = 0;
		int h = 0;
		int w = 0;

		try {
			scanner = new Scanner(System.in);
			numH = scanner.nextInt();
			numW = scanner.nextInt();
			h = scanner.nextInt();
			w = scanner.nextInt();

			int total = numH * numW;
			int col = h * numW;
			int row = w * (numH - h);
			System.out.println(total - col - row);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;
		int numC = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			numC = scanner.nextInt();
			int[] bArray = new int[numM];
			int[][] aArray = new int[numN][numM];

			for (int i = 0; i < bArray.length; i++) {
				bArray[i] = scanner.nextInt();

			}
			for (int i = 0; i < aArray.length; i++) {
				for (int j = 0; j < aArray[i].length; j++) {
					aArray[i][j] = scanner.nextInt();
				}
			}
			int cnt = 0;

			for (int i = 0; i < aArray.length; i++) {
				int res = 0;
				for (int j = 0; j < aArray[i].length; j++) {
					res += (aArray[i][j] * bArray[j]);
				}
				if (res + numC > 0) {
					cnt++;
				}
			}

			System.out.println(cnt);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();

			long[] aArra = new long[numN];
			long[] bArra = new long[numN];

			Map<Long, Long> shopmap = new TreeMap<Long, Long>();

			for (int i = 0; i < numN; i++) {
				aArra[i] = scanner.nextInt();
				bArra[i] = scanner.nextInt();
				shopmap.put(aArra[i], bArra[i]);
			}
			int resNumM = numM;
			long res = 0;
			for (Entry<Long, Long> entry : shopmap.entrySet()) {
				if (resNumM == 0) {
					break;
				}
				long key = entry.getKey();
				long value = entry.getValue();
				if (resNumM >= value) {
					res += key * value;
					resNumM -= value;
				} else {
					res += (key * resNumM);
					resNumM = 0;
				}

			}
			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}