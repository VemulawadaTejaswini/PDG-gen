import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		int[][] bou = {
				{1, 2},
				{7, 3},
				{4, 4},
				{5, 5},
				{3, 5},
				{2, 5},
				{9, 6},
				{6, 6},
				{8, 7}
				};
		// 1桁当たりの本数、その本数を使う桁数
		TreeMap<Integer, Integer> honsuuMap = new TreeMap<Integer, Integer>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			for (int j = 0; j < 9; j++) {
				if (a[i] == bou[j][0]) {
					honsuuMap.put(bou[j][1], 0);
					break;
				}
			}
		}
		sc.close();

		Integer[] array = honsuuMap.keySet().toArray(new Integer[0]);

		editHonsuuMap(n, array, 0, honsuuMap);

//		for (Entry<Integer, Integer> entry : honsuuMap.entrySet()) {
//			System.out.print(entry.getKey() + " " + entry.getValue());
//			System.out.println();
//		}

		Arrays.parallelSort(a);
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < 9; j++) {
				if (a[i] == bou[j][0]) {
					int ketasuu = honsuuMap.get(bou[j][1]);
					for (int k = 0; k < ketasuu; k++) {
						System.out.print(a[i]);
					}
					honsuuMap.put(bou[j][1], 0);
					break;
				}
			}
		}
		System.out.println();
	}

	private static boolean editHonsuuMap(
			int n, Integer[] array, int startIdx, TreeMap<Integer, Integer> honsuuMap) {
		for (int i = startIdx; i < array.length; i++) {
			if (n % array[i] == 0) {
				honsuuMap.put(array[i], n / array[i]);
				return true;
			}

			for (int j = (n / array[i]) - 1; j >= 0; j--) {
				int tempN = n - (array[i] * j);
				boolean flg = editHonsuuMap(tempN, array, i + 1, honsuuMap);
				if (flg) {
					honsuuMap.put(array[i], j);
					return true;
				}
			}
		}
		return false;
	}
}
