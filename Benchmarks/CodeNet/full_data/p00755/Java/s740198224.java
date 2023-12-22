import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static final int[][] move_dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	
	public static boolean is_ok(int x, int y, int w, int h){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void change(int x, int y, int prev_color, int next_color, int[][] map, int h, int w){
		if(map[y][x] != prev_color){
			return;
		}
		map[y][x] = next_color;
		
		for(int[] move : move_dir){
			final int nx = x + move[0];
			final int ny = y + move[1];
			
			if(!is_ok(nx, ny, w, h)){
				continue;
			}else if(map[ny][nx] != prev_color){
				continue;
			}
			
			change(nx, ny, prev_color, next_color, map, h, w);
		}
	}
	
	public static int count(int x, int y, int[][] map, int h, int w){
		int ret = 0;
		
		final int color = map[y][x];
		map[y][x] = Integer.MAX_VALUE;
		
		for(int[] move : move_dir){
			final int nx = x + move[0];
			final int ny = y + move[1];
			
			if(!is_ok(nx, ny, w, h)){
				continue;
			}else if(map[ny][nx] != color){
				continue;
			}
			
			ret += count(nx, ny, map, h, w);
		}
		
		return ret + 1;
	}
	
	public static int[][] clone(int[][] array, int h, int w){
		int[][] ret = new int[h][w];
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				ret[i][j] = array[i][j];
			}
		}
		
		return ret;
	}
	
	public static void copy(int[][] dst, int[][] src, int h, int w){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				dst[i][j] = src[i][j];
			}
		}
	}
	
	public static int dfs(int[][] map, int pur_color, int deep, int h, int w){
		if(deep == 0){
			if(map[0][0] != pur_color){
				return 0;
			}else{
				return count(0, 0, map, h, w);
			}
		}
		
		int[][] prev = clone(map, h, w);
		int ret = 0;
		
		for(int color = 1; color < 7; color++){
			if(color == map[0][0]){
				continue;
			}
			
			change(0, 0, map[0][0], color, map, h, w);
			
			ret = Math.max(ret, dfs(map, pur_color, deep - 1, h, w));
			
			copy(map, prev, h, w);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			final int c = sc.nextInt();
			
			if(h == 0){
				break;
			}
			
			int[][] map = new int[h][w];
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			System.out.println(dfs(map, c, 5, h, w));
		}
	}
}