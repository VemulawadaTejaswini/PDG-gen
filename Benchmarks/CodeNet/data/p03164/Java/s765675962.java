import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	static int n;
	static long INF = (long)1e18;
	static int[] v, w;
	static TreeMap<Pair, Long> tree;
	
	public static long dp(int i, int r) {
		if(r < 0)
			return -INF;
		if(i == n || r == 0)
			return 0;
		
		Pair p = new Pair(i, r);
		if(tree.containsKey(p))
			return tree.get(p);
		
		long max = Math.max(v[i] + dp(i + 1, r - w[i]), dp(i + 1, r));
		tree.put(p, max);
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int weight = sc.nextInt();
		
		v = new int[n];
		w = new int[n];
		for(int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		tree = new TreeMap<>();
		
		System.out.println(dp(0, weight));
	}
	
	public static class Pair implements Comparable<Pair> {
		int i, w;
		
		public Pair(int i, int w) {
			this.i = i;
			this.w = w;
		}
		
		public int compareTo(Pair p) {
			if(this.i == p.i)
				return this.w - p.w;
			return this.i - p.i;
		}
		
		public boolean equals(Object o) {
			Pair p = (Pair)o;
			return this.i == p.i && this.w == p.w;
		}
	}
}
