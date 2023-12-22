import java.util.*;
public class Main {
	static String[][] map;
	static boolean[][] al;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();
			if(w == 0 && h == 0) {
				break;
			}
			map = new String[h][w];
			al = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				String tmp = stdIn.next();
				for(int j = 0; j < w; j++) {
					map[i][j] = tmp.substring(j, j+1);
				}
			}
			
			int npx = 0;
			int npy = 0;
			boolean lp = false;
			while(true) {
				if(map[npy][npx].equals(".")) {
					break;
				}
				if(al[npy][npx]) {
					lp = true;
					break;
				}
				al[npy][npx] = true;
				if(map[npy][npx].equals(">")) {
					npx++;
				}
				if(map[npy][npx].equals("<")) {
					npx--;
				}
				if(map[npy][npx].equals("v")) {
					npy++;
				}
				if(map[npy][npx].equals("^")) {
					npy--;
				}
			}
			if(lp) {
				System.out.println("LOOP");
			}
			else {
				System.out.println(npx + " " + npy);
			}
			
			
		}
	}
}