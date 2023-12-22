import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;

			int[][] map = new int[2*h+3][2*w+3];
			Deque<Point> q = new ArrayDeque<Point>();

			Arrays.fill(map[1], 1);
			for(int i=2; i<=2*h; i++){
				map[i][1] = 1;
				for(int j = (i%2==0) ? 3 : 2; j<=2*w; j+=2){
					map[i][j] = sc.nextInt();
				}
				map[i][2*w+1] = 1;
			}
			Arrays.fill(map[2*h+1], 1);

			q.offer(new Point(2, 2, 1));
			map[2][2] = 1;
			while(!q.isEmpty()){
				if(map[2*h][2*w]!=0) break;
				Point p = q.poll();
				p.cnt++;

				for(int i=0; i<4; i++){
					if(map[p.y+dy[i]][p.x+dx[i]]==0 && map[p.y+2*dy[i]][p.x+2*dx[i]]==0){
						map[p.y+2*dy[i]][p.x+2*dx[i]] = p.cnt;
						q.offer(new Point(p.x+2*dx[i], p.y+2*dy[i], p.cnt));
					}
				}
			}

			System.out.println((map[2*h][2*w]!=0) ? map[2*h][2*w] : 0);
		}
	}

	static class Point{
		int x, y, cnt;
		Point(int a, int b, int c){
			x = a;
			y = b;
			cnt = c;
		}
	}
}