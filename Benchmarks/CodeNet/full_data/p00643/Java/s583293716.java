import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		int x, y;
		int cost;
		int top, come, right;
		
		public Walk(int x, int y, int cost, int top, int come, int right) {
			super();
			this.x = x;
			this.y = y;
			this.cost = cost;
			this.top = top;
			this.come = come;
			this.right = right;
		}

		@Override
		public int compareTo(Walk o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[10][10];
		boolean[][][][][] is_visited = new boolean[10][10][7][7][7];
		
		
		while(true){
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					for(int k = 0; k < 7; k++){
						for(int l = 0; l < 7; l++){
							for(int m = 0; m < 7; m++){
								is_visited[i][j][k][l][m] = false;
							}
						}
					}
				}
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = sc.nextInt();
				}
			}
			int s_y = sc.nextInt();
			int s_x = sc.nextInt();
			int g_y = sc.nextInt();
			int g_x = sc.nextInt();
			
			PriorityQueue<Walk> queue = new PriorityQueue<Main.Walk>();
			queue.add(new Walk(s_x, s_y, 0, 1, 2, 3));
			
			int min_cost = Integer.MAX_VALUE;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				//System.out.println(walk.x + " " + walk.y);
				
				if(is_visited[walk.y][walk.x][walk.top][walk.come][walk.right]){
					continue;
				}else{
					is_visited[walk.y][walk.x][walk.top][walk.come][walk.right] = true;
				}
				
				if(walk.x == g_x && walk.y == g_y){
					min_cost = Math.min(min_cost, walk.cost);
					continue;
				}
				
				if(walk.y > 0){
					final int next_x = walk.x;
					final int next_y = walk.y - 1;
					final int next_top = walk.come;
					final int next_bottom = 7 - walk.come;
					final int next_right = walk.right;
					final int next_come = 7 - walk.top;
					
					if(!is_visited[next_y][next_x][next_top][next_come][next_right]){
						queue.add(new Walk(next_x, next_y, walk.cost + map[next_y][next_x] * next_bottom, next_top, next_come, next_right));
					}
				}
				
				if(walk.y < h - 1){
					final int next_x = walk.x;
					final int next_y = walk.y + 1;
					final int next_top = 7 - walk.come;
					final int next_bottom = walk.come;
					final int next_right = walk.right;
					final int next_come = walk.top;
					
					if(!is_visited[next_y][next_x][next_top][next_come][next_right]){
						queue.add(new Walk(next_x, next_y, walk.cost + map[next_y][next_x] * next_bottom, next_top, next_come, next_right));
					}
				}
				
				if(walk.x > 0){
					final int next_x = walk.x - 1;
					final int next_y = walk.y;
					final int next_top = walk.right;
					final int next_bottom = 7 - walk.right;
					final int next_right = 7 - walk.top;
					final int next_come = walk.come;
					
					if(!is_visited[next_y][next_x][next_top][next_come][next_right]){
						queue.add(new Walk(next_x, next_y, walk.cost + map[next_y][next_x] * next_bottom, next_top, next_come, next_right));
					}
				}
				
				if(walk.x < w - 1){
					final int next_x = walk.x + 1;
					final int next_y = walk.y;
					final int next_top = 7 - walk.right;
					final int next_bottom = walk.right;
					final int next_right = walk.top;
					final int next_come = walk.come;
					
					if(!is_visited[next_y][next_x][next_top][next_come][next_right]){
						queue.add(new Walk(next_x, next_y, walk.cost + map[next_y][next_x] * next_bottom, next_top, next_come, next_right));
					}
				}
			}
			
			System.out.println(min_cost);
		}
	}

}