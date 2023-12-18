
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solveA();
		// new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;
		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			Map<Integer, Integer> evenMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> oddMap = new HashMap<Integer, Integer>();

			for (int i = 0; i < numN; i++) {
				int wkNum = scanner.nextInt();
				if (i % 2 == 0) {
					if (!evenMap.containsKey(wkNum)) {
						evenMap.put(wkNum, 0);
					}
					int res = evenMap.get(wkNum);
					res++;
					evenMap.put(wkNum, res);
				} else {
					if (!oddMap.containsKey(wkNum)) {
						oddMap.put(wkNum, 0);
					}
					int res = oddMap.get(wkNum);
					res++;
					oddMap.put(wkNum, res);
				}
			}

			List<int[]> wkListEvevnKey = new ArrayList<int[]>();

			for (Iterator<Integer> iterator = evenMap.keySet().iterator(); iterator.hasNext();) {
				Integer key = iterator.next();
				wkListEvevnKey.add(new int[] { key, evenMap.get(key) });
			}
			Collections.sort(wkListEvevnKey, new IntComparatorForList());

			List<int[]> wkLisOddKey = new ArrayList<int[]>();

			for (Iterator<Integer> iterator = oddMap.keySet().iterator(); iterator.hasNext();) {
				Integer key = iterator.next();
				wkLisOddKey.add(new int[] { key, oddMap.get(key) });
			}
			Collections.sort(wkLisOddKey, new IntComparatorForList());

			int evenMax = 0;
			int evenMaxMinus1 = 0;
			for (int i = 0; i < wkListEvevnKey.size(); i++) {
				if (i == 0) {
					evenMaxMinus1 += wkListEvevnKey.get(i)[1];
				} else if (i == 1) {
					evenMax += wkListEvevnKey.get(i)[1];
				} else {
					evenMax += wkListEvevnKey.get(i)[1];
					evenMaxMinus1 += wkListEvevnKey.get(i)[1];
				}
			}

			int oddMax = 0;
			int oddMaxMinus1 = 0;
			for (int i = 0; i < wkLisOddKey.size(); i++) {
				if (i == 0) {
					oddMaxMinus1 += wkLisOddKey.get(i)[1];
				} else if (i == 1) {
					oddMax += wkLisOddKey.get(i)[1];
				} else {
					oddMax += wkLisOddKey.get(i)[1];
					oddMaxMinus1 += wkLisOddKey.get(i)[1];
				}
			}

			if (evenMap.size() == 1 && oddMap.size() == 1) {
				if (wkListEvevnKey.get(0)[0] == wkLisOddKey.get(0)[0]) {
					System.out.println(wkLisOddKey.get(0)[1]);
				} else {
					System.out.println(0);
				}
			} else {
				if (wkListEvevnKey.get(0)[0] == wkLisOddKey.get(0)[0]) {
					System.out.println(Math.min(oddMax + evenMaxMinus1, evenMax + oddMaxMinus1));
				} else {
					System.out.println(oddMax + evenMax);
				}
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static class IntComparatorForList implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			if (o1[1] > o2[1]) {
				return -1;
			} else if (o1[1] < o2[1]) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	private void solveB() {
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

	private void solveC() {
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