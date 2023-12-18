import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] h = new int[N]; int[] a = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		long[] dp = new long[N+1];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<h[i]; j++) {
				dp[i] = Math.max(dp[h[i]], dp[j]+a[i]);
			}
		}
		
		long ans = 0;
		for(int i=1; i<=N; i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
	}
}