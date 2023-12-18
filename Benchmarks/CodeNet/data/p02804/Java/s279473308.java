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
    // ==================================================================
    int MAX = 510000;					
    int MOD = 1000000007;					
    long[] fac, finv, inv;			// a! (fac[a])   (a!)の-1乗 (finv[a])		
    // テーブルを作る前処理　→　これを呼んでから COM() を呼ぶ					
    void COMinit() {					
    	fac = new long[MAX];				
    	finv = new long[MAX];				
    	inv = new long[MAX];				
    	fac[0] = fac[1] = 1;				
    	finv[0] = finv[1] = 1;				
    	inv[1] = 1;				
    	for (int i = 2; i < MAX; i++){				
        		fac[i] = fac[i - 1] * i % MOD;			
    		inv[i] = (long)MOD - inv[MOD%i] * (MOD / i) % MOD;			
    		finv[i] = finv[i - 1] * inv[i] % MOD;			
    	}				
    }					
    // 二項係数計算					
    long COM(int n, int k){					
    	if (n < k)		return 0;		
    	if (n < 0 || k < 0)		return 0;		
    	return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;				
    }
    int N, K;
    int[] A;
    long calc_1() {
    	long ans = 0, wk;
    	for (int i = 0; i < N-K+1; i++) {
			for (int j = i+K-1; j < N; j++) {
				wk = A[j] - A[i];
				wk = (wk * COM(j-i-1, K-2)) % MOD;
				ans = (ans + wk) % MOD;
			}
		}
    	return ans;
    }
    long calc_2() {
    	long min = 0, wk;
    	for (int i = 0; i < N-K+1; i++) {
    		wk = ((long)A[i] * COM(N-i-1, K-1)) % MOD;
			min = (min + wk) % MOD;
		}
    	long max = 0;
    	for (int i = K-1; i < N; i++) {
    		wk = ((long)A[i] * COM(i, K-1)) % MOD;
    		max = (max + wk) % MOD;
		}
    	return (max - min + MOD) % MOD;
    }
    public void solve() {
    	COMinit();
    	N = ni();
    	K = ni();
    	A = ndi(N);
    	Arrays.sort(A);
    	out.println(calc_2());

//    	// debug
//    	Random random = new Random(0);
//    	try {
//		    FileWriter file = new FileWriter("C:\\temp\\test_data.txt");
//		    PrintWriter pw = new PrintWriter(new BufferedWriter(file));
//			for (int i = 2; i <= 1000; i++) {
//				N = i;
//				A = new int[N];
//				K = random.nextInt(i-1) + 1;
//				for (int j = 0; j < N; j++) {
//					A[j] = random.nextInt(1000000000-1) + 1;
//				}
//		    	Arrays.sort(A);
//		    	long ans_1 = calc_1();
//		    	long ans_2 = calc_2();
//		    	if(ans_1 != ans_2) {
//		    		pw.println("ans_1 = " + ans_1 + "  ans_2 = " + ans_2);
//		    		pw.println("N = " + N + "  K = " + K);
//		    		for (int j = 0; j < N; j++) {
//		    			pw.print(A[j] + " ");
//					}
//		    		pw.println("");
//		    		pw.close();
//		    		out.println("NG");
//		    		return;
//		    	}
//			}
//    	} catch(Exception ex) {
//    		ex.printStackTrace();
//    	}
//    	out.println("OK");
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
