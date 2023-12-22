import java.util.*;
class Main {
	static int w;
	static int h;
	static int xs;
	static int ys;
	static int xg;
	static int yg;
	static int[][] map;
	static int co;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while (true) {
			w = stdIn.nextInt();
			h = stdIn.nextInt();
			if (w == 0 && h == 0){
				break;
			}
			map = new int[h][w];
			xs = stdIn.nextInt();
			ys = stdIn.nextInt();
			xg = stdIn.nextInt();
			yg = stdIn.nextInt();
			int n = stdIn.nextInt();
			for (int i = 0; i < n; i++) {
				int c = stdIn.nextInt();
				int d = stdIn.nextInt();
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();

				if (d == 0) {
					for (int j = y - 1; j < y + 1; j++) {
						for (int k = x - 1; k < x + 3; k++) {
							map[j][k] = c;
						}
					}
				} else {
					for (int j = y - 1; j < y + 3; j++) {
						for (int k = x - 1; k < x + 1; k++) {
							map[j][k] = c;
						}
					}
				}
			}
			boolean ans;
			co = map[ys-1][xs-1];
			ans = solv(xs - 1, ys - 1);
			System.out.println((ans) ? "OK" : "NG");
		}
	}
	
	static boolean solv(int x, int y) {
		
		if(x < 0 || y < 0 || x >= w || y >= h) return false;
		if(map[y][x] != co) return false;
		if(y == yg-1 && x == xg-1) return true;
		map[y][x] = -1;
 		if(solv(x+1,y)) return true;
		if(solv(x-1,y)) return true;
		if(solv(x,y+1)) return true;
		if(solv(x,y-1)) return true;
		
		return false;
	}
}