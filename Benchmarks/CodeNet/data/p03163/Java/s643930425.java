
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Knapsack1 {

	static int N, INF = (int) 1e9;
	static Long[][] memo;
	static int[] values;
	static int[] weights;

	
	static Long solve(int idx, int remA) {
		if (remA < 0) 
			return (long) (-1 * INF);
		if (idx == N)
			return 0L;
		if (memo[idx][remA] != -1)
			return memo[idx][remA];
	

	Long	max = Math.max(solve(idx + 1, remA), values[idx] + solve(idx + 1, remA - weights[idx]));

		return memo[idx][remA] = max;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		memo=new Long [n][w+1];
		N=n;
		for (int i = 0; i < N; i++)
			Arrays.fill(memo[i], -1L);
		values = new int[n];
		weights = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			weights[i] = Integer.parseInt(st.nextToken());
			values[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(solve(0, w));
	}
}
