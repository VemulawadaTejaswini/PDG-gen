import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static final int MAX = 16;
	public static final int F_MAX = 50;
	
	public static int[][] move_dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int h, int w){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x_map = new int[F_MAX];
		int[] y_map = new int[F_MAX];
		
		int[][] attached = new int[MAX][MAX];
		
		boolean[][] can_enter = new boolean[MAX][MAX];
		boolean[][] goal = new boolean[MAX][MAX];
		
		boolean[][][][] visited = new boolean[F_MAX][F_MAX][F_MAX][F_MAX];

		while (true) {
			final int W = sc.nextInt();
			final int H = sc.nextInt();

			if (W == 0 && H == 0) {
				break;
			}
			
			for(int i = 0; i < F_MAX; i++){
				for(int j = 0; j < F_MAX; j++){
					for(int k = 0; k < F_MAX; k++){
						for(int l = 0; l < F_MAX; l++){
							visited[i][j][k][l] = false;
						}
					}
				}
			}

			int start = -1;
			int s_r1 = -1, s_r2 = -1, s_r3 = -1;
			
			int attach_count = 0;
			int rock_count = 0;
			for (int i = 0; i < H; i++) {
				char[] input = sc.next().toCharArray();

				for (int j = 0; j < W; j++) {
					if (input[j] == '@') {
						start = attach_count;
					} else if (input[j] == '*') {
						if(rock_count == 0){
							s_r1 = attach_count;
						}else if(rock_count == 1){
							s_r2 = attach_count;
						}else if(rock_count == 2){
							s_r3 = attach_count;
						}
						
						rock_count++;
					}
					
					if (input[j] == '#') {
						can_enter[i][j] = false;
						attached[i][j] = -1;
					} else {
						can_enter[i][j] = true;
						x_map[attach_count] = j;
						y_map[attach_count] = i;
						attached[i][j] = attach_count;
						attach_count++;
					}

					if (input[j] == '_') {
						goal[i][j] = true;
					} else {
						goal[i][j] = false;
					}
				}
			}

		
			LinkedList<Integer> pos_queue = new LinkedList<Integer>();
			LinkedList<Integer> r1_queue = new LinkedList<Integer>();
			LinkedList<Integer> r2_queue = new LinkedList<Integer>();
			LinkedList<Integer> r3_queue = new LinkedList<Integer>();
			LinkedList<Integer> time_queue = new LinkedList<Integer>();
			
			pos_queue.add(start);
			r1_queue.add(s_r1);
			r2_queue.add(s_r2);
			r3_queue.add(s_r3);
			time_queue.add(0);

			while (!time_queue.isEmpty()) {
				final int pos = pos_queue.poll();
				final int r1  = r1_queue.poll();
				final int r2  = r2_queue.poll();
				final int r3  = r3_queue.poll();
				final int time = time_queue.poll();
				//System.out.println(bit + " " + time + " " + set.size());
				
				final int pos_x = x_map[pos];
				final int pos_y = y_map[pos];
				final int r1_x =  x_map[r1];
				final int r1_y =  y_map[r1];
				final int r2_x =  x_map[r2];
				final int r2_y =  y_map[r2];
				final int r3_x =  x_map[r3];
				final int r3_y =  y_map[r3];
				
				if(goal[r1_y][r1_x] && goal[r2_y][r2_x] && goal[r3_y][r3_x]){
					System.out.println(time);
					break;
				}
				
				//System.out.println(pos_x + " " + pos_y + " " + r1_x + " " + r1_y + " " + r2_x + " " + r2_y + " " + r3_x + " " + r3_y);
				
				for(int move[] : move_dir){
					final int nx = pos_x + move[0];
					final int ny = pos_y + move[1];
					
					//System.out.println(x + " " + y + " " + nx + " " + ny);
					
					int n_r1_x = r1_x;
					int n_r1_y = r1_y;
					int n_r2_x = r2_x;
					int n_r2_y = r2_y;
					int n_r3_x = r3_x;
					int n_r3_y = r3_y;
					
					if(nx == n_r1_x && ny == n_r1_y){
						n_r1_x += move[0];
						n_r1_y += move[1];
					}
					
					if(nx == n_r2_x && ny == n_r2_y){
						n_r2_x += move[0];
						n_r2_y += move[1];
					}
					
					if(nx == n_r3_x && ny == n_r3_y){
						n_r3_x += move[0];
						n_r3_y += move[1];
					}
					//System.out.println("5");
					
					if(!is_ok(nx, ny, H, W)){
						continue;
					}else if(!is_ok(n_r1_x, n_r1_y, H, W)){
						continue;
					}else if(!is_ok(n_r2_x, n_r2_y, H, W)){
						continue;
					}else if(!is_ok(n_r3_x, n_r3_y, H, W)){
						continue;
					}else if(n_r1_x == n_r2_x && n_r1_y == n_r2_y){
						//System.out.println(1);
						continue;
					}else if(n_r2_x == n_r3_x && n_r2_y == n_r3_y){
						//System.out.println(2);
						continue;
					}else if(n_r1_x == n_r3_x && n_r1_y == n_r3_y){
						//System.out.println(3);
						continue;
					}else if(attached[ny][nx] == -1){
						continue;
					}else if(attached[n_r1_y][n_r1_x] == -1){
						continue;
					}else if(attached[n_r2_y][n_r2_x] == -1){
						continue;
					}else if(attached[n_r3_y][n_r3_x] == -1){
						continue;
					}
					
					//System.out.println("t");
					
					final int n_pos = attached[ny][nx];
					final int n_r1  = attached[n_r1_y][n_r1_x];
					final int n_r2  = attached[n_r2_y][n_r2_x];
					final int n_r3  = attached[n_r3_y][n_r3_x];
					
					if(visited[n_pos][n_r1][n_r2][n_r3]){
						continue;
					}
					
					visited[n_pos][n_r1][n_r2][n_r3] = true;
					pos_queue.add(n_pos);
					r1_queue.add(n_r1);
					r2_queue.add(n_r2);
					r3_queue.add(n_r3);
					time_queue.add(time + 1);
				}
				
			}

		}

		sc.close();
	}

}