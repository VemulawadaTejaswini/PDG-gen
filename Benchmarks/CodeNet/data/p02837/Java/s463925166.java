import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
	static int mod = 1000000007;
	private static long[] fact;
	private static long[] inv_fact;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();

			for (int j = 0; j < a; j++) {

				int x = sc.nextInt();
				int y = sc.nextInt();
				if (y == 0)
					y = -1;

				matrix[i][x - 1] = y;

				// System.out.println("j:" + j);
				// System.out.println("x:" + x + " y:" + y);
			}
		}

		for (int i = 0; i < n; i++) {

			// 自分は正直者のつもり
			matrix[i][i] = 1;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			Set<Integer> set = new TreeSet<Integer>();

			for (int j = 0; j < matrix.length; j++) {

				int y = matrix[i][j];

				// 正直者なら
				if (y == 1) {
					// 不親切だと言われていないことを確認
					if (matrix[j][i] != -1) {
						set.add(j);
					} else {
						set.clear();
						break;
					}
				}

				// System.out.println(set);

			}
			list.add(set.size());
		}

		int max = list.stream().mapToInt(Integer::valueOf).max().getAsInt();

		System.out.println(max);

	}

}