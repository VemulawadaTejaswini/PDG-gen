import java.util.*;

public class Main {
	
	public static int[] moveX = {0,0,-1,1};
	public static int[] moveY = {-1,1,0,0};
	public static char[][] map;
	public static boolean[][] check;
	
	public static void dfs (int y, int x) {
		
		for (int i = 0; i < moveX.length; i++) {
			int nextX = x + moveX[i];
			int nextY = y + moveY[i];
			
			if (0 <= nextX && nextX < map[0].length && 
				0 <= nextY && nextY < map.length && 
				map[nextY][nextX] == '.' && 
				!check[nextY][nextX]) {
				
				check[nextY][nextX] = true;
				dfs(nextY,nextX);
			}
		}
		
	}
	
	public static void main (String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x == 0 && y == 0) break;
			
			int ans = 0;
			int startX = 0, startY = 0;
			map = new char[y][x];
			check = new boolean[y][x];
			
			for (int i = 0; i < y; i++)
				map[i] = sc.next().toCharArray();
			
			main:
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					if (map[i][j] == '@') {
						startX = j;
						startY = i;
						check[i][j] = true;
						break main;
					}
				}
			}
			
			dfs(startY,startX);
			
			for (boolean[] ch : check) {
				for (boolean c : ch)
					if (c) ans++;
			}
			
			System.out.println(ans);
		}
		
	}
	
}