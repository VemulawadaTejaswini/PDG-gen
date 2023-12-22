import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 1000000;
	public static final int SQRT = 1000;
	
	public static final int MAP_SIZE = 2 * SQRT + 1;
	public static final int CENTER = SQRT + 1;
	
	public static int[][] move_dir = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
	
	public static void circle(int[][] map, int m, int[] x_pos, int[] y_pos){
		int len = 1;
		int count = 1;
		int type = 0;
		int cur_x = CENTER;
		int cur_y = CENTER;
		
		x_pos[count] = cur_x;
		y_pos[count] = cur_y;
		map[cur_x][cur_y] = count++;
		prepare:
		while(true){
			final int dx = move_dir[type][0];
			final int dy = move_dir[type][1];
			
			for(int i = 0; i < len; i++){
				cur_x += dx;
				cur_y += dy;
				
				if(count > m){
					break prepare;
				}
				
				x_pos[count] = cur_x;
				y_pos[count] = cur_y;
				map[cur_y][cur_x] = count++;
			}
			
			type = (type + 1) % move_dir.length;
			
			if(type % 2 == 0){
				len++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* generate primes */
		boolean is_prime[] = new boolean[MAX + 1];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		for(int i = 2; i <= SQRT; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		int[][] map = new int[MAP_SIZE][MAP_SIZE];
		int[] x_pos = new int[MAX + 1];
		int[] y_pos = new int[MAX + 1];
		
		int[][] dp_prev_prime = new int[MAP_SIZE][MAP_SIZE];
		int[][] dp_length = new int[MAP_SIZE][MAP_SIZE];
		
		while (true) {
			final int m = sc.nextInt();
			final int n = sc.nextInt();
			
			if(m == 0 && n == 0){
				break;
			}
			
			Arrays.fill(x_pos, 0);
			Arrays.fill(y_pos, 0);
			for(int i = 0; i < MAP_SIZE; i++){
				Arrays.fill(map[i], 0);
			}
			
			circle(map, m, x_pos, y_pos);
			
			for(int y = MAP_SIZE - 1; y >= 0; y--){
				Arrays.fill(dp_length[y], 0);
				Arrays.fill(dp_prev_prime[y], 0);
			}
			
			
			for(int y = MAP_SIZE - 1; y >= 0; y--){
				for(int x = MAP_SIZE - 1; x >= 0; x--){
					final int cave_value = map[y][x];
					
					if(cave_value == 0){
						continue;
					}else if(cave_value > m){
						continue;
					}
					
					if(is_prime[cave_value]){
						dp_length[y][x]++;
						
						if(dp_prev_prime[y][x] == 0){
							dp_prev_prime[y][x] = cave_value;
						}
					}
					
					if(y == 0){
						continue;
					}
					
					//System.out.println(cave_value + " " + dp_length[y][x] + " " + dp_prev_prime[y][x]);
					//sc.nextLine();
					final int next_y = y - 1;
					for(int dx = -1; dx <= 1; dx++){
						final int next_x = x + dx;
						final int next_value = map[next_y][next_x];
						
						if(next_x < 0){
							continue;
						}else if(next_x >= MAP_SIZE){
							continue;
						}else if(next_value == 0){
							continue;
						}else if(next_value > m){
							continue;
						}
						
						final int cave_length = dp_length[y][x];
						final int next_length = dp_length[next_y][next_x];
						
						final int cave_prev_prime = dp_prev_prime[y][x];
						final int next_prev_prime = dp_prev_prime[next_y][next_x];
						
						if(cave_length > next_length || (cave_length == next_length && cave_prev_prime > next_prev_prime)){
							dp_length[next_y][next_x] = cave_length;
							dp_prev_prime[next_y][next_x] = cave_prev_prime;
						}
					}
				}
			}
			
			//System.out.println(y_pos[n] + " " + x_pos[n]);
			
			System.out.println(dp_length[y_pos[n]][x_pos[n]] + " " + dp_prev_prime[y_pos[n]][x_pos[n]]);	
		}
		
		sc.close();
	}
}