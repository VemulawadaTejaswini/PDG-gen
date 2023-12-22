
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[][] cost = new int[10][10];
			for (int[] t : cost)
				Arrays.fill(t, 1 << 24);
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
			}
			for (int i = 0; i < 10; i++) {
				slove(i, cost);
			}
			int ans = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 10; i++) {
				int sum = 0;
				for (int j = 0; j < 10; j++) {
					if (cost[i][j] != 1 << 24)
						sum += cost[i][j];
				}
				if (sum != 0) {
					if (sum < min) {
						min = sum;
						ans = i;
					}
				}
			}
			System.out.println(ans + " " + min);
		}

	}

	private void slove(int x, int[][] cost) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(x);
		cost[x][x] = 0;
		while (!deque.isEmpty()) {
			int pri = deque.poll();
			for (int i = 0; i < 10; i++) {
				if (pri == i)
					continue;
				int a = cost[x][i];
				int b = cost[pri][i];
				int c = cost[pri][x];
				if (cost[pri][i] != 1 << 24
						&& cost[x][i] >= cost[pri][i] + cost[x][pri]) {
					cost[x][i] = cost[pri][i] + cost[x][pri];
					deque.push(i);
				}
			}
		}

	}
}