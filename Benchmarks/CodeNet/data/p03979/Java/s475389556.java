import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int h;
	static int w;
	static byte[][] map;
	
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		initMap();
		if (checkEdge()) {
			System.out.println("-1");
			return;
		}
		fill();
		checkInner();
		int cnt = count();
		System.out.println(cnt);
		long end = System.currentTimeMillis();
		//System.out.println((end-start) + "ms");
	}
	
	static void initMap() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] flds = line.split(" ");
		h = Integer.parseInt(flds[0]);
		w = Integer.parseInt(flds[1]);
		map = new byte[h][w];
		for (int y=0; y<h; y++) {
			line = br.readLine();
			for (int x=0; x<w; x++) {
				char ch = line.charAt(x);
				if (ch == 'X') {
					map[y][x] = 1;
				}
			}
		}
	}
	
	static boolean checkEdge() {
		for (int x=0; x<w; x++) {
			if (map[0][x] > 0) {
				return true;
			}
			if (map[h-1][x] > 0) {
				return true;
			}
		}		
		for (int y=0; y<h; y++) {
			if (map[y][0] > 0) {
				return true;
			}
			if (map[y][w-1] > 0) {
				return true;
			}
		}
		return false;
	}
	
	static void fill() {
		for (int y=1; y<h-1; y++) {
			for (int x=1; x<w-1; x++) {
				if (map[y][x] == 1) {
					fill(x-1, y);
					fill(x+1, y);
					fill(x, y-1);
					fill(x, y+1);
				}
			}
		}
	}
	
	static void fill(int x, int y) {
		if (map[y][x] == 0) {
			map[y][x] = 2;
		}
	}
	
	static void checkInner() {
		for (int y=1; y<h-1; y++) {
			for (int x=1; x<w-1; x++) {
				if (map[y][x] != 2) {
					continue;
				}
				if (map[y][x-1] == 0) {
					continue;
				}
				if (map[y][x+1] == 0) {
					continue;
				}
				if (map[y-1][x] == 0) {
					continue;
				}
				if (map[y+1][x] == 0) {
					continue;
				}
				map[y][x] = 3;
			}
		}
	}
	
	static int count() {
		int cnt = 0;
		for (int y=0; y<h; y++) {
			for (int x=0; x<w; x++) {
				if (map[y][x] == 2) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
}
