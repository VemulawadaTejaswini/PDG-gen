import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(f.readLine());
		String s = f.readLine();
		ArrayList<Long> blockLengths = new ArrayList<>();
		long count = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '1') {
				count++;
			} else {
				blockLengths.add(count);
				count = 0;
			}
		}
		blockLengths.add(count);
		long[][] dp = new long[2][blockLengths.size() + 1];
		for(int i = 2; i <= blockLengths.size(); i++) {
			long prev = blockLengths.get(i - 2);
			long curr = blockLengths.get(i - 1);
			if(prev > 0 && curr > 0) {
				dp[1][i] = Math.max(prev, curr) + dp[0][i - 1];
				if(prev > 1) {
					dp[1][i] = Math.max(dp[1][i], Math.max(prev - 1, curr) + dp[1][i - 1]);
				}
			}
			dp[0][i] = Math.max(dp[1][i - 1], dp[0][i - 1]);
		}
		long answer = Math.max(dp[0][blockLengths.size()], dp[1][blockLengths.size()]);
		//System.out.println(blockLengths);
		//System.out.println(Arrays.toString(dp[0]));
		//System.out.println(Arrays.toString(dp[1]));
		System.out.println(answer);
	}
}
