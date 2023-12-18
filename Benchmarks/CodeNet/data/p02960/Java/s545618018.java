import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int mod = (int) 1E9 + 7;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();

		// dp[r] = ある文字までを13で割った余りがrであるものの個数
		long dp[] = new long[13];

		// 初期値
		if ( s[0] == '?' ) {
			for ( int n = 0; n < 10; n++ ) {
				dp[n] = 1;
			}
		} else {
			dp[s[0] - '0'] = 1;
		}

		for ( int i = 1; i < s.length; i++ ) {
			
			// 前回の余りrごとに見て今回のtempを埋める
			long[] temp = new long[13];			
			for ( int r = 0; r < 13; r++ ) {
				
				if ( s[i] != '?' ) {
					int now = s[i] - '0';
					temp[(r * 10 + now) % 13] += dp[r];
				}
				else {
					for ( int now = 0; now < 10; now++ ) {
						temp[(r * 10 + now) % 13] += dp[r];
					}
				}
			}
			
			for ( int r = 0; r < 13; r++ ) {
				dp[r] = temp[r] % mod;
			}
		}
		System.out.println(dp[5]);
		br.close();
	}
}
