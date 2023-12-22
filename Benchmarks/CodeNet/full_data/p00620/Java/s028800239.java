import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int[][] move_dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	
	public static boolean is_ok(int x, int y, final int n){
		if(x < 0 || x >= n || y < 0 || y >= n){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean dfs(int deep, final int size, final int n, boolean using[][], int[][] map, int x, int y, int cur, 
			ArrayList<Integer> x_pos, ArrayList<Integer> y_pos, ArrayList<Integer> values, int painted, final int all){
		final int value = values.get(deep);
		
		/*
		System.out.println(deep + " " + n + " " + cur + "/" + value);
		
		System.out.println("---------------------------------------");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(using[i][j]){
					System.out.print("x ");
				}else{
					System.out.print(map[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
//		*/
		if(cur > value){
			return false;
		}else if(cur == value){
			if(deep == size - 1 && painted == all){
				return true;
			}else if(deep == size - 1){
				return false;
			}
			
			final int nx = x_pos.get(deep + 1);
			final int ny = y_pos.get(deep + 1);
			
			return dfs(deep + 1, size, n, using, map, nx, ny, 0, x_pos, y_pos, values, painted, all);
		}else{
			for(int[] move : move_dir){
				final int nx = x + move[0];
				final int ny = y + move[1];
				
				if(!is_ok(nx, ny, n)){
					continue;
				}else if(using[ny][nx]){
					continue;
				}
				
				using[ny][nx] = true;
				if(dfs(deep, size, n, using, map, nx, ny, cur + map[ny][nx], x_pos, y_pos, values, painted + 1, all)){
					return true;
				}
				using[ny][nx] = false;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			boolean[][] using = new boolean[n][n];
			int[][] map = new int[n][n];
			ArrayList<Integer> x_pos = new ArrayList<Integer>();
			ArrayList<Integer> y_pos = new ArrayList<Integer>();
			ArrayList<Integer> values = new ArrayList<Integer>();
			
			int count = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					final int input = sc.nextInt();
					
					if(input < 0){
						using[i][j] = true;
						y_pos.add(i);
						x_pos.add(j);
						values.add(-input);
					}else{
						count++;
						map[i][j] = input;
					}
				}
			}
			
			final int size = x_pos.size();
			
			final boolean ret = dfs(0, size, n, using, map, x_pos.get(0), y_pos.get(0), 0, x_pos, y_pos, values, 0, count);
			
			System.out.println(ret ? "YES" : "NO");
		}

		sc.close();
	}
}