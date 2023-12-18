import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(), maxw = kb.nextInt();
		
		int[] v = new int[n];
		int[] w = new int[n];
		
		for(int i = 0; i < n; i++) {
			w[i] = kb.nextInt();
			v[i] = kb.nextInt();
		}
		System.out.println(knap(maxw, v, w));
	}
	static long knap(int maxw, int[] v, int[] w) {
		long[][] cache = new long[w.length+1][maxw+1];
		
		for(int i = 1; i <= w.length; i++) {
			for(int x = 0; x <= maxw; x++) {
				if(w[i-1] > x) {
					cache[i][x] = cache[i-1][x];
				}else {
					cache[i][x] = Math.max(cache[i-1][x], cache[i-1][x-w[i-1]] + v[i-1]);
				}
			}
		}
		return cache[w.length][maxw];
	}
}
