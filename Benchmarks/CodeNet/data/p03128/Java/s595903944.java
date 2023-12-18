import java.awt.Robot;
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
    int[] C = { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
    String BLANK = "";
    int N, M;
    List<PP> list = new ArrayList<>();
    String[] memo = new String[10001];
    String calc(int zan) {
//    	out.println("start calc  zan = " + zan);
    	if(zan == 0) {
//    		out.println("  return  空（到達）");
    		return BLANK;
    	} else if(zan < 0) {
//    		out.println("  return null");
    		return null;
    	}
    	if(memo[zan] != null) {
//    		out.println("  return memo[" + zan + "] = " + memo[zan]);
    		return memo[zan];
    	}
    	String ans = null, wk;
    	int sv = 0;
    	for(PP p : list) {
    		if(p.val != sv) {				// 使う本数が同じなら処理しない
	    		wk = calc(zan - p.val);
	    		if(wk != null) {
	    			ans = wk + p.key;
	    			break;
	    		}
	    		sv = p.val;
//    		} else {
//    			out.println("  処理対象外　　　数値　＝　" + p.key + "  本数　＝　" + p.val);
    		}
    	}
//    	out.println("end calc  zan = " + zan + "   ans = " + ans);
    	return memo[zan] = ans;
    }
    public void solve() {
    	N = ni();
    	M = ni();
    	int a;
    	for (int i = 0; i < M; i++) {
			a = ni();
			list.add(new PP(a, C[a - 1]));
		}
    	list.sort(comparing(PP::getVal).thenComparing(PP::getKey, reverseOrder()));
    	char[] tc = calc(N).toCharArray();
    	Arrays.sort(tc);
    	String ans = new StringBuffer(new String(tc)).reverse().toString();
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
