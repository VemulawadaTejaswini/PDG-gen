import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int R = sc.nextInt();
			final int C = sc.nextInt();
			
			if(R == 0 && C == 0){
				break;
			}
			
			final int LIM = 1 << R;
			
			boolean[][] map = new boolean[R][C];
			for(int i = 0; i < R; i++){
				for(int j = 0; j < C; j++){
					map[i][j] = sc.nextInt() == 0;
				}
			}
			
			int[] col_sum = new int[C];
			for(int col = 0; col < C; col++){
				for(int row = 0; row < R; row++){
					col_sum[col] += map[row][col] ? 1 : 0;
				}
			}
			
			int max = 0;
			for(int comb = 0; comb < LIM; comb++){
				for(int row = 0; row < R; row++){
					if((comb & (1 << row)) == 0){
						continue;
					}
					
					for(int col = 0; col < C; col++){
						col_sum[col] += map[row][col] ? -1 : 1;
					}
				}
				
				int sum = 0;
				for(int col = 0; col < C; col++){
					sum += Math.max(R - col_sum[col], col_sum[col]);
				}
				
				max = Math.max(max, sum);
				
				for(int row = 0; row < R; row++){
					if((comb & (1 << row)) == 0){
						continue;
					}
					
					for(int col = 0; col < C; col++){
						col_sum[col] += map[row][col] ? 1 : -1;
					}
				}
			}
			
			System.out.println(max);
		}
	}

}