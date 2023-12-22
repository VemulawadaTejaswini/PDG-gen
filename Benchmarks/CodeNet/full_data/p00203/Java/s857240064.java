import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			
			if(X == 0 && Y == 0){
				break;
			}
			
			int[][] map = new int[Y][X];
			
			for(int i = 0; i < Y; i++){
				for(int j = 0; j < X; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			int[][] dp = new int[Y+2][X];
			
			for(int i = 0; i < Y; i++){
				for(int j = 0; j < X; j++){
					if(map[i][j] == 1){
						dp[i][j] = 0;
						//System.out.print(dp[i][j] + " ");
						continue;
					}
					
					if(i == 0){
						dp[i][j] = 1;
					}else{
						dp[i][j] += (map[i-1][j] == 0 ? dp[i-1][j] : 0);
						if(map[i][j] != 2){
							dp[i][j] += j != 0 ? (map[i-1][j-1] == 0 ? dp[i-1][j-1] : 0) : 0;
							dp[i][j] += j != X-1 ? (map[i-1][j+1] == 0 ? dp[i-1][j+1] : 0) : 0;
						}
					}
					
					if(map[i][j] == 2){
						dp[i+2][j] = dp[i][j];
					}
					
					//System.out.print(dp[i][j] + " ");
				}
				
				//System.out.println();
			}
			/*
			for(int i = Y; i < Y+2; i++){
				for(int j = 0; j < X; j++){
					System.out.print(dp[i][j] + " ");
				}
				System.out.println();
			}
			*/
			for(int i = Y; i < Y+2; i++){
				for(int j = 0; j < X; j++){
					dp[i][j] += dp[i-1][j];
				}
			}
			
			int sum = 0;
			for(int j = 0; j < X; j++){
				sum += dp[Y+1][j];
			}
			
			System.out.println(sum);
		}
		
	}

}