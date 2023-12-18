import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = arrayInt(sc, n);
		sc.close();
		int cur = 1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != cur) {
				ans++;
			} else {
				cur++;
			}
		}
		System.out.println(ans == n ? -1 : ans);
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static long arrayMax(long[] array) {
		long ans = Long.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}

	public static String[] arrayString(Scanner sc, int n) {
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}
		return array;
	}

	static String nextPermutation(String s) {

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
			list.add(s.charAt(i));

		int pivotPos = -1;
		char pivot = 0;
		for (int i = list.size() - 2; i >= 0; i--) {
			if (list.get(i) < list.get(i + 1)) {
				pivotPos = i;
				pivot = list.get(i);
				break;
			}
		}

		if (pivotPos == -1 && pivot == 0)
			return "Final";

		int L = pivotPos + 1, R = list.size() - 1;
		int minPos = -1;
		char min = Character.MAX_VALUE;
		for (int i = R; i >= L; i--) {
			if (pivot < list.get(i)) {
				if (list.get(i) < min) {
					min = list.get(i);
					minPos = i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R + 1));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++)
			sb.append(list.get(i));

		return sb.toString();
	}
}
