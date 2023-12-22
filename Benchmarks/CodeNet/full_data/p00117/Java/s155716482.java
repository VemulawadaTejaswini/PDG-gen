
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] cost = new int[n + 1];
		Arrays.fill(cost, Integer.MAX_VALUE);

		int[][] num = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ",");
			int a = Integer.valueOf(tokenizer.nextToken());
			int b = Integer.valueOf(tokenizer.nextToken());
			int c = Integer.valueOf(tokenizer.nextToken());
			int d = Integer.valueOf(tokenizer.nextToken());
			num[a][b] = c;
			num[b][a] = d;

		}

		StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ",");
		int q = Integer.parseInt(tokenizer.nextToken());
		int r = Integer.parseInt(tokenizer.nextToken());
		int ans = Integer.parseInt(tokenizer.nextToken())
				- Integer.parseInt(tokenizer.nextToken());
		ans = ans - getYen(q, r, num) - getYen(r, q, num);
		System.out.println(ans);
	}

	public static int getYen(int q, int r, int[][] num) {
		int[] cost = new int[num.length];
		Arrays.fill(cost, Integer.MAX_VALUE);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		cost[q] = 0;
		deque.push(q);
		while (!deque.isEmpty()) {
			for (int i = 0; i < deque.size(); i++) {
				int p = deque.pop();
				for (int j = 1; j < num.length; j++) {
					if (num[p][j] != 0 && num[p][j] + cost[p] < cost[j]) {
						deque.push(j);
						cost[j] = num[p][j] + cost[p];
					}
				}
			}
		}
		return cost[r];
	}
}