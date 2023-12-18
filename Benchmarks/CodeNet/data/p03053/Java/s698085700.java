import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getDist(Point p) {
			return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
		}
	}
	
	public void solve() {
		LinkedList<Point> wPoints = new LinkedList<Main.Point>();
		LinkedList<Point> bPoints = new LinkedList<Main.Point>();
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		
		for (int y=0; y<H; y++) {
			String line = in.next();
			for (int x=0; x<W; x++) {
				if (line.charAt(x) == '#') {
					// black
					bPoints.add(new Point(x, y));
				} else {
					// white
					wPoints.add(new Point(x, y));
				}
			}
		}
		
		in.close();
		int max = 0;
		for (Point wp : wPoints) {
			int min = Integer.MAX_VALUE;
			for (Point bp : bPoints) {
				int dist = wp.getDist(bp);
				if (min > dist) {
					if (min <= max) {
						break;
					}
					min = dist;
				}
			}
			if (max < min) {
				max = min;
			}
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
