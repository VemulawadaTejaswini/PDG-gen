import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int SIZE = 100;
	
	public static final int[][][] move_dir = 
		{
			{
				{ 1,  0},
				{-1,  0},
				{ 0,  1},
				{ 0, -1},
				{-1, -1},
				{-1,  1}
			},
			{
				{ 1,  0},
				{-1,  0},
				{ 0,  1},
				{ 0, -1},
				{ 1, -1},
				{ 1,  1}
			}
		};
	
	public static boolean is_ok(int x, int y, int m, int n){
		if(x < 0 || y < 0 || x >= m || y >= n){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[][] dist = new int[SIZE][SIZE];
		boolean[][] visited = new boolean[SIZE][SIZE];
		
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		LinkedList<Integer> time_queue = new LinkedList<Integer>();
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int m = sc.nextInt();
			
			for(int i = 0; i < n ; i++){
				for(int j = 0; j < m; j++){
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
			
			x_queue.clear();
			y_queue.clear();
			time_queue.clear();
			
			final int s = sc.nextInt();
			for(int i = 0; i < s; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				dist[y][x] = 0;
				x_queue.add(x);
				y_queue.add(y);
			}
			
			while(!x_queue.isEmpty()){
				final int x = x_queue.poll();
				final int y = y_queue.poll();
				
				//System.out.println(x + " " + y);
				
				for(int[] move : move_dir[y % 2]){
					final int nx = x + move[0];
					final int ny = y + move[1];
					final int next_dist = dist[y][x] + 1;
					
					if(!is_ok(nx, ny, m, n)){
						continue;
					}else if(dist[ny][nx] <= next_dist){
						continue;
					}
					
					dist[ny][nx] = next_dist;
					x_queue.add(nx);
					y_queue.add(ny);
				}
			}
			/*
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					System.out.print(dist[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("----------------------");
			*/
			final int t = sc.nextInt();
			
			int max = 0;
			for(int i = 0; i < t; i++){
				final int sx = sc.nextInt() - 1;
				final int sy = sc.nextInt() - 1;
				
				if(dist[sy][sx] == 0){
					continue;
				}
				
				for(int j = 0; j < n ; j++){
					for(int k = 0; k < m; k++){
						visited[j][k] = false;
					}
				}
				
				x_queue.clear();
				y_queue.clear();
				time_queue.clear();
				
				x_queue.add(sx);
				y_queue.add(sy);
				time_queue.add(0);
				visited[sy][sx] = true;
				
				int count = 0;
				while(!time_queue.isEmpty()){
					final int x = x_queue.poll();
					final int y = y_queue.poll();
					final int time = time_queue.poll();
					
					//System.out.println(i + " " + x + " " +  y + " " + time);
					count++;
					
					//System.out.println(count);
					
					for(int[] move : move_dir[y % 2]){
						final int nx = x + move[0];
						final int ny = y + move[1];
						final int next_time = time + 1;
						
						if(!is_ok(nx, ny, m, n)){
							continue;
						}else if(visited[ny][nx]){
							continue;
						}else if(dist[ny][nx] <= next_time){
							continue;
						}
						
						x_queue.add(nx);
						y_queue.add(ny);
						visited[ny][nx] = true;
						time_queue.add(next_time);
					}
				}
				
				max = Math.max(max, count);
			}
			
			System.out.println(max);
		}
	}
}