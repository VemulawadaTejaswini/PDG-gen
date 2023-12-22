
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

import atCoder.template.f.Main.Pair;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		
		Pair LU = new Pair(0,0);
		Pair RU = new Pair(0,Integer.MAX_VALUE);
		Pair LD = new Pair(Integer.MAX_VALUE,0);
		Pair RD = new Pair(Integer.MAX_VALUE,Integer.MAX_VALUE);

		Pair LUN = RD;
		Pair RUN = LD;
		Pair LDN = RU;
		Pair RDN = LU;

		for( int i=0; i<n ; i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Pair c = new Pair(x,y);
			
			if(	LU.dist(c) < LU.dist(LUN) ) {
				LUN = c;
			}
			if(	RU.dist(c) < RU.dist(RUN) ) {
				RUN = c;
			}
			if(	LD.dist(c) < LD.dist(LDN) ) {
				LDN = c;
			}
			if(	RD.dist(c) < RD.dist(RDN) ) {
				RDN = c;
			}
		}

		long ans = Integer.MIN_VALUE;
		ans = Math.max( ans, LUN.dist(RUN) );
		ans = Math.max( ans, LUN.dist(LDN) );
		ans = Math.max( ans, LUN.dist(RDN) );
		ans = Math.max( ans, RUN.dist(LDN) );
		ans = Math.max( ans, RUN.dist(RDN) );
		ans = Math.max( ans, LDN.dist(RDN) );
		
		System.out.println(ans);
		
	}
	
	public static class Pair implements Comparable<Pair>{
		int c = 0;
		int d = 0;
		
		public Pair(int c, int d) {
			super();
			this.c = c;
			this.d = d;
		}

		public long dist( Pair o) {
			return Math.abs((long)o.c-c)+Math.abs((long)o.d-d);
		};
		
		@Override
		public int compareTo(Pair o) {
			int dd = this.d - o.d;
			if( dd != 0 ) {
				return dd;
			}
			int cc = this.c - o.c;
			return cc;
		}

		@Override
		public String toString() {
			return "Pair [c=" + c + ", d=" + d + "]";
		}
		
	}
}
