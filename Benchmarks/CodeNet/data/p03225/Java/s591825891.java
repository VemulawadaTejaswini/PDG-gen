import java.io.*;
import java.util.*;

public class Main {
	static int w, h;
	static boolean[][] map;

	private void compute(){

		Scanner scanner = new Scanner (System.in);
		h = scanner.nextInt();
		w = scanner.nextInt();
		map = new boolean[w][h];
		for (int y=0;y<h;y++) {
			String s = scanner.next();
			for (int x=0;x<w;x++)
				map[x][y] = s.charAt(x) == '#';
		}
		
		long rtn = 0;
		for (int x=0;x<w;x++) {
			for (int y=0;y<h;y++) {
				if (!map[x][y])
					continue;
				for (int d=max(max(dist(x, y, 0, 0), dist(x, y, 0, h-1)), max(dist(x, y, w-1, 0), dist(x, y, w-1, h-1)));d>1;d--) {
					rtn += getNum(x, y, d, false, 0, 0);
				}
			}
		}
		System.out.print(rtn);
	}
	
	static int getNum(int x, int y, int d, boolean third, int fx, int fy) {
		int rtn = 0;
		int x2 = x+d, y2 = y;
		while (x2 > x-d && x2 >= 0) {
			if (isRange(x2, y2)) {
				if (map[x2][y2]) {
					if (third) {
						if (dist(fx, fy, x2, y2) == d)
							rtn += 1;
					} else {
						rtn += getNum(x2, y2, d, true, x, y);
					}
				}
			}
			x2--;
			if (x2 >= x)
				y2++;
			else
				y2--;
		}
		return rtn;
	}
	
	static boolean isRange(int x, int y) {
			return x >= 0 && y >= 0 && x < w && y < h;
	}
	
	static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	static int dist(int x1, int y1, int x2, int y2) {
		return abs(x1 - x2) + abs(y1 - y2);
	}
	
	static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}
