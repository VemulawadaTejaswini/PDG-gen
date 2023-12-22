import java.util.*;
public class Main { 
	public static int[][] map;
	public static ArrayDeque<Data> que;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			que = new ArrayDeque<Data>();
			int t = stdIn.nextInt();
			int n = stdIn.nextInt();
			if(t == 0 && n == 0) break;
			map = new int[150][150];
			for(int i = 0; i < 150; i++) {
				for(int j = 0; j < 150; j++) {
					map[i][j] = -1;
				}
			}
			for(int i = 0; i < n; i++) {
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				map[y+75][x+75] = 9999999;
			}
			
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			que.add(new Data(x+75,y+75,t));
			while(!que.isEmpty()) {
				Data a = que.poll();
				if(a.x < 0 || a.y < 0 || a.x >= 150|| a.y >= 150) continue;
				if(map[a.y][a.x] == 9999999) continue;
				if(map[a.y][a.x] >= a.t) continue;
				
				map[a.y][a.x] = a.t;
				if(a.t-1 == -1) continue;
				que.add(new Data(a.x+1,a.y+1,a.t-1));
				que.add(new Data(a.x+1,a.y,a.t-1));
				que.add(new Data(a.x,a.y+1,a.t-1));
				que.add(new Data(a.x,a.y-1,a.t-1));
				que.add(new Data(a.x-1,a.y,a.t-1));
				que.add(new Data(a.x-1,a.y-1,a.t-1));
			}
			
			int c = 0;
			for(int i = 0; i < 150; i++) {
				for(int j = 0; j < 150; j++) {
					if(map[i][j] != -1 && map[i][j] != 9999999) {
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}

class Data {
	int x;
	int y;
	int t;
	public Data(int a, int b, int c) {
		x = a;
		y = b;
		t = c;
	}
}