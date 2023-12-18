import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		int[] p = getIntArray(sc);
		int[] q = getIntArray(sc);

		int[] numArray = new int[n];
		for (int i = 0; i < n; i++) {
			numArray[i] = i + 1;
		}
		List<Integer[]> permutation = getPermutation(numArray);

		int pIndex = -1;
		int qIndex = -1;
		for (int i = 0; i < permutation.size(); i++) {
			Integer[] perm = permutation.get(i);
			if (pIndex == -1 && isEqual(perm, p)) {
				pIndex = i;
			}

			if (qIndex == -1 && isEqual(perm, q)) {
				qIndex = i;
			}
		}
		System.out.println(Math.abs(pIndex - qIndex));
	}

	private static boolean isEqual(Integer[] perm, int[] target) {
		for (int i = 0; i < perm.length; i++) {

			if (perm[i].intValue() != target[i]) {

				return false;
			}
		}
		return true;
	}

	private static List<Integer[]> getPermutation(int[] numArray) {
		List<Integer[]> permutation = new ArrayList<>();
		Integer[] ans = new Integer[numArray.length];
		boolean[] used = new boolean[numArray.length];

		return buildPermutaion(permutation, numArray, ans, used, 0);
	}

	private static List<Integer[]> buildPermutaion(List<Integer[]> list, int[] numArray, Integer[] ans, boolean[] used,
			int depth) {

		// 全部使い切った時=>できた順列を返す
		if (depth == numArray.length) {
			list.add(ans.clone());
			return list;
		}
		// 使い切っていない場合

		for (int i = 0; i < numArray.length; i++) {
			if (used[i]) {
				continue;
			}
			ans[depth] = numArray[i];
			used[i] = true;
			list = buildPermutaion(list, numArray, ans, used, depth + 1);

			used[i] = false;
		}

		return list;
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をintで返却
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をStringで返却
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をint配列で返却
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// 直前にnext()を実行していると改行コードだけ取ってしまうのでその対策
		while (line.equals("")) {
			line = sc.nextLine();
		}

		String[] strArray = line.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
