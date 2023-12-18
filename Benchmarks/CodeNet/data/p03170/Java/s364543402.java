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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken());
		
		int[] a = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean[] dp = new boolean[K+1]; //true if next turn wins
		dp[0] = false;
		for(int i=1; i<=K; i++) {
			if(i>=a[0]) {
				for(int x: a) {
					if(!dp[i-x]) {
						dp[i] = true;
						break;
					}
				}
			}else {
				dp[i] = false;
			}
		}

		if(dp[K]) {
			System.out.println("First");
		}else {
			System.out.println("Second");
		}
		
	}
}
