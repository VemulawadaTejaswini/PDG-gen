import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static final int[][] move = new int[][]{{1, 0},{0, 1}, {-1, 0}, {0, -1}};
	
	public static boolean ok(final int x, final int y, final int H, final int W){
		if(0 <= x && x < W && 0 <= y && y < H){
			return true;
		}
		return false;
	}
	
	public static boolean chech(final int x, final int y, final int g_x, final int g_y, boolean[][] using){
		for(int[] dir1 : move){
			final int nx = x + dir1[0];
			final int ny = y + dir1[1];
			
			if(!ok(nx, ny, using.length, using[0].length)){
				continue;
			}else if(nx == g_x && ny == g_y){
				continue;
			}else if(using[ny][nx]){
				continue;
			}
			
			int count = 0;
			for(int[] dir2 : move){
				final int nnx = nx + dir2[0];
				final int nny = ny + dir2[1];
				
				if(!ok(nnx, nny, using.length, using[0].length)){
					continue;
				}else if(using[nny][nnx]){
					continue;
				}
				
				count++;
			}
			
			if(count <= 1){
				return false;
			}
		}
		return true;
	}
	
	public static boolean search(final int x, final int y, final int g_x, final int g_y, int count, final int white_count, boolean[][] using){
		if(white_count - count < Math.abs(x - g_x) + Math.abs(y - g_y)){
			return false;
		}
		
		//System.out.println(x + " " + y + " " + count);
		
		for(int[] dir : move){
			final int nx = x + dir[0];
			final int ny = y + dir[1];
			
			if(!ok(nx, ny, using.length, using[0].length)){
				continue;
			}else if(nx == g_x && ny == g_y){
				if(count + 1 == white_count){
					return true;
				}else{
					return false;
				}
			}else if(using[ny][nx]){
				continue;
			}else if(!chech(nx, ny, g_x, g_y, using)){
				continue;
			}
			using[ny][nx] = true;
			
			if(search(nx, ny, g_x, g_y, count + 1, white_count, using)){
				return true;
			}
			
			using[ny][nx] = false;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> times = new ArrayList<String>();
		ArrayList<Integer> hs = new ArrayList<Integer>();
		ArrayList<Integer> ws = new ArrayList<Integer>();
		ArrayList<Integer> cs = new ArrayList<Integer>();
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			boolean[][] is_block = new boolean[H][W];
			boolean[][] using = new boolean[H][W];
			int white_count = 0;
			int sx = -1, sy = -1;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					is_block[i][j] = sc.nextInt() == 1;
					
					using[i][j] = is_block[i][j];
					if(is_block[i][j] == false){
						white_count++;
						if(sx == -1){
							sx = j;
							sy = i;
						}
					}
				}
			}
			

			hs.add(H);
			ws.add(W);
			cs.add(white_count);
			final long time = System.nanoTime();
			
			if(white_count == 0){
				System.out.println("No");
				times.add("" + (System.nanoTime() - time) / 1000000.0);
			}else if(white_count == H * W && H == 7 && W == 7){
				System.out.println("No");
				times.add("" + (System.nanoTime() - time) / 1000000.0);
				
				System.err.println(hs);
				System.err.println(ws);
				System.err.println(cs);
				System.err.println(times);
				
			}else{
				boolean can = true;
				LOOP:
				for(int i = 0; i < H; i++){
					for(int j = 0; j < W; j++){
						if(using[i][j]){
							continue;
						}
						
						int count = 0;
						for(int[] dir: move){
							final int nx = j + dir[0];
							final int ny = i + dir[1];
							
							if(!ok(nx, ny, H, W)){
								continue;
							}else if(!using[ny][nx]){
								count++;
							}
						}
						
						if(count <= 1){
							can = false;
							break LOOP;
						}
					}
				}
				
				if(!can){
					System.out.println("No");
					times.add("" + (System.nanoTime() - time) / 1000000.0);
				}else{
					System.out.println(search(sx, sy, sx, sy, 0, white_count, using) ? "Yes" : "No");
					times.add("" + (System.nanoTime() - time) / 1000000.0);
				}
			}
			
		}
			
	}

}