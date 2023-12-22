import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int DP[][][][] = new int[h][w][2][2];
			DP[0][0][0][0] = 1;
			DP[0][0][1][0] = 1;
			
			//0 -> left, 1 -> upper
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					for(int dir = 0; dir < 2; dir++){
						for(int can_change = 0; can_change < 2; can_change++){
							if(DP[i][j][dir][can_change] == 0){
								continue;
							}
							
							if(j != w - 1){
								if(dir == 0){							
									DP[i][j+1][0][1] += DP[i][j][dir][can_change];
									DP[i][j+1][0][1] %= 100000;
								}else if(can_change == 1){
									DP[i][j+1][0][0] += DP[i][j][dir][can_change];
									DP[i][j+1][0][0] %= 100000;
								}
							}
							
							if(i != h - 1){
								if(dir == 1){							
									DP[i+1][j][1][1] += DP[i][j][dir][can_change];
									DP[i+1][j][1][1] %= 100000;
								}else if(can_change == 1){
									DP[i+1][j][1][0] += DP[i][j][dir][can_change];
									DP[i+1][j][1][0] %= 100000;
								}
							}
						}
					}
				}
			}
			
			int sum = 0;
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 2; j++){
					sum += DP[h-1][w-1][i][j];
					sum %= 100000;
				}
			}
			
			System.out.println(sum);
		}
		
	}

}