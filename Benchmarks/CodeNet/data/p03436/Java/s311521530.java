import java.awt.Point;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][w];
		int [][]     d = new  int[h][w];
		
		int countDots = 0;
		for (int i = 0; i < h; i++) {
			String line = sc.next();
			
			for (int j = 0; j < w; j++) {
				field[i][j] = line.charAt(j);
				if (field[i][j] == '.') countDots++;
			}
		}
		
		int[] my = {0, 1, 0, -1};
		int[] mx = {1, 0, -1, 0};
		 
		Point start = new Point(0, 0);
		Point goal  = new Point(w-1, h-1);
		Deque<Point> deq = new ArrayDeque<>();
		deq.add(start);
		d[start.y][start.x] = 1;
		
		
		while(!deq.isEmpty()) {
			Point current = deq.poll();
			
			for (int i = 0; i < my.length; i++) {
				int ny = current.y + my[i];
				int nx = current.x + mx[i];
				
				if (ny < 0 || ny >= h || nx < 0 || nx >= w) continue;
				if (field[ny][nx] == '#') continue;
				if (d[ny][nx] != 0) continue;
				
				d[ny][nx] = d[current.y][current.x] + 1;
				deq.add(new Point(nx, ny));
			}
		}
		so.println(countDots - d[goal.y][goal.x]);
	}
}
