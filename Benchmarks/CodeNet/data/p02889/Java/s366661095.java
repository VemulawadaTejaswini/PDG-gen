import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[][] map = new int[n + 1][n + 1];
			int m = sc.nextInt();
			int l = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				map[a][b] = c;
			}
			int query = sc.nextInt();
			int[] d = new int[n + 1];
			int[] parent = new int[n + 1];
			int[] col = new int[n + 1]; // 0 : not visited, 1: candidate. 2: visited
			for (int i = 0; i < query; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				Queue<Integer> q = new ArrayDeque<>();
				col[from] = 2;
				int temp = from;
				while (true) {

					for (int j = 1; j <= n; j++) {
						if ((map[temp][j] == 0 && map[j][temp] == 0) || col[j] == 2) {
							continue;
						}
						int path = getPath(map, temp, j);
						if (d[j] == 0 || path + d[temp] < d[j]) {
							d[j] = path + d[temp];
							col[j] = 1;
							parent[j] = temp;
							q.add(j);
						}
					}
					int mincost = Integer.MAX_VALUE;
					int next = 0;
					for(int aaa = 1; aaa <= n; aaa++) {
						if (col[aaa] == 1 && d[aaa] < mincost) {
							mincost = d[aaa];
							next = aaa;
						}
					}
					if (next == 0) {
						System.out.println(-1);
						d = new int[n + 1];
						parent = new int[n + 1];
						col = new int[n + 1];
						break;
					}
					col[next] = 2;
					if (next == to) {
						List<Integer> route = new ArrayList<>();
						route.add(next);
						while (parent[next] != 0) {
							route.add(parent[next]);
							next = parent[next];
						}
						int size = route.size();
						int f = route.get(size - 1);
						int tlen = 0;
						int count = 0;
						for (int k = size - 2; k >= 0; k--) {
							tlen += getPath(map, f, route.get(k));
							if (tlen > l) {
								count++;
								tlen -= l;
							}
							f = route.get(k);
						}
						System.out.println(count);
						d = new int[n + 1];
						parent = new int[n + 1];
						col = new int[n + 1];
						break;
					}
					temp = next;
				}
			}
		}
	}

	static int getPath(int[][] map, int f, int to) {
		int a = map[f][to];
		int b = map[to][f];
		if (a == 0 && b == 0) {
			return 0;
		} else if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else {
			if (a < b) {
				return a;
			}
			return b;
		}
	}
}
