import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int M = 100000;

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] graph = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(graph[i], M);
		}
		for (int i = 0; i < m; i++) {
			String[] input = sc.next().split(",");
			int s = Integer.valueOf(input[0]);
			int t = Integer.valueOf(input[1]);
			graph[s][t] = Integer.valueOf(input[2]);
			graph[t][s] = Integer.valueOf(input[3]);
		}
		String[] input = sc.next().split(",");
		int[] go = { Integer.valueOf(input[0]), Integer.valueOf(input[1]) };
		int get = Integer.valueOf(input[2]) - Integer.valueOf(input[3]);
		for (int I = 0; I < 2; I++) {
			int start = go[I];
			int goal = go[I ^ 1];
			int[] len = new int[n + 1];
			boolean[] v = new boolean[n + 1];
			for (int i = 0; i <= n; i++) {
				len[i] = M;
			}
			len[start] = 0;
			for (int i = 0; i <= n; i++) {
				int min = M;
				int p = 0;
				for (int j = 0; j <= n; j++) {
					if (!v[j] && len[j] < min) {
						p = j;
						min = len[j];
					}
				}
				v[p] = true;
				for (int j = 0; j <= n; j++) {
					if (len[p] + graph[p][j] < len[j]) {
						len[j] = len[p] + graph[p][j];
					}
				}
			}
			get -= len[goal];
		}
		System.out.println(get);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}