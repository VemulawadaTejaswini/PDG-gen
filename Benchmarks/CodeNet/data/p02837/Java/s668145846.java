import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[][] g = new int[n][n];
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			Arrays.fill(g[i], -1);
			for(int j = 0; j < m; j++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt();
				g[i][x] = y;
			}
		}
		int max = 0;
		for(int mask = 0; mask < (1 << n); mask++) {
			if(check(mask, g, n)) {
				max = Integer.max(count(mask), max);
			}
		}
		System.out.println(max);
	}
	static int count(int mask) {
		int res = 0;
		while(mask > 0) {
			if((mask & 1) > 0) res++;
			mask >>= 1;
		}
		return res;
	}

	static boolean check(int mask, int[][] g, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(((1 << i) & mask) > 0) {
					int k = ((1 << j) & mask) > 0? 1:0;
					if(g[i][j] >= 0 && g[i][j] != k) return false;
				}
			}
		}
		return true;
	}
	
	
}
