import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	
	private class Map {
		int H, W;
		String[] lines = null;
		
		public Map(int H, int W, String[] lines) {
			this.H = H;
			this.W = W;
			this.lines = lines;
		}
		
		public boolean isFloor(int x, int y) {
			if (x < 0 || x >= W || y < 0 || y >= H) {
				return false;
			} else if (lines[y].charAt(x) == '#') {
				return false;
			}
			return true;
		}
		
	}
	
	public int get(int[][] map, int x, int y) {
		if (y < 0 || y >= map.length || x < 0 || x >= map[0].length) {
			return -1;
		} else {
			return map[y][x];
		}
	}
	
	private void debugPrint(int[][] map) {
		System.err.println("-------------------");
		for (int y=0; y<map.length; y++) {
			for (int x=0; x<map[y].length; x++) {
				System.err.print(String.format("%3d ", map[y][x]));
			}
			System.err.println();
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		String[] lines = new String[H];
		for (int i=0; i<H; i++) {
			lines[i] = in.next();
		}
		in.close();
		
		Map map = new Map(H, W, lines);
		
		int[][] top = new int[H][W];
		for (int x=0; x<W; x++) {
			for (int y=0; y<H; y++) {
				if (map.isFloor(x, y)) {
					top[y][x] = get(top, x, y-1) + 1;
				} else {
					top[y][x] = -1;
				}
			}
		}
		int[][] bottom = new int[H][W];
		for (int x=0; x<W; x++) {
			for (int y=H-1; y>=0; y--) {
				if (map.isFloor(x, y)) {
					bottom[y][x] = get(bottom, x, y+1) + 1;
				} else {
					bottom[y][x] = -1;
				}
			}
		}
		
		int[][] right = new int[H][W];
		for (int y=0; y<H; y++) {
			for (int x=W-1; x>=0; x--) {
				if (map.isFloor(x, y)) {
					right[y][x] = get(right, x+1, y) + 1;
				} else {
					right[y][x] = -1;
				}
			}
		}
		
		int[][] left = new int[H][W];
		for (int y=0; y<H; y++) {
			for (int x=0; x<W; x++) {
				if (map.isFloor(x, y)) {
					left[y][x] = get(left, x-1, y) + 1;
				} else {
					left[y][x] = -1;
				}
			}
		}

		int max = 0;

		//debugPrint(top);
		//debugPrint(bottom);
		
		for (int y=0; y<H; y++) {
			for (int x=0; x<W; x++) {
				if (map.isFloor(x, y)) {
					int count = top[y][x] + bottom[y][x] + left[y][x] + right[y][x] + 1;
					if (max < count) {
						max = count;
						//System.err.println(x + "," + y + ":" + count + "(" + top[y][x] + "," + bottom[y][x] + "," + left[y][x] + "," + right[y][x]);
					}
					
				}
			}
		}

		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
