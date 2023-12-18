import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		int[] ans = new int[n];
		for (int i = 1; i < n; i++) {
			Queue<Integer> que = new ArrayDeque<>();
			que.add(i);
			int[] d = new int[n + 1];
			Arrays.fill(d, 10000);
			d[i] = 0;
			while (!que.isEmpty()) {
				int cur = que.poll();
				if (cur < n) {
					int next = cur + 1;
					if (d[cur] + 1 < d[next]) {
						d[next] = d[cur] + 1;
						que.add(next);
					}
				}
				if (cur > x) {
					int next = cur - 1;
					if (d[cur] + 1 < d[next]) {
						d[next] = d[cur] + 1;
						que.add(next);
					}
				}
				if (cur == x) {
					int next = y;
					if (d[cur] + 1 < d[next]) {
						d[next] = d[cur] + 1;
						que.add(next);
					}
				}
			}
			for (int j = i + 1; j <= n; j++) {
				ans[d[j]]++;
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}
}
