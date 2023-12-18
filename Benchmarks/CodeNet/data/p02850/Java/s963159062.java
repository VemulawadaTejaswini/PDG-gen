import java.util.*;

public class Main {

	static int N; // 頂点数
	static int[] color; // 色
	static int[][] edges; // 辺
	static int max[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		edges = new int[N][N];
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edges[a][b] = 1;
			edges[b][a] = 1;
		}
		max = new int[N];
		color = new int[N - 1];
		sc.close();

		int cnt = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// 辺がない or すでに探索済みの場合はcontinue
				if (edges[i][j] == 0) {
					continue;
				}
				// maxを更新する
				max[i]++;
				max[j]++;
				// 辺に色を付ける
				color[cnt] = Math.max(max[i], max[j]);
				cnt++;
			}
		}

		int k = 0;
		for (int i = 0; i < N; i++) {
			k = Math.max(k, max[i]);
		}
		System.out.println(k);
		for (int i = 0; i < N - 1; i++) {
			System.out.println(color[i]);
		}
	}
}
