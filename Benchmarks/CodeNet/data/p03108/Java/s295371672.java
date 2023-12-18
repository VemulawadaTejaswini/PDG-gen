import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

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
    // ======================================================================
	int[] par;	    			// [子番号] = 親番号(親の場合、メンバ数のマイナス値)
								// [1]=3 [2]=-1 [3]=-2  なら　１　と　３　は　同じグループ
	// 親の番号を返す（この中で親に直接つなぎ変えている
	int root(int x) {			
		if(par[x] < 0)     	return x;	// 親の場合はマイナスが入っている
		else                return par[x] = root(par[x]);
	}
	// 同じグループなら true を返す
	boolean same(int x, int y) {	
		return root(x) == root(y);
	}
	// グループ数を返す
	int groupCnt() {
		int ans = 0;
		for(int i = 0; i < par.length; i++) {
			if(par[i] < 0)	ans++;
		}
		return ans;
	}
	// メンバ数を返す
	int size(int x) {
		return -par[root(x)];
	}
	// 同じ親につなげる
	void connect(int x, int y) {	
		x = root(x);			// 親を取得する
		y = root(y);			// 親を取得する
		if(x == y)  return;		// 同じなので処理しない
		if(size(x) > size(y)) {	// メンバ数が多い方にくっつける
			par[x] += par[y];	//   メンバ数を更新する
			par[y] = x;			//   親番号を設定する
		} else {
			par[y] += par[x];
			par[x] = y;
		}
	}
	// 初期化
	void init(int n) {
		par = new int[n];
		Arrays.fill(par, -1);	// 全部が親で、メンバ数を　１　とする
	}
	void dump(PrintWriter out) {
		for(int i = 0; i < par.length; i++) {
		    out.println("par[" + i + "] = " + par[i]);
		}
		out.println("");
	}
    int[][] B;
    public void solve() {
    	int N = ni();
    	int M = ni();
    	B = new int[M][2];
    	for (int i = 0; i < M; i++) {
			B[i][0] = ni() - 1;
			B[i][1] = ni() - 1;
		}
    	init(N);
    	long[] ans = new long[M];
    	ans[M-1] = (long)N * (N-1) / 2;
    	for (int i = M-1; i > 0; i--) {
			ans[i-1] = ans[i];
			if(!same(B[i][0], B[i][1])) {
				ans[i-1] -= (long)size(B[i][0]) * size(B[i][1]);
				connect(B[i][0], B[i][1]);
			}
		}
    	for (int i = 0; i < M; i++) {
			out.println(ans[i]);
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
