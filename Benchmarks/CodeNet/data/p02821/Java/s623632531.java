import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

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
    public interface Sub {
        PPL func(int param);
    }
    List<Integer> list = new ArrayList<>();
    public void solve() {
    	int N = ni();
    	int M = ni();
    	int[] A = ndi(N);
    	Arrays.sort(A);
    	long[] sum = new long[N+1];
    	for (int i = 0; i < N; i++) {
			sum[i+1] = sum[i] + A[i];
		}
    	Sub sub = param -> {					// param 以上の幸福度の数と合計値を返す
//    		out.println("start sub　幸福度（左＋右）　= " + param);
    		int left, right, mid = 0, val;
    		long cnt = 0, total = 0;
    		for (int i = 0; i < N; i++) {
    			val = param - A[i];
//				out.println("  左の位置　 = " + i + "  必要な幸福度（右）　 = " + val + "　これ以上を探す");
//    			if(val < 0)	continue;
	    		left = -1; right = N;
	    		while(Math.abs(right - left) > 1) {
	    			mid = (left + right) / 2;
	    			if(A[mid] >= val)	right = mid;
	    			else				left = mid;
	    		}
	    		cnt += (N - right);
	    		total += (sum[N] - sum[right] + (long)A[i]*(N - right));
//				out.println(" 右の位置　　最小　= " + left + "  最大　 = " + right + "  中間　 = " + mid 
//						+ "  見つかった値　A[" + mid + "] = " + A[mid]	+ "  見つかった数　 = " + (N - right) 
//						+ "  　合計値　 = " + (sum[N] - sum[right] + A[i]*(N - right)));
    		}
    		return new PPL(cnt, total);
    	};
    	PPL pp = new PPL(0,0);
		int left, right, mid;
		left = 0; right = A[N-1]*2 + 1;			// 握手１回の幸福度の範囲を２分探索する
		while(Math.abs(right - left) > 1) {
			mid = (right + left) / 2;
			pp = sub.func(mid);
			if(pp.key >= M)		left = mid;		// mid 以上の幸福度が、Ｍ個以上見つかれば
			else				right = mid;
//			out.println("　　→　１回の握手の幸福度の 　　最低　 = " + left + "  最大 = " + right + "  中間　 = " + mid 
//					+ "  見つかった個数　 = " + pp.key + "  合計値　 = " + pp.val);
		}
//		out.println("---- 最後の left の値が正しいので　再計算 する　-----");
		pp = sub.func(left);
		long ans = pp.val - (pp.key - M) * left;
//		out.println("cnt = " + pp.key + "  total = " + pp.val);
		out.println(ans);
    }
    class PPL {
    	public long key, val;
    	public PPL(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long getVal() {
			return val;
		}
		public void setVal(long val) {
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
