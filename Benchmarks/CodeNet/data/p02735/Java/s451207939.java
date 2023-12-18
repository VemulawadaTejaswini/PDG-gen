import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] grid = new char[h][w];
		for(int i=0; i<h; i++) 
	        grid[i] = sc.next().toCharArray();

		int[][] cnt = new int[h][w];		
		if(grid[0][0] == '#') 
			cnt[0][0] =1;

		for(int i=1; i<w; i++) {
			 if(grid[0][i] == '.')
		          cnt[0][i] = cnt[0][i-1];
		        else {
		          if(grid[0][i-1] == '#')
		            cnt[0][i] = cnt[0][i-1];
		          else
		            cnt[0][i] = cnt[0][i-1] + 1;
		        }
		}
		for(int i=1; i<h; i++) {
			cnt[i][0] = cnt[i-1][0];
			if(grid[i-1][0] == '.' && grid[i][i-1]  == '#') {
				cnt[i][0]++;
			}
		}
		for(int i=1; i<h; i++) {
			for(int j=1; j<w; j++) {
		          if(grid[i][j] == '.') {
		              cnt[i][j] = Math.min(cnt[i-1][j], cnt[i][j-1]);
		            } else {
		              int up = cnt[i-1][j];
		              if(grid[i-1][j] == '.')
		                up++;
		              int left = cnt[i][j-1];
		              if(grid[i][j-1] == '.')
		                left++;
		              cnt[i][j] = Math.min(up, left);
		            }	
			}
		}	
	      System.out.println(cnt[h-1][w-1]);
	}
}