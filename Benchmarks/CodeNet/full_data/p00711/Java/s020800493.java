import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	static String[][] map;
	static boolean[][] vmap;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			int h = stdIn.nextInt();
			if (h == 0 && w == 0) break;
			map = new String[h][w];
			vmap = new boolean[h][w];
			int x = 0;
			int y = 0;
			for(int i = 0; i < h; i++) {
				String a = stdIn.next();
				for(int j = 0; j < w; j++) {
					map[i][j] = String.valueOf(a.charAt(j));
					if(a.charAt(j) == '@') {
						x = j;
						y = i;
					}
				}
			}
			sorv(y,x);
			int ans = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(vmap[i][j]) ans++;
				}
			}
			System.out.println(ans);
		}
	}
	public static void sorv(int y,int x) {
		if(y < 0 || x < 0) return;
		if(y >= map.length || x >= map[y].length) return;
		if(map[y][x].equals("#")) return;
		if(vmap[y][x]) return;
		vmap[y][x] = true;
		sorv(y+1,x);
		sorv(y-1,x);
		sorv(y,x+1);
		sorv(y,x-1);
		
	}
}