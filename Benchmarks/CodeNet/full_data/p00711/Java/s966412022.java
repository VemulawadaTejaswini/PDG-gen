import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<int[]> quque = new ArrayDeque<int[]>();
		
		while(true) {
			String str = br.readLine();
			int sPos = str.indexOf(" ");
			int w = Integer.parseInt(str.substring(0, sPos));
			int h = Integer.parseInt(str.substring(sPos+1));
			if(w == 0 && h == 0) break;
			
			int[][] map = new int[h][w];
			int[] personXY = new int[2];
			for(int y = 0; y < h; y++) {
				str = br.readLine();
				
				for(int x = 0; x < w; x++) {
					char c = str.charAt(x);
					if(c == '@') {
						personXY[0] = x;
						personXY[1] = y;
					}
					else
						map[y][x] = c == '.' ? 0
						          : c == '#' ? 1 : 2;
				}
			}
			//System.out.println(Arrays.deepToString(map));
			
			quque.addLast(personXY);
			
			int movable = 0;
			
			while(!quque.isEmpty()) {
				int[] xy = quque.pollFirst();
				int x = xy[0];
				int y = xy[1];
				
				if(map[y][x] == 1)
					continue;
				
				map[y][x] = 1;
				movable++;
				if(0 < x && map[y][x-1] == 0) {
					quque.addLast(new int[]{x-1, y});
				}
				if(x+1 < map[y].length && map[y][x+1] == 0) {
					quque.addLast(new int[]{x+1, y});
				}
				if(0 < y && map[y-1][x] == 0) {
					quque.addLast(new int[]{x, y-1});
				}
				if(y+1 < map.length && map[y+1][x] == 0) {
					quque.addLast(new int[]{x, y+1});
				}
			}
			
			
			System.out.println(movable);
		}
	}
}