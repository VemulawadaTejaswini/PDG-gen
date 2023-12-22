import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	class E {
		int from;
		int to;
		int cost;

		E(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}

	class V {
		int x;
		int y;

		V(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	int wh(int w, int i, int j) {
		return (i * w + j);
	}

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			sc.nextLine();
			if ((w | h) == 0) {
				break;
			}

			char map[][] = new char[h][w];
			LinkedList<V> node = new LinkedList<V>();
			int dp[][] = new int[w * h][w * h];
			for (int i = 0; i < w * h; i++) {
				Arrays.fill(dp[i], Integer.MAX_VALUE / 4);
			}
			for (int i = 0; i < h; i++) {
				String buffer = sc.nextLine();
				map[i] = buffer.toCharArray();
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '*') {
						node.addLast(new V(j, i));
					}
					if (map[i][j] == 'o') {
						node.addFirst(new V(j, i));
					}
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w;j++){
					if (map[i][j] != 'x') {
						if (w > j + 1) {
							if (map[i][j + 1] != 'x') {
								dp[wh(w, i, j)][wh(w, i, j + 1)] = 1;
								dp[wh(w, i, j + 1)][wh(w, i, j)] = 1;
							}
						}
						if (h > i + 1) {
							if (map[i + 1][j] != 'x') {
								dp[wh(w, i, j)][wh(w, i + 1, j)] = 1;
								dp[wh(w, i + 1, j)][wh(w, i, j)] = 1;
							}
						}
						if (0 < j) {
							if (map[i][j - 1] != 'x') {
								dp[wh(w, i, j)][wh(w, i, j - 1)] = 1;
								dp[wh(w, i, j - 1)][wh(w, i, j)] = 1;
							}
						}
						if (0 < i) {
							if (map[i-1][j] != 'x') {
								dp[wh(w, i, j)][wh(w, i - 1, j)] = 1;
								dp[wh(w, i - 1, j)][wh(w, i, j)] = 1;
							}
						}
					}

				}
			}
			int wh = w * h;
			for (int i = 0; i < wh; i++) {
				for (int j = 0; j < wh; j++) {
					for (int k = 0; k < wh; k++) {
						dp[i][k] = Math.min(dp[i][j] + dp[j][k], dp[i][k]);
					}
				}
			}
			LinkedList<E> hen = new LinkedList<E>();
			boolean mmm = false;
			for (int i = 0; i < node.size(); i++) {
				V temp = node.get(i);
				for (int j = 0; j < node.size(); j++) {
					V temp2 = node.get(j);
					int cost = dp[wh(w, temp.y, temp.x)][wh(w, temp2.y, temp2.x)];
					hen.add(new E(i, j, cost));
					if (cost > 1e5) {
						System.out.println(-1);
						mmm = true;
						break;
					}
				}
				if (mmm)
					break;
			}
			if (mmm) {
				continue;
			}

			int[][] dp2 = new int[1 << node.size()][node.size()];
			for (int i = 0; i < 1 << node.size(); i++) {
				Arrays.fill(dp2[i], Integer.MAX_VALUE / 4);
			}
			dp2[0][0] = 0;
			dp2[1][0] = 0;
			for (int i = 0; i < 1 << node.size(); i++) {
				for (int prev = 0; prev < node.size(); prev++) {
					int sh = 1 << prev;
					if ((i & sh) != 0) {
						continue;
					}
					int next = (i | sh);
					E a = hen.getFirst();
					for (int l = 0; l < node.size(); l++) {
						for (E e : hen) {
							if (e.from == prev) {
								if (e.to == l) {
									a = e;
									break;
								}
							}
						}
						dp2[next][prev] = Math.min(dp2[next][prev], dp2[i][l]
								+ a.cost);
					}
				}
			}
			int res = Integer.MAX_VALUE;
//			System.out.println(Arrays.deepToString(dp2));
			for (int i = 0; i < node.size(); i++) {
				res = Math.min(res, dp2[(1 << node.size()) - 1][i]);
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}