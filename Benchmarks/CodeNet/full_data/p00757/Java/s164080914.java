import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void print(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.printf("%03d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int calc_area(final int s_x, final int s_y, final int g_x, final int g_y, int[][] sums){
		if(s_x == 0 && s_y == 0){
			return sums[g_y][g_x];
		}else if(s_x == 0){
			return sums[g_y][g_x] - sums[s_y - 1][g_x];
		}else if(s_y == 0){
			return sums[g_y][g_x] - sums[g_y][s_x - 1];
		}else{
			return sums[g_y][g_x] - sums[g_y][s_x - 1] - sums[s_y - 1][g_x] + sums[s_y - 1][s_x - 1];
		}
	}
	
	public static int dfs(final int s_x, final int s_y, final int g_x, final int g_y, final int max, final int sup, int[][] sums, int[][][][] memo, int[][][][] min){
		if(memo[s_y][s_x][g_y][g_x] >= 0){
			return memo[s_y][s_x][g_y][g_x];
		}
		
		//System.out.println(s_x + " " + s_y + " " + g_x + " " + g_y);
		
		final int this_area = calc_area(s_x, s_y, g_x, g_y, sums);
		final int diff = max - sup;
		
		if(diff > this_area){
			return memo[s_y][s_x][g_y][g_x] = 0;
		}else if(s_x == g_x && s_y == g_y){
			min[s_y][s_x][g_y][g_x] = max - this_area;
			return memo[s_y][s_x][g_y][g_x] = 1;
		}
		//System.out.println(s_x + " " + s_y + " " + g_x + " " + g_y + " =>" + calc_area(s_x, s_y, g_x, g_y, sums) + " , " + diff);
		
		int ret = 0;
		
		for(int sp_x = s_x + 1; sp_x <= g_x; sp_x++){
			final int left_ret  = dfs(s_x , s_y, sp_x - 1, g_y, max, sup, sums, memo, min);
			final int right_ret = dfs(sp_x, s_y, g_x     , g_y, max, sup, sums, memo, min);
			
			//System.out.println("h : " + s_x + " " + sp_x + " " + g_x + " ( " + s_y  + ", " + g_y + " ) =>" + left_ret + " , " + right_ret);
			
			if(left_ret == 0 || right_ret == 0){
				continue;
			}
			
			final int new_group = left_ret + right_ret;
			final int new_min = Math.max(min[s_y][s_x][g_y][sp_x - 1], min[s_y][sp_x][g_y][g_x]);
			if(ret <= new_group){
				if(ret < new_group || min[s_y][s_x][g_y][g_x] > new_min){
					min[s_y][s_x][g_y][g_x] = new_min;
					ret = new_group;
				}
			}
		}
		
		for(int sp_y = s_y + 1; sp_y <= g_y; sp_y++){
			final int up_ret   = dfs(s_x, s_y , g_x, sp_y - 1, max, sup, sums, memo, min);
			final int down_ret = dfs(s_x, sp_y, g_x, g_y     , max, sup, sums, memo, min);
			
			//System.out.println("v : " + s_y + " " + sp_y + " " + g_y + " ( " + s_x + "," + g_x + " ) =>" + up_ret + " , " + down_ret);
			
			if(up_ret == 0 || down_ret == 0){
				continue;
			}
			
			final int new_group = up_ret + down_ret;
			final int new_min = Math.max(min[s_y][s_x][sp_y - 1][g_x], min[sp_y][s_x][g_y][g_x]);
			if(ret <= new_group){
				if(ret < new_group || min[s_y][s_x][g_y][g_x] > new_min){
					min[s_y][s_x][g_y][g_x] = new_min;
					ret = new_group;
				}
			}
		}
		
		
		if(ret <= 0){
			min[s_y][s_x][g_y][g_x] = max - this_area;
			return memo[s_y][s_x][g_y][g_x] = 1;
		}else{
			return memo[s_y][s_x][g_y][g_x] = ret;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			final int s = sc.nextInt();
			
			if(h == 0 && w == 0 && s == 0){
				break;
			}
			
			System.gc();
			
			int[][] input = new int[h][w];
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					input[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 1; j < w; j++){
					input[i][j] += input[i][j-1];
				}
			}
			
			for(int j = 0; j < w; j++){
				for(int i = 1; i < h; i++){
					input[i][j] += input[i-1][j];
				}
			}
			
			//print(input);
			
			int[][][][] memo = new int[h][w][h][w];
			int[][][][] min  = new int[h][w][h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					for(int k = 0; k < h; k++){
						for(int l = 0; l < w; l++){
							memo[i][j][k][l] = -1;
							min[i][j][k][l] = -1;
						}
					}
				}
			}
			
			System.out.println(dfs(0, 0, w - 1, h - 1, input[h-1][w-1], s, input, memo, min) + " " + (s - min[0][0][h-1][w-1]));
			
			//print(min[0][0]);
		}
	}

}