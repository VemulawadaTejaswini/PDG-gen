import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int SIZE = 100005;
	static int[] even = new int[SIZE];
	static int[] odd = new int[SIZE];
	static Pair[] evenPair = null;
	static Pair[] oddPair = null;
	static int ans = 0;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			int v = sc.nextInt();
			if(i % 2 == 0) ++even[v];
			else ++odd[v];
		}
		
		evenPair = getSortedArray(even);
		//System.out.println(Arrays.toString(evenPair));
		oddPair = getSortedArray(odd);
		//System.out.println(Arrays.toString(oddPair));
		
		if(evenPair[0].y != oddPair[0].y) {
			ans = n - evenPair[0].x - oddPair[0].x;
		} else {
			int p = n - evenPair[0].x - oddPair[1].x;
			int q = n - evenPair[1].x - oddPair[0].x;
			ans = Math.min(p, q);
		}
		System.out.println(ans);
	}
	
	static Pair[] getSortedArray(int[] cnt) {
		Pair[] res = new Pair[SIZE];
		for(int i = 0; i < SIZE; ++i) res[i] = new Pair(cnt[i], i);
		Arrays.sort(res, Comparator.reverseOrder());
		return res;
	}
}

class Pair implements Comparable<Pair> {
	int x;
	int y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Pair p) {
		if(this.x != p.x) return this.x - p.x;
		else return this.y - p.y;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		sb.append(this.x);
		sb.append(", ");
		sb.append(this.y);
		sb.append(')');
		return sb.toString();
	}
}