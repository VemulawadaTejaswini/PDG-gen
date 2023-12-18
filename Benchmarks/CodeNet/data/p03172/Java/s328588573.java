import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[][] cache;
	static final int MOD = 1000000007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int K = Integer.parseInt(S[1]);
		
		int[] A = new int[N];
		
		S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			A[i] = Integer.parseInt(S[i]);
		}
		
		cache = new int[N][K+1];
		
		for(int i = 0; i < N; i++) {
			cache[i][0]  = 1;
		}
		
		int temp =  Math.min(K, A[0]);
		for(int i = 1 ; i <= temp; i++) {
			cache[0][i] = 1;
		}
		
		System.out.println(ways(A, K));
	}
	
	public static int ways(int[] A, int K) {
		int N = A.length;
		int[] prevSum = new int[K+1];
		prevSum[0] = 1;
		
		for(int i = 0; i < N; i++) {
			cache[i][0]  = 1;
		}
		
		int temp =  Math.min(K, A[0]);
		for(int i = 1 ; i <= temp; i++) {
			cache[0][i] = 1;
			prevSum[i] = (prevSum[i-1] + cache[0][i]) % MOD;
		}
		
		for(int i = temp + 1; i<=K; i++) {
			prevSum[i] = (prevSum[i-1] + cache[0][i]) % MOD;
		}
		
		for(int i = 1; i < N ; i++) {
			int[] currSum = new int[K+1];
			currSum[0] = 1;
			for(int k = 1; k <= K; k++) {
				temp =  Math.min(k, A[i]);
				if(k-temp == 0) {
					cache[i][k] = prevSum[k];
				} else {
					cache[i][k] = prevSum[k] - prevSum[k-temp-1];
				}
				currSum[k] = (currSum[k-1] + cache[i][k]) % MOD;
			}
			prevSum = currSum;
		}
		
		return cache[N-1][K];
	}
}
