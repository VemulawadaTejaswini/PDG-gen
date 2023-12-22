import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	char[][] map = new char[10][10];
	boolean flag = true;
	int[] dirx = {-1, 0, 1, -1, 1, -1, 0, 1};
	int[] diry = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	int put(char color, int y, int x) {
		int ret = 0;
		if (map[y][x] != '.') return ret;
		for (int i = 0; i < dirx.length; i++) {
			int stoneNum = checkDir(color, x, y, i);
			ret += stoneNum;
		}
		return ret;
	}
	
	int checkDir(char color, int x, int y, int dir) {
		char c = map[y+diry[dir]][x+dirx[dir]];
		if (c == 0 || c == '.' || c == color) return 0;
		else {
			for (int j = 2; j < dirx.length; j++) {
				c = map[y+diry[dir]*j][x+dirx[dir]*j];
				if (c == 0 || c == '.') return 0;
				else if (c == color) return j - 1;
				else continue;
			}
		}
		return 0;
	}
	
	void flip(char color, int x, int y) {
		for (int i = 0; i < dirx.length; i++) {
			int stoneNum = checkDir(color, x, y, i);
			for (int k = stoneNum; k >= 0; k--) {
				map[y+diry[i]*k][x+dirx[i]*k] = color;
			}
		}
	}
	
	public void run() {
		for (int i = 1; i <= 8; i++) {
			String s = in.next();
			for (int j = 0; j < 8; j++) {
				map[i][j+1] = s.charAt(j);
			}
		}
		
		int max;
		int x, y;
		while (flag) {
			flag = false;
			max = 0;
			x = -1; y = -1;
			for (int i = 1; i <= 8; i++) {
				for (int j = 1; j <= 8; j++) {
					if (max < put('o', i, j)) {
						y = i; x = j;
						max = put('o', i, j);
					}
				}
			}
			if (max != 0) {
				flip('o', x, y);
				flag = true;
			}
			max = 0;
			x = -1; y = -1;
			for (int i = 8; i > 0; i--) {
				for (int j = 8; j > 0; j--) {
					if (max < put('x', i, j)) {
						y = i; x = j;
						max = put('x', i, j);
					}
				}
			}
			if (max != 0) {
				flip('x', x, y);
				flag = true;
			}
		}
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}