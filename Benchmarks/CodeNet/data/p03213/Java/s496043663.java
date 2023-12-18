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
    // N! を素因数分解する								
    int[] E = new int[100];		// [i] : i の何乗かを設定する　 4! = 2^2 * 3 = --> [2]=2 　[3]=1						
    void calc(int N) {								
    	int cur;							
    	for(int i=2; i <= N; i++) {			// ２～Ｎを個別に素因数分解する				
    		cur = i;						
    		for(int j=2; j*j <= i; j++) {						
    			while(cur % j == 0) {					
    				E[j]++;				
    				cur = cur / j;				
    			}					
    		}						
    		if(cur > 1)	E[cur]++;		// 素数			
    	}							
    }
//    // パスカルの三角形を作る				
//    long[][] dp;				
//    public void make_comb_dp(int n) {				
//        dp = new long[n+1][n+1];				
//        for(int i = 0; i < n+1; i++) {				
//            dp[i][0] = 1L;				
//            dp[i][i] = 1L;				
//        }				
//        for(int i = 2; i < n+1; i++) {				
//    	    for(int j = 1; j < i; j++) {			
//                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];				
//    	    }			
//        }				
//    }				
//    // 二項係数を返す				
//    boolean initFlag = false;				
//    public long combination(int n, int k) {				
////    	if(!initFlag){			
////    		make_comb_dp(n);		
////    		initFlag = true;		
////    	}			
//    	return(dp[n][k]);			
//    }				

	public void solve() {
		int N = ni();
		calc(N);
//		for (int i = 0; i < N; i++) {
//			if(E[i] > 0)	out.println("E[" + i + "] = " + E[i]);
//		}
		int cnt_2 = 0, cnt_4 = 0, cnt_14 = 0, cnt_24 = 0, cnt_74 = 0;
		for (int i = 0; i < E.length; i++) {
//			if(E[i] >= 2 && E[i] < 4)	cnt_2++;
//			else if(E[i] >= 4)			cnt_4++;
			if(E[i] >= 2)		cnt_2++;
			if(E[i] >= 4)		cnt_4++;
			if(E[i] >= 14)		cnt_14++;
			if(E[i] >= 24)		cnt_24++;
			if(E[i] >= 74)		cnt_74++;
		}
//		make_comb_dp(100);
//		long ans = combination(cnt_4, 2) * combination(cnt_2, 1)
//					+ combination(cnt_4, 3) * 3;
		long ans = cnt_74 + cnt_24 * (cnt_2 - 1) + cnt_14 * (cnt_4 - 1)
					+ (cnt_4 * (cnt_4 - 1) * (cnt_2 -2)) / 2;
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
