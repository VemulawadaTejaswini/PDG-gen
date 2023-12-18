import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long X = Long.parseLong(tokens[1]);
		List<Long> x = new ArrayList<>(N);

		tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			x.add(Long.parseLong(tokens[i]));
		}
		Collections.reverse(x);
		long[] moveCost = new long[N];
		moveCost[0] = 4;
		if (N >= 2) {
			moveCost[1] = 5;
		}
		for (int i = 2; i < N; ++i) {
			moveCost[i] = moveCost[i - 1] + 2;
		}

		long cost = 0;
		while (!x.isEmpty()) {
			int currentCarry = 1;
			long firstDust = x.get(x.size() - 1);
			x.remove(x.size() - 1);
			cost += firstDust;
			cost += X;
			cost += firstDust * moveCost[currentCarry - 1];
			cost += X;

			// 足すかどうかの判断
			for (int i = x.size() - 2; i >= 0; --i) {
				long dust = x.get(i);
				if (dust * moveCost[currentCarry] <= dust + moveCost[0] * dust + X) {
					// 左辺: 今拾っていくコスト == 拾う位置 * 1つ増えたときの移動コスト
					// 右辺: 拾っていかない場合の回収コスト == 拾う位置まで戻ってくる + 1つ抱えた状態の移動コスト * 拾う位置 + 捨てるコスト
					cost += dust * moveCost[currentCarry] + X;
					currentCarry++;
					x.remove(i);
				} else {
					break;
				}
			}
		}
		System.out.println(cost);

		in.close();
	}
}