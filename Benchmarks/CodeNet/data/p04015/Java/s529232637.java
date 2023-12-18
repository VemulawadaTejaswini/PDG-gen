import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    int N, A;
    int[] X;
    long[][][] memo;
    int[][][] dp;
    long calc(int now, int cnt, int total) {
//    	out.println("calc start  now = " + now + "  cnt = " + cnt + "  total = " + total);
    	if(now >= N) {
    		if(cnt != 0 && cnt * A == total) {
//    			out.println(" -->  return  1");
    			return 1;
    		} else {
//    			out.println(" -->  return  0");
    			return 0;
    		}
    	}
		if(memo[now][cnt][total] != -1)		return memo[now][cnt][total];
		long ans = 0;
		ans += calc(now + 1, cnt + 1, total + X[now]);
		ans += calc(now + 1, cnt, total);
//    	out.println("    end  ans = " + ans + "  now = " + now + "  cnt = " + cnt + "  total = " + total);
		return memo[now][cnt][total] = ans;
    }
    public void solve() {
    	N = ni();
    	A = ni();
    	X = ndi(N);
//    	dp = new int[N+1][N+1][50*50+10];
    	memo = new long[N][N][50*50+10];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				Arrays.fill(memo[i][j], -1);
			}
		}
    	out.println(calc(0,0,0));
//    	for (int i = 0; i < N; i++) {
//    		for (int j = 0; j < N; j++) {
//				for (int k = 0; k <= 50 * 50; k++) {
//					dp[i+1][j+1][k + X[i]] = Math.max(dp[i+1][j+1][k + X[i]], dp[i][j][k] + 1);
//					dp[i+1][j][k] = Math.max(dp[i+1][j][k], dp[i][j][k]);
//				}
//    		}
//		}
////    	for (int i = 1; i < N; i++) {
////			for (int j = 1; j < N; j++) {
////				for (int j2 = 0; j2 <= 50*50; j2++) {
////					if(j2 == 7 || j2 == 8 || j2 == 9 || j2 == 14 || j2 == 15 
////							|| j2 == 16	|| j2 == 17 || j2 == 18 || j2 == 24)
////						out.println("dp[" + i + "][" + j + "][" + j2 + "] = " + dp[i][j][j2]);
////				}
////			}
////		}
//    	int ans = 0;
//    	for (int i = 1; i < N; i++) {
//			ans += dp[N][i][i * A];
//			out.println("dp[" + N + "][" + i + "][" + (i * A) + "] = " + dp[N][i][i * A]);
//		}
//    	out.println(ans);
    }
    // Set に入れるなら　PPKEY　を使う！
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
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
