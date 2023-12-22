
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<>());
		for (int i = 0; i < n; i++) {
			scanner.next();
			int m = scanner.nextInt();
			List<Integer> memo = new ArrayList<>();
			for (int j = 0; j < m; j++) {
				memo.add(scanner.nextInt());
			}
			list.add(memo);
		}
		int[][] map = new int[n + 1][n + 1];
		int INF = 1 << 28;
		for (int[] m : map) {
			Arrays.fill(m, INF);
		}
		for (int i = 1; i <= n; i++) {
			slove(map, list, i, i, 1, 1 << i);
		}
		int nn = scanner.nextInt();
		for (int i = 0; i < nn; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			int m = scanner.nextInt();
			if (map[s][t] < m) {
				System.out.println(map[s][t] + 1);
			} else {
				System.out.println("NA");
			}
		}

	}

	private static void slove(int[][] map, List<List<Integer>> list, int i,
			int s, int n, int bit) {
		for (int t : list.get(s)) {
			int a = bit | 1 << t;
			if (a != bit && map[i][t] > n) {
				map[i][t] = n;
				slove(map, list, i, t, n + 1, a);
			}
		}
	}
}