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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
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
    // ==================================================================
    int N, M;
    boolean[] used = null;					// 使用済みのマーク				
    int[] data = null;						// 作成中の順列の１つ				
    TreeSet<Integer> set = new TreeSet<>();									
    // 順列の作成　　　now : 現在の値　　depth : 現在の深さ										
    public void permutation(int now, int depth, PrintWriter out) {										
//    	out.println("start  now = " + now + "  depth = " + depth );									
    	if(depth == N) {				// できた順列の１つに対する処理					
//    	    for(int i = 0; i < N; i++)     out.print("[" + data[i] + "]");									
//    	    out.println("");									
    		int p = 0, keta = 1;
    		for (int i = 0; i < N; i++) {
    			p += data[N-i-1] * keta;
    			keta *= 10;
    		}
    		set.add(p);
    	}									
    	for(int i=0; i < N; i++) {									
    		if(!used[i]) {								
    			used[i] = true;			//　使用済みとする				
    			data[depth] = i + 1;							
    			permutation(i, depth + 1, out);							
    			used[i] = false;			// 戻す				
    		}								
    	}									
//    	out.println("end  now = " + now + "  depth = " + depth);									
    }
	public void solve() {
		N = ni();
		int[] P = ndi(N);
		int[] Q = ndi(N);
		int p = 0, q = 0, keta = 1;
		for (int i = 0; i < N; i++) {
			p += P[N-i-1] * keta;
			q += Q[N-i-1] * keta;
			keta *= 10;
		}
//		out.println("p = " + p + " q = " + q);
		used = new boolean[N];
		data = new int[N];
	    permutation(0, 0, out);
	    int a = 0, b = 0, cnt = 1;
	    for(int wk : set) {
//	    	out.println("wk = " + wk);
	    	if(wk == p)		a = cnt;
	    	if(wk == q)		b = cnt;
	    	cnt++;
	    	if(a != 0 && b != 0)	break;
		}
	    out.println(Math.abs(a - b));
	}
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
