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
    	int N = ni();
    	int W = ni();
    	int[][] wv = new int[N][2];
    	for (int i = 0; i < N; i++) {
			wv[i] = ndi(2);
		}
    	long[][] dp = new long[2][100010];
    	Arrays.fill(dp[0], 1000000000000000000L);
    	Arrays.fill(dp[1], 1000000000000000000L);
    	dp[0][0] = 0;
    	int from = 0, to = 1;
    	for (int i = 0; i < N; i++) {
    		from = (i & 1);
    		to = (from + 1) & 1;
    		for (int j = 0; j <= 100000; j++) {
    			if(dp[from][j] + wv[i][0] <= W)
    				dp[to][j + wv[i][1]] = Math.min(dp[to][j + wv[i][1]], 
    												dp[from][j] + wv[i][0]); 
    			dp[to][j] = Math.min(dp[to][j], dp[from][j]); 
			}
		}
    	long ans = 0;
		for (int j = 0; j <= 100000; j++) {
			if(dp[to][j] <= W)	ans = j;
		}
    	out.println(ans);
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
