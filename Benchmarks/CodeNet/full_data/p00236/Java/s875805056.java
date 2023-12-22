import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static final int[][] move = new int[][]{{1, 0},{0, 1}, {-1, 0}, {0, -1}};
	
	public static boolean search(int x, int y, final int g_x, final int g_y, int count, final int white_count, boolean[][] using){
		if(using[y][x]){
			return false;
		}
		
		//System.out.println("x : " + x + " , y : " + y + " , count = " + count);
		
		count++;
		
		if(white_count == 1 && white_count == count){
			if(x == g_x && y == g_y){
				return true;
			}else{
				return false;
			}
		}
		
		using[y][x] = true;
		for(int[] dir : move){
			if(x + dir[0] < 0 || x + dir[0] >= using[0].length || y + dir[1] < 0 || y + dir[1] >= using.length){
				continue;
			}else if(count == white_count && x + dir[0] == g_x && y + dir[1] == g_y){
				return true;
			}else if(count == white_count){
				continue;
			}else if(using[y+dir[1]][x+dir[0]]){
				continue;
			}
			
			if(search(x + dir[0], y + dir[1], g_x, g_y, count, white_count, using)){
				return true;
			}
		}
		using[y][x] = false;
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			boolean[][] is_block = new boolean[H][W];
			boolean[][] using = new boolean[H][W];
			int white_count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					is_block[i][j] = sc.nextInt() == 1;
					
					using[i][j] = is_block[i][j];
					if(is_block[i][j] == false){
						white_count++;
					}
				}
			}
			
			if(white_count == 0){
				System.out.println("No");
			}else{
				LOOP:
				for(int i = 0; i < H; i++){
					for(int j = 0; j < W; j++){
						if(!is_block[i][j]){
							System.out.println(search(j, i, j, i, 0, white_count, using) ? "Yes" : "No");
							break LOOP;
						}
					}
				}
				
				
			}
			
		}
			
	}

}