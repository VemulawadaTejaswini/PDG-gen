
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int n;
	int[] cost, dp;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cost = new int[n];
		for (int i=0;i<n;i++) cost[i] = sc.nextInt();
		
		System.out.println(solve());
//		debug(dp);
	}
	
	int solve() {
		dp = new int[n]; fill(dp, INF); dp[0] = 0;
		PriorityQueue<P> q = new PriorityQueue<P>();
		q.add(new P(0, 0));
		
		for (;;) {
			P cur = q.remove();
			if (cur.p == n-1) return cur.c;
			
			if (cost[cur.p] != 0) {
				if (dp[cur.p + cost[cur.p]] > cur.c) {
					dp[cur.p + cost[cur.p]] = cur.c;
					q.add(new P(cur.p + cost[cur.p], cur.c));
				}
			}
			else {
				for (int i=1;i<=6;i++) {
					int next = min(n-1, cur.p + i);
					if (dp[next] > cur.c + 1) {
						dp[next] = cur.c + 1;
						q.add(new P(next, cur.c + 1));
					}
				}
			}
		}
	}
	
	class P implements Comparable<P>{
		int p, c;
		P(int p, int c) {
			this.p = p;
			this.c = c;
		}
		@Override
		public int compareTo(P o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			if (c != o.c)
				return c - o.c;
			return o.p - p;
		}
	}
	

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}