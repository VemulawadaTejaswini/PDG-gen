
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveB2();
		new Main().solveC();
		//		new Main().solveC2();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int a = 0;
		int b = 0;
		int c = 0;

		try {
			scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();

			if (c <= (a + b)) {
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

	private void solveC() {

		try (final Scanner scanner = new Scanner(System.in)) {
			final int n = scanner.nextInt();

			int[][] ab = IntStream.range(0, n).collect(() -> new int[n][2],
					(t, i) -> {
						t[i][0] = scanner.nextInt();
						t[i][1] = scanner.nextInt();
					}, (t, u) -> {
						Stream.concat(Arrays.stream(t), Arrays.stream(u));
					});

			Arrays.sort(ab, new SortComparatorC2());

			int[][] cd = IntStream.range(0, n).collect(() -> new int[n][2],
					(t, i) -> {
						t[i][0] = scanner.nextInt();
						t[i][1] = scanner.nextInt();
					}, (t, u) -> {
						Stream.concat(Arrays.stream(t), Arrays.stream(u));
					});

			Arrays.sort(cd, new SortComparatorC2());

			int[] memo = new int[n];

			int res = 0;
			for (int j = 0; j < cd.length; j++) {
				int bX = cd[j][0];
				int bY = cd[j][1];
				for (int k = 0; k < ab.length; k++) {
					int rX = ab[k][0];
					int rY = ab[k][1];
					if (bX > rX && bY > rY && memo[k] != 1) {
						memo[k] = 1;
						res++;
												System.out.println(bX + ":" + bY + ":" + rX + ":" + rY);
						break;
					}
				}
			}

			System.out.println(res);

		}

	}

	/*
	 * int[][]
	 * int[][0]が小さいのが先(xが小さいのが先)
	 * int[][1]が大きいのが先(yが大きいのが先)
	 */
	private static class SortComparatorC2 implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			if (o1[0] < o2[0]) {
				return -1;
			} else if (o1[0] > o2[0]) {
				return 1;
			} else {
				if (o1[1] < o2[1]) {
					return 1;
				} else if (o1[1] > o2[1]) {
					return -1;
				} else {
					return 0;
				}
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