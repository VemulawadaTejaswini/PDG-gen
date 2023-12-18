import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static int minCost(int stones[]) {
		int cost[] = new int[stones.length];
		cost[0] = 0;
		cost[1] = Math.abs(stones[1] - stones[0]);
		for (int i = 2; i < stones.length; i++) {
			cost[i] = Math.min(Math.abs(stones[i - 1] - stones[i]) + cost[i - 1],
					Math.abs(stones[i] - stones[i - 2]) + cost[i - 2]);
		}
		return cost[stones.length - 1];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int stones[] = new int[n];
		String array[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			stones[i] = Integer.valueOf(array[i]);
		}
		System.out.println("" + minCost(stones));

	}

}