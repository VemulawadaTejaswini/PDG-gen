import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static final int[] dx={0,1,0,-1}, dy={-1,0,1,0};
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		Point start = new Point(0, 0);
		Point goal = new Point(h-1, w-1);
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		int all = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == '.') all++;
			}
		}
		ArrayDeque<Point> deque = new ArrayDeque<>();
		deque.add(start);

		int count = 0;
		map[0][0] = '#';
		outer:for(;true;count++) {
			for(int i = deque.size(); i > 0; i--) {
				Point poll = deque.poll();
				if(poll.equals(goal)) {
					break outer;
				}
				for(int j = 0; j < 4; j++) {
					if(poll.x+dx[j] < 0 || poll.x+dx[j] > h-1 || poll.y+dy[j] < 0 || poll.y+dy[j] > w-1) {

					} else {
						if(map[poll.x+dx[j]][poll.y+dy[j]] == '.') {
							deque.add(new Point(poll.x+dx[j],poll.y+dy[j]));
							map[poll.x+dx[j]][poll.y+dy[j]] = '#';
						}
					}
				}
			}
		}
		System.out.println(all - count - 1);
	}
}