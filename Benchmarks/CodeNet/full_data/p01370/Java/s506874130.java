import java.util.*;
public class Main { 
	public static int[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int t = stdIn.nextInt();
			int n = stdIn.nextInt();
			if(t == 0 && n == 0) break;
			map = new int[70][70];
			for(int i = 0; i < 70; i++) {
				for(int j = 0; j < 70; j++) {
					map[i][j] = -1;
				}
			}
			for(int i = 0; i < n; i++) {
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				map[y+30][x+30] = 9999999;
			}
			
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			solv(x+30,y+30,t);
			int c = 0;
			for(int i = 0; i < 70; i++) {
				for(int j = 0; j < 70; j++) {
					if(map[i][j] != -1 && map[i][j] != 9999999) {
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
	
	public static void solv(int x, int y, int t) {
		if(x < 0 || y < 0 || x >= 70|| y >= 70 || t < 0) return;
		if(map[y][x] == 9999999) return;
		if(map[y][x] > t) return;
		
		map[y][x] = t;
		
		solv(x+1,y+1,t-1);
		solv(x+1,y,t-1);
		solv(x,y+1,t-1);
		solv(x,y-1,t-1);
		solv(x-1,y,t-1);
		solv(x-1,y-1,t-1);
	}
}