import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main088D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();

		int W = sc.nextInt();

		int white = 0;

		char[][] maze = new char[H][W];

		for(int i=0;i<H;i++) {

			String s = sc.next();

			for(int j=0;j<W;j++) {

				maze[i][j] = s.charAt(j);

				if(maze[i][j] == '.') white++;
			}
		}

			Queue<Point> q = new LinkedList<Point>();

			q.add(new Point(0,0,0));

			int[] dx = {-1,0,1,0};

			int[] dy = {0,-1,0,1};

			int nstep = 0;

			while(q.size()>0) {

				Point p = q.poll();

				for(int i=0;i<4;i++) {

				int nx = p.x + dx[i];

				int ny = p.y + dy[i];

				nstep = p.step + 1;

				if(ny>=0 && nx>=0 && ny<H && nx<W) {

					if(ny == H-1 && nx == W-1) {


						System.out.println(white-nstep-1);

						return;
					}else if(maze[ny][nx] == '.') {

						q.add(new Point(ny,nx,nstep));

						maze[ny][nx] = '#';
					}

				}
				}

				if(q.size() == 0)	System.out.println(-1);


			}


	}
	public static class Point{

		int y;

		int x;

		int step;

		public Point(int y ,int x, int step) {

			this.y = y;

			this.x = x;

			this.step = step;

		}
	}

}
