import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_c
public class Main {
	static int[] arrayA;
	static int[] arrayB;
	static int[] arrayC;
	static int[] arrayD;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		arrayA = new int[q];
		arrayB = new int[q];
		arrayC = new int[q];
		arrayD = new int[q];

		for (int i = 0; i < q; i++) {
			arrayA[i] = sc.nextInt();
			arrayB[i] = sc.nextInt();
			arrayC[i] = sc.nextInt();
			arrayD[i] = sc.nextInt();
		}
		sc.close();

		Integer[] array = {};
		System.out.println(dfs(array, n, m));
	}

	static int score(Integer[] array) {
		int ans = 0;
		for (int i = 0; i < arrayB.length; i++) {
			if (array[arrayB[i] - 1] - array[arrayA[i] - 1] == arrayC[i]) {
				ans = ans + arrayD[i];
			}
		}
		return ans;
	}

	//////////////////
	static int dfs(Integer[] array, int N, int M) {
		if (array.length == N) {
			return score(array);
		}

		int last_i;
		if (array.length > 0) {
			last_i = array[array.length - 1];
		} else {
			last_i = 1;
		}

		int ans = 0;
		for (int i = last_i; i <= M; i++) {
			List<Integer> list = new ArrayList<>(Arrays.asList(array));
			list.add(i);
			array = list.toArray(new Integer[list.size()]);
			ans = Math.max(ans, dfs(array, N, M));
			list.remove(list.size() - 1);
			array = list.toArray(new Integer[list.size()]);
		}
		return ans;
	}
	//////////////////
}