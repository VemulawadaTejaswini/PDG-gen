import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			int[][] bal = new int[n][2];
			for (int i = 0; i < bal.length; i++) {
				bal[i][0] = sc.nextInt();// ポジション
				bal[i][1] = sc.nextInt();// 時間
			}

			// int[] = {position, time, baloons, distance}
			Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
			Integer[] init = { 0, 0, 0, 0 };
			deque.addLast(init);
			int drop = n;
			for (int i = 0; i < bal.length; i++) {
				int size = deque.size();
				for (int j = 0; j < size; j++) {
					Integer[] poll = deque.pollFirst();
					int p = poll[0];
					int t = poll[1];
					int b = poll[2];
					int d = poll[3];

					int dist = Math.abs(p - bal[i][0]);// バルーンまでの距離
					boolean catchable = false;
					// 取りに行けるならqueに追加
					if (b < 3 && dist * (b + 1) <= bal[i][1] - t) {
						Integer[] put = { bal[i][0], bal[i][1], b + 1, d + dist };
						deque.addLast(put);
						catchable = true;
					}

					// 家に帰った時も考える
					if (p * (b + 1) + bal[i][0] <= bal[i][1] - t) {
						Integer[] put = { bal[i][0], bal[i][1], 1,
								d + p + bal[i][0] };
						deque.addLast(put);
						catchable = true;
					}

					// 取れなかった時
					if (!catchable) {
						drop = Math.min(drop, i + 1);
					}
				}
			}

			if (deque.isEmpty()) {
				System.out.println("NG " + drop);
			} else {
				int score = Integer.MAX_VALUE;
				for (Integer[] integers : deque) {
					score = Math.min(score, integers[3] + integers[0]);
				}
				System.out.println("OK " + score);
			}
		}
	}
}