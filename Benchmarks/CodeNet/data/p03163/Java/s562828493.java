import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(), maxw = kb.nextInt();
		
		int[] w = new int[n];
		int[] v = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			w[i] = kb.nextInt();
			v[i] = kb.nextInt();
		}
		System.out.println(dp(maxw, w, v));
	}
	static int dp(int maxw, int[] w, int[] v) {
		int[][] cache = new int[2][maxw+1];
		int pre = 0, cur = 1;
		
		for(int i = 1; i <= w.length; i++) {
			for(int x = 0; x <= maxw; x++) {
				if(w[i-1] > cache[pre][x]) {
					cache[cur][x] = cache[pre][x];
				}else {
					cache[cur][x] = Math.max(cache[pre][x], cache[pre][x-w[i]]+v[i-1]);
				}
			}
			int temp = cur;
			cur = pre;
			pre = temp;
		}
		return cache[w.length][maxw];
	}
}
