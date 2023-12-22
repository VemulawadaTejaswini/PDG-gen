import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static boolean is_ok(int x, int y, int h, int w){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static int MAX = 50;
	
	public static int[][] move_dir = new int[][]{{1, 0},{-1, 0},{0, 1},{0, -1}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[][][][] visited = new boolean[MAX][MAX][MAX][MAX];
		boolean[][] is_wall = new boolean[MAX][MAX];
		
		LinkedList<Integer> x1_queue = new LinkedList<Integer>();
		LinkedList<Integer> y1_queue = new LinkedList<Integer>();
		LinkedList<Integer> x2_queue = new LinkedList<Integer>();
		LinkedList<Integer> y2_queue = new LinkedList<Integer>();
		LinkedList<Integer> time_queue = new LinkedList<Integer>();
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			final int in_x1 = sc.nextInt() - 1;
			final int in_y1 = sc.nextInt() - 1;
			final int in_x2 = sc.nextInt() - 1;
			final int in_y2 = sc.nextInt() - 1;
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					for(int k = 0; k < H; k++){
						for(int l = 0; l < W; l++){
							visited[i][j][k][l] = false;
						}
					}
					
					is_wall[i][j] = sc.nextInt() == 1;
				}
			}
			
			x1_queue.clear();
			y1_queue.clear();
			x2_queue.clear();
			y2_queue.clear();
			time_queue.clear();
			
			x1_queue.add(in_x1);
			y1_queue.add(in_y1);
			x2_queue.add(in_x2);
			y2_queue.add(in_y2);
			time_queue.add(0);
			
			visited[in_y1][in_x1][in_y2][in_x2] = true;
			
			boolean flag = false;
			while(!time_queue.isEmpty()){
				final int x1 = x1_queue.poll();
				final int y1 = y1_queue.poll();
				final int x2 = x2_queue.poll();
				final int y2 = y2_queue.poll();
				final int time = time_queue.poll();
				
				//System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + time);
				
				if(time >= 100){
					break;
				}
				
				if(x1 == x2 && y1 == y2){
					flag = true;
					System.out.println(time);
					break;
				}
				
				for(int[] move : move_dir){
					int nx1 = x1 + move[0];
					int ny1 = y1 + move[1];
					int nx2 = x2 - move[0];
					int ny2 = y2 - move[1];
					
					if(!is_ok(nx1, ny1, H, W) || is_wall[ny1][nx1]){
						nx1 = x1;
						ny1 = y1;
					}
					
					if(!is_ok(nx2, ny2, H, W) || is_wall[ny2][nx2]){
						nx2 = x2;
						ny2 = y2;
					}
					
					//System.out.println(!is_ok(nx1, ny1, H, W));
					
					//System.out.println(y1 + " " + ny1 + " " + nx1 + " " + ny2 + " " + nx2);
					
					if(!visited[ny1][nx1][ny2][nx2]){
						visited[ny1][nx1][ny2][nx2] = true;
						x1_queue.add(nx1);
						y1_queue.add(ny1);
						x2_queue.add(nx2);
						y2_queue.add(ny2);
						time_queue.add(time + 1);
					}
				}
			}
			
			if(!flag){
				System.out.println("NA");
			}
			
		}
		
	}

}