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
	public void solve() {
		int N = ni();
		char[] PC = new char[N];
		for (int i = 0; i < N; i++)		PC[i] = (char)('0' + ni());
		char[] QC = new char[N];
		for (int i = 0; i < N; i++)		QC[i] = (char)('0' + ni());
		String P = String.valueOf(PC);
		String Q = String.valueOf(QC);
		int[] ord = new int[N];
		for (int i = 0; i < N; i++)	ord[i] = i+1;
		Map<String, Integer> map = new HashMap<>();
		int cnt = 1;
		char[] wd = new char[N];
		String wk;
		do {
			for (int i = 0; i < N; i++)		wd[i] = (char)('0' + ord[i]);
			wk = String.valueOf(wd);
			map.put(wk, cnt++);
		} while (next_permutation(ord));
		int ans = Math.abs(map.get(P) - map.get(Q));
		out.println(ans);
	}
	// 与えられた配列の中身を辞書順に、次の順列をセットする（次がなければ　false を返す）								
	public boolean next_permutation(int[] a) {								
		for (int i = a.length - 2; i >= 0; i--) {							
			if (a[i] < a[i + 1]) {						
				for (int j = a.length - 1;; j--) {					
					if (a[i] < a[j]) {				
						int temp = a[i];			
						a[i] = a[j];			
						a[j] = temp;			
						for (i++, j = a.length - 1; i < j; i++, j--) {			
							temp = a[i];		
							a[i] = a[j];		
							a[j] = temp;		
						}			
						return true;			
					}				
				}					
			}						
		}							
		return false;							
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
