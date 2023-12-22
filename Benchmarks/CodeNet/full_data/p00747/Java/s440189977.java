import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;

			int[][] map = new int[h+2][w+2];
			int[][] wall_l = new int[h][w+1];
			int[][] wall_r = new int[h+1][w];
			Deque<Point> q = new ArrayDeque<Point>();

			for(int i=0; i<2*h-1; i++){
				for(int j=0; j<=w; j++){
					if(i%2==0 && j>0 && j<w){
						wall_l[i/2][0] = wall_l[i/2][w] = 1;
						wall_l[i/2][j] = sc.nextInt();
					}else if(i%2==1 && j<w){
						wall_r[0][j] = wall_r[h][j] = 1;
						wall_r[(i+1)/2][j] = sc.nextInt();
					}
				}
			}

			q.offer(new Point(1, 1, 1));
			while(!q.isEmpty()){
				Point p = q.poll();
				map[p.y][p.x] = p.cnt++;
				if(map[h][w]!=0) break;

				if(wall_r[p.y][p.x-1]==0 && map[p.y+1][p.x]==0){
					q.offer(new Point(p.x, p.y+1, p.cnt));
				}
				if(wall_l[p.y-1][p.x]==0 && map[p.y][p.x+1]==0){
					q.offer(new Point(p.x+1, p.y, p.cnt));
				}
				if(wall_r[p.y-1][p.x-1]==0 && map[p.y-1][p.x]==0){
					q.offer(new Point(p.x, p.y-1, p.cnt));
				}
				if(wall_l[p.y-1][p.x-1]==0 && map[p.y][p.x-1]==0){
					q.offer(new Point(p.x-1, p.y, p.cnt));
				}
			}

			System.out.println((map[h][w]!=0) ? map[h][w] : 0);
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