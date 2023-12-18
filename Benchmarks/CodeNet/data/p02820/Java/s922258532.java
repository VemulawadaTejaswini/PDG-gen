import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Objects;
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
    //================================================================================
    final int RR = 1, SS = 2, PP = 3;
    int N, K, R, S, P;
    char[] C;
    int[][] CK;
    int[][] dp;
    int calc(int s, int d) {
    	if(s == RR && d == SS)		return R;
    	else if(s == SS && d == PP)	return S;
    	else if(s == PP && d == RR)	return P;
    	else						return 0;
    }
    public void solve() {
    	N = Integer.parseInt(sc.next());
    	K = Integer.parseInt(sc.next());
    	R = Integer.parseInt(sc.next());
    	S = Integer.parseInt(sc.next());
    	P = Integer.parseInt(sc.next());
    	C = sc.next().toCharArray();
    	// mod K で分割する
    	int max = N / K + 1;
    	CK = new int[K][max];
    	for (int i = 0; i < N; i++) {
    		int wk = 0;
    		if(C[i] == 'r')			wk = RR;
    		else if(C[i] == 's')	wk = SS;
    		else					wk = PP;
			CK[i % K][i / K] = wk;
		}
    	long ans = 0;
    	dp = new int[max+3][4];
    	for (int i = 0; i < K; i++) {
			for (int j = 0; j < dp.length; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					dp[j][j2] = 0;
				}
			}
			for (int j = 0; j < max; j++) {
				for (int j2 = 1; j2 < 4; j2++) {
					if(j2 == RR) {
						dp[j+1][RR] = Math.max(dp[j+1][RR], dp[j][SS] + calc(RR, CK[i][j]));
						dp[j+1][RR] = Math.max(dp[j+1][RR], dp[j][PP] + calc(RR, CK[i][j]));
					} else if(j2 == SS) {
						dp[j+1][SS] = Math.max(dp[j+1][SS], dp[j][RR] + calc(SS, CK[i][j]));
						dp[j+1][SS] = Math.max(dp[j+1][SS], dp[j][PP] + calc(SS, CK[i][j]));
					} else if(j2 == PP) {
						dp[j+1][PP] = Math.max(dp[j+1][PP], dp[j][RR] + calc(PP, CK[i][j]));
						dp[j+1][PP] = Math.max(dp[j+1][PP], dp[j][SS] + calc(PP, CK[i][j]));
					}
				}
			}
			ans += (Math.max(dp[max][RR], Math.max(dp[max][SS], dp[max][PP])));
		}
    	out.println(ans);
    }
}