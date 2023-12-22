import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			int[][] map = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			int[][] dp = new int[h][w];
			for(int i=0;i<w;i++){
				if(map[0][i]==0) dp[0][i] = 1;
			}
			for(int i=1;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]==0){
						if(j>0 && map[i-1][j-1]==0) dp[i][j] += dp[i-1][j-1];
						if(j<w-1 && map[i-1][j+1]==0) dp[i][j] += dp[i-1][j+1];
						if(map[i-1][j]==0) dp[i][j] += dp[i-1][j];
						if(i>1 && map[i-2][j]==2) dp[i][j] += dp[i-2][j];
					}else if(map[i][j]==2){
						if(map[i-1][j]==0) dp[i][j] += dp[i-1][j];
						if(i>1 && map[i-2][j]==2) dp[i][j] += dp[i-2][j];
					}
				}
			}
			
			int sum = 0;
			for(int i=0;i<w;i++){
				sum += dp[h-1][i];
				if(h>1 && map[h-2][i]==2) sum += dp[h-2][i];
			}
			System.out.println(sum);
		}	
	}	
}