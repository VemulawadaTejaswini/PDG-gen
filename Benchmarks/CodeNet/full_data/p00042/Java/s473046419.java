import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int count = 0;
		while (true) {
			line = br.readLine().trim();
			if (line.equals("0"))
				break;
			count++;

			int W = Integer.parseInt(line);
			int N = Integer.parseInt(br.readLine().trim());
			int[] v = new int[N];
			int[] w = new int[N];
 			for (int i = 0; i < N; i++) {
				line = br.readLine();
				String[] splited = line.trim().split(",");
				v[i] = Integer.parseInt(splited[0]);
				w[i] = Integer.parseInt(splited[1]);
			}
			
			searchBestChoice(v, w, N, W, count);
		}
	}

	private static void searchBestChoice(final int[] v,final int[] w, final int N, final int weight, int count) {
		int[] dp = new int[weight + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		/* 価値の総和の最大値を動的計画法で求める ナップサック問題 */
		for(int i = 0; i < N; i++) {
			for(int j = w[i]; j < weight; j++) {
				if( dp[j - w[i]] >= 0 && dp[i] < dp[j - w[i]] + v[i]) {
					dp[j] = dp[j - w[i]] + v[i];
				}
			}
		}
		
		int maxValue = 0;
		int maxWeight = 0;
		
		for(int i = 1; i < weight; i++ ) {
			if(maxValue < dp[i]) {
				maxValue = dp[i];
				maxWeight = i;
			}
		}
		System.out.println("Case " + count + ":");
		System.out.println(maxValue);
		System.out.println(maxWeight);
	}
}