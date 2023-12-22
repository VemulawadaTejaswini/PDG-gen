import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int dx[] = {-1,1,0,0};
		int dy[] = {0,0,-1,1};
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if( w == 0 && h == 0  ) break;
			int[][] room = new int[h][w];
			boolean[][] visited = new boolean[h][w];
			
			for(int i=0;i<h;i++) {
				String str = sc.next();
				for(int j=0;j<w;j++) {
					room[i][j] = 0;
					visited[i][j] = false;
					if(str.charAt(j) == '<') room[i][j] = 1;
					else if(str.charAt(j) == '>') room[i][j] = 2;
					else if(str.charAt(j) == '^') room[i][j] = 3;
					else if(str.charAt(j) == 'v') room[i][j] = 4;
//					System.out.print(room[i][j] + " ");
//					if(j % w== w-1) System.out.println();
				}
			}
			int x = 0,y = 0;
			boolean loop = false;
			while(true) {
				if(room[y][x] == 0) break;
				if(visited[y][x]) {
					loop = true;
					break;
				}
				visited[y][x] = true;
				int tmp = x;
				x += dx[ room[y][x]-1 ];
				y += dy[ room[y][tmp]-1 ];
			}
			if(loop) System.out.println("LOOP");
			else System.out.println(x + " " + y);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}