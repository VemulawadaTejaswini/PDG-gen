import java.util.Scanner;

class Walker {
	int[][] map;
	int maxTurn, nTile;
	
	public Walker(int[][] map, int turn) {
		this.map = map;
		this.maxTurn = turn;
		this.nTile = 0;
	}
	
	public boolean canWalk(int x, int y) {
		return (x >= 0 && x <= 60 && y >= 0 && y <= 60) && map[y][x] != 2;
	}
	
	public void walk(int x, int y, int turn) {
		if (map[y][x] == 0) nTile++;

		map[y][x] = 1;
		//printMap();

		if (maxTurn == turn) return;
		
		if (canWalk(x, y + 1))     walk(x, y + 1, turn + 1);
		if (canWalk(x + 1, y + 1)) walk(x + 1, y + 1, turn + 1);
		if (canWalk(x + 1, y))     walk(x + 1, y, turn + 1);
		if (canWalk(x, y - 1))     walk(x, y - 1, turn + 1);
		if (canWalk(x - 1, y - 1)) walk(x - 1, y - 1, turn + 1);
		if (canWalk(x - 1, y))     walk(x - 1, y, turn + 1);
	}

	public void printMap() {
		printMap(5, 5);
	}
	
	public void printMap(int w, int h) {
		System.out.println();
		for (int y = -h; y <= h; y++) {
			int i = 60 - (y + 30);
			for (int k = 0; k < y + h; k++) System.out.print(" ");

			for (int x = -w; x <= w; x++) {
				int j = x + 30;
				System.out.printf("%2d", new Object[] { map[i][j] });
			}

			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int t = sc.nextInt(); 
			int n = sc.nextInt();
			
			if (t == 0 && n == 0) break;
			
			int[][] map = new int[61][61];
			
			for (; n > 0; n--) {
				int x = sc.nextInt() + 30;
				int y = sc.nextInt() + 30;
				map[y][x] = 2;
			}
			
			int sx = sc.nextInt() + 30;
			int sy = sc.nextInt() + 30;
			
			Walker w = new Walker(map, t);
			w.walk(sx, sy, 0);
			System.out.println(w.nTile);
		}

	}
}