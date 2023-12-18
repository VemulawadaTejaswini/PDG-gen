import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] maze = new char[h][w];
		int[][] dp = new int[h][w];
			
		for(int i=0; i<h; i++) 
			maze[i] = sc.next().toCharArray();			
		
		if(maze[0][0] == '#') dp[0][0] =1;

		for(int i=1; i<w; i++) {
			dp[0][i] = dp[0][i-1];
			if (maze[0][i-1] == '.' && maze[0][i] == '#') {
				dp[0][i]++;
			}
		}
		for(int i=1; i<h; i++) {
			dp[i][0] = dp[i-1][0];
			if(maze[i-1][0] == '.' && maze[i][i-1]  == '#') {
				dp[i][0]++;
			}
		}
		for(int i=1; i<h; i++) {
			for(int j=1; j<w; j++) {
				int up = dp[i-1][j];
				if(maze[i-1][j] == '.' && maze[i][j] == '#') {
					up++;
				}
				int left = dp[i][j-1];
				if(maze[i][j-1] == '.' && maze[i][j] == '#') {
					left++;
				}
				dp[i][j] = min(up,left);
			}
		}	
out.println(dp[h-1][w-1]);	
	}
}