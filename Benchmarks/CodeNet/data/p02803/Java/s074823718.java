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
	int[] dx = { 0, 0, -1, 1 };
	int[] dy = { -1, 1, 0, 0 };
	
	int H, W;
	char[][] c = null;											// 地図
	int[][] f = null;											// 何番目かを保存（通ったかどうかのフラグも兼ねる）
	int wcnt = 0;												// 最初の白の数
	Queue<PP> que = new ArrayDeque<>();							// キュー
	
	// スタートとゴールの位置を受け取る
	int calc(int s_h, int s_w, int g_h, int g_w) {
//		out.println("start calc  (" + s_h + ", " + s_w + ") --> (" + g_h + ", " + g_w + ")");
		int h, w, n_h, n_w;
		PP p = null;
    	for(int i=0; i < H; i++) {								// 値の初期化
    		Arrays.fill(f[i], -1);
    	}
		f[s_h][s_w] = 0;										// スタートの値が　０
		que.clear();
		que.add(new PP(s_h, s_w));								// スタートをキューに入れる
		while(que.peek() != null) {
			p = que.poll();
			h = p.getKey();
			w = p.getVal();
//    		out.println("  y = " + h + "  x = " + w);
			if(h == g_h && w == g_w) {							// ゴールかの判定
//        		out.println(" goal  -->   f(" + h + ", " + w + ") = " + f[h][w]);
				break;
			}
			for(int i=0; i < 4; i++) {
				n_h = h + dy[i];
				n_w = w + dx[i];
				if(n_h < 0 || n_h >= H || n_w < 0 || n_w >= W) {
					continue;
				}
				if(f[n_h][n_w] == -1 && c[n_h][n_w] != '#') {	// まだ　通っていなければ
					que.add(new PP(n_h, n_w));					// キューに追加する
					f[n_h][n_w] = f[h][w] + 1;					// 何番目かを設定する
				}
//				out.println("f[" + n_h + "][" + n_w + "] = " + f[n_h][n_w]);
			}
		}
		return f[g_h][g_w];										// ゴールが何番目を返す
	}
    public void solve() {
    	H = ni();
    	W = ni();
    	c = new char[H][W];				// 地図
    	f = new int[H][W];				// 何番目かを保存（通ったかどうかのフラグも兼ねる）
    	for (int i = 0; i < H; i++) {
			c[i] = ns().toCharArray();
		}
    	int ans = 0;
    	for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(c[i][j] == '#')		continue;
				for (int i2 = 0; i2 < H; i2++) {
					for (int j2 = 0; j2 < W; j2++) {
						if(c[i2][j2] == '#')		continue;
						ans = Math.max(ans, calc(i, j, i2, j2));
					}
				}
			}
		}
    	out.println(ans);
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
