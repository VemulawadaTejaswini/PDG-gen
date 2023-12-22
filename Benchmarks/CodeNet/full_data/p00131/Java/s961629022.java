import java.util.Scanner;

public class Main {
	
	public static void push(int x, int y, boolean[][] p_array, boolean[][] e_array){
		p_array[y][x] = !p_array[y][x];
		e_array[y][x] = !e_array[y][x];
		
		if(x != 0){
			e_array[y][x-1] = !e_array[y][x-1];
		}
		
		if(x != SIZE-1){
			e_array[y][x+1] = !e_array[y][x+1];
		}
		
		if(y != 0){
			e_array[y-1][x] = !e_array[y-1][x];
		}
		
		if(y != SIZE-1){
			e_array[y+1][x] = !e_array[y+1][x];
		}
	}
	
	public static void set(int x, int y, boolean sw, boolean[][] p_array, boolean[][] e_array){
		if(sw){
			push(x,y,p_array,e_array);
		}
	}
	
	public static final int SIZE = 10;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean[][] array = new boolean[SIZE][SIZE];
		boolean[][] effect_array = new boolean[SIZE][SIZE];
		boolean[][] put_array = new boolean[SIZE][SIZE];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < SIZE; j++){
				for(int k = 0; k < SIZE; k++){
					array[j][k] = sc.nextInt() == 0 ? false : true;
				}
			}
			
			for(int cur = 0; cur < (1 << SIZE); cur++){
				
				for(int j = 0; j < SIZE; j++){
					for(int k = 0; k < SIZE; k++){
						put_array[j][k] = effect_array[j][k] = false; 
					}
				}
				
				set(9 , 0 , (((cur >> (SIZE - 10)) % 2) == 0) ? false : true , put_array , effect_array);
				set(8 , 0 , (((cur >> (SIZE -  9)) % 2) == 0) ? false : true , put_array , effect_array);
				set(7 , 0 , (((cur >> (SIZE -  8)) % 2) == 0) ? false : true , put_array , effect_array);
				set(6 , 0 , (((cur >> (SIZE -  7)) % 2) == 0) ? false : true , put_array , effect_array);
				set(5 , 0 , (((cur >> (SIZE -  6)) % 2) == 0) ? false : true , put_array , effect_array);
				set(4 , 0 , (((cur >> (SIZE -  5)) % 2) == 0) ? false : true , put_array , effect_array);
				set(3 , 0 , (((cur >> (SIZE -  4)) % 2) == 0) ? false : true , put_array , effect_array);
				set(2 , 0 , (((cur >> (SIZE -  3)) % 2) == 0) ? false : true , put_array , effect_array);
				set(1 , 0 , (((cur >> (SIZE -  2)) % 2) == 0) ? false : true , put_array , effect_array);
				set(0 , 0 , (((cur >> (SIZE -  1)) % 2) == 0) ? false : true , put_array , effect_array);
				
				for(int j = 1; j < SIZE; j++){
					for(int k = 0; k < SIZE; k++){
						if(array[j-1][k] != effect_array[j-1][k]){
							push(k, j, put_array, effect_array);
						}
					}
				}
				
				boolean is_correct = true;
				
				for(int j = 0; j < SIZE; j++){
					if(array[9][j] != effect_array[9][j]){
						is_correct = false;
						break;
					}
				}
				
				if(!is_correct){
					continue;
				}else{
					for(int j = 0; j < SIZE; j++){
						boolean is_first = true;
						for(int k = 0; k < SIZE; k++){
							if(!is_first){
								System.out.print(" ");
							}
							System.out.print(put_array[j][k] ? 1 : 0);
							if(is_first == true){
								is_first = false;
							}
						}
						System.out.println();
					}
					break;
				}
				
			}
			
		}
		
	}
	
}