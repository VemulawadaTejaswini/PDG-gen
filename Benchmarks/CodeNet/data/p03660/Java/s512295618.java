import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static int n;
	static int[][] m = new int[1000][1000];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			m[scan.nextInt() - 1][scan.nextInt() - 1] = 1;
		}
		int[] ansF = bfs(0);
		int[] ansS = bfs(n - 1);
		int f = 0;
		int s = 0;
		int flag = 1;
		for (int i = 0; i < n; i++) {
			if (ansF[i] < ansS[i]) {
				f++;
			} else if (ansF[i] > ansS[i]) {
				s++;
			} else {
				if (flag % 2 == 1) {
					f++;
				} else {
					s++;
				}
			}
		}
		if (f > s) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}

	}

	public static int[] bfs(int a) {
		int[] ans = new int[100001];
		Deque<Integer> q = new ArrayDeque<>();
		q.offer(a);
		Arrays.fill(ans, -1);
		ans[a] = 0;
		while (!q.isEmpty()) {
			int b = q.poll();
			for (int i = 0; i < n; i++) {
				if (m[b][i] == 0) {
					continue;
				}
				if (ans[i] != -1) {
					continue;
				}
				ans[i] = ans[b] + 1;
				q.offer(i);
			}
		}
		return ans;
	}
}