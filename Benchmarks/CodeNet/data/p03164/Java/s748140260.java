import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class taro {
	public static void main(String args[]) throws IOException{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(kb.readLine());
		
		int n = Integer.parseInt(st.nextToken()), maxw = Integer.parseInt(st.nextToken());
		
		int[] v = new int[n];
		int[] w = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(kb.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(dp(maxw, w, v));
	}
	static long dp(int maxw, int[] w, int[] v) {
		long[][] cache = new long[2][maxw+1];
		int pre = 0, cur = 1;
		
		for(int i = 1; i <= w.length; i++) {
			for(int x = 0; x <= maxw; x++) {
				if(w[i-1] > x) {
					cache[cur][x] = cache[pre][x];
				}else {
					cache[cur][x] = Math.max(cache[pre][x], cache[pre][x-w[i-1]]+v[i-1]);
				}
			}
			int temp = cur;
			cur = pre;
			pre = temp;
		}
		return cache[pre][maxw];
	}
}
