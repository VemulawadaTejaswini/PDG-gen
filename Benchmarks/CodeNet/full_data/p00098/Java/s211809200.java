import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		long[][] map = new long[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				map[i][j] = sc.nextLong();
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i != 0){
					map[i][j] += map[i-1][j];
				}
				if(j != 0){
					map[i][j] += map[i][j-1];
				}
				if(i != 0 && j != 0){
					map[i][j] -= map[i-1][j-1];
				}
			}
		}
		
		long max = 0;
		for(int s_y = 0; s_y < n; s_y++){
			for(int s_x = 0; s_x < n; s_x++){
				
				for(int e_y = s_y; e_y < n; e_y++){
					for(int e_x = s_x; e_x < n; e_x++){
						
						final long ll = s_y == 0 || s_x == 0 ? 0 : map[s_y-1][s_x-1];
						final long lr = s_y == 0 ? 0 : map[s_y-1][e_x];
						final long rl = s_x == 0 ? 0 : map[e_y][s_x-1];
						final long rr = map[e_y][e_x];
						
						max = Math.max(max, rr - lr - rl + ll);
					}
				}
			}
		}
		
		System.out.println(max);
		
	}

}