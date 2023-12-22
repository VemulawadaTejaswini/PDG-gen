

import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer> sig_first = new ArrayList<Integer>();
	static ArrayList<Integer> sig_last = new ArrayList<Integer>();
	
	/* x番までの最小回数を出力 */
	public static int dp(int x, int k, int dp[]) {
		int i, j;
		
		/* 初期値の設定 */
		if(sig_first.get(0) == sig_last.get(0)) dp[0] = 0;
		else dp[0] = 1;
		
		if(x == 0) {
			return dp[0]; //番兵
		}else {
			if(sig_first.get(x) == sig_last.get(x)) {
				dp[x] = dp(x-1, k, dp);
			}else {
				dp[x] = x*x; // 最大でx回の更新
				for(i = x - k ; i <= x - 1 ; i++) {
					if(i < 0) continue;
					int b = 0;
					for(j = i ; j <= x-1 ; j++) {
						if(sig_last.get(j) != sig_last.get(j+1)) b++; //　更新回数の確認
					}
					if(dp[x] > (dp(i, k, dp) + (int)Math.ceil(b/2) + 1)) {
						dp[x] = dp(i, k, dp) + (int)Math.ceil(b/2) + 1;
					}
				}
			}
			return dp[x];
		}
	}
	
	public static void main(String[] args) throws IOException{
		int i = 0; int n = 0; int k = 0;
		String s, t; String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* n, k, s, t の 初期化 */
		if((line = br.readLine()) != null) {
			String[] buf = line.split(" ");
			n = Integer.parseInt(buf[0]);
			k = Integer.parseInt(buf[1]);
		}
		s = br.readLine();
		t = br.readLine();
		
		/* char要素 (W or B) を int要素 (0 or 1) に変換 */
		for(i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'B') {
				sig_first.add(1);
			}else {
				sig_first.add(0);
			}
			if(t.charAt(i) == 'B') {
				sig_last.add(1);
			}else {
				sig_last.add(0);
			}
		}
		int[] dp = new int[n];
		for(i = 0 ; i < n ; i++) {
			dp[i] = 0;
		}
		int result = dp(n-1, k, dp);
		System.out.println(result);
		br.close();
	}
}

