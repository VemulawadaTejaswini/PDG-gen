import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static final int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int n){
		if(x < 0 || y < 0 || x >= n || y >= n){
			return false;
		}else{
			return true;
		}
	}
	
	public static void disp(boolean[][] matrix, int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j != 0){
					System.out.print(" ");
				}
				System.out.print(matrix[i][j] ? "1" : "0");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		boolean[][] matrix = new boolean[n][n];
		boolean[][] using =  new boolean[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				final boolean elem = sc.nextInt() == 1;
				
				matrix[i][j] = elem;
			}
		}
		
		for(int q = 0; q < m; q++){
			final int op = sc.nextInt();
			
			//disp(matrix, n);
			
			if(op == 0){
				final int r = sc.nextInt() - 1;
				final int c = sc.nextInt() - 1;
				final int size = sc.nextInt();
				final int deg = sc.nextInt();
				
				for(int rot = 0; rot < deg; rot += 90){
					for(int i = 0; i < n; i++){
						for(int j = 0; j < n; j++){
							using[i][j] = matrix[i][j];
						}
					}
					
					for(int i = 0; i < size; i++){
						for(int j = 0; j < size; j++){
							final int next_i = j;
							final int next_j = size - i - 1;
							
							//System.out.println((r + next_i) + "," + (c + next_j));
							
							using[r + next_i][c + next_j] = matrix[r + i][c + j]; 
						}
					}
					
					boolean[][] temp = using;
					using = matrix;
					matrix = temp;
				}
				
			}else if(op == 1){
				final int r = sc.nextInt() - 1;
				final int c = sc.nextInt() - 1;
				final int size = sc.nextInt();
				
				for(int i = 0; i < size; i++){
					for(int j = 0; j < size; j++){
						matrix[r + i][c + j] = !matrix[r + i][c + j];
					}
				}
			}else if(op == 2){
				final int r = sc.nextInt() - 1;
				
				boolean first = matrix[r][0];
				for(int c = 0; c < n-1; c++){
					matrix[r][c] = matrix[r][c+1];
				}
				matrix[r][n-1] = first;
			}else if(op == 3){
				final int r = sc.nextInt() - 1;
				
				boolean last = matrix[r][n-1];
				for(int c = n - 1; c > 0; c--){
					matrix[r][c] = matrix[r][c-1];
				}
				matrix[r][0] = last;
			}else if(op == 4){
				final int r = sc.nextInt() - 1;
				final int c = sc.nextInt() - 1;
				
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						using[i][j] = false;
					}
				}
				
				final boolean rev = matrix[r][c];
				
				LinkedList<Integer> x_list = new LinkedList<Integer>();
				LinkedList<Integer> y_list = new LinkedList<Integer>();
				x_list.add(c);
				y_list.add(r);
				matrix[r][c] = !rev;
				using[r][c] = true;
				
				while(!x_list.isEmpty()){
					final int x = x_list.poll();
					final int y = y_list.poll();
					
					for(int[] move : move_dir){
						final int nx = x + move[0];
						final int ny = y + move[1];
						
						if(!is_ok(nx, ny, n)){
							continue;
						}else if(matrix[ny][nx] != rev){
							continue;
						}else if(using[ny][nx]){
							continue;
						}
						
						matrix[ny][nx] = !rev;
						using[ny][nx] = true;
						
						x_list.add(nx);
						y_list.add(ny);
					}
				}
			}
		}
		
		disp(matrix, n);
		
	}

}