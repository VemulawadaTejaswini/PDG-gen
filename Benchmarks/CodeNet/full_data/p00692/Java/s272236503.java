
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	public static final int HEIGHT = 5;
	public static final int WIDTH  = 4;
	public static final int LENGTH = HEIGHT * WIDTH;
	public static final int BLANK = 6;
	public static final int UNUSED = 0;
	
	public static int get_pos_bit(long bit, int pos){
		return (int) ((bit >> (3 * pos)) & 7);
	}
	
	public static long set_pos_bit(long bit, int pos, int num){
		//System.out.println(Long.toBinaryString(bit));
		bit &= (((1L << (LENGTH * 3)) - 1) << ((pos + 1) * 3)) | ((1L << (pos * 3)) - 1);
		//System.out.println(Long.toBinaryString(((1L << (LENGTH * 3)) - 1) << ((pos + 1) * 3) | ((1L << (pos * 3)) - 1)));
		//System.out.println(Long.toBinaryString(bit));
		bit |= ((long) (num)) << (pos * 3);
		//System.out.println(Long.toBinaryString(bit));
		return bit;
	}
	
	public static long slim_bit(long bit){
		for(int pos = 0; pos < LENGTH; pos++){
			//final int x = pos % WIDTH;
			//final int y = pos / WIDTH;
			
			if(get_pos_bit(bit, pos) == BLANK){
				for(int replace_pos = pos + 1; replace_pos < LENGTH; replace_pos++){
					bit = set_pos_bit(bit, replace_pos - 1, get_pos_bit(bit, replace_pos));
				}
				
				bit = set_pos_bit(bit, LENGTH - 1, UNUSED);
				pos--;
			}
		}
		
		return bit;
	}
	
	public static void print_bit(long bit){
		for(int pos = 0; pos < LENGTH; pos++){
			System.out.print(get_pos_bit(bit, pos) + " ");
		}
		System.out.println();
	}
	
	public static int count_bit(long bit){
		for(int pos = 0; pos < LENGTH; pos++){
			if(get_pos_bit(bit, pos) == UNUSED){
				return pos;
			}
		}
		return 20;
	}
	
	public static boolean is_ok(int x, int y){
		return x >= 0 && y >= 0 && x <= WIDTH - 1 && y <= HEIGHT - 1;
	}
	
	public static int[][] dir = new int[][]{{1, 0}, {1, 1}, {0, 1}, {-1, 1}};
	
	
	public static int dfs(long bit, Map<Long, Integer> memo){
		if(memo.containsKey(bit)){
			return memo.get(bit);
		}
		
		//print_bit(bit);
		
		int min = Integer.MAX_VALUE;
		
		BREAK:
		for(int y = 0; y < HEIGHT; y++){
			for(int x = 0; x < WIDTH; x++){
				final int cur = get_pos_bit(bit, y * WIDTH + x);
				
				if(cur == UNUSED){
					break BREAK;
				}
				
				for(int[] move : dir){
					final int nx = x + move[0];
					final int ny = y + move[1];
					
					if(!is_ok(nx, ny)){
						continue;
					}
					
					final int next = get_pos_bit(bit, ny * WIDTH + nx);
					
					if(next != cur){
						continue;
					}
					
					long next_bit = bit;
					next_bit = set_pos_bit(next_bit, ny * WIDTH + nx, BLANK);
					next_bit = set_pos_bit(next_bit, y * WIDTH + x, BLANK);
					//print_bit(next_bit);
					next_bit = slim_bit(next_bit);
					//print_bit(next_bit);
					
					min = Math.min(min, dfs(next_bit, memo));
				}
			}
		}
		
		if(min == Integer.MAX_VALUE){
			min = count_bit(bit);
		}
		memo.put(bit, min);
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		for(int tt = 0; tt < n; tt++){
			long bit = 0L;
			
			for(int i = 0; i < LENGTH; i++){
				bit = set_pos_bit(bit, i, sc.nextInt());
			}
			
			System.out.println(dfs(bit, new HashMap<Long, Integer>()));
		}
		
	}

}