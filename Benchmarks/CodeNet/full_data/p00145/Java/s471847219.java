import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[][] over = new int[n][];
		for(int i = 0; i < n; i++){
			over[i] = new int[n - i];
		}
		
		int[][] under = new int[n][];
		for(int i = 0; i < n; i++){
			under[i] = new int[n - i];
		}
		
		int[][] DP= new int[n][];
		for(int i = 0; i < n; i++){
			DP[i] = new int[n - i];
			Arrays.fill(DP[i], Integer.MAX_VALUE);
		}
		/*
		for(int i = 0; i < n; i++){
			over[0][i] = sc.nextInt();
			under[0][i] = sc.nextInt();
			DP[0][i] = 0;
		}
		*/
		for(int i = 1; i < n; i++){
			for(int j = 0; j < n - i; j++){
				for(int k = 0; k < i; k++){
					final int left_range = k;
					final int left_start = j;
					final int right_range = i - k - 1;
					final int right_start = j + k + 1;
					
					final int cost = DP[left_range][left_start] + DP[right_range][right_start] + 
							over[left_range][left_start] * under[left_range][left_start] * over[right_range][right_start] * under[right_range][right_start];
					
					if(DP[i][j] > cost){
						DP[i][j] = cost;
						under[i][j] = under[right_range][right_start];
						over[i][j] = over[left_range][left_start];
					}
				}
				
			}
			
		}
		
			
			
		System.out.println(DP[n-1][0]);
	}

}