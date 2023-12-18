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
    final int MOD = 1000000007;
    public void solve() {
    	int H = ni();
    	int W = ni();
    	char[][] A = new char[H+10][W+10];
    	char[] wk;
    	for (int i = 0; i < H; i++) {
    		wk = ns().toCharArray();
    		for (int j = 0; j < W; j++) {
				A[i][j] = wk[j];
			}
		}
    	int[][] dp = new int[H][W];
    	dp[0][0] = 1;
    	for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(A[i+1][j] == '.')
					dp[i+1][j] = (int)(((long)dp[i+1][j] + (long)dp[i][j]) % MOD);
				if(A[i][j+1] == '.')
					dp[i][j+1] = (int)(((long)dp[i][j+1] + (long)dp[i][j]) % MOD);
			}
		}
    	out.println(dp[H-1][W-1]);
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
