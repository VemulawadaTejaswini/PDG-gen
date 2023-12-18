import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static final String YES = "Yes";

	private static final String NO = "No";

	public static void main(String[] args) {

		int[][] arr = scan();
		System.out.println(process(arr) ? YES : NO);
	}

	private static int[][] scan() {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}

	private static boolean process(int[][] arr) {

		Map<String, Integer> map = new HashMap<>();

		return invoke(arr, map, 0);
	}

	private static boolean invoke(int[][] arr, Map<String, Integer> map, int j) {

		String aKey = "a" + j;
		int val;
		int a;
		int b;
		String bKey;
		while (j < arr.length) {
			a = arr[0][j];
			if (map.get(aKey) == null) {
				map.put(aKey, a);
			} else {
				a = map.get(aKey);
			}
			if (a < 0) {
				return false;
			}

			for (int i = 0; i < arr.length; i++) {
				val = arr[i][j];
				bKey = "b" + i;
				b = val - a;

				if (map.get(bKey) == null) {
					map.put(bKey, b);
				} else if (b != map.get(bKey)) {
					if (j > 0) {
						map.put(aKey, map.get(aKey) - 1);
						return invoke(arr, map, j);
					}
					map.put(bKey, b);
				} else {
					b = map.get(bKey);
				}

				if (b < 0 || val != (a + b)) {
					map.put(aKey, map.get(aKey) - 1);
					return invoke(arr, map, j);
				}
			}
			return invoke(arr, map, j + 1);
		}
		return true;
	}
}