
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			boolean[][] p_map = new boolean[H][W];
			
			for(int i = 0; i < N; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				p_map[y][x] = true;
			}
			
			final int s_x = sc.nextInt();
			final int s_y = sc.nextInt();
			
			int[] c_map = new int[H];
			for(int i = 0; i < s_y; i++){
				for(int j = 0; j < s_x; j++){
					c_map[0] += p_map[i][j] ? 1 : 0;
				}
			}
			
			int max = c_map[0];
			/*
			System.out.println();
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					System.out.print(p_map[i][j] ? "*" : "-");
				}
				System.out.println();
			}
			*/
			for(int i = s_y - 1; i < H; i++){
				if(i != s_y - 1){
					c_map[i - (s_y - 1)] = c_map[i - s_y];
					
					for(int k = 0; k < s_x; k++){
						c_map[i - (s_y - 1)] -= p_map[i-s_y][k] ? 1 : 0;
						c_map[i - (s_y - 1)] += p_map[i][k] ? 1 : 0;
					}
				}
				
				int inner = c_map[i - (s_y - 1)];
				//System.out.println(i + " " + (s_x - 1) + " " + inner);
				max = Math.max(inner, max);
				
				for(int j = s_x; j < W; j++){
					for(int k = i - (s_y - 1); k <= i; k++){
						inner -= p_map[k][j - s_x] ? 1 : 0;
						inner += p_map[k][j] ? 1 : 0;
					}
					
					max = Math.max(inner, max);
					//System.out.println(i + " " + j + " " + inner);
				}
			}
			
			System.out.println(max);
			
		}
		
	}

}