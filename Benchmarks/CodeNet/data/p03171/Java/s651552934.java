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
    int N;
    int[] A;
    long[][] memo;
    long calc(int now, int left) {
    	if(now >= N)				return 0;
    	if(memo[now][left] != -1)	return memo[now][left];
    	long ans = 0;
    	int right = left + N - now - 1;
    	if(now % 2 == 0) {				// 先手
        	ans = calc(now + 1, left + 1) + A[left];
        	ans = Math.max(ans, calc(now + 1, left) + A[right]);
    	} else {						// 後手
        	ans = calc(now + 1, left + 1) - A[left];
        	ans = Math.min(ans, calc(now + 1, left) - A[right]);
    	}
    	return memo[now][left] = ans;
    }
    public void solve() {
    	N = ni();
    	A = ndi(N);
    	memo = new long[N][N];
    	for (int i = 0; i < N; i++) {
			Arrays.fill(memo[i], -1);
		}
    	out.println(calc(0, 0));
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
