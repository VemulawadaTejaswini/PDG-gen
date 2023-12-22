// Discrete Speed
import java.util.*;

public class Main {
	static final double EPS = 1e-4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int s = sc.nextInt() - 1, g = sc.nextInt() - 1;
			int[][] d = new int[n][n];
			int[][] l = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], 0);
				Arrays.fill(l[i], 0);
			}
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
				int td = sc.nextInt();
				int tc = sc.nextInt();
				d[x][y] = td;
				d[y][x] = td;
				l[x][y] = tc;
				l[y][x] = tc;
			}
			double[][] costs = new double[n][31];
			for (int i = 0; i < n; i++)
				Arrays.fill(costs[i], -1);
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			queue.add(new Node(s, 0, 0, -1));
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				int tn = node.num;
				double tc = node.cost;
				int tv = node.v;
				int tb = node.before;
				if (costs[tn][tv] > 0 && costs[tn][tv] < tc-EPS)
					continue;
				else
					costs[tn][tv] = tc;
				if (tn == g && tv == 1)
					break;
				for (int i = 0; i < n; i++) {
					if (d[tn][i] >= 0 && i != tb) {
						for (int j = -1; j <= 1; j++) {
							int v = tv + j;
							double c = (double) d[tn][i] / v;
							if (v >= 1 && v <= l[tn][i])
								queue.add(new Node(i, tc + c, v, tn));
						}
					}
				}
			}
			if (costs[g][1] == -1)
				System.out.println("unreachable");
			else
				System.out.println(costs[g][1]);
		}
		sc.close();
	}

	static class Node implements Comparable<Node> {
		int num, v, before;
		double cost;

		Node(int n, double c, int tv, int b) {
			num = n;
			cost = c;
			v = tv;
			before = b;
		}

		public int compareTo(Node anotherNode) {
			return this.cost < anotherNode.cost ? -1 : 1;
		}

	}
}