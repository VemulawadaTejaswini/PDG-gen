
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveB2();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();
			lineCA = scanner.nextInt();

			if (lineCA <= (lineAB + lineBC)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int n = 0;
		int m = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			Map<String, Integer> nArray = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String key = scanner.next();
				if (!nArray.containsKey(key)) {
					nArray.put(key, 1);
				} else {
					int count = nArray.get(key);
					nArray.put(key, ++count);
				}
			}

			m = scanner.nextInt();

			for (int i = 0; i < m; i++) {
				String key = scanner.next();
				if (nArray.containsKey(key)) {
					int count = nArray.get(key);
					nArray.put(key, --count);
				}
			}

			int maxCount = 0;
			for (Iterator<Integer> iterator = nArray.values().iterator(); iterator.hasNext();) {
				maxCount = Math.max(maxCount, iterator.next());
			}

			System.out.println(maxCount);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB2() {
		Scanner scanner = null;
		int n = 0;
		int m = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			String[] nArray = new String[n];
			for (int i = 0; i < nArray.length; i++) {
				nArray[i] = scanner.next();
			}

			m = scanner.nextInt();

			String[] mArray = new String[m];
			for (int i = 0; i < mArray.length; i++) {
				mArray[i] = scanner.next();
			}

			int result = 0;
			for (int i = 0; i < n; i++) {
				int wkRes = 0;
				for (int j = 0; j < n; j++) {
					if (nArray[i].equals(nArray[j])) {
						wkRes++;
					}
				}

				for (int j = 0; j < m; j++) {
					if (nArray[i].equals(mArray[j])) {
						wkRes--;
					}
				}
				result = Math.max(wkRes, result);

			}

			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int[] getPare(int[] source, int[][] target) {

		//		if (pairList.containsKey(source[0] + ":" + source[1])) {
		//			return pairList.get(source[0] + ":" + source[1]);
		//		}

		int[] res = new int[2];
		res[0] = -1;
		res[1] = -1;
		int x = source[0];
		int y = source[1];
		for (int i = 0; i < target.length; i++) {
			if (target[i][0] > x && target[i][1] > y) {
				boolean isMatch = false;
				for (Iterator<int[]> iterator = pairList.values().iterator(); iterator.hasNext() && !isMatch;) {
					int[] wk = iterator.next();
					if (target[i][0] == wk[0] && target[i][1] == wk[1]) {
						isMatch = true;
					}
				}

				if (isMatch) {
					continue;
				}
				res[0] = target[i][0];
				res[1] = target[i][1];
				pairList.put(res[0] + ":" + res[1], res);
				break;
			}
		}
		return res;
	}

	private Map<String, int[]> pairList = new HashMap<String, int[]>();

	private void solveC() {
		Scanner scanner = null;
		int n = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			int[][] ab = new int[n][2];
			for (int i = 0; i < n; i++) {
				ab[i][0] = scanner.nextInt();
				ab[i][1] = scanner.nextInt();
			}

			int[][] cd = new int[n][2];
			for (int i = 0; i < n; i++) {
				cd[i][0] = scanner.nextInt();
				cd[i][1] = scanner.nextInt();
			}

			for (int i = 0; i < n; i++) {
				getPare(ab[i], cd);
			}

			System.out.println(pairList.size());

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