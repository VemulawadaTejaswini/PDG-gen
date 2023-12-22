import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int ds=0; ds<n; ds++) {
			String x = br.readLine();
			String y = br.readLine();

			int xLen = x.length();
			int yLen = y.length();
			int[] dp = new int[xLen+1];
			int last = 0;
			for (int i=1; i<=xLen; i++) {
				for (int j=last; j<yLen; j++) {
					if(x.charAt(i-1) == y.charAt(j)){
						dp[i] = dp[i-1]+1;
						last = j;
						break;
					}
				}
				if (dp[i] == 0)
					dp[i] = dp[i-1];
			}

			System.out.println(dp[xLen]);
		}


		br.close();
	}
}