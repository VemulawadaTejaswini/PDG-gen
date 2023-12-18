import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==========================================================
    public void solve() {
    	char[] S = ns().toCharArray();
    	char[] T = ns().toCharArray();
    	int[][] dp = new int[3001][3001];
    	for (int i = 0; i < S.length; i++) {
			for (int j = 0; j < T.length; j++) {
				if(S[i] == T[j]) {
					dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j] + 1);
				} else {
					dp[i+1][j+1] = Math.max(dp[i+1][j+1],
									Math.max(dp[i][j+1], dp[i+1][j]));
				}
			}
		}
//    	out.println(dp[S.length][T.length]);	// 最長の長さ
    	
    	StringBuffer sb = new StringBuffer();
    	int si = S.length;
    	int tj = T.length;
    	while(si > 0 && tj > 0) {
    		if(dp[si][tj] == dp[si-1][tj])	si--;
    		if(dp[si][tj] == dp[si][tj-1])	tj--;
    		if(si>0 && tj > 0 && (dp[si][tj] != dp[si-1][tj-1])) {
				sb.append(S[si-1]);		// dp は　+1　しているので　-1 する
				si--; tj--;
    		}
    	}
    	char[] ans = sb.toString().toCharArray();
    	for (int i = ans.length-1; i >= 0; i--) {
			out.print(ans[i]);
		}
    	out.println("");
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return sc.nextInt();
    }
    public long nl() {
    	return sc.nextLong();
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] nddi(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
