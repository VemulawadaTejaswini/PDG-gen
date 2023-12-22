import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();
			int[][] cost = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
						cost[i][j] = 0;
				}
			}

			int count=0;
			while (count<(n-1)) {
				int start = in.nextInt();
				int end = in.nextInt();
				int t = in.nextInt();
				cost[start - 1][end - 1] = t;
				cost[end - 1][start - 1] = t;
				count++;
			}

			int[][] dist = cost.clone();

			in.nextInt();
			System.out.println((judgeTotal(dist, n, 0, 0) * 2
					- judgeMax(dist, n, 0, 0)));

		}
	}

	public static int judgeTotal(int[][] dist, int n, int cur, int t) {
		int sum = 0;
		for (int i = 0; i < dist.length; i++) {
			if (hasNext(dist, i, 0))
				for (int j = (i + 1); j < dist.length; j++) {
					sum += dist[j][i];
				}
		}

		return sum;
	}

	public static int judgeMax(int[][] dist, int n, int cur, int t) {
		int sum = 0;
		for (int i = 0; i < dist.length; i++) {

			if (hasNext(dist, i, 0)){
				int max=0;
				for (int j = (i + 1); j < dist.length; j++) {
						max = Math.max(dist[j][i],max);
				}
				sum+=max;
			}
		}

		return sum;
	}

	public static boolean hasNext(int[][] dist, int cur, int flag) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int j = cur + 1; j < dist.length; j++) {
			if (dist[cur][j] != 0)
				al.add(j);
		}
		for (int j = 0; j < al.size(); j++)
			if (al.size() == 0) {
				return false;
			} else {
				if (flag != 0) {
					return true;
				} else {
					for (int k = 0; k < al.size(); k++) {
						return hasNext(dist, al.get(k), 1);
					}

				}
			}
		return false;
	}
}