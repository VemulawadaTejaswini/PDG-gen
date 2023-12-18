import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long X = Long.parseLong(tokens[1]);
		PriorityQueue<Long> x = new PriorityQueue<>(N, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			x.add(Long.parseLong(tokens[i]));
		}
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
			long firstDust = x.poll();
			cost += firstDust;
			cost += X;
			cost += firstDust * moveCost[currentCarry - 1];
			cost += X;

			// 足すかどうかの判断
			while (!x.isEmpty()) {
				long dust = x.peek();
				if (dust * moveCost[currentCarry] < dust + moveCost[0] * dust + X) {
					cost += dust * moveCost[currentCarry] + X;
					currentCarry++;
					x.poll();
				} else {
					break;
				}
			}
		}
		System.out.println(cost);

		in.close();
	}
}
