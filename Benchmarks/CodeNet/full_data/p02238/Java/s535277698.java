import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n+1][n+1];

		// 初回訪問リスト
		int[] d = new int[n+1];
		Arrays.fill(d, -1);

		// 訪問完了リスト
		int[] f = new int[n+1];
		Arrays.fill(f, -1);

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();			// 番号
			int k = sc.nextInt();			// uの出次数
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				mat[u][v] = 1;
			}
		}

		Stack<Integer> stack = new Stack<Integer>();

		int count = 0;
		for (int index = 1; index <= n; index++) {
			if (d[index] == -1) {
				stack.add(index);
				d[index] = ++count;
			} else {
				continue;
			}

			while (!stack.isEmpty()) {
				int from = stack.peek();
				boolean isNext = false;
				for (int to = 1; to <= n; to++) {
					if (mat[from][to] == 1 && d[to] == -1) {
						stack.push(to);
						d[to] = ++count;
						isNext = true;
					}
				}
				if (!isNext) {
					from = stack.pop();
					f[from] = ++count;
				}
			}
		}



		// 幅優先探索
//		for (int i = 0; i < n; i++) {
//			int u = sc.nextInt();
//			int k = sc.nextInt();
//			for (int j = 0; j < k; j++) {
//				int v = sc.nextInt();
//				mat[u][v] = 1;
//			}
//		}
//
//
//		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
//		q.add(1);
//		v[1] = 0;
//
//		while (!q.isEmpty()) {
//			int f = q.poll();
//			for (int t = 1; t <= n; t++) {
//				if (mat[f][t] == 1) {
//					q.add(t);
//					if (v[t] == -1) {
//						v[t] = v[f] + 1;
//					}
//				}
//			}
//		}

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i] + " " + f[i]);
		}



	}

	public static void matPrint(int[][] mat) {
		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}

