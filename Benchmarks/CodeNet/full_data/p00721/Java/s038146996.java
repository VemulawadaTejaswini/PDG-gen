import java.util.*;

public class Main{
	static Deque<Tilemap> q = new ArrayDeque<Tilemap>();
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static class Tilemap{
		int x, y;
		int dirty_tile_num;
		int count;
		Tilemap(int j, int i, int d, int c){
			x = j;
			y = i;
			dirty_tile_num = d;
			count = c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] tile = new int[20+2][20+2];
		int[][] map = new int[20+2][20+2];
		Tilemap start = new Tilemap(0, 0, 0, 0);
		Tilemap xy = new Tilemap(0, 0, 0, 0);
		int w, h, dirty_tile_num, move, x, y;
		String str;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) break;
			dirty_tile_num = 0;

			for(int i=1; i<=h; i++){
				str = sc.next();
				for(int j=1; j<=w; j++){
					if(str.charAt(j-1)=='.'){
						tile[i][j] = 1;
					}else if(str.charAt(j-1)=='*'){
						tile[i][j] = 2;
						dirty_tile_num++;
					}else if(str.charAt(j-1)=='o'){
						start = new Tilemap(j, i, 0, -1);
						tile[i][j] = 1;
					}else if(str.charAt(j-1)=='x'){
						tile[i][j] = 0;
					}
				}
				tile[i][w+1] = 0;
			}
			Arrays.fill(tile[h+1], 0);
			start.dirty_tile_num = dirty_tile_num;
			q.offer(start);

			move = -1;
			for(int i=0; i<=w+1; i++){
				map[i] = tile[i].clone();
			}

			while(!q.isEmpty()){
				xy = q.poll();
				x = xy.x; y = xy.y;
				xy.count++;
				if(map[y][x]==2){
					xy.dirty_tile_num--;
					if(xy.dirty_tile_num==0){
						move = xy.count;
						break;
					}
					q.clear();
					tile[y][x] = 1;
					for(int i=0; i<=w+1; i++){
						map[i] = tile[i].clone();
					}
					
				}
				map[y][x] = 0;
				for(int i=0; i<4; i++){
					if(map[y+dy[i]][x+dx[i]]!=0){
						q.offer(new Tilemap(x+dx[i], y+dy[i], xy.dirty_tile_num, xy.count));
					}
				}
			}
			System.out.println(move);
			q.clear();
		}
	}
}