import java.util.Scanner;

public class Main {
	public static String[] map;
	public static int[][] steps;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String wh = sc.nextLine();
			String[] sp = wh.split("\\s+");
			int w = Integer.parseInt(sp[0]);
			int h = Integer.parseInt(sp[1]);
			if(w == 0) break;
			
			int num = 2 * h - 1;
			map = new String[num];
			for(int i = 0; i < num; i++) {
				map[i] = sc.nextLine();
			}

			steps = new int[h][w];/* 歩数 */
			walk(0, 0, 0);
			
			System.out.println(steps[h-1][w-1]);
		}
	}
	
	public static void walk(int h, int w, int depth) {
		depth++;
		if(steps[h][w] == 0) {
			steps[h][w] = depth;
		} else {
			if(steps[h][w] > depth) {
				steps[h][w] = depth;
			} else {
				return;/* コスト同or大のため終了 */
			}
		}

		/* 上 */
		if(h * 2 - 1 > 0) {
			if(map[h*2-1].charAt(w*2) == '0') {
				walk(h-1, w, depth);
			}
		}
		/* 右 */
		if(w*2+1 < map[0].length()) {
			if(map[h*2].charAt(w*2+1) == '0') {
				walk(h, w+1, depth);
			}
		}
		/* 下 */
		if(h * 2 + 1 < map.length) {
			if(map[h*2+1].charAt(w*2) == '0') {
				walk(h+1, w, depth);
			}
		}
		if(0 < w*2-1) {/* 左 */
			if(map[h*2].charAt(w*2-1) == '0') {
				walk(h, w-1, depth);
			}
		}
	}

}

