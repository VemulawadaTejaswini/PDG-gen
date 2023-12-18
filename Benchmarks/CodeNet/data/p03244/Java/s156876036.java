
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();

			String res = line.chars()
					.mapToObj(c -> {
						switch ((char) c) {
						case '1':
							return String.valueOf('9');
						case '9':
							return String.valueOf('1');
						default:
							return String.valueOf(c);
						}
					}).collect(Collectors.joining());

			System.out.println(res);

			//			char[] wkArray = line.toCharArray();
			//			StringBuffer buf = new StringBuffer();
			//			for (int i = 0; i < wkArray.length; i++) {
			//				switch (wkArray[i]) {
			//				case '1':
			//					buf.append(9);
			//					break;
			//				case '9':
			//					buf.append(1);
			//					break;
			//				default:
			//					buf.append(wkArray[i]);
			//					break;
			//				}
			//
			//			}
			//
			//			System.out.println(buf.toString());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();
			int start = Integer.parseInt(line);

			for (int outer = start; outer <= 999; outer++) {
				char[] wkArray = Integer.toString(outer).toCharArray();

				if (wkArray[0] == wkArray[1] && wkArray[1] == wkArray[2]) {
					System.out.println(outer);
					return;
				}
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {

		int num = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			num = scanner.nextInt();

			int[] wk = IntStream.range(0, num).map(i -> scanner.nextInt()).toArray();

			Map<Integer, Integer> wkMapEven = new HashMap<Integer, Integer>();
			Map<Integer, Integer> wkMapOdd = new HashMap<Integer, Integer>();
			for (int i = 0; i < num; i++) {
				int val = wk[i];
				if (i % 2 == 0) {
					wkMapEven.merge(val, 1, (oldV, newV) -> oldV + newV);
				} else {
					wkMapOdd.merge(val, 1, (oldV, newV) -> oldV + newV);
				}
			}

			int cnt = 0;
			long[][] resEven = new long[wkMapEven.size()][2];
			for (Entry<Integer, Integer> entry : wkMapEven.entrySet()) {
				resEven[cnt][0] = entry.getKey();
				resEven[cnt][1] = entry.getValue();
				cnt++;
			}

			Arrays.sort(resEven, (x, y) -> {
				if (x[1] < y[1]) {
					return -1;
				} else if (x[1] > y[1]) {
					return 1;
				} else {
					if (x[0] < y[0]) {
						return -1;
					} else if (x[0] > y[0]) {
						return 1;
					} else {
						return 0;
					}
				}
			});

			cnt = 0;
			long[][] resOdd = new long[wkMapOdd.size()][2];
			for (Entry<Integer, Integer> entry : wkMapOdd.entrySet()) {
				resOdd[cnt][0] = entry.getKey();
				resOdd[cnt][1] = entry.getValue();
				cnt++;
			}

			Arrays.sort(resOdd, (x, y) -> {
				if (x[1] < y[1]) {
					return -1;
				} else if (x[1] > y[1]) {
					return 1;
				} else {
					if (x[0] < y[0]) {
						return -1;
					} else if (x[0] > y[0]) {
						return 1;
					} else {
						return 0;
					}
				}
			});

			long sum = 0;
			long maxEven = resEven[resEven.length - 1][0];
			long maxEvenVal = resEven[resEven.length - 1][1];
			long maxOdd = resOdd[resOdd.length - 1][0];
			long maxOddVal = resOdd[resOdd.length - 1][1];
			long even = Arrays.stream(resEven).mapToLong(i -> i[1]).sum();
			long odd = Arrays.stream(resOdd).mapToLong(i -> i[1]).sum();
			if (maxEven != maxOdd) {
				sum = (even - maxEvenVal) + (odd - maxOddVal);
			} else {
				long maxEven2Val = 0;
				if (resEven.length != 1) {
					maxEven2Val = resEven[resEven.length - 2][1];
				}

				long maxOdd2Val = 0;
				if (resOdd.length != 1) {
					maxOdd2Val = resOdd[resOdd.length - 2][1];
				}

				long val1 = (even - maxEvenVal) + (odd - maxOdd2Val);
				long val2 = (even - maxEven2Val) + (odd - maxOddVal);
				sum = Math.min(val1, val2);

			}
			System.out.println(sum);
		}
	}

	/**
	 * 解けていない
	 */
	private void solveC2() {
		Scanner scanner = null;
		int num = 0;

		try {
			scanner = new Scanner(System.in);
			num = scanner.nextInt();

			Map<Integer, Integer> wkMapEven = new HashMap<Integer, Integer>();
			Map<Integer, Integer> wkMapOdd = new HashMap<Integer, Integer>();
			for (int i = 0; i < num; i++) {
				int wk = scanner.nextInt();
				if (i % 2 == 0) {
					putNum(wkMapEven, wk);
				} else {
					putNum(wkMapOdd, wk);
				}
			}

			int wkEvenKey = getMaxKey(wkMapEven);
			int wkOddKey = getMaxKey(wkMapOdd);
			int totalCountNotMax = getTotal(wkMapEven, wkEvenKey);
			int totalCountNotMax2 = getTotal(wkMapOdd, wkOddKey);
			if (wkEvenKey == wkOddKey && wkMapEven.size() == 1 && wkMapOdd.size() == 1) {
				for (Iterator<Integer> iterator = wkMapEven.values().iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}

			} else if (wkMapEven.size() == 1 && wkMapOdd.size() == 1) {
				System.out.println(0);
			} else if (wkEvenKey != wkOddKey) {
				System.out.println(totalCountNotMax + totalCountNotMax2);
			} else if (wkEvenKey == wkOddKey) {

				int totalCountSecond = getSecondTotal(wkMapEven);
				int totalCountSecond2 = getSecondTotal(wkMapOdd);

				System.out
						.println(Math.min(totalCountNotMax + totalCountSecond, totalCountNotMax2 + totalCountSecond2));

			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int getSecondTotal(Map<Integer, Integer> wkMap) {
		List<Integer> wkList = new ArrayList<Integer>();

		for (Iterator<Integer> iterator = wkMap.values().iterator(); iterator.hasNext();) {
			wkList.add(iterator.next());
		}

		Collections.sort(wkList);
		int maxCount = 0;
		for (int i = 0; i < wkList.size() - 1; i++) {
			maxCount += wkList.get(i);
		}
		return maxCount;
	}

	private int getTotal(Map<Integer, Integer> wkMap, int excludeKey) {
		int maxCount = 0;
		for (Iterator<Integer> iterator = wkMap.keySet().iterator(); iterator.hasNext();) {
			Integer key = iterator.next();

			if (wkMap.get(key) != excludeKey) {
				maxCount += wkMap.get(key);
			}

		}
		return maxCount;
	}

	private int getMaxKey(Map<Integer, Integer> wkMap) {
		int maxCount = 0;
		int maxKey = 0;
		for (Iterator<Integer> iterator = wkMap.keySet().iterator(); iterator.hasNext();) {
			Integer key = iterator.next();

			if (wkMap.get(key) > maxCount) {
				maxCount = wkMap.get(key);
				maxKey = key;
			}

		}
		return maxKey;
	}

	private void putNum(Map<Integer, Integer> wkMap, int i) {
		if (wkMap.get(i) == null) {
			wkMap.put(i, 1);
		} else {
			int cnt = wkMap.get(i);
			wkMap.put(i, ++cnt);
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