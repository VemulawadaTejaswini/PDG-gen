import java.util.Arrays; 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int h, int w){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final int N = sc.nextInt();
		
		boolean[][][] is_visited = new boolean[H][W][N + 1];
		boolean[] get_ans = new boolean[N + 1];
		
		boolean[][] is_wall = new boolean[H][W];
		
		int[] x_pos = new int[N + 1];
		int[] y_pos = new int[N + 1];
		
		for(int i = 0; i < H; i++){
			char[] input = sc.next().toCharArray();
			
			for(int j = 0; j < W; j++){
				if(input[j] == 'S'){
					x_pos[0] = j;
					y_pos[0] = i;
				}else if('0' <= input[j] && input[j] <= '9'){
					x_pos[input[j] - '0'] = j;
					y_pos[input[j] - '0'] = i;
				}
				
				if(input[j] == 'X'){
					is_wall[i][j] = true;
				}
				
			}
		}
		
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		LinkedList<Integer> n_queue = new LinkedList<Integer>();
		LinkedList<Integer> t_queue = new LinkedList<Integer>();
		
		x_queue.add(x_pos[0]);
		y_queue.add(y_pos[0]);
		n_queue.add(0);
		t_queue.add(0);
		
		while(!x_queue.isEmpty()){
			final int x = x_queue.poll();
			final int y = y_queue.poll();
			final int n = n_queue.poll();
			final int t = t_queue.poll();
			
			//System.out.println(x + " " + y + " " + n + " " + t);
			
			if(n >= N){
				System.out.println(t);
				break;
			}
			
			if(get_ans[n]){
				continue;
			}else if(is_visited[y][x][n]){
				continue;
			}else{
				is_visited[y][x][n] = true;
			}
			
			if(x_pos[n + 1] == x && y_pos[n + 1] == y){
				x_queue.add(x);
				y_queue.add(y);
				n_queue.add(n + 1);
				t_queue.add(t);
				
				get_ans[n] = true;
				
				continue;
			}
			
			for(int[] move : move_dir){
				final int nx = x + move[0];
				final int ny = y + move[1];
				
				if(!is_ok(nx, ny, H, W)){
					continue;
				}else if(is_wall[ny][nx]){
					continue;
				}else if(is_visited[ny][nx][n]){
					continue;
				}else if(get_ans[n]){
					continue;
				}else{
					x_queue.add(nx);
					y_queue.add(ny);
					n_queue.add(n);
					t_queue.add(t + 1);
				}
			}
			
 		}
		
	}
}