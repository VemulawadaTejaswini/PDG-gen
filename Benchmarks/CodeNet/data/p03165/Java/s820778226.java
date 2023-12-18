import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static class Pair{
		int val;
		int i;
		int j;
		public Pair(int val, int i, int j) {
			this.val = val;
			this.i = i;
			this.j = j;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		//int N = Integer.parseInt(st.nextToken()); int W = Integer.parseInt(st.nextToken());
		
		String s = br.readLine(); String t = br.readLine();
		int slen = s.length(); int tlen = t.length();
		
		int[][] dp = new int[slen+1][tlen+1];
		for(int i=0; i<=slen; i++) {
			dp[i][0] = 0;
		}
		for(int j=0; j<=tlen; j++) {
			dp[0][j] = 0;
		}
		
		for(int i=1; i<=slen; i++) {
			for(int j=1; j<=tlen; j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		String ans = "";
		int i = slen; int j= tlen;
		while(true) {
			if(s.charAt(i-1)==t.charAt(j-1)) {
				ans = s.charAt(i-1) + ans;
				i--; j--;
			}else {
				if(dp[i-1][j] > dp[i][j-1]) {
					i--;
				}else {
					j--;
				}
			}
			if(i==0 || j==0) {
				break;
			}
		}
		System.out.println(ans);
//		Pair[][] dp = new Pair[slen+1][tlen+1];
//		dp[0][0] = new Pair(0, 0, 0);
//		
//		for(int i=0; i<slen; i++) {
//			for(int j=0; j<tlen; j++) {
//				if(s.charAt(i)==t.charAt(j)) {
//					if(dp[i+1][j+1]==null) dp[i+1][j+1] = new Pair(0, 0, 0);
//					if(dp[i][j].val+1 > dp[i+1][j+1].val) {
//						dp[i+1][j+1] = new Pair(dp[i][j].val+1, i, j);
//					}
//				}
//				if(dp[i+1][j]==null) dp[i+1][j] = new Pair(0, 0, 0);
//				if(dp[i][j+1]==null) dp[i][j+1] = new Pair(0, 0, 0);
//				if(dp[i][j].val > dp[i+1][j].val) {
//					dp[i+1][j] = new Pair(dp[i][j].val, i, j);
//				}
//				if(dp[i][j].val > dp[i][j+1].val) {
//					dp[i][j+1] = new Pair(dp[i][j].val, i, j);
//				}
//			}
//		}
//		
//		Pair ans = new Pair(0, 0, 0);
//		for(int i=0; i<=slen; i++) {
//			for(int j=0; j<tlen; j++) {
//				ans = new Pair(Math.max(ans.val, dp[i][j].val), i, j);
//			}
//		}
//		System.out.println(ans);
	}

}
