import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int MAX_N = 7;
	public static final int MAX_M = 2000;
	public static final int MAX_S = 3000;
	
	public static int[][] DP   = new int[MAX_S + 1][MAX_M + 1];
	public static int[][] next = new int[MAX_S + 1][MAX_M + 1];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int S = sc.nextInt();
			
			if(N == 0 && M == 0 && S == 0){
				break;
			}
			
			for(int i = 0; i < S; i++){
				for(int j = 0; j < M; j++){
					DP[i][j] = next[i][j] = 0;
				}
			}
			
			DP[S][0] = 1;
			
			for(int iter = 0; iter < N * N; iter++){
				for(int cur_S = S; cur_S >= 0; cur_S--){
					for(int cur_M = 0; cur_M <= M; cur_M++){
						if(DP[cur_S][cur_M] == 0){
							continue;
						}
						
						for(int next_M = cur_M + 1; next_M <= M; next_M++){
							if(cur_S < next_M){
								break;
							}
							
							next[cur_S - next_M][next_M] += DP[cur_S][cur_M];
							next[cur_S - next_M][next_M] %= 100000;
						}
					}
				}
				
				int[][] tmp = next;
				next = DP;
				DP = tmp;
				
				for(int i = 0; i <= S; i++){
					for(int j = 0; j <= M; j++){
						next[i][j] = 0;
					}
				}
			}
			
			int sum = 0;
			for(int i = 0; i <= M; i++){
				sum += DP[0][i];
				sum %= 100000;
			}
			
			System.out.println(sum);
			
		}
	}

}