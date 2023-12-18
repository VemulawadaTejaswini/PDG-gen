import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static long costArray[][];
	private static long minCost[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nd = br.readLine().split(" ");
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);

		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		costArray = new long[n][n];
		minCost = new long[n];
		for (int i = 0; i < n; i++) {
			minCost[i] = Long.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				costArray[i][j] = calcCost(i, j, d, a[i], a[j]);
				if (costArray[i][j] < minCost[i]) {
					minCost[i] = costArray[i][j];
				}
			}
		}

		Arrays.parallelSort(minCost);
		long sum = 0L;
		for (int i = 1; i < n; i++) {
			sum += minCost[i];
		}
		System.out.println(sum);
	}

	private static long calcCost(int i, int j, int d, int ai, int aj) {
		if (i == j) {
			return Long.MAX_VALUE;
		}
		if (costArray[j][i] != 0) {
			return costArray[j][i];
		}
		long val = i - j;
		val = Math.abs(val);
		val *= d;
		val += (ai + aj);
		return val;
	}
}
