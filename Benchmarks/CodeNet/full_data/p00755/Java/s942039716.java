import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			if (h == 0) {
				sc.close();
				break;
			}

			int w = sc.nextInt();
			int c = sc.nextInt();

			int[][] panel = new int[h][w];
			int[][] dummy = new int[h][w];
			for (int i = 0; i < panel.length; i++) {
				for (int j = 0; j < panel[i].length; j++) {
					panel[i][j] = sc.nextInt();
				}
			}

			int max = 0;
			for (int i1 = 1; i1 <= 6; i1++) {
				for (int i2 = 1; i2 <= 6; i2++) {
					for (int i3 = 1; i3 <= 6; i3++) {
						for (int i4 = 1; i4 <= 6; i4++) {
							for (int i = 0; i < dummy.length; i++) {
								for (int j = 0; j < dummy[0].length; j++) {
									dummy[i][j] = panel[i][j];
								}
							}
							check(dummy, i1);
							check(dummy, i2);
							check(dummy, i3);
							check(dummy, i4);
							check(dummy, c);
							max = Math.max(max, check(dummy, c));
						}
					}
				}
			}

			System.out.println(max);
			System.gc(); // 1テストケースごとにメモリを解放
		}

	}

	static int check(int[][] dummy, int c) {
		int old = dummy[0][0];
		boolean[][] used = new boolean[dummy.length][dummy[0].length];
		Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
		Integer[] first = { 0, 0 };
		deque.add(first);
		used[0][0] = true;
		dummy[0][0] = c;
		int ret = 1;

		int[][] dir = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

		while (!deque.isEmpty()) {
			Integer[] poll = deque.poll();
			int i = poll[0];
			int j = poll[1];

			for (int k = 0; k < dir.length; k++) {
				if (i + dir[k][0] >= 0 && i + dir[k][0] < dummy.length && j + dir[k][1] >= 0
						&& j + dir[k][1] < dummy[0].length && !used[i + dir[k][0]][j + dir[k][1]]
						&& dummy[i + dir[k][0]][j + dir[k][1]] == old) {
					Integer[] put = { i + dir[k][0], j + dir[k][1] };
					deque.add(put);
					used[i + dir[k][0]][j + dir[k][1]] = true;
					dummy[i + dir[k][0]][j + dir[k][1]] = c;
					ret++;
				}
			}
		}
		return ret;
	}

}