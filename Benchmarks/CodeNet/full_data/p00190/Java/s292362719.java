import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final long[] ans_array = new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0};
	
	public static final int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static int get_x(int pos){
		if(pos == 0){
			return 0;
		}else if(pos >= 1 && pos <= 3){
			return pos - 2;
		}else if(pos >= 4 && pos <= 8){
			return pos - 6;
		}else if(pos >= 9 && pos <= 11){
			return pos - 10;
		}else{
			return 0;
		}
	}
	
	public static int get_y(int pos){
		if(pos == 0){
			return -2;
		}else if(pos >= 1 && pos <= 3){
			return -1;
		}else if(pos >= 4 && pos <= 8){
			return 0;
		}else if(pos >= 9 && pos <= 11){
			return 1;
		}else{
			return 2;
		}
	}
	
	public static int get_pos(int x, int y){
		if(y == -2 && x == 0){
			return 0;
		}else if(y == -1 && x >= -1 && x <= 1){
			return 2 + x;
		}else if(y == 0 && x >= -2 && x <= 2){
			return 6 + x;
		}else if(y == 1 && x >= -1 && x <= 1){
			return 10 + x;
		}else{
			return 12;
		}
	}
	
	public static void print_bit(long bit){
		for(int i = 0; i < 13; i++){
			System.out.print((bit >>> (i * 4)) & 15);
			System.out.print(" ,");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Long> is_visited = new HashSet<Long>();
		
		long ans_bit = 0;
		for(int i = 0; i < 13; i++){
			ans_bit |= (ans_array[i] << (i * 4));
		}
		
		while(true){
			final int top = sc.nextInt();
			
			if(top == -1){
				break;
			}
			
			is_visited.clear();
			
			long init_bit = top;
			for(int i = 1; i < 13; i++){
				init_bit |= (sc.nextLong() << (i * 4));
			}
			
			LinkedList<Long> bit_queue = new LinkedList<Long>();
			LinkedList<Integer> time_queue = new LinkedList<Integer>();
			is_visited.add(init_bit);
			bit_queue.add(init_bit);
			time_queue.add(0);
			
			boolean flag = false;
			while(!bit_queue.isEmpty()){
				long bit = bit_queue.poll();
				int time = time_queue.poll();
				
				if(time > 20){
					continue;
				}
				//print_bit(bit);
				//print_bit(ans_bit);
				//sc.next();
				//System.out.println(bit + " " + time);
				
				if(bit == ans_bit){
					flag = true;
					System.out.println(time);
					break;
				}
				
				if(time == 20){
					continue;
				}
				
				for(int hole = 0; hole < 13; hole++){
					if((bit & (15L << (hole * 4))) != 0){
						continue;
					}
					
					final int x_pos = get_x(hole);
					final int y_pos = get_y(hole);
					
					for(int[] move : move_dir){
						final int nx = x_pos + move[0];
						final int ny = y_pos + move[1];
						
						if(Math.abs(nx) + Math.abs(ny) > 2){
							continue;
						}
						
						int next_hole = get_pos(nx, ny);
						long next_value = (bit >>> (next_hole * 4)) & (15L);
						
						if(next_value == 0){
							continue;
						}
						
						long next_bit = bit & ~(15L << (hole * 4));
						next_bit = next_bit & ~(15L << (next_hole * 4));
						
						next_bit |= (next_value << (hole * 4));
						
						if(is_visited.contains(next_bit)){
							continue;
						}
						
						is_visited.add(next_bit);
						time_queue.add(time + 1);
						bit_queue.add(next_bit);
					}
				}
			}
			
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}