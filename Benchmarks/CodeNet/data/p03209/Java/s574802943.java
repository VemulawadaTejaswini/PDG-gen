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
    int N;
    long X;
    long[] T, C;
    long ans = 0;
    void calc(int now, long zan) {
//    	out.println("開始　　レベル　 = " + now + "  残り　= " + zan);
    	if(zan <= 0)	return;
    	if(now == 0) {
    		ans++;
//    		out.println(" 1 　終了　--> ans = " + ans);
    		return;
    	}
    	zan--;
    	if(T[now - 1] <= zan) {
    		ans += C[now - 1];
    		zan -= T[now - 1];
//    		out.println(" 2 　 ans = " + ans + " zan = " + zan);
    	} else {
    		calc(now - 1, zan);
    		zan = 0;
//    		out.println(" 3 　 ans = " + ans + " zan = " + zan);
    	}
    	if(zan <= 0)	return;
    	ans++;
    	zan--;
//		out.println(" 4 　 ans = " + ans + " zan = " + zan);
    	if(zan <= 0)	return;
    	if(T[now - 1] <= zan) {
    		ans += C[now - 1];
    		zan -= T[now - 1];
//    		out.println(" 5 　 ans = " + ans + " zan = " + zan);
    	} else {
    		calc(now-1, zan);
    		zan = 0;
//    		out.println(" 6 　 ans = " + ans + " zan = " + zan);
    	}
    }
    public void solve() {
		N = ni();
		X = nl();
		T = new long[N+1];
		C = new long[N+1];
		T[0] = C[0] = 1;
		for (int i = 1; i <= N; i++) {
			T[i] = T[i-1] * 2 + 3;
			C[i] = C[i-1] * 2 + 1;
//			out.println("T[" + i + "] = " + T[i] 
//					+ "  C[" + i + "] = " + C[i]);
		}
		calc(N, X);
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
