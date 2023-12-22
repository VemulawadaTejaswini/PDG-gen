import java.util.*;
class Main {
	static int[][] map;
	static int[][] map2;
	static int[] vx = new int[] {0,1,-1,1,0,1};
	static int[] vy = new int[] {-1,-1,0,0,1,1};
	
	static int[] vx2 = new int[] {-1,0,-1,1,-1,0};
	static int[] vy2 = new int[] {-1,-1,0,0,1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;
			map = new int[n][m];
			map2 = new int[n][m];
			for(int i = 0; i < n; i++) {
				Arrays.fill(map[i], 2 << 27);
				Arrays.fill(map2[i], -1);
			}
			int s = sc.nextInt();
			for(int i = 0; i < s; i++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				solv(y,x,0,i);
			}

			
			
			int max = 0;
			int t = sc.nextInt();
			for(int i = 0; i < t; i++) {
				int[][] tmpMap = new int[n][];
				int[][] tmpMap2 = new int[n][];
				for(int j = 0; j < n; j++) {
					tmpMap[j] = Arrays.copyOf(map[j], map[j].length);
					tmpMap2[j] = Arrays.copyOf(map2[j], map2[j].length);
				}
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				solv(y,x,0,-2);
				int ret = count();
				if(ret > max) { 
					max = ret;
				}
				
				map = tmpMap;
				map2 = tmpMap2;
			}
			System.out.println(max);
			
		}
	}
	static void solv(int y ,int x, int count,int id) {
		if(map[y][x] < count) return;
		if(map[y][x] == count && map2[y][x] != id) {
			map2[y][x] = -10;
			return;
		}
		map[y][x] = count;
		map2[y][x] = id;
		
		for(int i = 0; i < 6; i++) {
			int tmpy = y + vy[i];
			int tmpx = x + vx[i];
			if(y % 2 == 0) {
				tmpy = y + vy2[i];
				tmpx = x + vx2[i];
			}
			
			if(!check(tmpy,tmpx)) continue;
			solv(tmpy,tmpx,count+1,id);
		}
	}
	
	static boolean check(int y, int x) {
		if(y < 0 || x < 0 || y >= map.length || x >= map[y].length) return false;
		return true;
	}
	
	static int count() {
		int ret = 0;
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map2[i][j] == -2) ret++;
			}
		}
		return ret;
	}
}