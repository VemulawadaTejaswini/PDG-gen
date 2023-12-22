import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	
	public static final int N_MAX = 20 + 1;
	public static final int K_MAX = 10 + 1;
	public static final int S_MAX = 155 + 1;
	
	public static int memo(final int n, final int k, final int s, int[][][] memo){
		//System.out.println(n + " " + k + " " + s);
		if(memo[n][k][s] >= 0){
			return memo[n][k][s];
		}else if(k == 0 && s == 0){
			return memo[n][k][s] = 1;
		}else if(k == 0){
			return memo[n][k][s] = 0;
		}
		
		int ret = 0;
		for(int next_use_value = 1; next_use_value <= n; next_use_value++){
			if(s < next_use_value){
				break;
			}
			
			ret += memo(next_use_value - 1, k - 1, s - next_use_value, memo);
		}
		
		return memo[n][k][s] = ret;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][][] memo = new int[N_MAX][K_MAX][S_MAX];
		
		for(int n = 0; n < N_MAX; n++){
			for(int k = 0; k < K_MAX; k++){
				for(int s = 0; s < S_MAX; s++){
					memo[n][k][s] = -1;
				}
			}
		}
		
		while(true){
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int s = sc.nextInt();
			
			if(n == 0 && k == 0 && s == 0){
				break;
			}
			
			System.out.println(memo(n, k, s, memo));
		}
		
	}
	
}