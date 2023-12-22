import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] costs = new int[N][N];
		for (int i = 0; i < costs.length; i++) {
			for (int j = 0; j < costs.length; j++) {
				costs[i][j] = sc.nextInt();
			}
		}
		sc.close();

		boolean[] used = new boolean[N];
		used[0] = true;
		int now = 0;
		int cost = 0;
		while (true) {
			int j = -1;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < costs[now].length; i++) {
				if (min > costs[now][i] && !used[i]) {
					j = i;
					min = costs[now][i];
				}
			}
			if (j == -1) {
				break;
			}
			used[j] = true;
			cost += costs[now][j];
			now = j;
		}
		System.out.println(cost + costs[now][0]);

	}

	static int swap(int[] clone, int[] run, int now) {
		int swapNum = 0;
		int k = 0;
		for (int i = 0; i < run.length; i++) {
			for (int j = 0; j < run[i]; j++) {
				if (clone[k] != now) {
					if (k == clone.length - 1) {
						return Integer.MAX_VALUE;
					}
					for (int l = k + 1; l < clone.length; l++) {
						if (clone[l] == now) {
							int tmp = clone[l];
							clone[l] = clone[k];
							clone[k] = tmp;

							swapNum += l - k;
							break;
						}
						if (l == clone.length - 1) {
							return Integer.MAX_VALUE;
						}
					}
				}

				k++;
			}
			now = (now + 1) % 2;
		}
		return swapNum;
	}
}