import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
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
    long MOD = 1000000007;
    int[][] D = new int[60][3 * 100000];		// 60桁分の累積和
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	long[] A = new long[N];
    	for (int j = 0; j < N; j++) {
        	A[j] = Long.parseLong(sc.next());
        	for (int i = 0; i < 60; i++) {
        		if(j == 0)	D[i][j] = (int)((A[j] >> i) & 1); 
        		else		D[i][j] = D[i][j-1] + (int)((A[j] >> i) & 1); 
//        		out.println("D[" + i + "][" + j + "] = " + D[i][j]);
			}
		}
    	long ans = 0;
    	long wk1, wk2;
    	for (int i = 0; i < 60; i++) {
			wk1 = (1L << i) % MOD;
//			out.println("ビット　" + i + " を処理する　   2 ^ " + i + " = " + wk1);
			for (int j = 0; j < N - 1; j++) {
				wk2 = D[i][N-1] - D[i][j];
				if(((A[j] >> i) & 1) == 0) {
					ans += ((wk1 * wk2) % MOD);
//					out.println("　　先頭　 " + j + "は　０　　" + j + "より後ろの　１　の数　＝　" + wk2 + "  --> ans = " + ans);
				} else {
					ans += ((wk1 * (long)(N - (j+1) - wk2)) % MOD);
//					out.println("　　先頭　 " + j + "は　１　　" + j + "より後ろの　０　の数　＝　" + (N - (j+1) - wk2) + "  --> ans = " + ans);
				}
				ans %= MOD;
			}
		}
    	out.println(ans);
    }    
    // ==================================================================
}

