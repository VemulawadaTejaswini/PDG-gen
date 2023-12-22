import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] over = new int[n];
		int[] under = new int[n];
		
		int[][] DP= new int[n][];
		for(int i = 0; i < n; i++){
			DP[i] = new int[n - i];
			Arrays.fill(DP[i], Integer.MAX_VALUE);
		}
		
		for(int i = 0; i < n; i++){
			over[i] = sc.nextInt();
			under[i] = sc.nextInt();
			DP[0][i] = 0;
		}
		
		for(int i = 1; i < n; i++){
			for(int j = 0; j < n - i; j++){
				for(int k = 0; k < i; k++){
					final int left_range = k;
					final int left_start = j;
					final int left_end = j + k;
					final int right_range = i - k - 1;
					final int right_start = j + k + 1;
					final int right_end = j + i;
					
					final int cost = DP[left_range][left_start] + DP[right_range][right_start] + 
							over[left_start] * under[left_end] * over[right_start] * under[right_end];
					
					DP[i][j] = Math.min(DP[i][j], cost);
				}
			}
		}
		
			
			
		System.out.println(DP[n-1][0]);
	}

}