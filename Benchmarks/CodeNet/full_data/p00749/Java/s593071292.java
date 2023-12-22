import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void paint(int[][] ret, int i, int j, int b, int a) {

		int ni = i + 1;

		int nj = j;

		if (ni >= 0 && ni < ret.length && nj >= 0 && nj < ret[0].length

				&& ret[ni][nj] == b) {

			ret[ni][nj] = a;

			paint(ret, ni, nj, b, a);

		}

		ni = i - 1;

		nj = j;

		if (ni >= 0 && ni < ret.length && nj >= 0 && nj < ret[0].length

				&& ret[ni][nj] == b) {

			ret[ni][nj] = a;

			paint(ret, ni, nj, b, a);

		}

		ni = i;

		nj = j + 1;

		if (ni >= 0 && ni < ret.length && nj >= 0 && nj < ret[0].length

				&& ret[ni][nj] == b) {

			ret[ni][nj] = a;

			paint(ret, ni, nj, b, a);

		}

		ni = i;

		nj = j - 1;

		if (ni >= 0 && ni < ret.length && nj >= 0 && nj < ret[0].length

				&& ret[ni][nj] == b) {

			ret[ni][nj] = a;

			paint(ret, ni, nj, b, a);

		}

	}



	int rec(char[][] map, int[][] ret) {

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[0].length; j++) {

				ret[i][j] = map[i][j] - '0';

//				System.out.print(ret[i][j]);

			}

//			System.out.println();

		}

		int count = 10;

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[0].length; j++) {

				if (ret[i][j] != 0 && ret[i][j] < 10) {

					int b = ret[i][j];

					ret[i][j] = count;

					paint(ret, i, j, b, count);

					count++;

				}

			}

		}

		int max = 0;

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[0].length; j++) {

				if (ret[i][j] != 0) {

					ret[i][j] -= 9;

					max = Math.max(ret[i][j], max);

				}

			}

		}

		return max;

	}



	tree isStable(int id, int[][] tree) {

		// System.out.println(id);

		LinkedList<Integer> checked = new LinkedList<Integer>();

		LinkedList<tree> children = new LinkedList<Main.tree>();

		tree name = new tree();

		name.stable = false;

		double x = 0;

		double weight = 0;

		double left = 100;

		double right = 0;

		for (int i = 0; i < tree.length; i++) {

			for (int j = 0; j < tree[0].length; j++) {

				if (tree[i][j] == id) {

					x = (((double)j+0.5) + x * weight) / (1 + weight);

					weight++;

					if (i - 1 < 0 || (tree[i - 1][j] != 0 && tree[i-1][j] != id)) {

						if (left > j) {

							left = j;

						}

						if (right < j) {

							right = j;

						}

					}

					if (i + 1 < tree.length) {

						if (tree[i + 1][j] != 0 && tree[i + 1][j] != id) {

							if (checked.contains(tree[i + 1][j]))

								continue;

							children.add(isStable(tree[i + 1][j], tree));

							checked.add(tree[i+1][j]);

						}

					}

				}

			}

		}

		right += 1;

		for (tree e : children) {

			if (e.stable == false) {

				return name;

			}

			x = (x * weight + e.x * e.weight) / (weight + e.weight);

			weight += e.weight;

		}

		double EPS = 0.000001;

		if (x - left < EPS) {

//			System.out.println(id + " is not STABLE "+ left+" "+right+ " zl " + x);

			return name;

		}

		if (right - x < EPS) {

//			System.out.println(id + " is not STABLE "+ left+" "+right+ " zl " + x);

			return name;

		}

//		System.out.println(id + " is STABLE "+ left+" "+right+ " zl " + x);

		name.left = left;

		name.right = right;

		name.x = x;

		name.weight = weight;

		name.stable = true;

		return name;

	}



	class tree {

		double weight;

		double x;

		double left;

		double right;

		boolean stable;

	}



	void run() {

		for (;;) {

			int w = sc.nextInt();

			int h = sc.nextInt();

			if ((w | h) == 0)

				break;

			char[][] map = new char[h][w];

			for (int i = 0; i < h; i++) {

				String buffer;

				for (buffer = sc.nextLine(); buffer.length() == 0; buffer = sc

						.nextLine())

					;

				map[h - i - 1] = buffer.replace('.', '0').toCharArray();

			}

			int[][] tr = new int[map.length][map[0].length];

			int a = rec(map, tr);

			boolean stable = false;

			for (int i = 0; i < tr[0].length; i++) {

				// System.out.println(tr[0][i]);

				if (tr[0][i] != 0) {

					tree ret = isStable(tr[0][i], tr);

					stable = ret.stable;

					break;

				}

			}

			System.out.println(stable ? "STABLE" : "UNSTABLE");

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}