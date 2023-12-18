
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

import atCoder.abc177.f.Main.Pair;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		PriorityQueue<Pair> q = new PriorityQueue<Pair>();
		Pair[] a = new Pair[n];
		
		for( int i=0 ; i<n ; i++ ) {
			a[i] = new Pair(sc.nextInt(), sc.nextInt() );
			q.add(a[i]);
		}
		
		Arrays.sort(a);
		
		boolean canFinish = true;
		int time =0;
		for( int i = 0 ; i< n ; i++ ) {
			time+= a[i].weight;
			if( a[i].limit < time ) {
				canFinish = false;
				break;
			}
		}
		
		if( canFinish ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

	public static class Pair implements Comparable<Pair>{
		int weight = 0;
		int limit = 0;
		
		public Pair(int weight, int limit) {
			super();
			this.weight = weight;
			this.limit = limit;
		}

		@Override
		public int compareTo(Pair o) {
			return limit - o.limit;
		}
	
	}
}
